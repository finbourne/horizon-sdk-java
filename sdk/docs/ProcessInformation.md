# com.finbourne.horizon.model.ProcessInformation
Required information for each process

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | **String** |  | [default to String]
**processName** | **String** |  | [default to String]
**runId** | **String** |  | [default to String]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**dataAction** | **String** |  | [default to String]
**schemaVersion** | **String** |  | [optional] [default to String]
**userId** | **String** |  | [default to String]
**processSummary** | [**ProcessSummary**](ProcessSummary.md) |  | [optional] [default to ProcessSummary]

```java
import com.finbourne.horizon.model.ProcessInformation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Domain = "example Domain";
String ProcessName = "example ProcessName";
String RunId = "example RunId";
OffsetDateTime StartTime = OffsetDateTime.now();
String DataAction = "example DataAction";
@jakarta.annotation.Nullable String SchemaVersion = "example SchemaVersion";
String UserId = "example UserId";
ProcessSummary ProcessSummary = new ProcessSummary();


ProcessInformation processInformationInstance = new ProcessInformation()
    .Domain(Domain)
    .ProcessName(ProcessName)
    .RunId(RunId)
    .StartTime(StartTime)
    .DataAction(DataAction)
    .SchemaVersion(SchemaVersion)
    .UserId(UserId)
    .ProcessSummary(ProcessSummary);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
