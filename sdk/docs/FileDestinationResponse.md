# com.finbourne.horizon.model.FileDestinationResponse
record containing details of a single file destination for a run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | [default to String]
**path** | **String** |  | [default to String]
**status** | **String** |  | [default to String]
**error** | **String** |  | [optional] [default to String]
**failureReason** | **String** |  | [optional] [default to String]

```java
import com.finbourne.horizon.model.FileDestinationResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
String Path = "example Path";
String Status = "example Status";
@jakarta.annotation.Nullable String Error = "example Error";
@jakarta.annotation.Nullable String FailureReason = "example FailureReason";


FileDestinationResponse fileDestinationResponseInstance = new FileDestinationResponse()
    .Type(Type)
    .Path(Path)
    .Status(Status)
    .Error(Error)
    .FailureReason(FailureReason);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
