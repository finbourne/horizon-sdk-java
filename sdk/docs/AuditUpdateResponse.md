# com.finbourne.horizon.model.AuditUpdateResponse
Response type for Horizon Audit Event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**processName** | **String** | The name of the Process the events will be visible under | [default to String]

```java
import com.finbourne.horizon.model.AuditUpdateResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ProcessName = "example ProcessName";


AuditUpdateResponse auditUpdateResponseInstance = new AuditUpdateResponse()
    .ProcessName(ProcessName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
