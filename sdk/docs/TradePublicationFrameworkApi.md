# TradePublicationFrameworkApi

All URIs are relative to *https://fbn-prd.lusid.com/horizon*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTpfTransactionHistorySearch**](TradePublicationFrameworkApi.md#getTpfTransactionHistorySearch) | **GET** /api/trade-publication-framework/transactions/search | [EXPERIMENTAL] GetTpfTransactionHistorySearch: Endpoint to search TPF transaction by transaction ID and/or instrument identifier, with filtering by instance and date range |
| [**getTransactionPayload**](TradePublicationFrameworkApi.md#getTransactionPayload) | **GET** /api/trade-publication-framework/instances/{instanceId}/runs/{runId}/transactions/{transactionId}/payload | [EXPERIMENTAL] GetTransactionPayload: Transaction payload detail |
| [**listInstanceRunHistory**](TradePublicationFrameworkApi.md#listInstanceRunHistory) | **GET** /api/trade-publication-framework/instances/{instanceId}/runs | [EXPERIMENTAL] ListInstanceRunHistory: List run history for a given TPF instance, with pagination support. |
| [**listInstancesWithStatus**](TradePublicationFrameworkApi.md#listInstancesWithStatus) | **GET** /api/trade-publication-framework/instances | [EXPERIMENTAL] ListInstancesWithStatus: Lists all instances of the Trade Publication Framework (TPF). |
| [**listRunFiles**](TradePublicationFrameworkApi.md#listRunFiles) | **GET** /api/trade-publication-framework/instances/{instanceId}/runs/{runId}/files | [EXPERIMENTAL] ListRunFiles: List Files in a run |
| [**listRunTransactions**](TradePublicationFrameworkApi.md#listRunTransactions) | **GET** /api/trade-publication-framework/instances/{instanceId}/runs/{runId}/transactions | [EXPERIMENTAL] ListRunTransactions: List Transactions in a run. |
| [**replayTransactions**](TradePublicationFrameworkApi.md#replayTransactions) | **POST** /api/trade-publication-framework/instances/{instanceId}/replay | [EXPERIMENTAL] ReplayTransactions: Replay one or more transactions through a TPF instance |
| [**retryTpfSftpDelivery**](TradePublicationFrameworkApi.md#retryTpfSftpDelivery) | **POST** /api/trade-publication-framework/instances/{instanceId}/files/{fileId}/retry-sftp | [EXPERIMENTAL] RetryTpfSftpDelivery: Retry SFTP delivery for a previously sent TPF file |



## getTpfTransactionHistorySearch

> PagedResourceListOfTpfTransactionSearchResponse getTpfTransactionHistorySearch(transactionId, instrumentId, dateFrom, dateTo, status, instanceId, pageSize, pageToken)

[EXPERIMENTAL] GetTpfTransactionHistorySearch: Endpoint to search TPF transaction by transaction ID and/or instrument identifier, with filtering by instance and date range

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.TradePublicationFrameworkApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TradePublicationFrameworkApiExample {

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
        // TradePublicationFrameworkApi apiInstance = apiFactory.build(TradePublicationFrameworkApi.class);

        TradePublicationFrameworkApi apiInstance = ApiFactoryBuilder.build(fileName).build(TradePublicationFrameworkApi.class);
        String transactionId = "transactionId_example"; // String | 
        String instrumentId = "instrumentId_example"; // String | 
        String dateFrom = "dateFrom_example"; // String | 
        String dateTo = "dateTo_example"; // String | 
        String status = "status_example"; // String | 
        String instanceId = "instanceId_example"; // String | 
        Integer pageSize = 400; // Integer | 
        String pageToken = ""; // String | 
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfTpfTransactionSearchResponse result = apiInstance.getTpfTransactionHistorySearch(transactionId, instrumentId, dateFrom, dateTo, status, instanceId, pageSize, pageToken).execute(opts);

            PagedResourceListOfTpfTransactionSearchResponse result = apiInstance.getTpfTransactionHistorySearch(transactionId, instrumentId, dateFrom, dateTo, status, instanceId, pageSize, pageToken).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TradePublicationFrameworkApi#getTpfTransactionHistorySearch");
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
| **transactionId** | **String**|  | [optional] |
| **instrumentId** | **String**|  | [optional] |
| **dateFrom** | **String**|  | [optional] |
| **dateTo** | **String**|  | [optional] |
| **status** | **String**|  | [optional] |
| **instanceId** | **String**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] [default to 400] |
| **pageToken** | **String**|  | [optional] [default to ] |

### Return type

[**PagedResourceListOfTpfTransactionSearchResponse**](PagedResourceListOfTpfTransactionSearchResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getTransactionPayload

> TransactionPayloadResponse getTransactionPayload(instanceId, runId, transactionId)

[EXPERIMENTAL] GetTransactionPayload: Transaction payload detail

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.TradePublicationFrameworkApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TradePublicationFrameworkApiExample {

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
        // TradePublicationFrameworkApi apiInstance = apiFactory.build(TradePublicationFrameworkApi.class);

        TradePublicationFrameworkApi apiInstance = ApiFactoryBuilder.build(fileName).build(TradePublicationFrameworkApi.class);
        String instanceId = "instanceId_example"; // String | 
        String runId = "runId_example"; // String | 
        String transactionId = "transactionId_example"; // String | 
        try {
            // uncomment the below to set overrides at the request level
            // TransactionPayloadResponse result = apiInstance.getTransactionPayload(instanceId, runId, transactionId).execute(opts);

            TransactionPayloadResponse result = apiInstance.getTransactionPayload(instanceId, runId, transactionId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TradePublicationFrameworkApi#getTransactionPayload");
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
| **instanceId** | **String**|  | |
| **runId** | **String**|  | |
| **transactionId** | **String**|  | |

### Return type

[**TransactionPayloadResponse**](TransactionPayloadResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | The requested TPF instance, run, or transaction payload does not exist. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listInstanceRunHistory

> PagedResourceListOfInstanceRunResponse listInstanceRunHistory(instanceId, page, pageSize)

[EXPERIMENTAL] ListInstanceRunHistory: List run history for a given TPF instance, with pagination support.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.TradePublicationFrameworkApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TradePublicationFrameworkApiExample {

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
        // TradePublicationFrameworkApi apiInstance = apiFactory.build(TradePublicationFrameworkApi.class);

        TradePublicationFrameworkApi apiInstance = ApiFactoryBuilder.build(fileName).build(TradePublicationFrameworkApi.class);
        String instanceId = "instanceId_example"; // String | 
        String page = ""; // String | 
        Integer pageSize = 100; // Integer | 
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfInstanceRunResponse result = apiInstance.listInstanceRunHistory(instanceId, page, pageSize).execute(opts);

            PagedResourceListOfInstanceRunResponse result = apiInstance.listInstanceRunHistory(instanceId, page, pageSize).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TradePublicationFrameworkApi#listInstanceRunHistory");
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
| **instanceId** | **String**|  | |
| **page** | **String**|  | [optional] [default to ] |
| **pageSize** | **Integer**|  | [optional] [default to 100] |

### Return type

[**PagedResourceListOfInstanceRunResponse**](PagedResourceListOfInstanceRunResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listInstancesWithStatus

> InstancesResponse listInstancesWithStatus()

[EXPERIMENTAL] ListInstancesWithStatus: Lists all instances of the Trade Publication Framework (TPF).

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.TradePublicationFrameworkApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TradePublicationFrameworkApiExample {

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
        // TradePublicationFrameworkApi apiInstance = apiFactory.build(TradePublicationFrameworkApi.class);

        TradePublicationFrameworkApi apiInstance = ApiFactoryBuilder.build(fileName).build(TradePublicationFrameworkApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // InstancesResponse result = apiInstance.listInstancesWithStatus().execute(opts);

            InstancesResponse result = apiInstance.listInstancesWithStatus().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TradePublicationFrameworkApi#listInstancesWithStatus");
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

[**InstancesResponse**](InstancesResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listRunFiles

> PagedResourceListOfRunFileResponse listRunFiles(instanceId, runId, page, pageSize)

[EXPERIMENTAL] ListRunFiles: List Files in a run

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.TradePublicationFrameworkApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TradePublicationFrameworkApiExample {

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
        // TradePublicationFrameworkApi apiInstance = apiFactory.build(TradePublicationFrameworkApi.class);

        TradePublicationFrameworkApi apiInstance = ApiFactoryBuilder.build(fileName).build(TradePublicationFrameworkApi.class);
        String instanceId = "instanceId_example"; // String | 
        String runId = "runId_example"; // String | 
        String page = ""; // String | 
        Integer pageSize = 100; // Integer | 
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfRunFileResponse result = apiInstance.listRunFiles(instanceId, runId, page, pageSize).execute(opts);

            PagedResourceListOfRunFileResponse result = apiInstance.listRunFiles(instanceId, runId, page, pageSize).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TradePublicationFrameworkApi#listRunFiles");
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
| **instanceId** | **String**|  | |
| **runId** | **String**|  | |
| **page** | **String**|  | [optional] [default to ] |
| **pageSize** | **Integer**|  | [optional] [default to 100] |

### Return type

[**PagedResourceListOfRunFileResponse**](PagedResourceListOfRunFileResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | The requested TPF instance or run does not exist. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listRunTransactions

> PagedResourceListOfTransactionResponse listRunTransactions(instanceId, runId, status, page, pageSize)

[EXPERIMENTAL] ListRunTransactions: List Transactions in a run.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.TradePublicationFrameworkApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TradePublicationFrameworkApiExample {

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
        // TradePublicationFrameworkApi apiInstance = apiFactory.build(TradePublicationFrameworkApi.class);

        TradePublicationFrameworkApi apiInstance = ApiFactoryBuilder.build(fileName).build(TradePublicationFrameworkApi.class);
        String instanceId = "instanceId_example"; // String | 
        String runId = "runId_example"; // String | 
        String status = "status_example"; // String | 
        String page = ""; // String | 
        Integer pageSize = 100; // Integer | 
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfTransactionResponse result = apiInstance.listRunTransactions(instanceId, runId, status, page, pageSize).execute(opts);

            PagedResourceListOfTransactionResponse result = apiInstance.listRunTransactions(instanceId, runId, status, page, pageSize).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TradePublicationFrameworkApi#listRunTransactions");
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
| **instanceId** | **String**|  | |
| **runId** | **String**|  | |
| **status** | **String**|  | |
| **page** | **String**|  | [optional] [default to ] |
| **pageSize** | **Integer**|  | [optional] [default to 100] |

### Return type

[**PagedResourceListOfTransactionResponse**](PagedResourceListOfTransactionResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | The requested TPF instance or run does not exist. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## replayTransactions

> ReplayTransactionsResponse replayTransactions(instanceId, replayTransactionsRequest)

[EXPERIMENTAL] ReplayTransactions: Replay one or more transactions through a TPF instance

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.TradePublicationFrameworkApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TradePublicationFrameworkApiExample {

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
        // TradePublicationFrameworkApi apiInstance = apiFactory.build(TradePublicationFrameworkApi.class);

        TradePublicationFrameworkApi apiInstance = ApiFactoryBuilder.build(fileName).build(TradePublicationFrameworkApi.class);
        String instanceId = "instanceId_example"; // String | 
        ReplayTransactionsRequest replayTransactionsRequest = new ReplayTransactionsRequest(); // ReplayTransactionsRequest | 
        try {
            // uncomment the below to set overrides at the request level
            // ReplayTransactionsResponse result = apiInstance.replayTransactions(instanceId, replayTransactionsRequest).execute(opts);

            ReplayTransactionsResponse result = apiInstance.replayTransactions(instanceId, replayTransactionsRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TradePublicationFrameworkApi#replayTransactions");
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
| **instanceId** | **String**|  | |
| **replayTransactionsRequest** | [**ReplayTransactionsRequest**](ReplayTransactionsRequest.md)|  | |

### Return type

[**ReplayTransactionsResponse**](ReplayTransactionsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | The requested TPF instance does not exist. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## retryTpfSftpDelivery

> TpfRetrySftpResponse retryTpfSftpDelivery(instanceId, fileId)

[EXPERIMENTAL] RetryTpfSftpDelivery: Retry SFTP delivery for a previously sent TPF file

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.TradePublicationFrameworkApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TradePublicationFrameworkApiExample {

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
        // TradePublicationFrameworkApi apiInstance = apiFactory.build(TradePublicationFrameworkApi.class);

        TradePublicationFrameworkApi apiInstance = ApiFactoryBuilder.build(fileName).build(TradePublicationFrameworkApi.class);
        String instanceId = "instanceId_example"; // String | Integration instance ID
        Long fileId = 56L; // Long | File delivery ID to retry
        try {
            // uncomment the below to set overrides at the request level
            // TpfRetrySftpResponse result = apiInstance.retryTpfSftpDelivery(instanceId, fileId).execute(opts);

            TpfRetrySftpResponse result = apiInstance.retryTpfSftpDelivery(instanceId, fileId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TradePublicationFrameworkApi#retryTpfSftpDelivery");
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
| **instanceId** | **String**| Integration instance ID | |
| **fileId** | **Long**| File delivery ID to retry | |

### Return type

[**TpfRetrySftpResponse**](TpfRetrySftpResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retry succeeded - file re-sent to SFTP |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | File delivery record not found |  -  |
| **409** | Duplicate file detected - same hash already delivered to destination |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

