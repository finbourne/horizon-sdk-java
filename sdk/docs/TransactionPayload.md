# com.finbourne.horizon.model.TransactionPayload
record containing the payload for a single transaction. Columns is compiled once from the TPF instance configuration and is identical across every item in the paginated result. PublicationStatus is the row's outcome: Sent, or Failed when the file holding it reached no destination.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** |  | [default to String]
**columns** | **List&lt;String&gt;** |  | [default to List<String>]
**values** | **Map&lt;String, String&gt;** |  | [default to Map<String, String>]
**rawCsvRow** | **String** |  | [default to String]
**publicationStatus** | **String** |  | [default to String]

```java
import com.finbourne.horizon.model.TransactionPayload;
import java.util.*;
import java.lang.System;
import java.net.URI;

String TransactionId = "example TransactionId";
List<String> Columns = new List<String>();
Map<String, String> Values = new Map<String, String>();
String RawCsvRow = "example RawCsvRow";
String PublicationStatus = "example PublicationStatus";


TransactionPayload transactionPayloadInstance = new TransactionPayload()
    .TransactionId(TransactionId)
    .Columns(Columns)
    .Values(Values)
    .RawCsvRow(RawCsvRow)
    .PublicationStatus(PublicationStatus);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
