# com.finbourne.horizon.model.UpdateClientConfigurationDraftRequest
Request to update the value of an existing draft client configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | The new JSON value to store. Must be valid JSON. | [default to String]

```java
import com.finbourne.horizon.model.UpdateClientConfigurationDraftRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Value = "example Value";


UpdateClientConfigurationDraftRequest updateClientConfigurationDraftRequestInstance = new UpdateClientConfigurationDraftRequest()
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
