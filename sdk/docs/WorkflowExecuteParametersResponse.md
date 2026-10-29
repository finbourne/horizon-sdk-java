# com.finbourne.horizon.model.WorkflowExecuteParametersResponse
The execute parameters a Workflow-driven integration instance accepts on executewithparams.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceId** | **String** | The instance these parameters belong to. | [default to String]
**integrationType** | **String** | The integration type of the instance, e.g. ta-tax-processes. | [default to String]
**parameters** | [**List&lt;WorkflowExecuteParameterResponse&gt;**](WorkflowExecuteParameterResponse.md) | Every parameter the integration accepts, each listed once. | [default to List<WorkflowExecuteParameterResponse>]
**stages** | [**List&lt;WorkflowExecuteStageResponse&gt;**](WorkflowExecuteStageResponse.md) | Per-stage breakdown of the steps that run and the parameters accepted. | [default to List<WorkflowExecuteStageResponse>]

```java
import com.finbourne.horizon.model.WorkflowExecuteParametersResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InstanceId = "example InstanceId";
String IntegrationType = "example IntegrationType";
List<WorkflowExecuteParameterResponse> Parameters = new List<WorkflowExecuteParameterResponse>();
List<WorkflowExecuteStageResponse> Stages = new List<WorkflowExecuteStageResponse>();


WorkflowExecuteParametersResponse workflowExecuteParametersResponseInstance = new WorkflowExecuteParametersResponse()
    .InstanceId(InstanceId)
    .IntegrationType(IntegrationType)
    .Parameters(Parameters)
    .Stages(Stages);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
