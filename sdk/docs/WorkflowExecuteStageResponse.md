# com.finbourne.horizon.model.WorkflowExecuteStageResponse
One stage of a staged integration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | [default to String]
**steps** | **List&lt;String&gt;** | The steps that run for this stage. | [default to List<String>]
**parameters** | **List&lt;String&gt;** | Names of every parameter this stage accepts. | [default to List<String>]
**rules** | **List&lt;String&gt;** | Cross-field rules the stage enforces, in plain text. | [default to List<String>]

```java
import com.finbourne.horizon.model.WorkflowExecuteStageResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
List<String> Steps = new List<String>();
List<String> Parameters = new List<String>();
List<String> Rules = new List<String>();


WorkflowExecuteStageResponse workflowExecuteStageResponseInstance = new WorkflowExecuteStageResponse()
    .Name(Name)
    .Steps(Steps)
    .Parameters(Parameters)
    .Rules(Rules);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
