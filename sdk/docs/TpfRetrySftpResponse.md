# com.finbourne.horizon.model.TpfRetrySftpResponse
Response from retrying SFTP file delivery

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**success** | **Boolean** | Whether the retry was successful | [default to Boolean]
**message** | **String** | Status message describing the result | [default to String]
**newFileDeliveryId** | **Long** | ID of the new file delivery record created for this retry (if successful) | [optional] [default to Long]
**retriedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the retry was executed | [optional] [default to OffsetDateTime]
**originalFile** | [**TpfFileDeliveryInfo**](TpfFileDeliveryInfo.md) |  | [optional] [default to TpfFileDeliveryInfo]
**duplicateFile** | [**TpfFileDeliveryInfo**](TpfFileDeliveryInfo.md) |  | [optional] [default to TpfFileDeliveryInfo]

```java
import com.finbourne.horizon.model.TpfRetrySftpResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean Success = true;
String Message = "example Message";
@jakarta.annotation.Nullable Long NewFileDeliveryId = new Long("100.00");
@jakarta.annotation.Nullable OffsetDateTime RetriedAt = OffsetDateTime.now();
TpfFileDeliveryInfo OriginalFile = new TpfFileDeliveryInfo();
TpfFileDeliveryInfo DuplicateFile = new TpfFileDeliveryInfo();


TpfRetrySftpResponse tpfRetrySftpResponseInstance = new TpfRetrySftpResponse()
    .Success(Success)
    .Message(Message)
    .NewFileDeliveryId(NewFileDeliveryId)
    .RetriedAt(RetriedAt)
    .OriginalFile(OriginalFile)
    .DuplicateFile(DuplicateFile);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
