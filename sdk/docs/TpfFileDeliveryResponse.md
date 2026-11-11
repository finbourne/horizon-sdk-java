# com.finbourne.horizon.model.TpfFileDeliveryResponse
Response model for TPF file delivery search results

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | **String** | The run id of the latest execution attempt in this row&#39;s run chain (the root run, its automatic retries and resends); equals referenceId when the chain has a single attempt or no recorded execution. | [optional] [default to String]
**runStartTime** | [**OffsetDateTime**](OffsetDateTime.md) | When the row&#39;s root run started (the batch start), not the latest attempt&#39;s start. | [optional] [default to OffsetDateTime]
**fileName** | **String** |  | [default to String]
**generatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the file was built, or when the attempt failed before a file was built. | [default to OffsetDateTime]
**rowCount** | **Integer** |  | [default to Integer]
**fileHash** | **String** |  | [optional] [default to String]
**destinationType** | **String** |  | [default to String]
**destinationPath** | **String** |  | [optional] [default to String]
**destinationStatus** | **String** |  | [default to String]
**destinationError** | **String** |  | [optional] [default to String]
**destinationName** | **String** |  | [optional] [default to String]
**fileUuid** | [**UUID**](UUID.md) |  | [default to UUID]
**canResend** | **Boolean** | Whether the data the file is rebuilt from is still retained, so a resend can be requested. | [default to Boolean]
**deliveredAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the file reached the destination; null for a Failed or Pending row. | [optional] [default to OffsetDateTime]
**attempt** | **Integer** | The highest attempt number (1-based) made for this delivery&#39;s run, including automatic retries and resends. | [optional] [default to Integer]
**referenceId** | **String** | The root run id of this row&#39;s run chain, the same value run history reports as referenceId. | [optional] [default to String]

```java
import com.finbourne.horizon.model.TpfFileDeliveryResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String RunId = "example RunId";
@jakarta.annotation.Nullable OffsetDateTime RunStartTime = OffsetDateTime.now();
String FileName = "example FileName";
OffsetDateTime GeneratedAt = OffsetDateTime.now();
Integer RowCount = new Integer("100.00");
@jakarta.annotation.Nullable String FileHash = "example FileHash";
String DestinationType = "example DestinationType";
@jakarta.annotation.Nullable String DestinationPath = "example DestinationPath";
String DestinationStatus = "example DestinationStatus";
@jakarta.annotation.Nullable String DestinationError = "example DestinationError";
@jakarta.annotation.Nullable String DestinationName = "example DestinationName";
UUID FileUuid = "example FileUuid";
Boolean CanResend = true;
@jakarta.annotation.Nullable OffsetDateTime DeliveredAt = OffsetDateTime.now();
@jakarta.annotation.Nullable Integer Attempt = new Integer("100.00");
@jakarta.annotation.Nullable String ReferenceId = "example ReferenceId";


TpfFileDeliveryResponse tpfFileDeliveryResponseInstance = new TpfFileDeliveryResponse()
    .RunId(RunId)
    .RunStartTime(RunStartTime)
    .FileName(FileName)
    .GeneratedAt(GeneratedAt)
    .RowCount(RowCount)
    .FileHash(FileHash)
    .DestinationType(DestinationType)
    .DestinationPath(DestinationPath)
    .DestinationStatus(DestinationStatus)
    .DestinationError(DestinationError)
    .DestinationName(DestinationName)
    .FileUuid(FileUuid)
    .CanResend(CanResend)
    .DeliveredAt(DeliveredAt)
    .Attempt(Attempt)
    .ReferenceId(ReferenceId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
