# com.finbourne.horizon.model.ResolveFailedDeliveryRequest
Request to resolve a failed delivery without retry.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **String** | The reason for resolving the failed delivery without retrying. | [default to String]

```java
import com.finbourne.horizon.model.ResolveFailedDeliveryRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Reason = "example Reason";


ResolveFailedDeliveryRequest resolveFailedDeliveryRequestInstance = new ResolveFailedDeliveryRequest()
    .Reason(Reason);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
