# com.finbourne.horizon.model.LatestRunsResponse
record containing the 24-hour run summary grouped by external status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **Integer** |  | [default to Integer]
**statusCounts** | [**List&lt;RunStatusCount&gt;**](RunStatusCount.md) |  | [default to List<RunStatusCount>]

```java
import com.finbourne.horizon.model.LatestRunsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Total = new Integer("100.00");
List<RunStatusCount> StatusCounts = new List<RunStatusCount>();


LatestRunsResponse latestRunsResponseInstance = new LatestRunsResponse()
    .Total(Total)
    .StatusCounts(StatusCounts);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
