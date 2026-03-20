# com.finbourne.horizon.model.CancelRunRequest
A request to cancel the specified instance execution.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runIds** | **List&lt;String&gt;** | The instance run ids to be cancelled. | [default to List<String>]
**message** | **String** | The user provided message as to why the instance executions were cancelled. | [optional] [default to String]

```java
import com.finbourne.horizon.model.CancelRunRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> RunIds = new List<String>();
@jakarta.annotation.Nullable String Message = "example Message";


CancelRunRequest cancelRunRequestInstance = new CancelRunRequest()
    .RunIds(RunIds)
    .Message(Message);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
