# com.finbourne.horizon.model.LusidEntity
Information about the LUSID entity this data can be used with

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The entity type | [default to String]
**entityTypeDisplayName** | **String** | The display name for the entity type. | [default to String]
**entitySubType** | **String** | The entity sub-type | [optional] [default to String]
**entitySubTypeDisplayName** | **String** | Display name for the entity sub-type | [optional] [default to String]

```java
import com.finbourne.horizon.model.LusidEntity;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EntityType = "example EntityType";
String EntityTypeDisplayName = "example EntityTypeDisplayName";
@jakarta.annotation.Nullable String EntitySubType = "example EntitySubType";
@jakarta.annotation.Nullable String EntitySubTypeDisplayName = "example EntitySubTypeDisplayName";


LusidEntity lusidEntityInstance = new LusidEntity()
    .EntityType(EntityType)
    .EntityTypeDisplayName(EntityTypeDisplayName)
    .EntitySubType(EntitySubType)
    .EntitySubTypeDisplayName(EntitySubTypeDisplayName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
