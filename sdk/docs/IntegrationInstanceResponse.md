# com.finbourne.horizon.model.IntegrationInstanceResponse
Response representing an integration instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique identifier of the integration instance. | [default to String]
**integrationType** | **String** | The type of the integration. | [default to String]
**name** | **String** | The name of the integration instance. | [default to String]
**description** | **String** | The description of the integration instance. | [default to String]
**enabled** | **Boolean** | Whether the integration instance is enabled. | [default to Boolean]
**triggers** | [**List&lt;Trigger&gt;**](Trigger.md) | The triggers associated with the integration instance. | [default to List<Trigger>]
**details** | **Object** | Base DTO type of an integration configuration specific to the integration type.   N.B. ASP.NET Core model validation is normally applied automatically when [ApiController] is added to a controller, however it doesn&#39;t work here with the polymorphic integration subtypes of this class (see https://github.com/dotnet/aspnetcore/issues/27882). The workaround here is to implement the IValidatableObject interface and each subtype must call Validate() or ValidateContents() on its properties (the validation is not recursive).  Located in Horizon.Integrations.Web so both specific integration projects and Horizon.WebApi can reference it. | [default to Object]
**postProcessTasks** | [**List&lt;PostProcessTask&gt;**](PostProcessTask.md) | The post process tasks associated with the integration instance. | [default to List<PostProcessTask>]

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
