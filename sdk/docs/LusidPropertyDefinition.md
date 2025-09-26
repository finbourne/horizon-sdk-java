# com.finbourne.horizon.model.LusidPropertyDefinition
Defines the information in a LUSID Property Definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** |  | [readonly] [default to String]
**productEntityItemKey** | **String** | Property key associated with the mapping | [default to String]
**domain** | **String** | The domain of this definition. | [default to String]
**scope** | **String** | The scope of this definition. | [default to String]
**code** | **String** | The code of this definition. | [default to String]
**displayName** | **String** | The name used when this definition is displayed. | [default to String]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**description** | **String** |  | [default to String]
**lifetime** | **String** |  | [default to String]
**constraintStyle** | **String** |  | [default to String]

```java
import com.finbourne.horizon.model.LusidPropertyDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
String ProductEntityItemKey = "example ProductEntityItemKey";
String Domain = "example Domain";
String Scope = "example Scope";
String Code = "example Code";
String DisplayName = "example DisplayName";
ResourceId DataTypeId = new ResourceId();
String Description = "example Description";
String Lifetime = "example Lifetime";
String ConstraintStyle = "example ConstraintStyle";


LusidPropertyDefinition lusidPropertyDefinitionInstance = new LusidPropertyDefinition()
    .Key(Key)
    .ProductEntityItemKey(ProductEntityItemKey)
    .Domain(Domain)
    .Scope(Scope)
    .Code(Code)
    .DisplayName(DisplayName)
    .DataTypeId(DataTypeId)
    .Description(Description)
    .Lifetime(Lifetime)
    .ConstraintStyle(ConstraintStyle);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
