# com.finbourne.horizon.model.FieldMapping
Mapping from a set of Vendor Fields to a LUSID core entity field

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldName** | **String** | The LUSID core entity field | [default to String]
**defaultValue** | **String** | Default value if needed | [optional] [default to String]
**vendorFields** | [**List&lt;VendorField&gt;**](VendorField.md) | Fields that will be used to map to this field | [default to List<VendorField>]
**transformationDescription** | **String** | The transformation, if required, to map from VendorFields to the LUSID Property | [optional] [default to String]
**entityType** | **String** | The LUSID Entity this is valid for | [default to String]
**entitySubType** | **String** | The LUSID Entity sub type this is valid for | [optional] [default to String]
**versions** | **List&lt;String&gt;** | The versions of the Vendor integration this mapping is valid for | [default to List<String>]

```java
import com.finbourne.horizon.model.FieldMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

String FieldName = "example FieldName";
@jakarta.annotation.Nullable String DefaultValue = "example DefaultValue";
List<VendorField> VendorFields = new List<VendorField>();
@jakarta.annotation.Nullable String TransformationDescription = "example TransformationDescription";
String EntityType = "example EntityType";
@jakarta.annotation.Nullable String EntitySubType = "example EntitySubType";
List<String> Versions = new List<String>();


FieldMapping fieldMappingInstance = new FieldMapping()
    .FieldName(FieldName)
    .DefaultValue(DefaultValue)
    .VendorFields(VendorFields)
    .TransformationDescription(TransformationDescription)
    .EntityType(EntityType)
    .EntitySubType(EntitySubType)
    .Versions(Versions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
