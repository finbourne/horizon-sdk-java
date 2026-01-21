# com.finbourne.horizon.model.IPropertyMapping

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entitySubType** | **String** |  | [optional] [default to String]
**entityType** | **String** |  | [default to String]
**optionality** | **String** |  | [default to String]
**property** | [**LusidPropertyDefinition**](LusidPropertyDefinition.md) |  | [default to LusidPropertyDefinition]
**transformationDescription** | **String** |  | [optional] [default to String]
**vendorFields** | [**List&lt;VendorField&gt;**](VendorField.md) |  | [default to List<VendorField>]
**versions** | **List&lt;String&gt;** |  | [default to List<String>]

```java
import com.finbourne.horizon.model.IPropertyMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String EntitySubType = "example EntitySubType";
String EntityType = "example EntityType";
String Optionality = "example Optionality";
LusidPropertyDefinition Property = new LusidPropertyDefinition();
@jakarta.annotation.Nullable String TransformationDescription = "example TransformationDescription";
List<VendorField> VendorFields = new List<VendorField>();
List<String> Versions = new List<String>();


IPropertyMapping iPropertyMappingInstance = new IPropertyMapping()
    .EntitySubType(EntitySubType)
    .EntityType(EntityType)
    .Optionality(Optionality)
    .Property(Property)
    .TransformationDescription(TransformationDescription)
    .VendorFields(VendorFields)
    .Versions(Versions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
