# com.finbourne.horizon.model.PagedResourceListOfVendorProduct

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]
**values** | [**List&lt;VendorProduct&gt;**](VendorProduct.md) |  | [default to List<VendorProduct>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.horizon.model.PagedResourceListOfVendorProduct;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String NextPage = "example NextPage";
@jakarta.annotation.Nullable String PreviousPage = "example PreviousPage";
List<VendorProduct> Values = new List<VendorProduct>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


PagedResourceListOfVendorProduct pagedResourceListOfVendorProductInstance = new PagedResourceListOfVendorProduct()
    .NextPage(NextPage)
    .PreviousPage(PreviousPage)
    .Values(Values)
    .Href(Href)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
