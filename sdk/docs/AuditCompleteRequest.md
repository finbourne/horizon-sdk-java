# com.finbourne.horizon.model.AuditCompleteRequest
An incoming request for a Horizon Complete Event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique ID identifiying the source of the event | [default to String]
**userId** | **String** | A unique ID identifiying who owns the schedule | [default to String]
**schedulerRunId** | **String** | The GUID of the schedule run | [default to String]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | When the run was started in UTC | [default to OffsetDateTime]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) | When the run finished in UTC | [default to OffsetDateTime]
**message** | **String** | A descriptive message to accompany the status | [default to String]
**status** | [**AuditCompleteStatus**](AuditCompleteStatus.md) |  | [default to AuditCompleteStatus]
**rowsTotal** | **Integer** | The number of data rows operated on | [default to Integer]
**rowsSucceeded** | **Integer** | The number of data rows successfully operated on | [default to Integer]
**rowsFailed** | **Integer** | The number of data rows that failed to be operated on | [default to Integer]
**rowsIgnored** | **Integer** | The number of data rows that had no actions taken | [default to Integer]
**auditFiles** | [**List&lt;AuditFileDetails&gt;**](AuditFileDetails.md) | A list of file details for attaching to the event | [default to List<AuditFileDetails>]
**processNameOverride** | **String** | Optional Name for how the process appears in Data Feed Monitoring | [optional] [default to String]

```java
import com.finbourne.horizon.model.AuditCompleteRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Id = "example Id";
String UserId = "example UserId";
String SchedulerRunId = "example SchedulerRunId";
OffsetDateTime StartTime = OffsetDateTime.now();
OffsetDateTime EndTime = OffsetDateTime.now();
String Message = "example Message";
AuditCompleteStatus Integer RowsTotal = new Integer("100.00");
Integer RowsSucceeded = new Integer("100.00");
Integer RowsFailed = new Integer("100.00");
Integer RowsIgnored = new Integer("100.00");
List<AuditFileDetails> AuditFiles = new List<AuditFileDetails>();
@jakarta.annotation.Nullable String ProcessNameOverride = "example ProcessNameOverride";


AuditCompleteRequest auditCompleteRequestInstance = new AuditCompleteRequest()
    .Id(Id)
    .UserId(UserId)
    .SchedulerRunId(SchedulerRunId)
    .StartTime(StartTime)
    .EndTime(EndTime)
    .Message(Message)
    .Status(Status)
    .RowsTotal(RowsTotal)
    .RowsSucceeded(RowsSucceeded)
    .RowsFailed(RowsFailed)
    .RowsIgnored(RowsIgnored)
    .AuditFiles(AuditFiles)
    .ProcessNameOverride(ProcessNameOverride);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
