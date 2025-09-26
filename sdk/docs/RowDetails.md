# com.finbourne.horizon.model.RowDetails
Information about the nuber of rows processed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rowsTotal** | **Integer** | The number of rows processed. | [optional] [default to Integer]
**rowsSucceeded** | **Integer** | The number of rows that were successfully processed. | [optional] [default to Integer]
**rowsIgnored** | **Integer** | The number of rows that were not processed. | [optional] [default to Integer]
**rowsFailed** | **Integer** | The number of rows that failed when being processed. | [optional] [default to Integer]

```java
import com.finbourne.horizon.model.RowDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Integer RowsTotal = new Integer("100.00");
@jakarta.annotation.Nullable Integer RowsSucceeded = new Integer("100.00");
@jakarta.annotation.Nullable Integer RowsIgnored = new Integer("100.00");
@jakarta.annotation.Nullable Integer RowsFailed = new Integer("100.00");


RowDetails rowDetailsInstance = new RowDetails()
    .RowsTotal(RowsTotal)
    .RowsSucceeded(RowsSucceeded)
    .RowsIgnored(RowsIgnored)
    .RowsFailed(RowsFailed);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
