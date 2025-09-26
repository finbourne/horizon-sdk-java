# com.finbourne.horizon.model.AuditFileDetails
Holds information about Horizon Audit Files

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileType** | [**AuditFileType**](AuditFileType.md) |  | [default to AuditFileType]
**filePathAndName** | **String** | The file path and name | [default to String]

```java
import com.finbourne.horizon.model.AuditFileDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

AuditFileType String FilePathAndName = "example FilePathAndName";


AuditFileDetails auditFileDetailsInstance = new AuditFileDetails()
    .FileType(FileType)
    .FilePathAndName(FilePathAndName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
