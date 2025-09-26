# com.finbourne.horizon.model.FileDetails
Information associated with files

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileName** | **String** |  | [default to String]
**fileType** | **String** |  | [optional] [default to String]
**id** | **String** |  | [default to String]

```java
import com.finbourne.horizon.model.FileDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String FileName = "example FileName";
@jakarta.annotation.Nullable String FileType = "example FileType";
String Id = "example Id";


FileDetails fileDetailsInstance = new FileDetails()
    .FileName(FileName)
    .FileType(FileType)
    .Id(Id);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
