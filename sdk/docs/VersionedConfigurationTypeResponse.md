# com.finbourne.horizon.model.VersionedConfigurationTypeResponse
Represents a registered versioned configuration type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configType** | **String** |  | [default to String]
**displayName** | **String** |  | [default to String]

```java
import com.finbourne.horizon.model.VersionedConfigurationTypeResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ConfigType = "example ConfigType";
String DisplayName = "example DisplayName";


VersionedConfigurationTypeResponse versionedConfigurationTypeResponseInstance = new VersionedConfigurationTypeResponse()
    .ConfigType(ConfigType)
    .DisplayName(DisplayName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
