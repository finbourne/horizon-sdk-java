# com.finbourne.horizon.model.OpenFigiPermIdResult
A packed WebAPI OpenFigi DTO and PermId DTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**openFigiResult** | [**OpenFigiData**](OpenFigiData.md) |  | [default to OpenFigiData]
**permIdResult** | [**PermIdData**](PermIdData.md) |  | [optional] [default to PermIdData]

```java
import com.finbourne.horizon.model.OpenFigiPermIdResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

OpenFigiData OpenFigiResult = new OpenFigiData();
PermIdData PermIdResult = new PermIdData();


OpenFigiPermIdResult openFigiPermIdResultInstance = new OpenFigiPermIdResult()
    .OpenFigiResult(OpenFigiResult)
    .PermIdResult(PermIdResult);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
