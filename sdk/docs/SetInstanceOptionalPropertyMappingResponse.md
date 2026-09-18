# com.finbourne.horizon.model.SetInstanceOptionalPropertyMappingResponse
Response for SetInstanceOptionalPropertyMapping.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyOverrides** | [**Map&lt;String, LusidPropertyDefinitionOverridesByType&gt;**](LusidPropertyDefinitionOverridesByType.md) | The full, current optional property mapping for the instance, after the write. | [default to Map<String, LusidPropertyDefinitionOverridesByType>]
**warnings** | **List&lt;String&gt;** | Advisory warnings about a write that succeeded regardless, e.g. a future-dated effectiveFromOverride, or another enabled instance of the same integration holding a different effectiveFromOverride for the same property. | [default to List<String>]

```java
import com.finbourne.horizon.model.SetInstanceOptionalPropertyMappingResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, LusidPropertyDefinitionOverridesByType> PropertyOverrides = new Map<String, LusidPropertyDefinitionOverridesByType>();
List<String> Warnings = new List<String>();


SetInstanceOptionalPropertyMappingResponse setInstanceOptionalPropertyMappingResponseInstance = new SetInstanceOptionalPropertyMappingResponse()
    .PropertyOverrides(PropertyOverrides)
    .Warnings(Warnings);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
