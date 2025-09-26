# com.finbourne.horizon.model.LusidPropertyToVendorFieldMapping
The mapping of a LUSID Property from the Vendor Field that would populate it

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**property** | [**LusidPropertyDefinition**](LusidPropertyDefinition.md) |  | [default to LusidPropertyDefinition]
**vendorField** | **String** |  | [default to String]
**vendorPackage** | **String** |  | [default to String]
**vendorNamespace** | **String** |  | [default to String]
**optionality** | [**Optionality**](Optionality.md) |  | [default to Optionality]

```java
import com.finbourne.horizon.model.LusidPropertyToVendorFieldMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

LusidPropertyDefinition Property = new LusidPropertyDefinition();
String VendorField = "example VendorField";
String VendorPackage = "example VendorPackage";
String VendorNamespace = "example VendorNamespace";
Optionality 

LusidPropertyToVendorFieldMapping lusidPropertyToVendorFieldMappingInstance = new LusidPropertyToVendorFieldMapping()
    .Property(Property)
    .VendorField(VendorField)
    .VendorPackage(VendorPackage)
    .VendorNamespace(VendorNamespace)
    .Optionality(Optionality);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
