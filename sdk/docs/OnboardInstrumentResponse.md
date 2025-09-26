# com.finbourne.horizon.model.OnboardInstrumentResponse
Simplified structure converted from the LUSID UpsertInstrumentReponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **String** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to String]
**values** | **List&lt;String&gt;** | The instruments which have been successfully updated or created. | [default to List<String>]
**failed** | **Map&lt;String, String&gt;** | The instruments that could not be updated or created or were left unchanged without error along with a reason for their failure. | [default to Map<String, String>]

```java
import com.finbourne.horizon.model.OnboardInstrumentResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Href = "example Href";
List<String> Values = new List<String>();
Map<String, String> Failed = new Map<String, String>();


OnboardInstrumentResponse onboardInstrumentResponseInstance = new OnboardInstrumentResponse()
    .Href(Href)
    .Values(Values)
    .Failed(Failed);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
