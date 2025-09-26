# com.finbourne.horizon.model.IntegrationRunLog

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **Long** |  | [default to Long]
**link** | [**IntegrationRunLogLink**](IntegrationRunLogLink.md) |  | [default to IntegrationRunLogLink]

```java
import com.finbourne.horizon.model.IntegrationRunLog;
import java.util.*;
import java.lang.System;
import java.net.URI;

Long Count = new Long("100.00");
IntegrationRunLogLink Link = new IntegrationRunLogLink();


IntegrationRunLog integrationRunLogInstance = new IntegrationRunLog()
    .Count(Count)
    .Link(Link);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
