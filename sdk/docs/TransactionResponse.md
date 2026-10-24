# com.finbourne.horizon.model.TransactionResponse
Response containing details of a single transaction for a run. A transaction built twice in one batch appears once per build. FailureStage says whether a failed transaction failed while being built (Build) or while its file was being delivered (Delivery).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** |  | [default to String]
**publicationStatus** | **String** | The outcome the screens show for this row: Sent, Skipped or Failed. | [default to String]
**portfolioScope** | **String** |  | [optional] [default to String]
**portfolioCode** | **String** |  | [optional] [default to String]
**instrumentId** | **String** |  | [optional] [default to String]
**instrumentType** | **String** |  | [optional] [default to String]
**instrumentName** | **String** |  | [optional] [default to String]
**tradeDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**status** | **String** | The batch element&#39;s processing state as the worker left it, not the outcome; read PublicationStatus for that. | [default to String]
**skipReason** | **String** |  | [optional] [default to String]
**failureReason** | **String** |  | [optional] [default to String]
**outputFileName** | **String** |  | [optional] [default to String]
**sentAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**destinations** | [**List&lt;DestinationResponse&gt;**](DestinationResponse.md) |  | [default to List<DestinationResponse>]
**failureStage** | **String** |  | [optional] [default to String]

```java
import com.finbourne.horizon.model.TransactionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String TransactionId = "example TransactionId";
String PublicationStatus = "example PublicationStatus";
@jakarta.annotation.Nullable String PortfolioScope = "example PortfolioScope";
@jakarta.annotation.Nullable String PortfolioCode = "example PortfolioCode";
@jakarta.annotation.Nullable String InstrumentId = "example InstrumentId";
@jakarta.annotation.Nullable String InstrumentType = "example InstrumentType";
@jakarta.annotation.Nullable String InstrumentName = "example InstrumentName";
@jakarta.annotation.Nullable OffsetDateTime TradeDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime SettlementDate = OffsetDateTime.now();
String Status = "example Status";
@jakarta.annotation.Nullable String SkipReason = "example SkipReason";
@jakarta.annotation.Nullable String FailureReason = "example FailureReason";
@jakarta.annotation.Nullable String OutputFileName = "example OutputFileName";
@jakarta.annotation.Nullable OffsetDateTime SentAt = OffsetDateTime.now();
List<DestinationResponse> Destinations = new List<DestinationResponse>();
@jakarta.annotation.Nullable String FailureStage = "example FailureStage";


TransactionResponse transactionResponseInstance = new TransactionResponse()
    .TransactionId(TransactionId)
    .PublicationStatus(PublicationStatus)
    .PortfolioScope(PortfolioScope)
    .PortfolioCode(PortfolioCode)
    .InstrumentId(InstrumentId)
    .InstrumentType(InstrumentType)
    .InstrumentName(InstrumentName)
    .TradeDate(TradeDate)
    .SettlementDate(SettlementDate)
    .Status(Status)
    .SkipReason(SkipReason)
    .FailureReason(FailureReason)
    .OutputFileName(OutputFileName)
    .SentAt(SentAt)
    .Destinations(Destinations)
    .FailureStage(FailureStage);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
