# com.finbourne.horizon.model.InstanceRunResponse
Response containing details of a single run for an instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**UUID**](UUID.md) |  | [default to UUID]
**batchReferenceId** | [**UUID**](UUID.md) |  | [default to UUID]
**attempt** | **Integer** |  | [optional] [default to Integer]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**duration** | **String** |  | [optional] [default to String]
**status** | **String** |  | [default to String]
**triggeredBy** | **String** |  | [optional] [default to String]
**total** | **Integer** |  | [default to Integer]
**sentCount** | **Long** |  | [default to Long]
**skippedCount** | **Long** |  | [default to Long]
**failedCount** | **Long** |  | [default to Long]
**failedFiles** | **Integer** |  | [default to Integer]

```java
import com.finbourne.horizon.model.InstanceRunResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

UUID RunId = "example RunId";
UUID BatchReferenceId = "example BatchReferenceId";
@jakarta.annotation.Nullable Integer Attempt = new Integer("100.00");
OffsetDateTime StartTime = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EndTime = OffsetDateTime.now();
@jakarta.annotation.Nullable String Duration = "example Duration";
String Status = "example Status";
@jakarta.annotation.Nullable String TriggeredBy = "example TriggeredBy";
Integer Total = new Integer("100.00");
Long SentCount = new Long("100.00");
Long SkippedCount = new Long("100.00");
Long FailedCount = new Long("100.00");
Integer FailedFiles = new Integer("100.00");


InstanceRunResponse instanceRunResponseInstance = new InstanceRunResponse()
    .RunId(RunId)
    .BatchReferenceId(BatchReferenceId)
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
    .FailedFiles(FailedFiles);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
