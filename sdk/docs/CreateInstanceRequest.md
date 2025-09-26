# com.finbourne.horizon.model.CreateInstanceRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceOptionalProps** | [**Map&lt;String, LusidPropertyDefinitionOverridesByType&gt;**](LusidPropertyDefinitionOverridesByType.md) |  | [optional] [default to Map<String, LusidPropertyDefinitionOverridesByType>]
**integrationType** | **String** |  | [default to String]
**name** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**enabled** | **Boolean** |  | [default to Boolean]
**triggers** | [**List&lt;Trigger&gt;**](Trigger.md) |  | [default to List<Trigger>]
**details** | **Object** |  | [default to Object]

```java
import com.finbourne.horizon.model.CreateInstanceRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, LusidPropertyDefinitionOverridesByType> InstanceOptionalProps = new Map<String, LusidPropertyDefinitionOverridesByType>();
String IntegrationType = "example IntegrationType";
String Name = "example Name";
String Description = "example Description";
Boolean Enabled = true;
List<Trigger> Triggers = new List<Trigger>();
Object 

CreateInstanceRequest createInstanceRequestInstance = new CreateInstanceRequest()
    .InstanceOptionalProps(InstanceOptionalProps)
    .IntegrationType(IntegrationType)
    .Name(Name)
    .Description(Description)
    .Enabled(Enabled)
    .Triggers(Triggers)
    .Details(Details);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
