# VersionedConfigurationsApi

All URIs are relative to *https://fbn-prd.lusid.com/horizon*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createVersionedConfigurationDraft**](VersionedConfigurationsApi.md#createVersionedConfigurationDraft) | **POST** /api/versionedconfiguration/{configType}/{name}/draft | [EXPERIMENTAL] CreateVersionedConfigurationDraft: Create a draft versioned configuration. |
| [**getVersionedConfiguration**](VersionedConfigurationsApi.md#getVersionedConfiguration) | **GET** /api/versionedconfiguration/{configType}/{name} | [EXPERIMENTAL] GetVersionedConfiguration: Get a versioned configuration. |
| [**listVersionedConfigurations**](VersionedConfigurationsApi.md#listVersionedConfigurations) | **GET** /api/versionedconfiguration/{configType} | [EXPERIMENTAL] ListVersionedConfigurations: List versioned configurations. |
| [**lockVersionedConfigurationVersion**](VersionedConfigurationsApi.md#lockVersionedConfigurationVersion) | **POST** /api/versionedconfiguration/{configType}/{name}/{majorVersion}/{minorVersion}/lock | [EXPERIMENTAL] LockVersionedConfigurationVersion: Lock a versioned configuration version. |
| [**updateVersionedConfigurationDraft**](VersionedConfigurationsApi.md#updateVersionedConfigurationDraft) | **PUT** /api/versionedconfiguration/{configType}/{name}/{majorVersion}/{minorVersion}/draft | [EXPERIMENTAL] UpdateVersionedConfigurationDraft: Update a draft versioned configuration. |



## createVersionedConfigurationDraft

> VersionedConfigurationResponse createVersionedConfigurationDraft(configType, name, createVersionedConfigurationDraftRequest)

[EXPERIMENTAL] CreateVersionedConfigurationDraft: Create a draft versioned configuration.

Creates a new draft configuration record. Configurations follow a draft/locked lifecycle: create a draft here, refine it with the update endpoint, then commit it with the lock endpoint. If both majorVersion and minorVersion are omitted in the request body, the next version is assigned automatically by incrementing the minor version of the current highest version (starting at 1.0 if none exists). The user must be authenticated and entitled to call this method.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.VersionedConfigurationsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class VersionedConfigurationsApiExample {

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
        // VersionedConfigurationsApi apiInstance = apiFactory.build(VersionedConfigurationsApi.class);

        VersionedConfigurationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(VersionedConfigurationsApi.class);
        String configType = "configType_example"; // String | The category of configuration.
        String name = "name_example"; // String | The logical name of the configuration.
        CreateVersionedConfigurationDraftRequest createVersionedConfigurationDraftRequest = new CreateVersionedConfigurationDraftRequest(); // CreateVersionedConfigurationDraftRequest | Options for the new draft, including optional explicit version and source version.
        try {
            // uncomment the below to set overrides at the request level
            // VersionedConfigurationResponse result = apiInstance.createVersionedConfigurationDraft(configType, name, createVersionedConfigurationDraftRequest).execute(opts);

            VersionedConfigurationResponse result = apiInstance.createVersionedConfigurationDraft(configType, name, createVersionedConfigurationDraftRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling VersionedConfigurationsApi#createVersionedConfigurationDraft");
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
| **createVersionedConfigurationDraftRequest** | [**CreateVersionedConfigurationDraftRequest**](CreateVersionedConfigurationDraftRequest.md)| Options for the new draft, including optional explicit version and source version. | [optional] |

### Return type

[**VersionedConfigurationResponse**](VersionedConfigurationResponse.md)

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


## getVersionedConfiguration

> VersionedConfigurationResponse getVersionedConfiguration(configType, name, majorVersion, minorVersion)

[EXPERIMENTAL] GetVersionedConfiguration: Get a versioned configuration.

Returns a specific configuration record. When both majorVersion and minorVersion are omitted, the highest available version is returned. Both must be supplied together or both omitted. The user must be authenticated and entitled to call this method.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.VersionedConfigurationsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class VersionedConfigurationsApiExample {

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
        // VersionedConfigurationsApi apiInstance = apiFactory.build(VersionedConfigurationsApi.class);

        VersionedConfigurationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(VersionedConfigurationsApi.class);
        String configType = "configType_example"; // String | The category of configuration.
        String name = "name_example"; // String | The logical name of the configuration.
        Integer majorVersion = 56; // Integer | The major version to retrieve. Must be supplied together with minorVersion, or both omitted.
        Integer minorVersion = 56; // Integer | The minor version to retrieve. Must be supplied together with majorVersion, or both omitted.
        try {
            // uncomment the below to set overrides at the request level
            // VersionedConfigurationResponse result = apiInstance.getVersionedConfiguration(configType, name, majorVersion, minorVersion).execute(opts);

            VersionedConfigurationResponse result = apiInstance.getVersionedConfiguration(configType, name, majorVersion, minorVersion).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling VersionedConfigurationsApi#getVersionedConfiguration");
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

[**VersionedConfigurationResponse**](VersionedConfigurationResponse.md)

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


## listVersionedConfigurations

> List&lt;VersionedConfigurationResponse&gt; listVersionedConfigurations(configType)

[EXPERIMENTAL] ListVersionedConfigurations: List versioned configurations.

Returns all configuration records for the given config type, across all versions and states (both draft and locked), ordered by version descending. The user must be authenticated and entitled to call this method.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.VersionedConfigurationsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class VersionedConfigurationsApiExample {

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
        // VersionedConfigurationsApi apiInstance = apiFactory.build(VersionedConfigurationsApi.class);

        VersionedConfigurationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(VersionedConfigurationsApi.class);
        String configType = "configType_example"; // String | The category of configuration to list.
        try {
            // uncomment the below to set overrides at the request level
            // List<VersionedConfigurationResponse> result = apiInstance.listVersionedConfigurations(configType).execute(opts);

            List<VersionedConfigurationResponse> result = apiInstance.listVersionedConfigurations(configType).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling VersionedConfigurationsApi#listVersionedConfigurations");
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

[**List&lt;VersionedConfigurationResponse&gt;**](VersionedConfigurationResponse.md)

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


## lockVersionedConfigurationVersion

> VersionedConfigurationResponse lockVersionedConfigurationVersion(configType, name, majorVersion, minorVersion)

[EXPERIMENTAL] LockVersionedConfigurationVersion: Lock a versioned configuration version.

Locks a draft configuration version, making it immutable and ready for use. Once locked, a version cannot be edited or unlocked. All versions are retained permanently. The user must be authenticated and entitled to call this method.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.VersionedConfigurationsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class VersionedConfigurationsApiExample {

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
        // VersionedConfigurationsApi apiInstance = apiFactory.build(VersionedConfigurationsApi.class);

        VersionedConfigurationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(VersionedConfigurationsApi.class);
        String configType = "configType_example"; // String | The category of configuration.
        String name = "name_example"; // String | The logical name of the configuration.
        Integer majorVersion = 56; // Integer | The major version to lock.
        Integer minorVersion = 56; // Integer | The minor version to lock.
        try {
            // uncomment the below to set overrides at the request level
            // VersionedConfigurationResponse result = apiInstance.lockVersionedConfigurationVersion(configType, name, majorVersion, minorVersion).execute(opts);

            VersionedConfigurationResponse result = apiInstance.lockVersionedConfigurationVersion(configType, name, majorVersion, minorVersion).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling VersionedConfigurationsApi#lockVersionedConfigurationVersion");
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

[**VersionedConfigurationResponse**](VersionedConfigurationResponse.md)

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


## updateVersionedConfigurationDraft

> VersionedConfigurationResponse updateVersionedConfigurationDraft(configType, name, majorVersion, minorVersion, updateVersionedConfigurationDraftRequest)

[EXPERIMENTAL] UpdateVersionedConfigurationDraft: Update a draft versioned configuration.

Updates the value of an existing draft configuration. Only draft versions can be updated; locked versions are immutable. This endpoint can be called multiple times before locking. The user must be authenticated and entitled to call this method.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.VersionedConfigurationsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class VersionedConfigurationsApiExample {

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
        // VersionedConfigurationsApi apiInstance = apiFactory.build(VersionedConfigurationsApi.class);

        VersionedConfigurationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(VersionedConfigurationsApi.class);
        String configType = "configType_example"; // String | The category of configuration.
        String name = "name_example"; // String | The logical name of the configuration.
        Integer majorVersion = 56; // Integer | The major version of the draft to update.
        Integer minorVersion = 56; // Integer | The minor version of the draft to update.
        UpdateVersionedConfigurationDraftRequest updateVersionedConfigurationDraftRequest = new UpdateVersionedConfigurationDraftRequest(); // UpdateVersionedConfigurationDraftRequest | The updated value.
        try {
            // uncomment the below to set overrides at the request level
            // VersionedConfigurationResponse result = apiInstance.updateVersionedConfigurationDraft(configType, name, majorVersion, minorVersion, updateVersionedConfigurationDraftRequest).execute(opts);

            VersionedConfigurationResponse result = apiInstance.updateVersionedConfigurationDraft(configType, name, majorVersion, minorVersion, updateVersionedConfigurationDraftRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling VersionedConfigurationsApi#updateVersionedConfigurationDraft");
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
| **updateVersionedConfigurationDraftRequest** | [**UpdateVersionedConfigurationDraftRequest**](UpdateVersionedConfigurationDraftRequest.md)| The updated value. | [optional] |

### Return type

[**VersionedConfigurationResponse**](VersionedConfigurationResponse.md)

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

