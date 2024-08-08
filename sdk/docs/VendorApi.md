# VendorApi

All URIs are relative to *https://fbn-prd.lusid.com/horizon*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCoreFieldMappingsForProductEntity**](VendorApi.md#getCoreFieldMappingsForProductEntity) | **GET** /api/vendor/mappings/fields | [EARLY ACCESS] GetCoreFieldMappingsForProductEntity: Get core field mappings for a given vendor product&#39;s entity. |
| [**getOptionalMappingsForProductEntity**](VendorApi.md#getOptionalMappingsForProductEntity) | **GET** /api/vendor/mappings/optional | [EARLY ACCESS] GetOptionalMappingsForProductEntity: Get a user defined LUSID property mappings for the specified vendor / LUSID entity. |
| [**getPropertyMappingsForProductEntity**](VendorApi.md#getPropertyMappingsForProductEntity) | **GET** /api/vendor/mappings/properties | [EARLY ACCESS] GetPropertyMappingsForProductEntity: Gets the property mappings for a given vendor product&#39;s entity |
| [**queryVendors**](VendorApi.md#queryVendors) | **POST** /api/vendor/$query | [EARLY ACCESS] QueryVendors: Query for vendors and their packages with entities and sub-entities. |
| [**setOptionalMappingsForProductEntity**](VendorApi.md#setOptionalMappingsForProductEntity) | **POST** /api/vendor/mappings/optional | [EARLY ACCESS] SetOptionalMappingsForProductEntity: Create a user defined LUSID property mappings for the specified vendor / LUSID entity. |



## getCoreFieldMappingsForProductEntity

> List&lt;LusidField&gt; getCoreFieldMappingsForProductEntity(vendorName, productName, lusidEntityType, lusidEntitySubType)

[EARLY ACCESS] GetCoreFieldMappingsForProductEntity: Get core field mappings for a given vendor product&#39;s entity.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.VendorApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class VendorApiExample {

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

        VendorApi apiInstance = ApiFactoryBuilder.build(fileName).build(VendorApi.class);
        String vendorName = "vendorName_example"; // String | 
        String productName = "productName_example"; // String | 
        String lusidEntityType = "lusidEntityType_example"; // String | 
        String lusidEntitySubType = "lusidEntitySubType_example"; // String | 
        try {
            List<LusidField> result = apiInstance.getCoreFieldMappingsForProductEntity(vendorName, productName, lusidEntityType, lusidEntitySubType).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#getCoreFieldMappingsForProductEntity");
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
| **vendorName** | **String**|  | |
| **productName** | **String**|  | |
| **lusidEntityType** | **String**|  | |
| **lusidEntitySubType** | **String**|  | [optional] |

### Return type

[**List&lt;LusidField&gt;**](LusidField.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getOptionalMappingsForProductEntity

> Map&lt;String, LusidPropertyDefinitionOverrides&gt; getOptionalMappingsForProductEntity(vendorName, productName, lusidEntityType, lusidEntitySubType)

[EARLY ACCESS] GetOptionalMappingsForProductEntity: Get a user defined LUSID property mappings for the specified vendor / LUSID entity.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.VendorApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class VendorApiExample {

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

        VendorApi apiInstance = ApiFactoryBuilder.build(fileName).build(VendorApi.class);
        String vendorName = "vendorName_example"; // String | 
        String productName = "productName_example"; // String | 
        String lusidEntityType = "lusidEntityType_example"; // String | 
        String lusidEntitySubType = "lusidEntitySubType_example"; // String | 
        try {
            Map<String, LusidPropertyDefinitionOverrides> result = apiInstance.getOptionalMappingsForProductEntity(vendorName, productName, lusidEntityType, lusidEntitySubType).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#getOptionalMappingsForProductEntity");
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
| **vendorName** | **String**|  | |
| **productName** | **String**|  | |
| **lusidEntityType** | **String**|  | |
| **lusidEntitySubType** | **String**|  | [optional] |

### Return type

[**Map&lt;String, LusidPropertyDefinitionOverrides&gt;**](LusidPropertyDefinitionOverrides.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPropertyMappingsForProductEntity

> List&lt;LusidPropertyToVendorFieldMapping&gt; getPropertyMappingsForProductEntity(vendorName, productName, lusidEntityType, lusidEntitySubType)

[EARLY ACCESS] GetPropertyMappingsForProductEntity: Gets the property mappings for a given vendor product&#39;s entity

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.VendorApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class VendorApiExample {

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

        VendorApi apiInstance = ApiFactoryBuilder.build(fileName).build(VendorApi.class);
        String vendorName = "vendorName_example"; // String | 
        String productName = "productName_example"; // String | 
        String lusidEntityType = "lusidEntityType_example"; // String | 
        String lusidEntitySubType = "lusidEntitySubType_example"; // String | 
        try {
            List<LusidPropertyToVendorFieldMapping> result = apiInstance.getPropertyMappingsForProductEntity(vendorName, productName, lusidEntityType, lusidEntitySubType).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#getPropertyMappingsForProductEntity");
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
| **vendorName** | **String**|  | |
| **productName** | **String**|  | |
| **lusidEntityType** | **String**|  | |
| **lusidEntitySubType** | **String**|  | [optional] |

### Return type

[**List&lt;LusidPropertyToVendorFieldMapping&gt;**](LusidPropertyToVendorFieldMapping.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## queryVendors

> PagedResourceListOfVendorProduct queryVendors(queryRequest)

[EARLY ACCESS] QueryVendors: Query for vendors and their packages with entities and sub-entities.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.VendorApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class VendorApiExample {

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

        VendorApi apiInstance = ApiFactoryBuilder.build(fileName).build(VendorApi.class);
        QueryRequest queryRequest = new QueryRequest(); // QueryRequest | 
        try {
            PagedResourceListOfVendorProduct result = apiInstance.queryVendors(queryRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#queryVendors");
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

### Return type

[**PagedResourceListOfVendorProduct**](PagedResourceListOfVendorProduct.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## setOptionalMappingsForProductEntity

> Map&lt;String, LusidPropertyDefinitionOverridesResponse&gt; setOptionalMappingsForProductEntity(vendorName, productName, lusidEntityType, requestBody, lusidEntitySubType)

[EARLY ACCESS] SetOptionalMappingsForProductEntity: Create a user defined LUSID property mappings for the specified vendor / LUSID entity.

### Example

```java
import com.finbourne.horizon.model.*;
import com.finbourne.horizon.api.VendorApi;
import com.finbourne.horizon.extensions.ApiConfigurationException;
import com.finbourne.horizon.extensions.ApiFactoryBuilder;
import com.finbourne.horizon.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class VendorApiExample {

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

        VendorApi apiInstance = ApiFactoryBuilder.build(fileName).build(VendorApi.class);
        String vendorName = "vendorName_example"; // String | 
        String productName = "productName_example"; // String | 
        String lusidEntityType = "lusidEntityType_example"; // String | 
        Map<String, LusidPropertyDefinitionOverrides> requestBody = new HashMap(); // Map<String, LusidPropertyDefinitionOverrides> | 
        String lusidEntitySubType = "lusidEntitySubType_example"; // String | 
        try {
            Map<String, LusidPropertyDefinitionOverridesResponse> result = apiInstance.setOptionalMappingsForProductEntity(vendorName, productName, lusidEntityType, requestBody, lusidEntitySubType).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#setOptionalMappingsForProductEntity");
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
| **vendorName** | **String**|  | |
| **productName** | **String**|  | |
| **lusidEntityType** | **String**|  | |
| **requestBody** | [**Map&lt;String, LusidPropertyDefinitionOverrides&gt;**](LusidPropertyDefinitionOverrides.md)|  | |
| **lusidEntitySubType** | **String**|  | [optional] |

### Return type

[**Map&lt;String, LusidPropertyDefinitionOverridesResponse&gt;**](LusidPropertyDefinitionOverridesResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

