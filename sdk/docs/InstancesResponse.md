# com.finbourne.horizon.model.InstancesResponse
record containing a list of instances.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instances** | [**List&lt;InstanceResponse&gt;**](InstanceResponse.md) |  | [default to List<InstanceResponse>]

```java
import com.finbourne.horizon.model.InstancesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<InstanceResponse> Instances = new List<InstanceResponse>();


InstancesResponse instancesResponseInstance = new InstancesResponse()
    .Instances(Instances);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
