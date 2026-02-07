# com.finbourne.horizon.model.IntegrationInstanceResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | [default to String]
**integrationType** | **String** |  | [default to String]
**name** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**enabled** | **Boolean** |  | [default to Boolean]
**triggers** | [**List&lt;Trigger&gt;**](Trigger.md) |  | [default to List<Trigger>]
**details** | **Object** |  | [default to Object]
**postProcessTasks** | [**List&lt;PostProcessTask&gt;**](PostProcessTask.md) |  | [default to List<PostProcessTask>]

```java
import com.finbourne.horizon.model.IntegrationInstanceResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Id = "example Id";
String IntegrationType = "example IntegrationType";
String Name = "example Name";
String Description = "example Description";
Boolean Enabled = true;
List<Trigger> Triggers = new List<Trigger>();
Object List<PostProcessTask> PostProcessTasks = new List<PostProcessTask>();


IntegrationInstanceResponse integrationInstanceResponseInstance = new IntegrationInstanceResponse()
    .Id(Id)
    .IntegrationType(IntegrationType)
    .Name(Name)
    .Description(Description)
    .Enabled(Enabled)
    .Triggers(Triggers)
    .Details(Details)
    .PostProcessTasks(PostProcessTasks);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
