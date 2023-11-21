package com.finbourne.horizon.extensions;

import com.finbourne.horizon.ApiClient;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
* Utility class that builds pre-configured horizon API instances to access horizon.
*
*/
public class ApiFactory {


    /**
    * The unique package that hosts all the horizon API classes
    */
    public static final String API_PACKAGE = "com.finbourne.horizon.api";

    private final ApiClient apiClient;
    private final Map<Class, Object> initialisedApis;

    /**
    * Create a API factory based on an {@link ApiClient}
    *
    * @param apiClient configured to a specific application
    */
    public ApiFactory(ApiClient apiClient) {
        this.apiClient = apiClient;
        initialisedApis = new HashMap<>();
    }

    /**
    * Builds an instance of a horizon API 
    *
    * For each instance of an {@link ApiFactory} only a singleton instance of each horizon API class exist. The APIs
    * are lazily initialised on request.
    *
    *
    * @param apiClass - class of the horizon API to create
    * @param <T> horizon API type
    * @return instance of the horizon API type configured as per the {@link ApiClient}
    *
    * @throws UnsupportedOperationException is the apiClass does not belong to the import com.finbourne.horizon.api package or
    * if the class has no constructor that accepts an {@link ApiClient} parameter.
    */
    public synchronized <T> T build(Class<T> apiClass) {
        @SuppressWarnings (value="unchecked")
        T apiInstance = (T) initialisedApis.get(apiClass);
        if (apiInstance == null) {
            checkIsSupportedApiClass(apiClass);
            Constructor<T> constructor = getApiConstructor(apiClass);
            apiInstance = createInstance(constructor);
            initialisedApis.put(apiClass, apiInstance);
        }
        return apiInstance;
    };

    /*
    * Create an instance of a horizon API configured by an {@link ApiClient}
    *
    * @throws UnsupportedOperationException on any reflection related issues on constructing the horizon API object
    */
    private <T> T createInstance(Constructor<T> constructor){
        try {
            return constructor.newInstance(apiClient);
        } catch (ReflectiveOperationException e) {
            throw new UnsupportedOperationException("Construction of " + constructor.getClass().getName() + " failed " +
                    "due to an invalid instantiation call.",e);
        }
    }

    /*
    * Retrieves the constructor for the horizon API that accepts an {@link ApiClient}
    *
    * @throws UnsupportedOperationException if the class doesn't have a valid constructor that takes
    * an {@link ApiClient} as an argument to ensure proper construction of a horizon API instance.
    */
    private <T> Constructor<T> getApiConstructor(Class<T> apiClass){
        try {
            return apiClass.getDeclaredConstructor(ApiClient.class);
        } catch (NoSuchMethodException e) {
            throw new UnsupportedOperationException(apiClass.getName() + " has no single argument constructor taking " +
                    "in " + ApiClient.class.getName());
        }
    }

    /*
    * Checks the class lives in the set package for horizon API classes.
    *
    * @throws UnsupportedOperationException if API class does not live in horizon API package
    */
    private void checkIsSupportedApiClass(Class apiClass){
        if (!isInApiPackage(apiClass)) {
            throw new UnsupportedOperationException(apiClass.getName() + " class is not a supported API class. " +
                    "Supported API classes live in the " + ApiFactory.API_PACKAGE + " package.");
        }
    }

    private boolean isInApiPackage(Class clazz){
        return API_PACKAGE.equals(clazz.getPackage().getName());
    }


}
