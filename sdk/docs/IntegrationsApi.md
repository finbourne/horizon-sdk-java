# IntegrationsApi

All URIs are relative to *https://fbn-prd.lusid.com/horizon*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInstance**](IntegrationsApi.md#createInstance) | **POST** /api/integrations/instances | [EXPERIMENTAL] CreateInstance: Create a single integration instance. |
| [**deleteInstance**](IntegrationsApi.md#deleteInstance) | **DELETE** /api/integrations/instances/{instanceId} | [EXPERIMENTAL] DeleteInstance: Delete a single integration instance. |
| [**executeInstance**](IntegrationsApi.md#executeInstance) | **POST** /api/integrations/instances/{instanceId}/execute | [EXPERIMENTAL] ExecuteInstance: Execute an integration instance. |
| [**executeInstanceWithParams**](IntegrationsApi.md#executeInstanceWithParams) | **POST** /api/integrations/instances/{instanceId}/executewithparams | [EXPERIMENTAL] ExecuteInstanceWithParams: Execute an integration instance with runtime parameters |
| [**getExecutionIdsForInstance**](IntegrationsApi.md#getExecutionIdsForInstance) | **GET** /api/integrations/instances/{instanceId}/executions | [EXPERIMENTAL] GetExecutionIdsForInstance: Get integration instance execution ids. |
| [**getInstanceOptionalPropertyMapping**](IntegrationsApi.md#getInstanceOptionalPropertyMapping) | **GET** /api/integrations/instances/configuration/{integration}/{instanceId} | [EXPERIMENTAL] GetInstanceOptionalPropertyMapping: Get the Optional Property Mapping for an Integration Instance |
| [**getIntegrationConfiguration**](IntegrationsApi.md#getIntegrationConfiguration) | **GET** /api/integrations/configuration/{integration} | [EXPERIMENTAL] GetIntegrationConfiguration: Get the Field and Property Mapping configuration for a given integration |
| [**getSchema**](IntegrationsApi.md#getSchema) | **GET** /api/integrations/schema/{integration} | [EXPERIMENTAL] GetSchema: Get the JSON schema for the details section of an integration instance. |
| [**listInstances**](IntegrationsApi.md#listInstances) | **GET** /api/integrations/instances | [EXPERIMENTAL] ListInstances: List instances across all integrations. |
| [**listIntegrations**](IntegrationsApi.md#listIntegrations) | **GET** /api/integrations | [EXPERIMENTAL] ListIntegrations: List available integrations. |
| [**setInstanceOptionalPropertyMapping**](IntegrationsApi.md#setInstanceOptionalPropertyMapping) | **PUT** /api/integrations/instances/configuration/{integration}/{instanceId} | [EXPERIMENTAL] SetInstanceOptionalPropertyMapping: Set the Optional Property Mapping for an Integration Instance |
| [**updateInstance**](IntegrationsApi.md#updateInstance) | **PUT** /api/integrations/instances/{instanceId} | [EXPERIMENTAL] UpdateInstance: Update a single integration instance. |



## createInstance

> InstanceIdentifier createInstance(createInstanceRequest)

[EXPERIMENTAL] CreateInstance: Create a single integration instance.

Creates a new instance of an integration, returning its identifier.  The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.IntegrationsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IntegrationsApiExample {

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
        // IntegrationsApi apiInstance = apiFactory.build(IntegrationsApi.class);

        IntegrationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IntegrationsApi.class);
        CreateInstanceRequest createInstanceRequest = new CreateInstanceRequest(); // CreateInstanceRequest | The new integration instance.
        try {
            // uncomment the below to set overrides at the request level
            // InstanceIdentifier result = apiInstance.createInstance(createInstanceRequest).execute(opts);

            InstanceIdentifier result = apiInstance.createInstance(createInstanceRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationsApi#createInstance");
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
| **createInstanceRequest** | [**CreateInstanceRequest**](CreateInstanceRequest.md)| The new integration instance. | [optional] |

### Return type

[**InstanceIdentifier**](InstanceIdentifier.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Identifier of the created instance. |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | The integration type does not exist. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteInstance

> deleteInstance(instanceId)

[EXPERIMENTAL] DeleteInstance: Delete a single integration instance.

Deletes an existing instance of an integration, returning its identifier.  The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.IntegrationsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IntegrationsApiExample {

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
        // IntegrationsApi apiInstance = apiFactory.build(IntegrationsApi.class);

        IntegrationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IntegrationsApi.class);
        String instanceId = "instanceId_example"; // String | Instance identifier e.g. \"b64135e7-98a0-41af-a845-d86167d54cc7\".
        try {
            // uncomment the below to set overrides at the request level
            // apiInstance.deleteInstance(instanceId).execute(opts);

            apiInstance.deleteInstance(instanceId).execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationsApi#deleteInstance");
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
| **instanceId** | **String**| Instance identifier e.g. \&quot;b64135e7-98a0-41af-a845-d86167d54cc7\&quot;. | |

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | The instance does not exist. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## executeInstance

> ExecuteInstanceResponse executeInstance(instanceId)

[EXPERIMENTAL] ExecuteInstance: Execute an integration instance.

Starts execution of an instance, returning its execution identifier.  The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.IntegrationsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IntegrationsApiExample {

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
        // IntegrationsApi apiInstance = apiFactory.build(IntegrationsApi.class);

        IntegrationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IntegrationsApi.class);
        String instanceId = "instanceId_example"; // String | Instance identifier e.g. \"b64135e7-98a0-41af-a845-d86167d54cc7\".
        try {
            // uncomment the below to set overrides at the request level
            // ExecuteInstanceResponse result = apiInstance.executeInstance(instanceId).execute(opts);

            ExecuteInstanceResponse result = apiInstance.executeInstance(instanceId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationsApi#executeInstance");
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
| **instanceId** | **String**| Instance identifier e.g. \&quot;b64135e7-98a0-41af-a845-d86167d54cc7\&quot;. | |

### Return type

[**ExecuteInstanceResponse**](ExecuteInstanceResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The execution id |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | The integration instance does not exist |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## executeInstanceWithParams

> ExecuteInstanceResponse executeInstanceWithParams(instanceId, requestBody)

[EXPERIMENTAL] ExecuteInstanceWithParams: Execute an integration instance with runtime parameters

Starts execution of an instance, returning its execution identifier.  The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.IntegrationsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IntegrationsApiExample {

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
        // IntegrationsApi apiInstance = apiFactory.build(IntegrationsApi.class);

        IntegrationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IntegrationsApi.class);
        String instanceId = "instanceId_example"; // String | Instance identifier e.g. \"b64135e7-98a0-41af-a845-d86167d54cc7\".
        Map<String, String> requestBody = {"para1":"val1","para2":"val2"}; // Map<String, String> | Dictionary(string,string) of runtime parameters passed to the integration instance
        try {
            // uncomment the below to set overrides at the request level
            // ExecuteInstanceResponse result = apiInstance.executeInstanceWithParams(instanceId, requestBody).execute(opts);

            ExecuteInstanceResponse result = apiInstance.executeInstanceWithParams(instanceId, requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationsApi#executeInstanceWithParams");
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
| **instanceId** | **String**| Instance identifier e.g. \&quot;b64135e7-98a0-41af-a845-d86167d54cc7\&quot;. | |
| **requestBody** | [**Map&lt;String, String&gt;**](String.md)| Dictionary(string,string) of runtime parameters passed to the integration instance | |

### Return type

[**ExecuteInstanceResponse**](ExecuteInstanceResponse.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The execution id |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | The integration instance does not exist |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getExecutionIdsForInstance

> List&lt;String&gt; getExecutionIdsForInstance(instanceId, limit)

[EXPERIMENTAL] GetExecutionIdsForInstance: Get integration instance execution ids.

Get the most recent execution ids for an integration instance.  The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.IntegrationsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IntegrationsApiExample {

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
        // IntegrationsApi apiInstance = apiFactory.build(IntegrationsApi.class);

        IntegrationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IntegrationsApi.class);
        String instanceId = "instanceId_example"; // String | Instance identifier e.g. \"30dc93c6-a127-46bf-aea8-e466d720b72d\".
        Integer limit = 56; // Integer | Maximum number of returned execution ids
        try {
            // uncomment the below to set overrides at the request level
            // List<String> result = apiInstance.getExecutionIdsForInstance(instanceId, limit).execute(opts);

            List<String> result = apiInstance.getExecutionIdsForInstance(instanceId, limit).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationsApi#getExecutionIdsForInstance");
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
| **instanceId** | **String**| Instance identifier e.g. \&quot;30dc93c6-a127-46bf-aea8-e466d720b72d\&quot;. | |
| **limit** | **Integer**| Maximum number of returned execution ids | [optional] |

### Return type

**List&lt;String&gt;**

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The execution ids sorted by start date (descending) |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | The integration instance does not exist |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getInstanceOptionalPropertyMapping

> Map&lt;String, LusidPropertyDefinitionOverridesByType&gt; getInstanceOptionalPropertyMapping(integration, instanceId)

[EXPERIMENTAL] GetInstanceOptionalPropertyMapping: Get the Optional Property Mapping for an Integration Instance

Will return the full list of optional properties configured for this integration instance and any naming overrides

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.IntegrationsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IntegrationsApiExample {

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
        // IntegrationsApi apiInstance = apiFactory.build(IntegrationsApi.class);

        IntegrationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IntegrationsApi.class);
        String integration = "integration_example"; // String | The type of the integration e.g. \"copp-clark\".
        String instanceId = "instanceId_example"; // String | Identifier of the instance
        try {
            // uncomment the below to set overrides at the request level
            // Map<String, LusidPropertyDefinitionOverridesByType> result = apiInstance.getInstanceOptionalPropertyMapping(integration, instanceId).execute(opts);

            Map<String, LusidPropertyDefinitionOverridesByType> result = apiInstance.getInstanceOptionalPropertyMapping(integration, instanceId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationsApi#getInstanceOptionalPropertyMapping");
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
| **integration** | **String**| The type of the integration e.g. \&quot;copp-clark\&quot;. | |
| **instanceId** | **String**| Identifier of the instance | |

### Return type

[**Map&lt;String, LusidPropertyDefinitionOverridesByType&gt;**](LusidPropertyDefinitionOverridesByType.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | The requested instance(s) do not exist. |  -  |
| **400** | The details of the input related failure |  -  |
| **200** | OK |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getIntegrationConfiguration

> IntegrationPropertyConfiguration getIntegrationConfiguration(integration)

[EXPERIMENTAL] GetIntegrationConfiguration: Get the Field and Property Mapping configuration for a given integration

The user must be authenticated, entitled to call this method, but the user&#39;s domain does not need to be licensed for the integration.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.IntegrationsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IntegrationsApiExample {

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
        // IntegrationsApi apiInstance = apiFactory.build(IntegrationsApi.class);

        IntegrationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IntegrationsApi.class);
        String integration = "integration_example"; // String | 
        try {
            // uncomment the below to set overrides at the request level
            // IntegrationPropertyConfiguration result = apiInstance.getIntegrationConfiguration(integration).execute(opts);

            IntegrationPropertyConfiguration result = apiInstance.getIntegrationConfiguration(integration).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationsApi#getIntegrationConfiguration");
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
| **integration** | **String**|  | |

### Return type

[**IntegrationPropertyConfiguration**](IntegrationPropertyConfiguration.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | The requested integration does not exist. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getSchema

> JSchema getSchema(integration)

[EXPERIMENTAL] GetSchema: Get the JSON schema for the details section of an integration instance.

The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.IntegrationsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IntegrationsApiExample {

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
        // IntegrationsApi apiInstance = apiFactory.build(IntegrationsApi.class);

        IntegrationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IntegrationsApi.class);
        String integration = "integration_example"; // String | The type of the integration e.g. \"copp-clark\".
        try {
            // uncomment the below to set overrides at the request level
            // JSchema result = apiInstance.getSchema(integration).execute(opts);

            JSchema result = apiInstance.getSchema(integration).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationsApi#getSchema");
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
| **integration** | **String**| The type of the integration e.g. \&quot;copp-clark\&quot;. | |

### Return type

[**JSchema**](JSchema.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The system defined JSON schema for the details of a specified integration. |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | The integration type does not exist or is not enabled. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listInstances

> List&lt;IntegrationInstance&gt; listInstances()

[EXPERIMENTAL] ListInstances: List instances across all integrations.

The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.IntegrationsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IntegrationsApiExample {

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
        // IntegrationsApi apiInstance = apiFactory.build(IntegrationsApi.class);

        IntegrationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IntegrationsApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // List<IntegrationInstance> result = apiInstance.listInstances().execute(opts);

            List<IntegrationInstance> result = apiInstance.listInstances().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationsApi#listInstances");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;IntegrationInstance&gt;**](IntegrationInstance.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | The requested instance(s) do not exist. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listIntegrations

> List&lt;IntegrationDescription&gt; listIntegrations()

[EXPERIMENTAL] ListIntegrations: List available integrations.

List all available integrations.  &#x60;&#x60;&#x60;\&quot;licensed\&quot;&#x60;&#x60;&#x60; indicates your domain is licensed to use this integration. To request a licence  contact your [FINBOURNE sales representative](https://www.finbourne.com/contact/).  Any authenticated user can call this method.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.IntegrationsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IntegrationsApiExample {

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
        // IntegrationsApi apiInstance = apiFactory.build(IntegrationsApi.class);

        IntegrationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IntegrationsApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // List<IntegrationDescription> result = apiInstance.listIntegrations().execute(opts);

            List<IntegrationDescription> result = apiInstance.listIntegrations().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationsApi#listIntegrations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;IntegrationDescription&gt;**](IntegrationDescription.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## setInstanceOptionalPropertyMapping

> Map&lt;String, LusidPropertyDefinitionOverridesByType&gt; setInstanceOptionalPropertyMapping(instanceId, integration, requestBody)

[EXPERIMENTAL] SetInstanceOptionalPropertyMapping: Set the Optional Property Mapping for an Integration Instance

The full list of properties must be supplied, the removal of a property from this list will remove it from the integration instance

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.IntegrationsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IntegrationsApiExample {

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
        // IntegrationsApi apiInstance = apiFactory.build(IntegrationsApi.class);

        IntegrationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IntegrationsApi.class);
        String instanceId = "instanceId_example"; // String | Identifier of the instance
        String integration = "integration_example"; // String | The type of the integration e.g. \"copp-clark\".
        Map<String, LusidPropertyDefinitionOverridesByType> requestBody = new HashMap(); // Map<String, LusidPropertyDefinitionOverridesByType> | Properties to be included and any overrides
        try {
            // uncomment the below to set overrides at the request level
            // Map<String, LusidPropertyDefinitionOverridesByType> result = apiInstance.setInstanceOptionalPropertyMapping(instanceId, integration, requestBody).execute(opts);

            Map<String, LusidPropertyDefinitionOverridesByType> result = apiInstance.setInstanceOptionalPropertyMapping(instanceId, integration, requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationsApi#setInstanceOptionalPropertyMapping");
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
| **instanceId** | **String**| Identifier of the instance | |
| **integration** | **String**| The type of the integration e.g. \&quot;copp-clark\&quot;. | |
| **requestBody** | [**Map&lt;String, LusidPropertyDefinitionOverridesByType&gt;**](LusidPropertyDefinitionOverridesByType.md)| Properties to be included and any overrides | [optional] |

### Return type

[**Map&lt;String, LusidPropertyDefinitionOverridesByType&gt;**](LusidPropertyDefinitionOverridesByType.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | The requested instance(s) do not exist. |  -  |
| **400** | The details of the input related failure |  -  |
| **200** | OK |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateInstance

> updateInstance(instanceId, updateInstanceRequest)

[EXPERIMENTAL] UpdateInstance: Update a single integration instance.

Updates an existing instance of an integration, returning its identifier.  The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.IntegrationsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IntegrationsApiExample {

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
        // IntegrationsApi apiInstance = apiFactory.build(IntegrationsApi.class);

        IntegrationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IntegrationsApi.class);
        String instanceId = "instanceId_example"; // String | Instance identifier e.g. \"b64135e7-98a0-41af-a845-d86167d54cc7\".
        UpdateInstanceRequest updateInstanceRequest = new UpdateInstanceRequest(); // UpdateInstanceRequest | The new integration instance.
        try {
            // uncomment the below to set overrides at the request level
            // apiInstance.updateInstance(instanceId, updateInstanceRequest).execute(opts);

            apiInstance.updateInstance(instanceId, updateInstanceRequest).execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationsApi#updateInstance");
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
| **instanceId** | **String**| Instance identifier e.g. \&quot;b64135e7-98a0-41af-a845-d86167d54cc7\&quot;. | |
| **updateInstanceRequest** | [**UpdateInstanceRequest**](UpdateInstanceRequest.md)| The new integration instance. | [optional] |

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | The instance does not exist. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

