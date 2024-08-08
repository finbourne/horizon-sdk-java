# IntegrationsApi

All URIs are relative to *https://fbn-prd.lusid.com/horizon*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInstance**](IntegrationsApi.md#createInstance) | **POST** /api/integrations/instances | [EXPERIMENTAL] CreateInstance: Create a single integration instance. |
| [**deleteInstance**](IntegrationsApi.md#deleteInstance) | **DELETE** /api/integrations/instances/{instanceId} | [EXPERIMENTAL] DeleteInstance: Delete a single integration instance. |
| [**executeInstance**](IntegrationsApi.md#executeInstance) | **POST** /api/integrations/instances/{instanceId}/execute | [EXPERIMENTAL] ExecuteInstance: Execute an integration instance. |
| [**getExecutionIdsForInstance**](IntegrationsApi.md#getExecutionIdsForInstance) | **GET** /api/integrations/instances/{instanceId}/executions | [EXPERIMENTAL] GetExecutionIdsForInstance: Get integration instance execution ids. |
| [**getSchema**](IntegrationsApi.md#getSchema) | **GET** /api/integrations/schema/{integration} | [EXPERIMENTAL] GetSchema: Get the JSON schema for the details section of an integration instance. |
| [**listInstances**](IntegrationsApi.md#listInstances) | **GET** /api/integrations/instances | [EXPERIMENTAL] ListInstances: List instances across all integrations. |
| [**listIntegrations**](IntegrationsApi.md#listIntegrations) | **GET** /api/integrations | [EXPERIMENTAL] ListIntegrations: List available integrations. |
| [**updateInstance**](IntegrationsApi.md#updateInstance) | **PUT** /api/integrations/instances/{instanceId} | [EXPERIMENTAL] UpdateInstance: Update a single integration instance. |



## createInstance

> InstanceIdentifier createInstance(createInstanceRequest)

[EXPERIMENTAL] CreateInstance: Create a single integration instance.

&lt;br&gt;Creates a new instance of an integration, returning its identifier.  &lt;br /&gt;  &lt;br /&gt;  &lt;br&gt;The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.

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

        IntegrationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IntegrationsApi.class);
        CreateInstanceRequest createInstanceRequest = new CreateInstanceRequest(); // CreateInstanceRequest | The new integration instance.
        try {
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
| **404** | The integration type does not exist. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteInstance

> deleteInstance(instanceId)

[EXPERIMENTAL] DeleteInstance: Delete a single integration instance.

&lt;br&gt;Deletes an existing instance of an integration, returning its identifier.  &lt;br /&gt;  &lt;br /&gt;  &lt;br&gt;The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.

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

        IntegrationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IntegrationsApi.class);
        String instanceId = "instanceId_example"; // String | Instance identifier e.g. \"b64135e7-98a0-41af-a845-d86167d54cc7\".
        try {
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
| **204** | The instance was deleted. |  -  |
| **404** | The instance does not exist. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## executeInstance

> ExecuteInstanceResponse executeInstance(instanceId)

[EXPERIMENTAL] ExecuteInstance: Execute an integration instance.

&lt;br&gt;Starts execution of an instance, returning its execution identifier.  &lt;br /&gt;  &lt;br /&gt;  &lt;br&gt;The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.

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

        IntegrationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IntegrationsApi.class);
        String instanceId = "instanceId_example"; // String | Instance identifier e.g. \"b64135e7-98a0-41af-a845-d86167d54cc7\".
        try {
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
| **404** | The integration instance does not exist |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getExecutionIdsForInstance

> String getExecutionIdsForInstance(instanceId, limit)

[EXPERIMENTAL] GetExecutionIdsForInstance: Get integration instance execution ids.

&lt;br&gt;Get the most recent execution ids for an integration instance.  &lt;br /&gt;  &lt;br&gt;The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.

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

        IntegrationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IntegrationsApi.class);
        String instanceId = "instanceId_example"; // String | Instance identifier e.g. \"30dc93c6-a127-46bf-aea8-e466d720b72d\".
        Integer limit = 56; // Integer | Maximum number of returned execution ids
        try {
            String result = apiInstance.getExecutionIdsForInstance(instanceId, limit).execute();
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

**String**

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The execution ids sorted by start date (descending) |  -  |
| **404** | The integration instance does not exist |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getSchema

> String getSchema(integration)

[EXPERIMENTAL] GetSchema: Get the JSON schema for the details section of an integration instance.

&lt;br&gt;The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.

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

        IntegrationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IntegrationsApi.class);
        String integration = "integration_example"; // String | The type of the integration e.g. \"copp-clark\".
        try {
            String result = apiInstance.getSchema(integration).execute();
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

**String**

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The system defined JSON schema for the details of a specified integration. |  -  |
| **404** | The integration type does not exist or is not enabled. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listInstances

> IntegrationInstance listInstances()

[EXPERIMENTAL] ListInstances: List instances across all integrations.

&lt;br&gt;The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.

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

        IntegrationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IntegrationsApi.class);
        try {
            IntegrationInstance result = apiInstance.listInstances().execute();
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

[**IntegrationInstance**](IntegrationInstance.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | The requested instance(s) do not exist. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listIntegrations

> List&lt;IntegrationDescription&gt; listIntegrations()

[EXPERIMENTAL] ListIntegrations: List available integrations.

&lt;br&gt;List all available integrations.  &lt;br /&gt;  &lt;br&gt;   &#x60;&#x60;&#x60;\&quot;licensed\&quot;&#x60;&#x60;&#x60; indicates your domain is licensed to use this integration. To request a licence   contact your [FINBOURNE sales representative](https://www.finbourne.com/contact/).  &lt;br /&gt;  &lt;br&gt;Any authenticated user can call this method.

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

        IntegrationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IntegrationsApi.class);
        try {
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
| **200** | Success |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateInstance

> updateInstance(instanceId, updateInstanceRequest)

[EXPERIMENTAL] UpdateInstance: Update a single integration instance.

&lt;br&gt;Updates an existing instance of an integration, returning its identifier.  &lt;br /&gt;  &lt;br /&gt;  &lt;br&gt;The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.

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

        IntegrationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IntegrationsApi.class);
        String instanceId = "instanceId_example"; // String | Instance identifier e.g. \"b64135e7-98a0-41af-a845-d86167d54cc7\".
        UpdateInstanceRequest updateInstanceRequest = new UpdateInstanceRequest(); // UpdateInstanceRequest | The new integration instance.
        try {
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
| **204** | The instance was updated. |  -  |
| **404** | The instance does not exist. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

