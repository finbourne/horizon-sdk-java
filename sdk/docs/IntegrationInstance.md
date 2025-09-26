# com.finbourne.horizon.model.IntegrationInstance
Response containing an integration instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifies the instance within the integration. | [default to String]
**integrationType** | **String** | The integration type. | [default to String]
**name** | **String** | Name of the instance. | [default to String]
**description** | **String** | Description of the instance. | [default to String]
**enabled** | **Boolean** | If true the instance will be executed if its trigger is satisfied. | [default to Boolean]
**triggers** | [**List&lt;Trigger&gt;**](Trigger.md) | Defines what triggers execution of the instance. | [default to List<Trigger>]
**details** | **Object** |  | [default to Object]

```java
import com.finbourne.horizon.model.IntegrationInstance;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Id = "example Id";
String IntegrationType = "example IntegrationType";
String Name = "example Name";
String Description = "example Description";
Boolean Enabled = true;
List<Trigger> Triggers = new List<Trigger>();
Object 

IntegrationInstance integrationInstanceInstance = new IntegrationInstance()
    .Id(Id)
    .IntegrationType(IntegrationType)
    .Name(Name)
    .Description(Description)
    .Enabled(Enabled)
    .Triggers(Triggers)
    .Details(Details);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
