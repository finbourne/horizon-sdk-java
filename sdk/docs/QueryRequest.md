# com.finbourne.horizon.model.QueryRequest
Used to control queries, including getting \"pages\" of data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**specification** | [**QuerySpecification**](QuerySpecification.md) |  | [optional] [default to QuerySpecification]

```java
import com.finbourne.horizon.model.QueryRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

QuerySpecification Specification = new QuerySpecification();


QueryRequest queryRequestInstance = new QueryRequest()
    .Specification(Specification);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
