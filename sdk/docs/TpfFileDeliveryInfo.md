# com.finbourne.horizon.model.TpfFileDeliveryInfo
Information about a file delivery

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | File delivery ID | [default to Long]
**fileName** | **String** | File name | [default to String]
**fileHash** | **String** | SHA-256 hash of the file content | [default to String]
**destinationPath** | **String** | SFTP destination path | [default to String]
**status** | **String** | Delivery status | [default to String]
**generatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the file was originally generated | [default to OffsetDateTime]

```java
import com.finbourne.horizon.model.TpfFileDeliveryInfo;
import java.util.*;
import java.lang.System;
import java.net.URI;

Long Id = new Long("100.00");
String FileName = "example FileName";
String FileHash = "example FileHash";
String DestinationPath = "example DestinationPath";
String Status = "example Status";
OffsetDateTime GeneratedAt = OffsetDateTime.now();


TpfFileDeliveryInfo tpfFileDeliveryInfoInstance = new TpfFileDeliveryInfo()
    .Id(Id)
    .FileName(FileName)
    .FileHash(FileHash)
    .DestinationPath(DestinationPath)
    .Status(Status)
    .GeneratedAt(GeneratedAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
