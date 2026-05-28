# com.finbourne.horizon.model.ReplayOptions
Optional parameters for replay operations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**overridePublicationStatus** | **String** | Override publication status for all transactions (e.g., force as \&quot;New\&quot;). | [optional] [default to String]

```java
import com.finbourne.horizon.model.ReplayOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String OverridePublicationStatus = "example OverridePublicationStatus";


ReplayOptions replayOptionsInstance = new ReplayOptions()
    .OverridePublicationStatus(OverridePublicationStatus);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
