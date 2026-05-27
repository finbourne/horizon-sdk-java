# com.finbourne.horizon.model.TransactionPayloadResponse
record containing details of a transaction payload.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columns** | **List&lt;String&gt;** |  | [default to List<String>]
**values** | **Map&lt;String, String&gt;** |  | [default to Map<String, String>]
**rawCsvRow** | **String** |  | [default to String]

```java
import com.finbourne.horizon.model.TransactionPayloadResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> Columns = new List<String>();
Map<String, String> Values = new Map<String, String>();
String RawCsvRow = "example RawCsvRow";


TransactionPayloadResponse transactionPayloadResponseInstance = new TransactionPayloadResponse()
    .Columns(Columns)
    .Values(Values)
    .RawCsvRow(RawCsvRow);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
