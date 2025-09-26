# com.finbourne.horizon.model.IntegrationLogActivity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**resultingStatus** | **String** |  | [default to String]
**messageType** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]

```java
import com.finbourne.horizon.model.IntegrationLogActivity;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Timestamp = OffsetDateTime.now();
String ResultingStatus = "example ResultingStatus";
@jakarta.annotation.Nullable String MessageType = "example MessageType";
@jakarta.annotation.Nullable String Description = "example Description";


IntegrationLogActivity integrationLogActivityInstance = new IntegrationLogActivity()
    .Timestamp(Timestamp)
    .ResultingStatus(ResultingStatus)
    .MessageType(MessageType)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
