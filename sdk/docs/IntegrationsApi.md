# IntegrationsApi

All URIs are relative to *https://fbn-prd.lusid.com/horizon*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInstance**](IntegrationsApi.md#createInstance) | **POST** /api/integrations/instances | [EXPERIMENTAL] CreateInstance: Create a single integration instance. |
| [**deleteInstance**](IntegrationsApi.md#deleteInstance) | **DELETE** /api/integrations/instances/{instanceId} | [EXPERIMENTAL] DeleteInstance: Delete a single integration instance. |
| [**executeInstance**](IntegrationsApi.md#executeInstance) | **POST** /api/integrations/instances/{instanceId}/execute | [EXPERIMENTAL] ExecuteInstance: Execute an integration instance. |
| [**getSchema**](IntegrationsApi.md#getSchema) | **GET** /api/integrations/schema/{integration} | [EXPERIMENTAL] GetSchema: Get the JSON schema for the details section of an integration instance. |
| [**listInstances**](IntegrationsApi.md#listInstances) | **GET** /api/integrations/instances | [EXPERIMENTAL] ListInstances: List instances across all integrations. |
| [**listIntegrations**](IntegrationsApi.md#listIntegrations) | **GET** /api/integrations | [EXPERIMENTAL] ListIntegrations: List available integrations. |
| [**updateInstance**](IntegrationsApi.md#updateInstance) | **PUT** /api/integrations/instances/{instanceId} | [EXPERIMENTAL] UpdateInstance: Update a single integration instance. |


<a id="createInstance"></a>
# **createInstance**
> InstanceIdentifier createInstance().createInstanceRequest(createInstanceRequest).execute();

[EXPERIMENTAL] CreateInstance: Create a single integration instance.

&lt;br&gt;Creates a new instance of an integration, returning its identifier.  &lt;br /&gt;  &lt;br /&gt;  &lt;br&gt;The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.

### Example
```java
// Import classes:
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.auth.*;
import com.finbourne.horizon.models.*;
import com.finbourne.horizon.api.IntegrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/horizon");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    IntegrationsApi apiInstance = new IntegrationsApi(defaultClient);
    CreateInstanceRequest createInstanceRequest = new CreateInstanceRequest(); // CreateInstanceRequest | The new integration instance.
    try {
      InstanceIdentifier result = apiInstance.createInstance()
            .createInstanceRequest(createInstanceRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#createInstance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
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

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Identifier of the created instance. |  -  |
| **404** | The integration type does not exist. |  -  |
| **0** | Error response |  -  |

<a id="deleteInstance"></a>
# **deleteInstance**
> deleteInstance(instanceId).execute();

[EXPERIMENTAL] DeleteInstance: Delete a single integration instance.

&lt;br&gt;Deletes an existing instance of an integration, returning its identifier.  &lt;br /&gt;  &lt;br /&gt;  &lt;br&gt;The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.

### Example
```java
// Import classes:
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.auth.*;
import com.finbourne.horizon.models.*;
import com.finbourne.horizon.api.IntegrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/horizon");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    IntegrationsApi apiInstance = new IntegrationsApi(defaultClient);
    String instanceId = "instanceId_example"; // String | Instance identifier e.g. \"b64135e7-98a0-41af-a845-d86167d54cc7\".
    try {
      apiInstance.deleteInstance(instanceId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#deleteInstance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
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

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The instance was deleted. |  -  |
| **404** | The instance does not exist. |  -  |
| **0** | Error response |  -  |

<a id="executeInstance"></a>
# **executeInstance**
> ExecuteInstanceResponse executeInstance(instanceId).execute();

[EXPERIMENTAL] ExecuteInstance: Execute an integration instance.

&lt;br&gt;Starts execution of an instance, returning its execution identifier.  &lt;br /&gt;  &lt;br /&gt;  &lt;br&gt;The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.

### Example
```java
// Import classes:
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.auth.*;
import com.finbourne.horizon.models.*;
import com.finbourne.horizon.api.IntegrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/horizon");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    IntegrationsApi apiInstance = new IntegrationsApi(defaultClient);
    String instanceId = "instanceId_example"; // String | Instance identifier e.g. \"b64135e7-98a0-41af-a845-d86167d54cc7\".
    try {
      ExecuteInstanceResponse result = apiInstance.executeInstance(instanceId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#executeInstance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
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

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The execution id |  -  |
| **404** | The integration instance does not exist |  -  |
| **0** | Error response |  -  |

<a id="getSchema"></a>
# **getSchema**
> String getSchema(integration).execute();

[EXPERIMENTAL] GetSchema: Get the JSON schema for the details section of an integration instance.

&lt;br&gt;The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.

### Example
```java
// Import classes:
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.auth.*;
import com.finbourne.horizon.models.*;
import com.finbourne.horizon.api.IntegrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/horizon");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    IntegrationsApi apiInstance = new IntegrationsApi(defaultClient);
    String integration = "integration_example"; // String | The type of the integration e.g. \"copp-clark\".
    try {
      String result = apiInstance.getSchema(integration)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#getSchema");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
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

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The system defined JSON schema for the details of a specified integration. |  -  |
| **404** | The integration type does not exist or is not enabled. |  -  |
| **0** | Error response |  -  |

<a id="listInstances"></a>
# **listInstances**
> IntegrationInstance listInstances().execute();

[EXPERIMENTAL] ListInstances: List instances across all integrations.

&lt;br&gt;The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.

### Example
```java
// Import classes:
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.auth.*;
import com.finbourne.horizon.models.*;
import com.finbourne.horizon.api.IntegrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/horizon");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    IntegrationsApi apiInstance = new IntegrationsApi(defaultClient);
    try {
      IntegrationInstance result = apiInstance.listInstances()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#listInstances");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IntegrationInstance**](IntegrationInstance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | The requested instance(s) do not exist. |  -  |
| **0** | Error response |  -  |

<a id="listIntegrations"></a>
# **listIntegrations**
> List&lt;IntegrationDescription&gt; listIntegrations().execute();

[EXPERIMENTAL] ListIntegrations: List available integrations.

&lt;br&gt;List all available integrations.  &lt;br /&gt;  &lt;br&gt;   &#x60;&#x60;&#x60;\&quot;licensed\&quot;&#x60;&#x60;&#x60; indicates your domain is licensed to use this integration. To request a licence   contact your [FINBOURNE sales representative](https://www.finbourne.com/contact/).  &lt;br /&gt;  &lt;br&gt;Any authenticated user can call this method.

### Example
```java
// Import classes:
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.auth.*;
import com.finbourne.horizon.models.*;
import com.finbourne.horizon.api.IntegrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/horizon");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    IntegrationsApi apiInstance = new IntegrationsApi(defaultClient);
    try {
      List<IntegrationDescription> result = apiInstance.listIntegrations()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#listIntegrations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;IntegrationDescription&gt;**](IntegrationDescription.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Error response |  -  |

<a id="updateInstance"></a>
# **updateInstance**
> updateInstance(instanceId).updateInstanceRequest(updateInstanceRequest).execute();

[EXPERIMENTAL] UpdateInstance: Update a single integration instance.

&lt;br&gt;Updates an existing instance of an integration, returning its identifier.  &lt;br /&gt;  &lt;br /&gt;  &lt;br&gt;The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.

### Example
```java
// Import classes:
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.auth.*;
import com.finbourne.horizon.models.*;
import com.finbourne.horizon.api.IntegrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/horizon");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    IntegrationsApi apiInstance = new IntegrationsApi(defaultClient);
    String instanceId = "instanceId_example"; // String | Instance identifier e.g. \"b64135e7-98a0-41af-a845-d86167d54cc7\".
    UpdateInstanceRequest updateInstanceRequest = new UpdateInstanceRequest(); // UpdateInstanceRequest | The new integration instance.
    try {
      apiInstance.updateInstance(instanceId)
            .updateInstanceRequest(updateInstanceRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#updateInstance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
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

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The instance was updated. |  -  |
| **404** | The instance does not exist. |  -  |
| **0** | Error response |  -  |

