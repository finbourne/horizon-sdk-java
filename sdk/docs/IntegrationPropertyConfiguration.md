# com.finbourne.horizon.model.IntegrationPropertyConfiguration
Response containing the description of an integration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The Integration this property configuration applies to | [default to String]
**properties** | [**List&lt;PropertyMapping&gt;**](PropertyMapping.md) | The mandatory and optional properties available in this integration | [default to List<PropertyMapping>]
**fields** | [**List&lt;FieldMapping&gt;**](FieldMapping.md) | The fields available in this integration | [default to List<FieldMapping>]

```java
import com.finbourne.horizon.model.IntegrationPropertyConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
List<PropertyMapping> Properties = new List<PropertyMapping>();
List<FieldMapping> Fields = new List<FieldMapping>();


IntegrationPropertyConfiguration integrationPropertyConfigurationInstance = new IntegrationPropertyConfiguration()
    .Type(Type)
    .Properties(Properties)
    .Fields(Fields);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
