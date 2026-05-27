# com.finbourne.horizon.model.TransactionResponse
Response containing details of a single transaction for a run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** |  | [default to String]
**publicationStatus** | **String** |  | [default to String]
**portfolioScope** | **String** |  | [optional] [default to String]
**portfolioCode** | **String** |  | [optional] [default to String]
**instrumentId** | **String** |  | [default to String]
**instrumentType** | **String** |  | [default to String]
**instrumentName** | **String** |  | [default to String]
**tradeDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**status** | **String** |  | [default to String]
**skipReason** | **String** |  | [optional] [default to String]
**failureReason** | **String** |  | [optional] [default to String]
**outputFileName** | **String** |  | [optional] [default to String]
**sentAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**destinations** | [**List&lt;DestinationResponse&gt;**](DestinationResponse.md) |  | [default to List<DestinationResponse>]

```java
import com.finbourne.horizon.model.TransactionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String TransactionId = "example TransactionId";
String PublicationStatus = "example PublicationStatus";
@jakarta.annotation.Nullable String PortfolioScope = "example PortfolioScope";
@jakarta.annotation.Nullable String PortfolioCode = "example PortfolioCode";
String InstrumentId = "example InstrumentId";
String InstrumentType = "example InstrumentType";
String InstrumentName = "example InstrumentName";
OffsetDateTime TradeDate = OffsetDateTime.now();
OffsetDateTime SettlementDate = OffsetDateTime.now();
String Status = "example Status";
@jakarta.annotation.Nullable String SkipReason = "example SkipReason";
@jakarta.annotation.Nullable String FailureReason = "example FailureReason";
@jakarta.annotation.Nullable String OutputFileName = "example OutputFileName";
@jakarta.annotation.Nullable OffsetDateTime SentAt = OffsetDateTime.now();
List<DestinationResponse> Destinations = new List<DestinationResponse>();


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
    .Destinations(Destinations);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
