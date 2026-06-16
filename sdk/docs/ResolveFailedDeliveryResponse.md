# com.finbourne.horizon.model.ResolveFailedDeliveryResponse
Response from resolving the failed deliveries for a batch without retry. Resolution is batch-level, so Finbourne.Horizon.Integrations.Web.Dto.Integrations.TradePublicationFramework.Response.ResolveFailedDeliveryResponse.ResolvedCount is the number of failed deliveries marked resolved.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchReferenceId** | **String** |  | [default to String]
**resolvedCount** | **Integer** |  | [default to Integer]
**resolved** | **Boolean** |  | [default to Boolean]
**resolvedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**resolutionReason** | **String** |  | [default to String]
**message** | **String** |  | [default to String]

```java
import com.finbourne.horizon.model.ResolveFailedDeliveryResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String BatchReferenceId = "example BatchReferenceId";
Integer ResolvedCount = new Integer("100.00");
Boolean Resolved = true;
OffsetDateTime ResolvedAt = OffsetDateTime.now();
String ResolutionReason = "example ResolutionReason";
String Message = "example Message";


ResolveFailedDeliveryResponse resolveFailedDeliveryResponseInstance = new ResolveFailedDeliveryResponse()
    .BatchReferenceId(BatchReferenceId)
    .ResolvedCount(ResolvedCount)
    .Resolved(Resolved)
    .ResolvedAt(ResolvedAt)
    .ResolutionReason(ResolutionReason)
    .Message(Message);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
