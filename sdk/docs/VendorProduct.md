# com.finbourne.horizon.model.VendorProduct
Denormalised information about vendors, the products they provide and the LUSID entity types they can be used to populate.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vendorName** | **String** |  | [default to String]
**productName** | **String** |  | [default to String]
**vendorProductKey** | **String** |  | [default to String]
**lusidEntity** | [**LusidEntity**](LusidEntity.md) |  | [default to LusidEntity]

```java
import com.finbourne.horizon.model.VendorProduct;
import java.util.*;
import java.lang.System;
import java.net.URI;

String VendorName = "example VendorName";
String ProductName = "example ProductName";
String VendorProductKey = "example VendorProductKey";
LusidEntity LusidEntity = new LusidEntity();


VendorProduct vendorProductInstance = new VendorProduct()
    .VendorName(VendorName)
    .ProductName(ProductName)
    .VendorProductKey(VendorProductKey)
    .LusidEntity(LusidEntity);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
