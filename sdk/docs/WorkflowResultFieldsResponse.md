# com.finbourne.horizon.model.WorkflowResultFieldsResponse
The result fields an instance returns to the Workflow task that started its run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceId** | **String** | The instance these fields belong to. | [default to String]
**reportsToWorkflow** | **Boolean** | Whether this instance has an enabled RunWorkflow post-process task at all. | [default to Boolean]
**resultFields** | [**List&lt;WorkflowResultFieldResponse&gt;**](WorkflowResultFieldResponse.md) | Every distinct field declared across this instance&#39;s RunWorkflow tasks. | [default to List<WorkflowResultFieldResponse>]
**tasks** | [**List&lt;WorkflowResultFieldsTaskResponse&gt;**](WorkflowResultFieldsTaskResponse.md) | Per-task breakdown: an instance may declare different fields on success and on failure. | [default to List<WorkflowResultFieldsTaskResponse>]

```java
import com.finbourne.horizon.model.WorkflowResultFieldsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InstanceId = "example InstanceId";
Boolean ReportsToWorkflow = true;
List<WorkflowResultFieldResponse> ResultFields = new List<WorkflowResultFieldResponse>();
List<WorkflowResultFieldsTaskResponse> Tasks = new List<WorkflowResultFieldsTaskResponse>();


WorkflowResultFieldsResponse workflowResultFieldsResponseInstance = new WorkflowResultFieldsResponse()
    .InstanceId(InstanceId)
    .ReportsToWorkflow(ReportsToWorkflow)
    .ResultFields(ResultFields)
    .Tasks(Tasks);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
