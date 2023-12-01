# ProcessHistoryApi

All URIs are relative to *https://fbn-prd.lusid.com/horizon*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCompleteEvent**](ProcessHistoryApi.md#createCompleteEvent) | **POST** /api/process-history/event/complete | [EARLY ACCESS] CreateCompleteEvent: Write a completed event to the Horizon Dashboard |
| [**createUpdateEvent**](ProcessHistoryApi.md#createUpdateEvent) | **POST** /api/process-history/event/update | [EARLY ACCESS] CreateUpdateEvent: Write an update event to the Horizon Dashboard |
| [**getLatestRuns**](ProcessHistoryApi.md#getLatestRuns) | **GET** /api/process-history/$latestRuns | [EARLY ACCESS] GetLatestRuns: Get latest run for each process |
| [**processEntryUpdates**](ProcessHistoryApi.md#processEntryUpdates) | **POST** /api/process-history/entries/$query | [EARLY ACCESS] ProcessEntryUpdates: Get process entry updates for a query |
| [**processHistoryEntries**](ProcessHistoryApi.md#processHistoryEntries) | **POST** /api/process-history/$query | [EARLY ACCESS] ProcessHistoryEntries: Get process history entries |


<a id="createCompleteEvent"></a>
# **createCompleteEvent**
> AuditCompleteResponse createCompleteEvent(auditCompleteRequest).execute();

[EARLY ACCESS] CreateCompleteEvent: Write a completed event to the Horizon Dashboard

### Example
```java
// Import classes:
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.auth.*;
import com.finbourne.horizon.models.*;
import com.finbourne.horizon.api.ProcessHistoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/horizon");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProcessHistoryApi apiInstance = new ProcessHistoryApi(defaultClient);
    AuditCompleteRequest auditCompleteRequest = new AuditCompleteRequest(); // AuditCompleteRequest | 
    try {
      AuditCompleteResponse result = apiInstance.createCompleteEvent(auditCompleteRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessHistoryApi#createCompleteEvent");
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
| **auditCompleteRequest** | [**AuditCompleteRequest**](AuditCompleteRequest.md)|  | |

### Return type

[**AuditCompleteResponse**](AuditCompleteResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **0** | Error response |  -  |

<a id="createUpdateEvent"></a>
# **createUpdateEvent**
> AuditUpdateResponse createUpdateEvent(auditUpdateRequest).execute();

[EARLY ACCESS] CreateUpdateEvent: Write an update event to the Horizon Dashboard

### Example
```java
// Import classes:
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.auth.*;
import com.finbourne.horizon.models.*;
import com.finbourne.horizon.api.ProcessHistoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/horizon");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProcessHistoryApi apiInstance = new ProcessHistoryApi(defaultClient);
    AuditUpdateRequest auditUpdateRequest = new AuditUpdateRequest(); // AuditUpdateRequest | 
    try {
      AuditUpdateResponse result = apiInstance.createUpdateEvent(auditUpdateRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessHistoryApi#createUpdateEvent");
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
| **auditUpdateRequest** | [**AuditUpdateRequest**](AuditUpdateRequest.md)|  | |

### Return type

[**AuditUpdateResponse**](AuditUpdateResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **0** | Error response |  -  |

<a id="getLatestRuns"></a>
# **getLatestRuns**
> List&lt;ProcessInformation&gt; getLatestRuns().execute();

[EARLY ACCESS] GetLatestRuns: Get latest run for each process

### Example
```java
// Import classes:
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.auth.*;
import com.finbourne.horizon.models.*;
import com.finbourne.horizon.api.ProcessHistoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/horizon");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProcessHistoryApi apiInstance = new ProcessHistoryApi(defaultClient);
    try {
      List<ProcessInformation> result = apiInstance.getLatestRuns()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessHistoryApi#getLatestRuns");
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

[**List&lt;ProcessInformation&gt;**](ProcessInformation.md)

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

<a id="processEntryUpdates"></a>
# **processEntryUpdates**
> PagedResourceListOfProcessUpdateResult processEntryUpdates(body).execute();

[EARLY ACCESS] ProcessEntryUpdates: Get process entry updates for a query

### Example
```java
// Import classes:
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.auth.*;
import com.finbourne.horizon.models.*;
import com.finbourne.horizon.api.ProcessHistoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/horizon");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProcessHistoryApi apiInstance = new ProcessHistoryApi(defaultClient);
    Object body = null; // Object | 
    try {
      PagedResourceListOfProcessUpdateResult result = apiInstance.processEntryUpdates(body)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessHistoryApi#processEntryUpdates");
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
| **body** | **Object**|  | |

### Return type

[**PagedResourceListOfProcessUpdateResult**](PagedResourceListOfProcessUpdateResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Error response |  -  |

<a id="processHistoryEntries"></a>
# **processHistoryEntries**
> PagedResourceListOfProcessInformation processHistoryEntries(body).execute();

[EARLY ACCESS] ProcessHistoryEntries: Get process history entries

### Example
```java
// Import classes:
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.auth.*;
import com.finbourne.horizon.models.*;
import com.finbourne.horizon.api.ProcessHistoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/horizon");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProcessHistoryApi apiInstance = new ProcessHistoryApi(defaultClient);
    Object body = null; // Object | 
    try {
      PagedResourceListOfProcessInformation result = apiInstance.processHistoryEntries(body)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessHistoryApi#processHistoryEntries");
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
| **body** | **Object**|  | |

### Return type

[**PagedResourceListOfProcessInformation**](PagedResourceListOfProcessInformation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Error response |  -  |

