# com.finbourne.horizon.model.OpenFigiSearchResult
Response coming back from a search request to OpenFIGI

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | [**List&lt;OpenFigiData&gt;**](OpenFigiData.md) | Enumerable list of OpenFIGI results | [default to List<OpenFigiData>]
**permIdUri** | **String** | URI of the related PermID response, if requested | [optional] [default to String]

```java
import com.finbourne.horizon.model.OpenFigiSearchResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<OpenFigiData> Results = new List<OpenFigiData>();
@jakarta.annotation.Nullable String PermIdUri = "example PermIdUri";


OpenFigiSearchResult openFigiSearchResultInstance = new OpenFigiSearchResult()
    .Results(Results)
    .PermIdUri(PermIdUri);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
