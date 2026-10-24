# com.finbourne.horizon.model.ReplayTransactionsRequest
Request to replay one or more transactions through a TPF instance. The instance ID is specified in the route path.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionIds** | **List&lt;String&gt;** | List of transaction IDs to replay. | [default to List<String>]
**mode** | **String** | Replay mode - DryRun (preview only) or Committed (real send). | [default to String]
**options** | [**ReplayOptions**](ReplayOptions.md) |  | [optional] [default to ReplayOptions]

```java
import com.finbourne.horizon.model.ReplayTransactionsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> TransactionIds = new List<String>();
String Mode = "example Mode";
ReplayOptions Options = new ReplayOptions();


ReplayTransactionsRequest replayTransactionsRequestInstance = new ReplayTransactionsRequest()
    .TransactionIds(TransactionIds)
    .Mode(Mode)
    .Options(Options);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
