# com.finbourne.horizon.model.RunStatusCount
record containing the count of runs for a given status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** |  | [default to String]
**count** | **Integer** |  | [default to Integer]

```java
import com.finbourne.horizon.model.RunStatusCount;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Status = "example Status";
Integer Count = new Integer("100.00");


RunStatusCount runStatusCountInstance = new RunStatusCount()
    .Status(Status)
    .Count(Count);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
