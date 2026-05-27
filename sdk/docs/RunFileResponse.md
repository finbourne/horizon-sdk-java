# com.finbourne.horizon.model.RunFileResponse
record containing details of a single file for a run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileName** | **String** |  | [default to String]
**generatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**rowCount** | **Integer** |  | [default to Integer]
**fileHash** | **String** |  | [default to String]
**encrypted** | **Boolean** |  | [default to Boolean]
**destinations** | [**List&lt;FileDestinationResponse&gt;**](FileDestinationResponse.md) |  | [default to List<FileDestinationResponse>]
**transactionIds** | [**List&lt;UUID&gt;**](UUID.md) |  | [default to List<UUID>]

```java
import com.finbourne.horizon.model.RunFileResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String FileName = "example FileName";
OffsetDateTime GeneratedAt = OffsetDateTime.now();
Integer RowCount = new Integer("100.00");
String FileHash = "example FileHash";
Boolean Encrypted = true;
List<FileDestinationResponse> Destinations = new List<FileDestinationResponse>();
List<UUID> TransactionIds = new List<UUID>();


RunFileResponse runFileResponseInstance = new RunFileResponse()
    .FileName(FileName)
    .GeneratedAt(GeneratedAt)
    .RowCount(RowCount)
    .FileHash(FileHash)
    .Encrypted(Encrypted)
    .Destinations(Destinations)
    .TransactionIds(TransactionIds);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
