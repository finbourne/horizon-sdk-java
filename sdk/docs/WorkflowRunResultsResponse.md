# com.finbourne.horizon.model.WorkflowRunResultsResponse
A run's status and the result values it published, which is what the Workflow AQS polls while it waits for an integration it started to finish.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | **String** | The run these results belong to, as returned by the execute endpoint. | [default to String]
**instanceId** | **String** | The instance that ran. | [default to String]
**status** | **String** | The run&#39;s status, reported exactly as the runs endpoint reports it: Queued, Started, Completed, Errored or Interrupted. A caller waiting for the run to finish is waiting for one of the last three. | [default to String]
**queuedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**startedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**completedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Null until the run reaches a terminal status. | [optional] [default to OffsetDateTime]
**attempt** | **Integer** | Which attempt this run is, counting reruns of the same work. | [default to Integer]
**reportsToWorkflow** | **Boolean** | Whether this run was started by a Workflow task. False for a scheduled or file-triggered run, which publishes no results because nothing is waiting on them. | [default to Boolean]
**results** | [**List&lt;WorkflowRunResultResponse&gt;**](WorkflowRunResultResponse.md) | One entry per field the instance declares, so the shape matches what the discovery endpoint promised when the worker was created. A declared field the run never published carries a null value. | [default to List<WorkflowRunResultResponse>]

```java
import com.finbourne.horizon.model.WorkflowRunResultsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RunId = "example RunId";
String InstanceId = "example InstanceId";
String Status = "example Status";
@jakarta.annotation.Nullable OffsetDateTime QueuedAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime StartedAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime CompletedAt = OffsetDateTime.now();
Integer Attempt = new Integer("100.00");
Boolean ReportsToWorkflow = true;
List<WorkflowRunResultResponse> Results = new List<WorkflowRunResultResponse>();


WorkflowRunResultsResponse workflowRunResultsResponseInstance = new WorkflowRunResultsResponse()
    .RunId(RunId)
    .InstanceId(InstanceId)
    .Status(Status)
    .QueuedAt(QueuedAt)
    .StartedAt(StartedAt)
    .CompletedAt(CompletedAt)
    .Attempt(Attempt)
    .ReportsToWorkflow(ReportsToWorkflow)
    .Results(Results);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
