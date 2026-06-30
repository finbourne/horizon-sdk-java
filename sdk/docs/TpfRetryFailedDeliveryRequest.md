# com.finbourne.horizon.model.TpfRetryFailedDeliveryRequest
Request to retry failed deliveries for multiple batch elements. The integration instance identifier is supplied via the route, not the body.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchElementReferenceIds** | **List&lt;String&gt;** | Batch element reference identifiers to retry. No regex pattern is required as batch element IDs are vendor-defined strings with varying formats. | [default to List<String>]

```java
import com.finbourne.horizon.model.TpfRetryFailedDeliveryRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> BatchElementReferenceIds = new List<String>();


TpfRetryFailedDeliveryRequest tpfRetryFailedDeliveryRequestInstance = new TpfRetryFailedDeliveryRequest()
    .BatchElementReferenceIds(BatchElementReferenceIds);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
