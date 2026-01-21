# com.finbourne.horizon.model.PropertyMapping
Mapping from a set of VendorFields to a LUSID Property

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**property** | [**LusidPropertyDefinition**](LusidPropertyDefinition.md) |  | [default to LusidPropertyDefinition]
**vendorFields** | [**List&lt;VendorField&gt;**](VendorField.md) | Fields that will be used to map to this Property Definition | [default to List<VendorField>]
**optionality** | **String** | Whether the Property is Mandatory, Suggested or Optional | [default to String]
**entityType** | **String** | The LUSID Entity this is valid for | [default to String]
**entitySubType** | **String** | The LUSID Entity sub type this is valid for | [optional] [default to String]
**transformationDescription** | **String** | The transformation, if required, to map from VendorFields to the LUSID Property | [optional] [default to String]
**versions** | **List&lt;String&gt;** | The versions of the Vendor integration this mapping is valid for | [default to List<String>]

```java
import com.finbourne.horizon.model.PropertyMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

LusidPropertyDefinition Property = new LusidPropertyDefinition();
List<VendorField> VendorFields = new List<VendorField>();
String Optionality = "example Optionality";
String EntityType = "example EntityType";
@jakarta.annotation.Nullable String EntitySubType = "example EntitySubType";
@jakarta.annotation.Nullable String TransformationDescription = "example TransformationDescription";
List<String> Versions = new List<String>();


PropertyMapping propertyMappingInstance = new PropertyMapping()
    .Property(Property)
    .VendorFields(VendorFields)
    .Optionality(Optionality)
    .EntityType(EntityType)
    .EntitySubType(EntitySubType)
    .TransformationDescription(TransformationDescription)
    .Versions(Versions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
