# com.finbourne.horizon.model.CancelRunRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runIds** | **List&lt;String&gt;** |  | [default to List<String>]
**message** | **String** |  | [optional] [default to String]

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
