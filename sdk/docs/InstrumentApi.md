# InstrumentApi

All URIs are relative to *https://fbn-prd.lusid.com/horizon*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInstrument**](InstrumentApi.md#createInstrument) | **POST** /api/instrument/onboarding/create | [EARLY ACCESS] CreateInstrument: Creates and masters instruments with third party vendors. |
| [**getOpenFigiParameterOption**](InstrumentApi.md#getOpenFigiParameterOption) | **GET** /api/instrument/onboarding/search/openfigi/parameterOptions | [EARLY ACCESS] GetOpenFigiParameterOption: Get all supported market sector values for OpenFigi search |
| [**retrievePermIdResult**](InstrumentApi.md#retrievePermIdResult) | **GET** /api/instrument/onboarding/search/permid/{id} | [EARLY ACCESS] RetrievePermIdResult: Retrieve PermId results from a previous query. |
| [**searchOpenFigi**](InstrumentApi.md#searchOpenFigi) | **GET** /api/instrument/onboarding/search/openfigi | [EARLY ACCESS] SearchOpenFigi: Search OpenFigi for instruments that match the specified terms. |
| [**vendors**](InstrumentApi.md#vendors) | **GET** /api/instrument/onboarding/vendors | [EARLY ACCESS] Vendors: Gets the VendorProducts of any supported and licenced integrations for a given market sector and security type. |


<a id="createInstrument"></a>
# **createInstrument**
> OnboardInstrumentResponse createInstrument(onboardInstrumentRequest).execute();

[EARLY ACCESS] CreateInstrument: Creates and masters instruments with third party vendors.

### Example
```java
// Import classes:
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.auth.*;
import com.finbourne.horizon.models.*;
import com.finbourne.horizon.api.InstrumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/horizon");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentApi apiInstance = new InstrumentApi(defaultClient);
    OnboardInstrumentRequest onboardInstrumentRequest = new OnboardInstrumentRequest(); // OnboardInstrumentRequest | 
    try {
      OnboardInstrumentResponse result = apiInstance.createInstrument(onboardInstrumentRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentApi#createInstrument");
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
| **onboardInstrumentRequest** | [**OnboardInstrumentRequest**](OnboardInstrumentRequest.md)|  | |

### Return type

[**OnboardInstrumentResponse**](OnboardInstrumentResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **0** | Error response |  -  |

<a id="getOpenFigiParameterOption"></a>
# **getOpenFigiParameterOption**
> List&lt;AllowedParameterValue&gt; getOpenFigiParameterOption(parameterName).execute();

[EARLY ACCESS] GetOpenFigiParameterOption: Get all supported market sector values for OpenFigi search

### Example
```java
// Import classes:
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.auth.*;
import com.finbourne.horizon.models.*;
import com.finbourne.horizon.api.InstrumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/horizon");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentApi apiInstance = new InstrumentApi(defaultClient);
    OpenFigiParameterOptionName parameterName = OpenFigiParameterOptionName.fromValue("IdType"); // OpenFigiParameterOptionName | 
    try {
      List<AllowedParameterValue> result = apiInstance.getOpenFigiParameterOption(parameterName)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentApi#getOpenFigiParameterOption");
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
| **parameterName** | [**OpenFigiParameterOptionName**](.md)|  | [enum: IdType, ExchangeCode, MicCode, Currency, MarketSector, SecurityType, GeneralSecurityType, StateCode] |

### Return type

[**List&lt;AllowedParameterValue&gt;**](AllowedParameterValue.md)

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

<a id="retrievePermIdResult"></a>
# **retrievePermIdResult**
> List&lt;PermIdData&gt; retrievePermIdResult(id).execute();

[EARLY ACCESS] RetrievePermIdResult: Retrieve PermId results from a previous query.

### Example
```java
// Import classes:
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.auth.*;
import com.finbourne.horizon.models.*;
import com.finbourne.horizon.api.InstrumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/horizon");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentApi apiInstance = new InstrumentApi(defaultClient);
    String id = "id_example"; // String | The execution ID returned by a previous query
    try {
      List<PermIdData> result = apiInstance.retrievePermIdResult(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentApi#retrievePermIdResult");
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
| **id** | **String**| The execution ID returned by a previous query | |

### Return type

[**List&lt;PermIdData&gt;**](PermIdData.md)

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

<a id="searchOpenFigi"></a>
# **searchOpenFigi**
> OpenFigiSearchResult searchOpenFigi(query, usePermId).limit(limit).marketSector(marketSector).execute();

[EARLY ACCESS] SearchOpenFigi: Search OpenFigi for instruments that match the specified terms.

### Example
```java
// Import classes:
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.auth.*;
import com.finbourne.horizon.models.*;
import com.finbourne.horizon.api.InstrumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/horizon");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentApi apiInstance = new InstrumentApi(defaultClient);
    String query = "query_example"; // String | 
    Boolean usePermId = false; // Boolean | Should also search PermId for additional information, defaults to `false`.
    Integer limit = 25; // Integer | Only affects results rom OpenFigi general text search
    String marketSector = "All"; // String | The market sector to search, defaults to `All`.
    try {
      OpenFigiSearchResult result = apiInstance.searchOpenFigi(query, usePermId)
            .limit(limit)
            .marketSector(marketSector)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentApi#searchOpenFigi");
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
| **query** | **String**|  | |
| **usePermId** | **Boolean**| Should also search PermId for additional information, defaults to &#x60;false&#x60;. | [default to false] |
| **limit** | **Integer**| Only affects results rom OpenFigi general text search | [optional] [default to 25] |
| **marketSector** | **String**| The market sector to search, defaults to &#x60;All&#x60;. | [optional] [default to All] |

### Return type

[**OpenFigiSearchResult**](OpenFigiSearchResult.md)

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

<a id="vendors"></a>
# **vendors**
> List&lt;VendorProduct&gt; vendors(marketSector, securityType).execute();

[EARLY ACCESS] Vendors: Gets the VendorProducts of any supported and licenced integrations for a given market sector and security type.

### Example
```java
// Import classes:
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.auth.*;
import com.finbourne.horizon.models.*;
import com.finbourne.horizon.api.InstrumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/horizon");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentApi apiInstance = new InstrumentApi(defaultClient);
    String marketSector = "marketSector_example"; // String | 
    String securityType = "securityType_example"; // String | 
    try {
      List<VendorProduct> result = apiInstance.vendors(marketSector, securityType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentApi#vendors");
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
| **marketSector** | **String**|  | |
| **securityType** | **String**|  | |

### Return type

[**List&lt;VendorProduct&gt;**](VendorProduct.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **0** | Error response |  -  |

