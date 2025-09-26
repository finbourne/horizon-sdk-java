# com.finbourne.horizon.model.ProcessSummary
Completed event details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**category** | **String** |  | [optional] [default to String]
**status** | **String** |  | [default to String]
**message** | **String** |  | [default to String]
**rows** | [**RowDetails**](RowDetails.md) |  | [default to RowDetails]
**fileDetails** | [**List&lt;FileDetails&gt;**](FileDetails.md) |  | [optional] [default to List<FileDetails>]

```java
import com.finbourne.horizon.model.ProcessSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime EndTime = OffsetDateTime.now();
@jakarta.annotation.Nullable String Category = "example Category";
String Status = "example Status";
String Message = "example Message";
RowDetails Rows = new RowDetails();
@jakarta.annotation.Nullable List<FileDetails> FileDetails = new List<FileDetails>();


ProcessSummary processSummaryInstance = new ProcessSummary()
    .EndTime(EndTime)
    .Category(Category)
    .Status(Status)
    .Message(Message)
    .Rows(Rows)
    .FileDetails(FileDetails);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
