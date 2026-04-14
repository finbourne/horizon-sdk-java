# com.finbourne.horizon.model.ProcessorSchemaResponse
DTO ProcessorSchemaResponse fields with JObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**processorName** | **String** |  | [default to String]
**version** | **String** |  | [default to String]
**configurationSchema** | **Object** |  | [default to Object]

```java
import com.finbourne.horizon.model.ProcessorSchemaResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ProcessorName = "example ProcessorName";
String Version = "example Version";
@jakarta.annotation.Nullable Object 

ProcessorSchemaResponse processorSchemaResponseInstance = new ProcessorSchemaResponse()
    .ProcessorName(ProcessorName)
    .Version(Version)
    .ConfigurationSchema(ConfigurationSchema);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
