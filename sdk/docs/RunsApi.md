# RunsApi

All URIs are relative to *https://fbn-prd.lusid.com/horizon*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRunResults**](RunsApi.md#getRunResults) | **GET** /api/runs | [EXPERIMENTAL] GetRunResults: Get run results |
| [**rerunInstance**](RunsApi.md#rerunInstance) | **PUT** /api/runs/{runId}/rerun | [EXPERIMENTAL] RerunInstance: Reruns a single instance execution. |



## getRunResults

> PagedResourceListOfIntegrationRunResponse getRunResults(filter, sortBy, limit, pageToken)

[EXPERIMENTAL] GetRunResults: Get run results

Get run results

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.RunsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RunsApiExample {

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
        // RunsApi apiInstance = apiFactory.build(RunsApi.class);

        RunsApi apiInstance = ApiFactoryBuilder.build(fileName).build(RunsApi.class);
        String filter = "filter_example"; // String | Expression to filter the result set.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
        Integer limit = 100; // Integer | When paginating, limit the results to this number.
        String pageToken = ""; // String | The pagination token to use to continue listing integration runs; this value is returned from   the previous call. If a pagination token is provided, the <i>sortBy</i> and <i>filter</i> fields must not have changed since the original request.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfIntegrationRunResponse result = apiInstance.getRunResults(filter, sortBy, limit, pageToken).execute(opts);

            PagedResourceListOfIntegrationRunResponse result = apiInstance.getRunResults(filter, sortBy, limit, pageToken).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunsApi#getRunResults");
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
| **pageToken** | **String**| The pagination token to use to continue listing integration runs; this value is returned from   the previous call. If a pagination token is provided, the &lt;i&gt;sortBy&lt;/i&gt; and &lt;i&gt;filter&lt;/i&gt; fields must not have changed since the original request. | [optional] [default to ] |

### Return type

[**PagedResourceListOfIntegrationRunResponse**](PagedResourceListOfIntegrationRunResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not Found |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## rerunInstance

> IntegrationRerunResponse rerunInstance(runId)

[EXPERIMENTAL] RerunInstance: Reruns a single instance execution.

&lt;br&gt;Reruns an execution instance of an integration.  &lt;br /&gt;  &lt;br /&gt;  &lt;br&gt;The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.RunsApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RunsApiExample {

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
        // RunsApi apiInstance = apiFactory.build(RunsApi.class);

        RunsApi apiInstance = ApiFactoryBuilder.build(fileName).build(RunsApi.class);
        String runId = "runId_example"; // String | Run identifier e.g. \"b64135e7-98a0-41af-a845-d86167d54cc7\".
        try {
            // uncomment the below to set overrides at the request level
            // IntegrationRerunResponse result = apiInstance.rerunInstance(runId).execute(opts);

            IntegrationRerunResponse result = apiInstance.rerunInstance(runId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunsApi#rerunInstance");
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
| **runId** | **String**| Run identifier e.g. \&quot;b64135e7-98a0-41af-a845-d86167d54cc7\&quot;. | |

### Return type

[**IntegrationRerunResponse**](IntegrationRerunResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The instance was rerun. |  -  |
| **404** | The execution does not exist. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

