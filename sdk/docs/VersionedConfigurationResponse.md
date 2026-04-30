# com.finbourne.horizon.model.VersionedConfigurationResponse
Represents a versioned configuration record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The logical name of the configuration. | [default to String]
**configType** | **String** | The category of configuration. | [default to String]
**majorVersion** | **Integer** | The major version number. | [default to Integer]
**minorVersion** | **Integer** | The minor version number. | [default to Integer]
**value** | **String** | The JSON configuration value. | [default to String]
**isDraft** | **Boolean** | Whether this version is still in draft state. Draft versions can be edited; locked versions cannot. | [default to Boolean]

```java
import com.finbourne.horizon.model.VersionedConfigurationResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
String ConfigType = "example ConfigType";
Integer MajorVersion = new Integer("100.00");
Integer MinorVersion = new Integer("100.00");
String Value = "example Value";
Boolean IsDraft = true;


VersionedConfigurationResponse versionedConfigurationResponseInstance = new VersionedConfigurationResponse()
    .Name(Name)
    .ConfigType(ConfigType)
    .MajorVersion(MajorVersion)
    .MinorVersion(MinorVersion)
    .Value(Value)
    .IsDraft(IsDraft);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
