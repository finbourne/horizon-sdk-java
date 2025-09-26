# com.finbourne.horizon.model.IIntegrationLogResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logId** | **Long** |  | [readonly] [default to Long]
**runId** | [**UUID**](UUID.md) |  | [optional] [readonly] [default to UUID]
**parentLogId** | **Long** |  | [optional] [readonly] [default to Long]
**logType** | **String** |  | [readonly] [default to String]
**firstActivity** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [readonly] [default to OffsetDateTime]
**lastActivity** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [readonly] [default to OffsetDateTime]
**status** | **String** |  | [optional] [readonly] [default to String]
**sourceRecord** | [**IntegrationLogRecord**](IntegrationLogRecord.md) |  | [optional] [default to IntegrationLogRecord]
**targetRecord** | [**IntegrationLogTargetRecord**](IntegrationLogTargetRecord.md) |  | [optional] [default to IntegrationLogTargetRecord]
**activities** | [**List&lt;IntegrationLogActivity&gt;**](IntegrationLogActivity.md) |  | [readonly] [default to List<IntegrationLogActivity>]

```java
import com.finbourne.horizon.model.IIntegrationLogResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Long LogId = new Long("100.00");
@jakarta.annotation.Nullable UUID RunId = "example RunId";
@jakarta.annotation.Nullable Long ParentLogId = new Long("100.00");
String LogType = "example LogType";
@jakarta.annotation.Nullable OffsetDateTime FirstActivity = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime LastActivity = OffsetDateTime.now();
@jakarta.annotation.Nullable String Status = "example Status";
IntegrationLogRecord SourceRecord = new IntegrationLogRecord();
IntegrationLogTargetRecord TargetRecord = new IntegrationLogTargetRecord();
List<IntegrationLogActivity> Activities = new List<IntegrationLogActivity>();


IIntegrationLogResponse iIntegrationLogResponseInstance = new IIntegrationLogResponse()
    .LogId(LogId)
    .RunId(RunId)
    .ParentLogId(ParentLogId)
    .LogType(LogType)
    .FirstActivity(FirstActivity)
    .LastActivity(LastActivity)
    .Status(Status)
    .SourceRecord(SourceRecord)
    .TargetRecord(TargetRecord)
    .Activities(Activities);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
