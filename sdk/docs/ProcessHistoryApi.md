# ProcessHistoryApi

All URIs are relative to *https://fbn-prd.lusid.com/horizon*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCompleteEvent**](ProcessHistoryApi.md#createCompleteEvent) | **POST** /api/process-history/event/complete | [EARLY ACCESS] CreateCompleteEvent: Write a completed event to the Horizon Dashboard |
| [**createUpdateEvent**](ProcessHistoryApi.md#createUpdateEvent) | **POST** /api/process-history/event/update | [EARLY ACCESS] CreateUpdateEvent: Write an update event to the Horizon Dashboard |
| [**getLatestRuns**](ProcessHistoryApi.md#getLatestRuns) | **GET** /api/process-history/$latestRuns | [EARLY ACCESS] GetLatestRuns: Get latest run for each process |
| [**processEntryUpdates**](ProcessHistoryApi.md#processEntryUpdates) | **POST** /api/process-history/entries/$query | [EARLY ACCESS] ProcessEntryUpdates: Get process entry updates for a query |
| [**processHistoryEntries**](ProcessHistoryApi.md#processHistoryEntries) | **POST** /api/process-history/$query | [EARLY ACCESS] ProcessHistoryEntries: Get process history entries |



## createCompleteEvent

> AuditCompleteResponse createCompleteEvent(auditCompleteRequest)

[EARLY ACCESS] CreateCompleteEvent: Write a completed event to the Horizon Dashboard

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.ProcessHistoryApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ProcessHistoryApiExample {

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
        // ProcessHistoryApi apiInstance = apiFactory.build(ProcessHistoryApi.class);

        ProcessHistoryApi apiInstance = ApiFactoryBuilder.build(fileName).build(ProcessHistoryApi.class);
        AuditCompleteRequest auditCompleteRequest = new AuditCompleteRequest(); // AuditCompleteRequest | 
        try {
            // uncomment the below to set overrides at the request level
            // AuditCompleteResponse result = apiInstance.createCompleteEvent(auditCompleteRequest).execute(opts);

            AuditCompleteResponse result = apiInstance.createCompleteEvent(auditCompleteRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessHistoryApi#createCompleteEvent");
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
| **auditCompleteRequest** | [**AuditCompleteRequest**](AuditCompleteRequest.md)|  | |

### Return type

[**AuditCompleteResponse**](AuditCompleteResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## createUpdateEvent

> AuditUpdateResponse createUpdateEvent(auditUpdateRequest)

[EARLY ACCESS] CreateUpdateEvent: Write an update event to the Horizon Dashboard

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.ProcessHistoryApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ProcessHistoryApiExample {

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
        // ProcessHistoryApi apiInstance = apiFactory.build(ProcessHistoryApi.class);

        ProcessHistoryApi apiInstance = ApiFactoryBuilder.build(fileName).build(ProcessHistoryApi.class);
        AuditUpdateRequest auditUpdateRequest = new AuditUpdateRequest(); // AuditUpdateRequest | 
        try {
            // uncomment the below to set overrides at the request level
            // AuditUpdateResponse result = apiInstance.createUpdateEvent(auditUpdateRequest).execute(opts);

            AuditUpdateResponse result = apiInstance.createUpdateEvent(auditUpdateRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessHistoryApi#createUpdateEvent");
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
| **auditUpdateRequest** | [**AuditUpdateRequest**](AuditUpdateRequest.md)|  | |

### Return type

[**AuditUpdateResponse**](AuditUpdateResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getLatestRuns

> List&lt;ProcessInformation&gt; getLatestRuns()

[EARLY ACCESS] GetLatestRuns: Get latest run for each process

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.ProcessHistoryApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ProcessHistoryApiExample {

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
        // ProcessHistoryApi apiInstance = apiFactory.build(ProcessHistoryApi.class);

        ProcessHistoryApi apiInstance = ApiFactoryBuilder.build(fileName).build(ProcessHistoryApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // List<ProcessInformation> result = apiInstance.getLatestRuns().execute(opts);

            List<ProcessInformation> result = apiInstance.getLatestRuns().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessHistoryApi#getLatestRuns");
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

[**List&lt;ProcessInformation&gt;**](ProcessInformation.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## processEntryUpdates

> PagedResourceListOfProcessUpdateResult processEntryUpdates(runId, queryRequest)

[EARLY ACCESS] ProcessEntryUpdates: Get process entry updates for a query

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.ProcessHistoryApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ProcessHistoryApiExample {

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
        // ProcessHistoryApi apiInstance = apiFactory.build(ProcessHistoryApi.class);

        ProcessHistoryApi apiInstance = ApiFactoryBuilder.build(fileName).build(ProcessHistoryApi.class);
        String runId = "runId_example"; // String | 
        QueryRequest queryRequest = new QueryRequest(); // QueryRequest | 
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfProcessUpdateResult result = apiInstance.processEntryUpdates(runId, queryRequest).execute(opts);

            PagedResourceListOfProcessUpdateResult result = apiInstance.processEntryUpdates(runId, queryRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessHistoryApi#processEntryUpdates");
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
| **runId** | **String**|  | |
| **queryRequest** | [**QueryRequest**](QueryRequest.md)|  | |

### Return type

[**PagedResourceListOfProcessUpdateResult**](PagedResourceListOfProcessUpdateResult.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## processHistoryEntries

> PagedResourceListOfProcessInformation processHistoryEntries(queryRequest, processName)

[EARLY ACCESS] ProcessHistoryEntries: Get process history entries

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.ProcessHistoryApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ProcessHistoryApiExample {

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
        // ProcessHistoryApi apiInstance = apiFactory.build(ProcessHistoryApi.class);

        ProcessHistoryApi apiInstance = ApiFactoryBuilder.build(fileName).build(ProcessHistoryApi.class);
        QueryRequest queryRequest = new QueryRequest(); // QueryRequest | 
        String processName = "processName_example"; // String | 
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfProcessInformation result = apiInstance.processHistoryEntries(queryRequest, processName).execute(opts);

            PagedResourceListOfProcessInformation result = apiInstance.processHistoryEntries(queryRequest, processName).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessHistoryApi#processHistoryEntries");
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
| **queryRequest** | [**QueryRequest**](QueryRequest.md)|  | |
| **processName** | **String**|  | [optional] |

### Return type

[**PagedResourceListOfProcessInformation**](PagedResourceListOfProcessInformation.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

