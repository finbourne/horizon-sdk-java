# com.finbourne.horizon.model.TpfFailedDeliveryResponse
Response for bulk retry operation of failed deliveries

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**submitted** | **Integer** | Number of batch elements submitted for retry | [default to Integer]
**results** | [**List&lt;TpfRetryElementResult&gt;**](TpfRetryElementResult.md) | Per-element retry results | [default to List<TpfRetryElementResult>]

```java
import com.finbourne.horizon.model.TpfFailedDeliveryResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Submitted = new Integer("100.00");
List<TpfRetryElementResult> Results = new List<TpfRetryElementResult>();


TpfFailedDeliveryResponse tpfFailedDeliveryResponseInstance = new TpfFailedDeliveryResponse()
    .Submitted(Submitted)
    .Results(Results);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
