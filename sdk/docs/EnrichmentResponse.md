# com.finbourne.horizon.model.EnrichmentResponse
Collated enrichment result information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enrichedInstruments** | **List&lt;String&gt;** |  | [default to List<String>]
**ignoredInstruments** | **List&lt;String&gt;** |  | [default to List<String>]
**errorFileId** | **String** | Error File ID, if one was created | [optional] [default to String]

```java
import com.finbourne.horizon.model.EnrichmentResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> EnrichedInstruments = new List<String>();
List<String> IgnoredInstruments = new List<String>();
@jakarta.annotation.Nullable String ErrorFileId = "example ErrorFileId";


EnrichmentResponse enrichmentResponseInstance = new EnrichmentResponse()
    .EnrichedInstruments(EnrichedInstruments)
    .IgnoredInstruments(IgnoredInstruments)
    .ErrorFileId(ErrorFileId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
