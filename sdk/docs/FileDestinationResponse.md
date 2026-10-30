# com.finbourne.horizon.model.FileDestinationResponse
The destination a file delivery row describes. A Failed row carries the per-transaction FailureReason when one was recorded, falling back to the raw Error text.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | [default to String]
**path** | **String** |  | [default to String]
**status** | **String** |  | [default to String]
**error** | **String** |  | [optional] [default to String]
**failureReason** | **String** |  | [optional] [default to String]
**name** | **String** | The configured destination name, such as the SFTP host, when one was recorded. | [optional] [default to String]
**deliveredAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the file reached the destination; null for a Failed or Pending row. | [optional] [default to OffsetDateTime]

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
@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable OffsetDateTime DeliveredAt = OffsetDateTime.now();


FileDestinationResponse fileDestinationResponseInstance = new FileDestinationResponse()
    .Type(Type)
    .Path(Path)
    .Status(Status)
    .Error(Error)
    .FailureReason(FailureReason)
    .Name(Name)
    .DeliveredAt(DeliveredAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
