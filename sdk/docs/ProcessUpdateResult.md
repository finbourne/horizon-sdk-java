# com.finbourne.horizon.model.ProcessUpdateResult
Shows details relevant to update events for a query

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | **String** |  | [default to String]
**entryId** | **String** |  | [default to String]
**processName** | **String** |  | [default to String]
**runId** | **String** |  | [default to String]
**entryDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**status** | **String** |  | [default to String]
**message** | **String** |  | [default to String]
**schemaVersion** | **String** |  | [optional] [default to String]

```java
import com.finbourne.horizon.model.ProcessUpdateResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Domain = "example Domain";
String EntryId = "example EntryId";
String ProcessName = "example ProcessName";
String RunId = "example RunId";
OffsetDateTime EntryDate = OffsetDateTime.now();
String Status = "example Status";
String Message = "example Message";
@jakarta.annotation.Nullable String SchemaVersion = "example SchemaVersion";


ProcessUpdateResult processUpdateResultInstance = new ProcessUpdateResult()
    .Domain(Domain)
    .EntryId(EntryId)
    .ProcessName(ProcessName)
    .RunId(RunId)
    .EntryDate(EntryDate)
    .Status(Status)
    .Message(Message)
    .SchemaVersion(SchemaVersion);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
