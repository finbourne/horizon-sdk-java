# com.finbourne.horizon.model.WorkflowExecuteParameterResponse
A single execute parameter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | [default to String]
**type** | **String** | One of the Workflow field types: String, Decimal, DateTime, Boolean. | [default to String]
**required** | **Boolean** | Whether every run must supply the parameter, whatever its stage. | [default to Boolean]
**displayName** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**format** | **String** | The shape a String value must take, e.g. YYYY-MM, when it has one. | [optional] [default to String]
**allowedValues** | **List&lt;String&gt;** | The closed set of accepted values, when there is one. | [optional] [default to List<String>]
**requiredForStages** | **List&lt;String&gt;** | The stages for which the parameter is mandatory. | [default to List<String>]

```java
import com.finbourne.horizon.model.WorkflowExecuteParameterResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
String Type = "example Type";
Boolean Required = true;
String DisplayName = "example DisplayName";
String Description = "example Description";
@jakarta.annotation.Nullable String Format = "example Format";
@jakarta.annotation.Nullable List<String> AllowedValues = new List<String>();
List<String> RequiredForStages = new List<String>();


WorkflowExecuteParameterResponse workflowExecuteParameterResponseInstance = new WorkflowExecuteParameterResponse()
    .Name(Name)
    .Type(Type)
    .Required(Required)
    .DisplayName(DisplayName)
    .Description(Description)
    .Format(Format)
    .AllowedValues(AllowedValues)
    .RequiredForStages(RequiredForStages);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
