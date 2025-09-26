# com.finbourne.horizon.model.LusidPropertyDefinitionOverrides
Override values for property Display Name and Description

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayNameOverride** | **String** |  | [optional] [default to String]
**descriptionOverride** | **String** |  | [optional] [default to String]

```java
import com.finbourne.horizon.model.LusidPropertyDefinitionOverrides;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String DisplayNameOverride = "example DisplayNameOverride";
@jakarta.annotation.Nullable String DescriptionOverride = "example DescriptionOverride";


LusidPropertyDefinitionOverrides lusidPropertyDefinitionOverridesInstance = new LusidPropertyDefinitionOverrides()
    .DisplayNameOverride(DisplayNameOverride)
    .DescriptionOverride(DescriptionOverride);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
