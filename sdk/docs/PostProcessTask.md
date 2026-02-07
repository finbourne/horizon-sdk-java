# com.finbourne.horizon.model.PostProcessTask

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** |  | [default to String]
**targetInstance** | **String** |  | [optional] [default to String]
**triggerOn** | **String** |  | [default to String]
**parameters** | **Object** |  | [optional] [default to Object]

```java
import com.finbourne.horizon.model.PostProcessTask;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Action = "example Action";
@jakarta.annotation.Nullable String TargetInstance = "example TargetInstance";
String TriggerOn = "example TriggerOn";
@jakarta.annotation.Nullable Object 

PostProcessTask postProcessTaskInstance = new PostProcessTask()
    .Action(Action)
    .TargetInstance(TargetInstance)
    .TriggerOn(TriggerOn)
    .Parameters(Parameters);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
