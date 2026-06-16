# com.finbourne.horizon.model.FailedDeliveryResponse
A batch's failed deliveries returned by the list endpoint, aggregated to one row per batch. Finbourne.Horizon.Integrations.Web.Dto.Integrations.TradePublicationFramework.Response.FailedDeliveryResponse.FailedCount is the number of failed deliveries in the batch and Finbourne.Horizon.Integrations.Web.Dto.Integrations.TradePublicationFramework.Response.FailedDeliveryResponse.FailureReason is the comma-separated set of their failure reasons.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchReferenceId** | **String** |  | [default to String]
**runId** | [**UUID**](UUID.md) |  | [default to UUID]
**runStartTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**failedCount** | **Integer** |  | [default to Integer]
**failureReason** | **String** |  | [default to String]
**lastAttemptAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**attemptCount** | **Integer** |  | [default to Integer]
**resolved** | **Boolean** |  | [default to Boolean]
**resolvedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**resolutionReason** | **String** |  | [optional] [default to String]

```java
import com.finbourne.horizon.model.FailedDeliveryResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String BatchReferenceId = "example BatchReferenceId";
UUID RunId = "example RunId";
OffsetDateTime RunStartTime = OffsetDateTime.now();
Integer FailedCount = new Integer("100.00");
String FailureReason = "example FailureReason";
OffsetDateTime LastAttemptAt = OffsetDateTime.now();
Integer AttemptCount = new Integer("100.00");
Boolean Resolved = true;
@jakarta.annotation.Nullable OffsetDateTime ResolvedAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String ResolutionReason = "example ResolutionReason";


FailedDeliveryResponse failedDeliveryResponseInstance = new FailedDeliveryResponse()
    .BatchReferenceId(BatchReferenceId)
    .RunId(RunId)
    .RunStartTime(RunStartTime)
    .FailedCount(FailedCount)
    .FailureReason(FailureReason)
    .LastAttemptAt(LastAttemptAt)
    .AttemptCount(AttemptCount)
    .Resolved(Resolved)
    .ResolvedAt(ResolvedAt)
    .ResolutionReason(ResolutionReason);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
