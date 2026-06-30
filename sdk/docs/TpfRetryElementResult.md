# com.finbourne.horizon.model.TpfRetryElementResult
Result for a single batch element retry attempt

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchElementReferenceId** | **String** | Batch element reference identifier | [default to String]
**status** | **String** | Status of the retry attempt (e.g., \&quot;Retrying\&quot;, \&quot;NotFound\&quot;) | [default to String]

```java
import com.finbourne.horizon.model.TpfRetryElementResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

String BatchElementReferenceId = "example BatchElementReferenceId";
String Status = "example Status";


TpfRetryElementResult tpfRetryElementResultInstance = new TpfRetryElementResult()
    .BatchElementReferenceId(BatchElementReferenceId)
    .Status(Status);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
