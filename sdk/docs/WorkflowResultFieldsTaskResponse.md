# com.finbourne.horizon.model.WorkflowResultFieldsTaskResponse
One of the instance's enabled RunWorkflow post-process tasks.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | [default to String]
**triggerOn** | **String** | When this task fires: OnSuccess, OnFailure or Always. | [default to String]
**resultFields** | **List&lt;String&gt;** | Names of the fields this particular task declares. | [default to List<String>]

```java
import com.finbourne.horizon.model.WorkflowResultFieldsTaskResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
String TriggerOn = "example TriggerOn";
List<String> ResultFields = new List<String>();


WorkflowResultFieldsTaskResponse workflowResultFieldsTaskResponseInstance = new WorkflowResultFieldsTaskResponse()
    .Name(Name)
    .TriggerOn(TriggerOn)
    .ResultFields(ResultFields);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
