# com.finbourne.horizon.model.ReplayTransactionsResponse
Response from a replay transactions operation containing the CSV output.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchReferenceId** | **String** |  | [default to String]
**mode** | **String** |  | [default to String]
**transactionCount** | **Integer** |  | [default to Integer]
**csvOutput** | **String** |  | [default to String]
**message** | **String** |  | [default to String]

```java
import com.finbourne.horizon.model.ReplayTransactionsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String BatchReferenceId = "example BatchReferenceId";
String Mode = "example Mode";
Integer TransactionCount = new Integer("100.00");
String CsvOutput = "example CsvOutput";
String Message = "example Message";


ReplayTransactionsResponse replayTransactionsResponseInstance = new ReplayTransactionsResponse()
    .BatchReferenceId(BatchReferenceId)
    .Mode(Mode)
    .TransactionCount(TransactionCount)
    .CsvOutput(CsvOutput)
    .Message(Message);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
