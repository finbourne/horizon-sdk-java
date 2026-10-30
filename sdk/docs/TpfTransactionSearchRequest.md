# com.finbourne.horizon.model.TpfTransactionSearchRequest
Request body for the POST transaction-search endpoint. Multiple values in TransactionIds and InstrumentIdentifiers are OR'd within each filter; both filters together are AND'd.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionIds** | **List&lt;String&gt;** | One or more LUSID transaction IDs to search for (max 50). Values are OR&#39;d. | [optional] [default to List<String>]
**instrumentIdentifiers** | **List&lt;String&gt;** | One or more instrument identifiers to search for (max 50). Values are OR&#39;d. Accepts LusidInstrumentId, Isin, Figi, Ticker, Cusip, Sedol or ClientInternal values. Every value is matched exactly against the stored instrument id; non-LUID values are also resolved against LUSID instruments in the default scope, whose own matching rules (including case) apply. | [optional] [default to List<String>]
**instanceId** | **String** | Instance ID to filter by. Omit or leave null to search all instances the caller has access to. | [optional] [default to String]
**from** | [**OffsetDateTime**](OffsetDateTime.md) | Start of the date range (inclusive). Defaults to 30 days ago if neither From nor To is provided. | [optional] [default to OffsetDateTime]
**to** | [**OffsetDateTime**](OffsetDateTime.md) | End of the date range (inclusive). Defaults to now if not provided. | [optional] [default to OffsetDateTime]
**limit** | **Integer** | Maximum number of results to return per page. | [optional] [default to Integer]
**page** | **String** | Pagination token from a previous response NextPage or PreviousPage. Omit for the first page. | [optional] [default to String]
**status** | **String** | Publication status to filter by. Valid values: Sent, Skipped, Failed. Optional. | [optional] [default to String]
**filter** | **String** | Filter expression to apply to the results, in the format \&quot;property operator value\&quot; (e.g., eq, ne, gt, lt), combined with \&quot;and\&quot;/\&quot;or\&quot; as needed. Filterable properties are transactionId, instanceName, runStartTime, instrumentName, instrumentType, instrumentId, tradeDate, settlementDate, skipReason, failureReason, fileName, portfolioScope, portfolioCode, and runId. PublicationStatus is not filterable here — use the Status body parameter instead. Dates are quoted ISO-8601. Destinations is not filterable. Must remain the same across pages — the page token includes a hash of both filter and sortBy. | [optional] [default to String]
**sortBy** | **List&lt;String&gt;** | Up to two sortable fields, each optionally suffixed \&quot; ASC\&quot; or \&quot; DESC\&quot;. Deterministic tiebreakers are appended automatically: RunStartTime DESC, TransactionId ASC, BatchUuid ASC, FileName ASC. Must remain the same across pages — the page token includes a hash of both filter and sortBy. | [optional] [default to List<String>]

```java
import com.finbourne.horizon.model.TpfTransactionSearchRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<String> TransactionIds = new List<String>();
@jakarta.annotation.Nullable List<String> InstrumentIdentifiers = new List<String>();
@jakarta.annotation.Nullable String InstanceId = "example InstanceId";
@jakarta.annotation.Nullable OffsetDateTime From = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime To = OffsetDateTime.now();
@jakarta.annotation.Nullable Integer Limit = new Integer("100.00");
@jakarta.annotation.Nullable String Page = "example Page";
@jakarta.annotation.Nullable String Status = "example Status";
@jakarta.annotation.Nullable String Filter = "example Filter";
@jakarta.annotation.Nullable List<String> SortBy = new List<String>();


TpfTransactionSearchRequest tpfTransactionSearchRequestInstance = new TpfTransactionSearchRequest()
    .TransactionIds(TransactionIds)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .InstanceId(InstanceId)
    .From(From)
    .To(To)
    .Limit(Limit)
    .Page(Page)
    .Status(Status)
    .Filter(Filter)
    .SortBy(SortBy);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
