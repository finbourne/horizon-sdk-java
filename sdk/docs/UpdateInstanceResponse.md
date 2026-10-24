# com.finbourne.horizon.model.UpdateInstanceResponse
The outcome of updating an instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**warnings** | [**List&lt;ValidationNoticeResponse&gt;**](ValidationNoticeResponse.md) | Non-blocking findings about the saved configuration. Empty when there are none. | [optional] [default to List<ValidationNoticeResponse>]

```java
import com.finbourne.horizon.model.UpdateInstanceResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<ValidationNoticeResponse> Warnings = new List<ValidationNoticeResponse>();


UpdateInstanceResponse updateInstanceResponseInstance = new UpdateInstanceResponse()
    .Warnings(Warnings);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
