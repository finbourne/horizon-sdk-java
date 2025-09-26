# com.finbourne.horizon.model.AuditUpdateRequest
An incoming request for a Horizon Update Event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique ID identifiying the source of the event | [default to String]
**userId** | **String** | A unique ID identifiying who owns the schedule | [default to String]
**schedulerRunId** | **String** | The GUID of the schedule run | [default to String]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | When the run was started in UTC | [default to OffsetDateTime]
**message** | **String** | A descriptive message to accompany the status | [default to String]
**processNameOverride** | **String** | Optional Name for how the process appears in Data Feed Monitoring | [optional] [default to String]

```java
import com.finbourne.horizon.model.AuditUpdateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Id = "example Id";
String UserId = "example UserId";
String SchedulerRunId = "example SchedulerRunId";
OffsetDateTime StartTime = OffsetDateTime.now();
String Message = "example Message";
@jakarta.annotation.Nullable String ProcessNameOverride = "example ProcessNameOverride";


AuditUpdateRequest auditUpdateRequestInstance = new AuditUpdateRequest()
    .Id(Id)
    .UserId(UserId)
    .SchedulerRunId(SchedulerRunId)
    .StartTime(StartTime)
    .Message(Message)
    .ProcessNameOverride(ProcessNameOverride);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
