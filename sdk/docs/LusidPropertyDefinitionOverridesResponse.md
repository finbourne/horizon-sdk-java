# com.finbourne.horizon.model.LusidPropertyDefinitionOverridesResponse
An item that has been updated as a result of setting LusidPropertyDefinitionOverrides.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** | The action performed on this property. \&quot;upsert\&quot; for setting values for new and existing   properties. \&quot;delete\&quot; for existing properties that were removed | [default to String]
**writeError** | **String** |  | [optional] [default to String]
**writeErrorDetail** | **String** |  | [optional] [default to String]
**displayNameOverride** | **String** |  | [optional] [default to String]
**descriptionOverride** | **String** |  | [optional] [default to String]

```java
import com.finbourne.horizon.model.LusidPropertyDefinitionOverridesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Action = "example Action";
@jakarta.annotation.Nullable String WriteError = "example WriteError";
@jakarta.annotation.Nullable String WriteErrorDetail = "example WriteErrorDetail";
@jakarta.annotation.Nullable String DisplayNameOverride = "example DisplayNameOverride";
@jakarta.annotation.Nullable String DescriptionOverride = "example DescriptionOverride";


LusidPropertyDefinitionOverridesResponse lusidPropertyDefinitionOverridesResponseInstance = new LusidPropertyDefinitionOverridesResponse()
    .Action(Action)
    .WriteError(WriteError)
    .WriteErrorDetail(WriteErrorDetail)
    .DisplayNameOverride(DisplayNameOverride)
    .DescriptionOverride(DescriptionOverride);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
