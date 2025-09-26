# com.finbourne.horizon.model.IntegrationDescription
Response containing the description of an integration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Unique identifier of the integration e.g. \&quot;copp-clark\&quot;. | [default to String]
**name** | **String** | Readable name of the integration e.g. \&quot;Copp Clark\&quot;. | [default to String]
**description** | **String** | Describes the purpose of the integration. | [default to String]
**supportedTriggerTypes** | **List&lt;String&gt;** | Trigger types (Time, File) the integration supports. | [default to List<String>]
**licensed** | **Boolean** | True if your domain is licensed to use this integration, otherwise false. | [default to Boolean]

```java
import com.finbourne.horizon.model.IntegrationDescription;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
String Name = "example Name";
String Description = "example Description";
List<String> SupportedTriggerTypes = new List<String>();
Boolean Licensed = true;


IntegrationDescription integrationDescriptionInstance = new IntegrationDescription()
    .Type(Type)
    .Name(Name)
    .Description(Description)
    .SupportedTriggerTypes(SupportedTriggerTypes)
    .Licensed(Licensed);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
