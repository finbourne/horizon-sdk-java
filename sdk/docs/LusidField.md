# com.finbourne.horizon.model.LusidField
A field on a LUSID entity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldName** | **String** | The name of the LUSID field. | [default to String]
**defaultValue** | **String** | The default value for the field. | [optional] [default to String]
**vendorPackages** | **List&lt;String&gt;** | The vendor package that contributes to this LUSID field. | [default to List<String>]
**vendorNamespaces** | **List&lt;String&gt;** | The vendor namespace that contributes to this LUSID field. | [default to List<String>]
**vendorFields** | **List&lt;String&gt;** | The underlying fields on the vendor package that contribute to this LUSID field | [default to List<String>]
**transformationDescription** | **String** | A description of how the vendor package&#39;s field(s) get mapped to the LUSID field | [optional] [default to String]
**entityType** | **String** | LUSID Entity this refers to (e.g. Instrument) | [default to String]
**entitySubType** | **String** | Sub-Entity this field refers to (e.g. Equity) | [optional] [default to String]

```java
import com.finbourne.horizon.model.LusidField;
import java.util.*;
import java.lang.System;
import java.net.URI;

String FieldName = "example FieldName";
@jakarta.annotation.Nullable String DefaultValue = "example DefaultValue";
List<String> VendorPackages = new List<String>();
List<String> VendorNamespaces = new List<String>();
List<String> VendorFields = new List<String>();
@jakarta.annotation.Nullable String TransformationDescription = "example TransformationDescription";
String EntityType = "example EntityType";
@jakarta.annotation.Nullable String EntitySubType = "example EntitySubType";


LusidField lusidFieldInstance = new LusidField()
    .FieldName(FieldName)
    .DefaultValue(DefaultValue)
    .VendorPackages(VendorPackages)
    .VendorNamespaces(VendorNamespaces)
    .VendorFields(VendorFields)
    .TransformationDescription(TransformationDescription)
    .EntityType(EntityType)
    .EntitySubType(EntitySubType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
