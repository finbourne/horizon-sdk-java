# ClientConfigurationsApi

All URIs are relative to *https://fbn-prd.lusid.com/horizon*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createClientConfigurationDraft**](ClientConfigurationsApi.md#createClientConfigurationDraft) | **POST** /api/clientconfiguration/{configType}/{name}/draft | [EXPERIMENTAL] CreateClientConfigurationDraft: Create a draft client configuration. |
| [**getClientConfiguration**](ClientConfigurationsApi.md#getClientConfiguration) | **GET** /api/clientconfiguration/{configType}/{name} | [EXPERIMENTAL] GetClientConfiguration: Get a client configuration. |
| [**listClientConfigurations**](ClientConfigurationsApi.md#listClientConfigurations) | **GET** /api/clientconfiguration/{configType} | [EXPERIMENTAL] ListClientConfigurations: List client configurations. |
| [**lockClientConfigurationVersion**](ClientConfigurationsApi.md#lockClientConfigurationVersion) | **POST** /api/clientconfiguration/{configType}/{name}/{majorVersion}/{minorVersion}/lock | [EXPERIMENTAL] LockClientConfigurationVersion: Lock a client configuration version. |
| [**updateClientConfigurationDraft**](ClientConfigurationsApi.md#updateClientConfigurationDraft) | **PUT** /api/clientconfiguration/{configType}/{name}/{majorVersion}/{minorVersion}/draft | [EXPERIMENTAL] UpdateClientConfigurationDraft: Update a draft client configuration. |



## createClientConfigurationDraft

> ClientConfigurationResponse createClientConfigurationDraft(configType, name, createClientConfigurationDraftRequest)

[EXPERIMENTAL] CreateClientConfigurationDraft: Create a draft client configuration.

Creates a new draft configuration record. Configurations follow a draft/locked lifecycle: create a draft here, refine it with the update endpoint, then commit it with the lock endpoint. If both majorVersion and minorVersion are omitted in the request body, the next version is assigned automatically by incrementing the minor version of the current highest version (starting at 1.0 if none exists). The user must be authenticated and entitled to call this method.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.ClientConfigurationsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ClientConfigurationsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"horizonUrl\": \"https://<your-domain>.lusid.com/horizon\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // ClientConfigurationsApi apiInstance = apiFactory.build(ClientConfigurationsApi.class);

        ClientConfigurationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ClientConfigurationsApi.class);
        String configType = "configType_example"; // String | The category of configuration.
        String name = "name_example"; // String | The logical name of the configuration.
        CreateClientConfigurationDraftRequest createClientConfigurationDraftRequest = new CreateClientConfigurationDraftRequest(); // CreateClientConfigurationDraftRequest | Options for the new draft, including optional explicit version and source version.
        try {
            // uncomment the below to set overrides at the request level
            // ClientConfigurationResponse result = apiInstance.createClientConfigurationDraft(configType, name, createClientConfigurationDraftRequest).execute(opts);

            ClientConfigurationResponse result = apiInstance.createClientConfigurationDraft(configType, name, createClientConfigurationDraftRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientConfigurationsApi#createClientConfigurationDraft");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configType** | **String**| The category of configuration. | |
| **name** | **String**| The logical name of the configuration. | |
| **createClientConfigurationDraftRequest** | [**CreateClientConfigurationDraftRequest**](CreateClientConfigurationDraftRequest.md)| Options for the new draft, including optional explicit version and source version. | [optional] |

### Return type

[**ClientConfigurationResponse**](ClientConfigurationResponse.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | The client does not exist. |  -  |
| **409** | A configuration with the specified version already exists. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getClientConfiguration

> ClientConfigurationResponse getClientConfiguration(configType, name, majorVersion, minorVersion)

[EXPERIMENTAL] GetClientConfiguration: Get a client configuration.

Returns a specific configuration record. When both majorVersion and minorVersion are omitted, the highest available version is returned. Both must be supplied together or both omitted. The user must be authenticated and entitled to call this method.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.ClientConfigurationsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ClientConfigurationsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"horizonUrl\": \"https://<your-domain>.lusid.com/horizon\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // ClientConfigurationsApi apiInstance = apiFactory.build(ClientConfigurationsApi.class);

        ClientConfigurationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ClientConfigurationsApi.class);
        String configType = "configType_example"; // String | The category of configuration.
        String name = "name_example"; // String | The logical name of the configuration.
        Integer majorVersion = 56; // Integer | The major version to retrieve. Must be supplied together with minorVersion, or both omitted.
        Integer minorVersion = 56; // Integer | The minor version to retrieve. Must be supplied together with majorVersion, or both omitted.
        try {
            // uncomment the below to set overrides at the request level
            // ClientConfigurationResponse result = apiInstance.getClientConfiguration(configType, name, majorVersion, minorVersion).execute(opts);

            ClientConfigurationResponse result = apiInstance.getClientConfiguration(configType, name, majorVersion, minorVersion).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientConfigurationsApi#getClientConfiguration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configType** | **String**| The category of configuration. | |
| **name** | **String**| The logical name of the configuration. | |
| **majorVersion** | **Integer**| The major version to retrieve. Must be supplied together with minorVersion, or both omitted. | [optional] |
| **minorVersion** | **Integer**| The minor version to retrieve. Must be supplied together with majorVersion, or both omitted. | [optional] |

### Return type

[**ClientConfigurationResponse**](ClientConfigurationResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | The client or configuration does not exist. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listClientConfigurations

> List&lt;ClientConfigurationResponse&gt; listClientConfigurations(configType)

[EXPERIMENTAL] ListClientConfigurations: List client configurations.

Returns all configuration records for the given config type, across all versions and states (both draft and locked), ordered by version descending. The user must be authenticated and entitled to call this method.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.ClientConfigurationsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ClientConfigurationsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"horizonUrl\": \"https://<your-domain>.lusid.com/horizon\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // ClientConfigurationsApi apiInstance = apiFactory.build(ClientConfigurationsApi.class);

        ClientConfigurationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ClientConfigurationsApi.class);
        String configType = "configType_example"; // String | The category of configuration to list.
        try {
            // uncomment the below to set overrides at the request level
            // List<ClientConfigurationResponse> result = apiInstance.listClientConfigurations(configType).execute(opts);

            List<ClientConfigurationResponse> result = apiInstance.listClientConfigurations(configType).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientConfigurationsApi#listClientConfigurations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configType** | **String**| The category of configuration to list. | |

### Return type

[**List&lt;ClientConfigurationResponse&gt;**](ClientConfigurationResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | The client does not exist. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## lockClientConfigurationVersion

> ClientConfigurationResponse lockClientConfigurationVersion(configType, name, majorVersion, minorVersion)

[EXPERIMENTAL] LockClientConfigurationVersion: Lock a client configuration version.

Locks a draft configuration version, making it immutable and ready for use. Once locked, a version cannot be edited or unlocked. All versions are retained permanently. The user must be authenticated and entitled to call this method.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.ClientConfigurationsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ClientConfigurationsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"horizonUrl\": \"https://<your-domain>.lusid.com/horizon\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // ClientConfigurationsApi apiInstance = apiFactory.build(ClientConfigurationsApi.class);

        ClientConfigurationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ClientConfigurationsApi.class);
        String configType = "configType_example"; // String | The category of configuration.
        String name = "name_example"; // String | The logical name of the configuration.
        Integer majorVersion = 56; // Integer | The major version to lock.
        Integer minorVersion = 56; // Integer | The minor version to lock.
        try {
            // uncomment the below to set overrides at the request level
            // ClientConfigurationResponse result = apiInstance.lockClientConfigurationVersion(configType, name, majorVersion, minorVersion).execute(opts);

            ClientConfigurationResponse result = apiInstance.lockClientConfigurationVersion(configType, name, majorVersion, minorVersion).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientConfigurationsApi#lockClientConfigurationVersion");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configType** | **String**| The category of configuration. | |
| **name** | **String**| The logical name of the configuration. | |
| **majorVersion** | **Integer**| The major version to lock. | |
| **minorVersion** | **Integer**| The minor version to lock. | |

### Return type

[**ClientConfigurationResponse**](ClientConfigurationResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | The client or configuration version does not exist, or the version is already locked. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateClientConfigurationDraft

> ClientConfigurationResponse updateClientConfigurationDraft(configType, name, majorVersion, minorVersion, updateClientConfigurationDraftRequest)

[EXPERIMENTAL] UpdateClientConfigurationDraft: Update a draft client configuration.

Updates the value of an existing draft configuration. Only draft versions can be updated; locked versions are immutable. This endpoint can be called multiple times before locking. The user must be authenticated and entitled to call this method.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.ClientConfigurationsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ClientConfigurationsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"horizonUrl\": \"https://<your-domain>.lusid.com/horizon\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // ClientConfigurationsApi apiInstance = apiFactory.build(ClientConfigurationsApi.class);

        ClientConfigurationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ClientConfigurationsApi.class);
        String configType = "configType_example"; // String | The category of configuration.
        String name = "name_example"; // String | The logical name of the configuration.
        Integer majorVersion = 56; // Integer | The major version of the draft to update.
        Integer minorVersion = 56; // Integer | The minor version of the draft to update.
        UpdateClientConfigurationDraftRequest updateClientConfigurationDraftRequest = new UpdateClientConfigurationDraftRequest(); // UpdateClientConfigurationDraftRequest | The updated value.
        try {
            // uncomment the below to set overrides at the request level
            // ClientConfigurationResponse result = apiInstance.updateClientConfigurationDraft(configType, name, majorVersion, minorVersion, updateClientConfigurationDraftRequest).execute(opts);

            ClientConfigurationResponse result = apiInstance.updateClientConfigurationDraft(configType, name, majorVersion, minorVersion, updateClientConfigurationDraftRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientConfigurationsApi#updateClientConfigurationDraft");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configType** | **String**| The category of configuration. | |
| **name** | **String**| The logical name of the configuration. | |
| **majorVersion** | **Integer**| The major version of the draft to update. | |
| **minorVersion** | **Integer**| The minor version of the draft to update. | |
| **updateClientConfigurationDraftRequest** | [**UpdateClientConfigurationDraftRequest**](UpdateClientConfigurationDraftRequest.md)| The updated value. | [optional] |

### Return type

[**ClientConfigurationResponse**](ClientConfigurationResponse.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | The client or configuration version does not exist, or the version is already locked. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

