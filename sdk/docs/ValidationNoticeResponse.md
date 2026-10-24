# com.finbourne.horizon.model.ValidationNoticeResponse
A non-blocking finding raised when an instance was saved. The save succeeded regardless.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**severity** | **String** | \&quot;Warning\&quot; or \&quot;Information\&quot;. | [default to String]
**field** | **String** | The configuration field the finding relates to. | [default to String]
**message** | **String** | What was found. | [default to String]

```java
import com.finbourne.horizon.model.ValidationNoticeResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Severity = "example Severity";
String Field = "example Field";
String Message = "example Message";


ValidationNoticeResponse validationNoticeResponseInstance = new ValidationNoticeResponse()
    .Severity(Severity)
    .Field(Field)
    .Message(Message);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
