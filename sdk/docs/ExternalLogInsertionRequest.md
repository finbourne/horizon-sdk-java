# com.finbourne.horizon.model.ExternalLogInsertionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logs** | [**List&lt;ExternalLogRecord&gt;**](ExternalLogRecord.md) |  | [default to List<ExternalLogRecord>]

```java
import com.finbourne.horizon.model.ExternalLogInsertionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ExternalLogRecord> Logs = new List<ExternalLogRecord>();


ExternalLogInsertionRequest externalLogInsertionRequestInstance = new ExternalLogInsertionRequest()
    .Logs(Logs);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
