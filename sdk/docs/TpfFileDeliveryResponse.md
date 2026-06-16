# com.finbourne.horizon.model.TpfFileDeliveryResponse
Response model for TPF file delivery search results

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | **String** |  | [optional] [default to String]
**runStartTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**fileName** | **String** |  | [default to String]
**generatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**rowCount** | **Integer** |  | [default to Integer]
**fileHash** | **String** |  | [optional] [default to String]
**destinationType** | **String** |  | [default to String]
**destinationPath** | **String** |  | [optional] [default to String]
**destinationStatus** | **String** |  | [default to String]
**destinationError** | **String** |  | [optional] [default to String]
**destinationName** | **String** |  | [optional] [default to String]

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
    .DestinationName(DestinationName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
