# com.finbourne.horizon.model.TpfTransactionSearchResponse
TPF send history record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | Transaction identifier | [default to String]
**instanceId** | [**UUID**](UUID.md) | Integration instance ID where the transaction was processed | [default to UUID]
**instanceName** | **String** | Integration instance name | [default to String]
**batchId** | [**UUID**](UUID.md) | Unique identifier of the batch | [default to UUID]
**runStartTime** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the batch/run started | [default to OffsetDateTime]
**publicationStatus** | **String** | Publication status of the transaction (Sent | Skipped | Failed) | [default to String]
**instrumentName** | **String** | Instrument name | [default to String]
**instrumentType** | **String** | Instrument type | [default to String]
**tradeDate** | [**OffsetDateTime**](OffsetDateTime.md) | Trade date of the transaction | [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Settlement date of the transaction | [optional] [default to OffsetDateTime]
**skipReason** | **String** | Reason the transaction was skipped (if applicable) | [optional] [default to String]
**fileName** | **String** | Output file associated with the publication run | [optional] [default to String]
**destinations** | **List&lt;String&gt;** | Destinations to which the transaction was published | [optional] [default to List<String>]
**portfolioCode** | **String** | PortfolioCode showing portfolio code | [optional] [default to String]
**portfolioScope** | **String** | PortfolioScope displaying portfolio scope | [optional] [default to String]
**failureReason** | **String** | FailureReason to show failure reason | [optional] [default to String]
**instrumentId** | **String** | InstrumentId showing instrument id of transaction | [optional] [default to String]

```java
import com.finbourne.horizon.model.TpfTransactionSearchResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String TransactionId = "example TransactionId";
UUID InstanceId = "example InstanceId";
String InstanceName = "example InstanceName";
UUID BatchId = "example BatchId";
OffsetDateTime RunStartTime = OffsetDateTime.now();
String PublicationStatus = "example PublicationStatus";
String InstrumentName = "example InstrumentName";
String InstrumentType = "example InstrumentType";
OffsetDateTime TradeDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime SettlementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String SkipReason = "example SkipReason";
@jakarta.annotation.Nullable String FileName = "example FileName";
@jakarta.annotation.Nullable List<String> Destinations = new List<String>();
@jakarta.annotation.Nullable String PortfolioCode = "example PortfolioCode";
@jakarta.annotation.Nullable String PortfolioScope = "example PortfolioScope";
@jakarta.annotation.Nullable String FailureReason = "example FailureReason";
@jakarta.annotation.Nullable String InstrumentId = "example InstrumentId";


TpfTransactionSearchResponse tpfTransactionSearchResponseInstance = new TpfTransactionSearchResponse()
    .TransactionId(TransactionId)
    .InstanceId(InstanceId)
    .InstanceName(InstanceName)
    .BatchId(BatchId)
    .RunStartTime(RunStartTime)
    .PublicationStatus(PublicationStatus)
    .InstrumentName(InstrumentName)
    .InstrumentType(InstrumentType)
    .TradeDate(TradeDate)
    .SettlementDate(SettlementDate)
    .SkipReason(SkipReason)
    .FileName(FileName)
    .Destinations(Destinations)
    .PortfolioCode(PortfolioCode)
    .PortfolioScope(PortfolioScope)
    .FailureReason(FailureReason)
    .InstrumentId(InstrumentId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
