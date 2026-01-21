# LogsApi

All URIs are relative to *https://fbn-prd.lusid.com/horizon*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getIntegrationLogResults**](LogsApi.md#getIntegrationLogResults) | **GET** /api/logs | [EXPERIMENTAL] GetIntegrationLogResults: Get integration log results |
| [**insertExternalLogs**](LogsApi.md#insertExternalLogs) | **POST** /api/logs/{instanceid}/{runid} | [EXPERIMENTAL] InsertExternalLogs: Inserts external logs into the specified ExternalApp Integration instance execution |



## getIntegrationLogResults

> PagedResourceListOfIIntegrationLogResponse getIntegrationLogResults(filter, sortBy, limit, pageToken)

[EXPERIMENTAL] GetIntegrationLogResults: Get integration log results

Get integration log results

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.LogsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LogsApiExample {

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
        // LogsApi apiInstance = apiFactory.build(LogsApi.class);

        LogsApi apiInstance = ApiFactoryBuilder.build(fileName).build(LogsApi.class);
        String filter = "filter_example"; // String | Expression to filter the result set.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
        Integer limit = 100; // Integer | When paginating, limit the results to this number.
        String pageToken = ""; // String | The pagination token to use to continue listing integration logs; this value is returned from  the previous call. If a pagination token is provided, the <i>sortBy</i> and <i>filter</i> fields must not have changed since the original request.  For more information, see https://support.lusid.com/knowledgebase/article/KA-01915.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfIIntegrationLogResponse result = apiInstance.getIntegrationLogResults(filter, sortBy, limit, pageToken).execute(opts);

            PagedResourceListOfIIntegrationLogResponse result = apiInstance.getIntegrationLogResults(filter, sortBy, limit, pageToken).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsApi#getIntegrationLogResults");
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
| **filter** | **String**| Expression to filter the result set. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. | [optional] [default to 100] |
| **pageToken** | **String**| The pagination token to use to continue listing integration logs; this value is returned from  the previous call. If a pagination token is provided, the &lt;i&gt;sortBy&lt;/i&gt; and &lt;i&gt;filter&lt;/i&gt; fields must not have changed since the original request.  For more information, see https://support.lusid.com/knowledgebase/article/KA-01915. | [optional] [default to ] |

### Return type

[**PagedResourceListOfIIntegrationLogResponse**](PagedResourceListOfIIntegrationLogResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | Not Found |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## insertExternalLogs

> Object insertExternalLogs(instanceid, runid, externalLogInsertionRequest)

[EXPERIMENTAL] InsertExternalLogs: Inserts external logs into the specified ExternalApp Integration instance execution

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.LogsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LogsApiExample {

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
        // LogsApi apiInstance = apiFactory.build(LogsApi.class);

        LogsApi apiInstance = ApiFactoryBuilder.build(fileName).build(LogsApi.class);
        String instanceid = "instanceid_example"; // String | 
        String runid = "runid_example"; // String | 
        ExternalLogInsertionRequest externalLogInsertionRequest = new ExternalLogInsertionRequest(); // ExternalLogInsertionRequest | 
        try {
            // uncomment the below to set overrides at the request level
            // Object result = apiInstance.insertExternalLogs(instanceid, runid, externalLogInsertionRequest).execute(opts);

            Object result = apiInstance.insertExternalLogs(instanceid, runid, externalLogInsertionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsApi#insertExternalLogs");
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
| **instanceid** | **String**|  | |
| **runid** | **String**|  | |
| **externalLogInsertionRequest** | [**ExternalLogInsertionRequest**](ExternalLogInsertionRequest.md)|  | |

### Return type

**Object**

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

