# com.finbourne.horizon.model.WorkflowResultFieldResponse
A single declared field.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | [default to String]
**type** | **String** | One of the Workflow field types: String, Decimal, DateTime, Boolean, LusidUserId. | [default to String]
**displayName** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]

```java
import com.finbourne.horizon.model.WorkflowResultFieldResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
String Type = "example Type";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";


WorkflowResultFieldResponse workflowResultFieldResponseInstance = new WorkflowResultFieldResponse()
    .Name(Name)
    .Type(Type)
    .DisplayName(DisplayName)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
