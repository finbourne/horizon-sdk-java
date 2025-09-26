# com.finbourne.horizon.model.IntegrationRunVersion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAtCreated** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**asAtModified** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.horizon.model.IntegrationRunVersion;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AsAtCreated = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AsAtModified = OffsetDateTime.now();


IntegrationRunVersion integrationRunVersionInstance = new IntegrationRunVersion()
    .AsAtCreated(AsAtCreated)
    .AsAtModified(AsAtModified);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
