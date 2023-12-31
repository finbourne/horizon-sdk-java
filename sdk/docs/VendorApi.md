# VendorApi

All URIs are relative to *https://fbn-prd.lusid.com/horizon*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCoreFieldMappingsForProductEntity**](VendorApi.md#getCoreFieldMappingsForProductEntity) | **GET** /api/vendor/mappings/fields | [EARLY ACCESS] GetCoreFieldMappingsForProductEntity: Get core field mappings for a given vendor product&#39;s entity. |
| [**getOptionalMappingsForProductEntity**](VendorApi.md#getOptionalMappingsForProductEntity) | **GET** /api/vendor/mappings/optional | [EARLY ACCESS] GetOptionalMappingsForProductEntity: Get a user defined LUSID property mappings for the specified vendor / LUSID entity. |
| [**getPropertyMappingsForProductEntity**](VendorApi.md#getPropertyMappingsForProductEntity) | **GET** /api/vendor/mappings/properties | [EARLY ACCESS] GetPropertyMappingsForProductEntity: Gets the property mappings for a given vendor product&#39;s entity |
| [**queryVendors**](VendorApi.md#queryVendors) | **POST** /api/vendor/$query | [EARLY ACCESS] QueryVendors: Query for vendors and their packages with entities and sub-entities. |
| [**setOptionalMappingsForProductEntity**](VendorApi.md#setOptionalMappingsForProductEntity) | **POST** /api/vendor/mappings/optional | [EARLY ACCESS] SetOptionalMappingsForProductEntity: Create a user defined LUSID property mappings for the specified vendor / LUSID entity. |


<a id="getCoreFieldMappingsForProductEntity"></a>
# **getCoreFieldMappingsForProductEntity**
> List&lt;LusidField&gt; getCoreFieldMappingsForProductEntity(vendorName, productName, lusidEntityType).lusidEntitySubType(lusidEntitySubType).execute();

[EARLY ACCESS] GetCoreFieldMappingsForProductEntity: Get core field mappings for a given vendor product&#39;s entity.

### Example
```java
// Import classes:
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.auth.*;
import com.finbourne.horizon.models.*;
import com.finbourne.horizon.api.VendorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/horizon");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    VendorApi apiInstance = new VendorApi(defaultClient);
    String vendorName = "vendorName_example"; // String | 
    String productName = "productName_example"; // String | 
    String lusidEntityType = "lusidEntityType_example"; // String | 
    String lusidEntitySubType = "lusidEntitySubType_example"; // String | 
    try {
      List<LusidField> result = apiInstance.getCoreFieldMappingsForProductEntity(vendorName, productName, lusidEntityType)
            .lusidEntitySubType(lusidEntitySubType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#getCoreFieldMappingsForProductEntity");
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
| **vendorName** | **String**|  | |
| **productName** | **String**|  | |
| **lusidEntityType** | **String**|  | |
| **lusidEntitySubType** | **String**|  | [optional] |

### Return type

[**List&lt;LusidField&gt;**](LusidField.md)

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

<a id="getOptionalMappingsForProductEntity"></a>
# **getOptionalMappingsForProductEntity**
> Map&lt;String, LusidPropertyDefinitionOverrides&gt; getOptionalMappingsForProductEntity(vendorName, productName, lusidEntityType).lusidEntitySubType(lusidEntitySubType).execute();

[EARLY ACCESS] GetOptionalMappingsForProductEntity: Get a user defined LUSID property mappings for the specified vendor / LUSID entity.

### Example
```java
// Import classes:
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.auth.*;
import com.finbourne.horizon.models.*;
import com.finbourne.horizon.api.VendorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/horizon");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    VendorApi apiInstance = new VendorApi(defaultClient);
    String vendorName = "vendorName_example"; // String | 
    String productName = "productName_example"; // String | 
    String lusidEntityType = "lusidEntityType_example"; // String | 
    String lusidEntitySubType = "lusidEntitySubType_example"; // String | 
    try {
      Map<String, LusidPropertyDefinitionOverrides> result = apiInstance.getOptionalMappingsForProductEntity(vendorName, productName, lusidEntityType)
            .lusidEntitySubType(lusidEntitySubType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#getOptionalMappingsForProductEntity");
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
| **vendorName** | **String**|  | |
| **productName** | **String**|  | |
| **lusidEntityType** | **String**|  | |
| **lusidEntitySubType** | **String**|  | [optional] |

### Return type

[**Map&lt;String, LusidPropertyDefinitionOverrides&gt;**](LusidPropertyDefinitionOverrides.md)

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

<a id="getPropertyMappingsForProductEntity"></a>
# **getPropertyMappingsForProductEntity**
> List&lt;LusidPropertyToVendorFieldMapping&gt; getPropertyMappingsForProductEntity(vendorName, productName, lusidEntityType).lusidEntitySubType(lusidEntitySubType).execute();

[EARLY ACCESS] GetPropertyMappingsForProductEntity: Gets the property mappings for a given vendor product&#39;s entity

### Example
```java
// Import classes:
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.auth.*;
import com.finbourne.horizon.models.*;
import com.finbourne.horizon.api.VendorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/horizon");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    VendorApi apiInstance = new VendorApi(defaultClient);
    String vendorName = "vendorName_example"; // String | 
    String productName = "productName_example"; // String | 
    String lusidEntityType = "lusidEntityType_example"; // String | 
    String lusidEntitySubType = "lusidEntitySubType_example"; // String | 
    try {
      List<LusidPropertyToVendorFieldMapping> result = apiInstance.getPropertyMappingsForProductEntity(vendorName, productName, lusidEntityType)
            .lusidEntitySubType(lusidEntitySubType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#getPropertyMappingsForProductEntity");
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
| **vendorName** | **String**|  | |
| **productName** | **String**|  | |
| **lusidEntityType** | **String**|  | |
| **lusidEntitySubType** | **String**|  | [optional] |

### Return type

[**List&lt;LusidPropertyToVendorFieldMapping&gt;**](LusidPropertyToVendorFieldMapping.md)

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

<a id="queryVendors"></a>
# **queryVendors**
> PagedResourceListOfVendorProduct queryVendors(queryRequest).execute();

[EARLY ACCESS] QueryVendors: Query for vendors and their packages with entities and sub-entities.

### Example
```java
// Import classes:
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.auth.*;
import com.finbourne.horizon.models.*;
import com.finbourne.horizon.api.VendorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/horizon");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    VendorApi apiInstance = new VendorApi(defaultClient);
    QueryRequest queryRequest = new QueryRequest(); // QueryRequest | 
    try {
      PagedResourceListOfVendorProduct result = apiInstance.queryVendors(queryRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#queryVendors");
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
| **queryRequest** | [**QueryRequest**](QueryRequest.md)|  | |

### Return type

[**PagedResourceListOfVendorProduct**](PagedResourceListOfVendorProduct.md)

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

<a id="setOptionalMappingsForProductEntity"></a>
# **setOptionalMappingsForProductEntity**
> Map&lt;String, LusidPropertyDefinitionOverridesResponse&gt; setOptionalMappingsForProductEntity(vendorName, productName, lusidEntityType, requestBody).lusidEntitySubType(lusidEntitySubType).execute();

[EARLY ACCESS] SetOptionalMappingsForProductEntity: Create a user defined LUSID property mappings for the specified vendor / LUSID entity.

### Example
```java
// Import classes:
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.auth.*;
import com.finbourne.horizon.models.*;
import com.finbourne.horizon.api.VendorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/horizon");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    VendorApi apiInstance = new VendorApi(defaultClient);
    String vendorName = "vendorName_example"; // String | 
    String productName = "productName_example"; // String | 
    String lusidEntityType = "lusidEntityType_example"; // String | 
    Map<String, LusidPropertyDefinitionOverrides> requestBody = new HashMap(); // Map<String, LusidPropertyDefinitionOverrides> | 
    String lusidEntitySubType = "lusidEntitySubType_example"; // String | 
    try {
      Map<String, LusidPropertyDefinitionOverridesResponse> result = apiInstance.setOptionalMappingsForProductEntity(vendorName, productName, lusidEntityType, requestBody)
            .lusidEntitySubType(lusidEntitySubType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#setOptionalMappingsForProductEntity");
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
| **vendorName** | **String**|  | |
| **productName** | **String**|  | |
| **lusidEntityType** | **String**|  | |
| **requestBody** | [**Map&lt;String, LusidPropertyDefinitionOverrides&gt;**](LusidPropertyDefinitionOverrides.md)|  | |
| **lusidEntitySubType** | **String**|  | [optional] |

### Return type

[**Map&lt;String, LusidPropertyDefinitionOverridesResponse&gt;**](LusidPropertyDefinitionOverridesResponse.md)

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

