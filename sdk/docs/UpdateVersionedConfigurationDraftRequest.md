# com.finbourne.horizon.model.UpdateVersionedConfigurationDraftRequest
Request to update the value of an existing draft versioned configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | The new JSON value to store. Must be valid JSON. | [default to String]

```java
import com.finbourne.horizon.model.UpdateVersionedConfigurationDraftRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Value = "example Value";


UpdateVersionedConfigurationDraftRequest updateVersionedConfigurationDraftRequestInstance = new UpdateVersionedConfigurationDraftRequest()
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
