# com.finbourne.horizon.model.InstanceRunResponse
Response containing details of a single run for an instance. The transaction and file figures describe the batch as it stands now, so they are reported on the latest attempt only and are null on earlier attempts of a retried run. Message explains a failed attempt and what will happen or must be done next; it is null for completed, running and queued attempts.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**UUID**](UUID.md) |  | [default to UUID]
**referenceId** | [**UUID**](UUID.md) |  | [default to UUID]
**attempt** | **Integer** |  | [optional] [default to Integer]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**duration** | **String** |  | [optional] [default to String]
**status** | **String** |  | [default to String]
**triggeredBy** | **String** |  | [optional] [default to String]
**total** | **Integer** |  | [optional] [default to Integer]
**sentCount** | **Long** |  | [optional] [default to Long]
**skippedCount** | **Long** |  | [optional] [default to Long]
**failedCount** | **Long** |  | [optional] [default to Long]
**failedFiles** | **Integer** |  | [optional] [default to Integer]
**message** | **String** |  | [optional] [default to String]

```java
import com.finbourne.horizon.model.InstanceRunResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

UUID RunId = "example RunId";
UUID ReferenceId = "example ReferenceId";
@jakarta.annotation.Nullable Integer Attempt = new Integer("100.00");
OffsetDateTime StartTime = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EndTime = OffsetDateTime.now();
@jakarta.annotation.Nullable String Duration = "example Duration";
String Status = "example Status";
@jakarta.annotation.Nullable String TriggeredBy = "example TriggeredBy";
@jakarta.annotation.Nullable Integer Total = new Integer("100.00");
@jakarta.annotation.Nullable Long SentCount = new Long("100.00");
@jakarta.annotation.Nullable Long SkippedCount = new Long("100.00");
@jakarta.annotation.Nullable Long FailedCount = new Long("100.00");
@jakarta.annotation.Nullable Integer FailedFiles = new Integer("100.00");
@jakarta.annotation.Nullable String Message = "example Message";


InstanceRunResponse instanceRunResponseInstance = new InstanceRunResponse()
    .RunId(RunId)
    .ReferenceId(ReferenceId)
    .Attempt(Attempt)
    .StartTime(StartTime)
    .EndTime(EndTime)
    .Duration(Duration)
    .Status(Status)
    .TriggeredBy(TriggeredBy)
    .Total(Total)
    .SentCount(SentCount)
    .SkippedCount(SkippedCount)
    .FailedCount(FailedCount)
    .FailedFiles(FailedFiles)
    .Message(Message);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
