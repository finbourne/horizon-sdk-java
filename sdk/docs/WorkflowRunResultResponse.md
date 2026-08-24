# com.finbourne.horizon.model.WorkflowRunResultResponse
A single declared field and the value this run published for it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | [default to String]
**type** | **String** | One of the Workflow field types: String, Decimal, DateTime, Boolean, LusidUserId. | [default to String]
**value** | **String** | The published value, or null when the run published nothing for this field. | [optional] [default to String]
**displayName** | **String** |  | [optional] [default to String]

```java
import com.finbourne.horizon.model.WorkflowRunResultResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
String Type = "example Type";
@jakarta.annotation.Nullable String Value = "example Value";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";


WorkflowRunResultResponse workflowRunResultResponseInstance = new WorkflowRunResultResponse()
    .Name(Name)
    .Type(Type)
    .Value(Value)
    .DisplayName(DisplayName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
