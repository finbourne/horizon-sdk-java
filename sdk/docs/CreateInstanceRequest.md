# com.finbourne.horizon.model.CreateInstanceRequest
A request to add a new instance to an integration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceOptionalProps** | [**Map&lt;String, LusidPropertyDefinitionOverridesByType&gt;**](LusidPropertyDefinitionOverridesByType.md) |  | [optional] [default to Map<String, LusidPropertyDefinitionOverridesByType>]
**integrationType** | **String** |  | [default to String]
**name** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**enabled** | **Boolean** |  | [default to Boolean]
**triggers** | [**List&lt;Trigger&gt;**](Trigger.md) |  | [default to List<Trigger>]
**details** | **Object** | Base DTO type of an integration configuration specific to the integration type.   N.B. ASP.NET Core model validation is normally applied automatically when [ApiController] is added to a controller, however it doesn&#39;t work here with the polymorphic integration subtypes of this class (see https://github.com/dotnet/aspnetcore/issues/27882). The workaround here is to implement the IValidatableObject interface and each subtype must call Validate() or ValidateContents() on its properties (the validation is not recursive).  Located in Horizon.Integrations.Web so both specific integration projects and Horizon.WebApi can reference it. | [default to Object]
**postProcessTasks** | [**List&lt;PostProcessTask&gt;**](PostProcessTask.md) | Post-process tasks for the instance. On update the stored tasks are replaced by this set when it is present, an empty set clears them, and omitting the field leaves them unchanged. | [optional] [default to List<PostProcessTask>]
**alertRules** | [**List&lt;AlertRule&gt;**](AlertRule.md) | Alert rules for the instance. On update the stored rules are replaced by this set when it is present, an empty set clears them, and omitting the field leaves them unchanged. | [optional] [default to List<AlertRule>]

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
Object @jakarta.annotation.Nullable List<PostProcessTask> PostProcessTasks = new List<PostProcessTask>();
@jakarta.annotation.Nullable List<AlertRule> AlertRules = new List<AlertRule>();


CreateInstanceRequest createInstanceRequestInstance = new CreateInstanceRequest()
    .InstanceOptionalProps(InstanceOptionalProps)
    .IntegrationType(IntegrationType)
    .Name(Name)
    .Description(Description)
    .Enabled(Enabled)
    .Triggers(Triggers)
    .Details(Details)
    .PostProcessTasks(PostProcessTasks)
    .AlertRules(AlertRules);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
