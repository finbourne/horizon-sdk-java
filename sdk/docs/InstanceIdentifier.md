# com.finbourne.horizon.model.InstanceIdentifier
Identifies a single instance of an integration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Instance identifier. | [default to String]
**warnings** | [**List&lt;ValidationNoticeResponse&gt;**](ValidationNoticeResponse.md) | Non-blocking findings about the saved configuration. Empty when there are none. | [optional] [default to List<ValidationNoticeResponse>]

```java
import com.finbourne.horizon.model.InstanceIdentifier;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Id = "example Id";
@jakarta.annotation.Nullable List<ValidationNoticeResponse> Warnings = new List<ValidationNoticeResponse>();


InstanceIdentifier instanceIdentifierInstance = new InstanceIdentifier()
    .Id(Id)
    .Warnings(Warnings);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
