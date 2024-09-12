# RunsApi

All URIs are relative to *https://fbn-prd.lusid.com/horizon*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRunResults**](RunsApi.md#getRunResults) | **GET** /api/runs | [EXPERIMENTAL] GetRunResults:  |



## getRunResults

> IntegrationRunResponse getRunResults(filter, sortBy, limit, pageToken)

[EXPERIMENTAL] GetRunResults: 

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
        String filter = "filter_example"; // String | 
        List<String> sortBy = Arrays.asList(); // List<String> | 
        Integer limit = 10; // Integer | 
        String pageToken = ""; // String | 
        try {
            // uncomment the below to set overrides at the request level
            // IntegrationRunResponse result = apiInstance.getRunResults(filter, sortBy, limit, pageToken).execute(opts);

            IntegrationRunResponse result = apiInstance.getRunResults(filter, sortBy, limit, pageToken).execute();
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
| **filter** | **String**|  | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 10] |
| **pageToken** | **String**|  | [optional] [default to ] |

### Return type

[**IntegrationRunResponse**](IntegrationRunResponse.md)

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

