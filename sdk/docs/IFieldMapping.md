# com.finbourne.horizon.model.IFieldMapping

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultValue** | **String** |  | [optional] [default to String]
**entitySubType** | **String** |  | [optional] [default to String]
**entityType** | **String** |  | [default to String]
**fieldName** | **String** |  | [default to String]
**transformationDescription** | **String** |  | [optional] [default to String]
**vendorFields** | [**List&lt;VendorField&gt;**](VendorField.md) |  | [default to List<VendorField>]
**versions** | **List&lt;String&gt;** |  | [default to List<String>]

```java
import com.finbourne.horizon.model.IFieldMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String DefaultValue = "example DefaultValue";
@jakarta.annotation.Nullable String EntitySubType = "example EntitySubType";
String EntityType = "example EntityType";
String FieldName = "example FieldName";
@jakarta.annotation.Nullable String TransformationDescription = "example TransformationDescription";
List<VendorField> VendorFields = new List<VendorField>();
List<String> Versions = new List<String>();


IFieldMapping iFieldMappingInstance = new IFieldMapping()
    .DefaultValue(DefaultValue)
    .EntitySubType(EntitySubType)
    .EntityType(EntityType)
    .FieldName(FieldName)
    .TransformationDescription(TransformationDescription)
    .VendorFields(VendorFields)
    .Versions(Versions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
