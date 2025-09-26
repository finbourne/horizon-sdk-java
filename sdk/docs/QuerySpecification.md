# com.finbourne.horizon.model.QuerySpecification
Defines the information that can be used to query a set of data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limit** | **Integer** | The maximum number of results to be returned in a \&quot;page\&quot; | [optional] [default to Integer]

```java
import com.finbourne.horizon.model.QuerySpecification;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Integer Limit = new Integer("100.00");


QuerySpecification querySpecificationInstance = new QuerySpecification()
    .Limit(Limit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
