# com.finbourne.horizon.model.OnboardInstrumentRequest
The full structure of a instrument creation / onboarding request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataResults** | [**List&lt;OpenFigiPermIdResult&gt;**](OpenFigiPermIdResult.md) | Enumerable packed OpenFigi/PermId information used to create instruments | [default to List<OpenFigiPermIdResult>]
**primaryVendorKey** | **String** | Primary vendor used to master instrument from Unknown to an asset type | [optional] [default to String]
**secondaryVendorKeys** | **List&lt;String&gt;** | Secondary vendors used to decorate additional properties | [optional] [default to List<String>]

```java
import com.finbourne.horizon.model.OnboardInstrumentRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<OpenFigiPermIdResult> DataResults = new List<OpenFigiPermIdResult>();
@jakarta.annotation.Nullable String PrimaryVendorKey = "example PrimaryVendorKey";
@jakarta.annotation.Nullable List<String> SecondaryVendorKeys = new List<String>();


OnboardInstrumentRequest onboardInstrumentRequestInstance = new OnboardInstrumentRequest()
    .DataResults(DataResults)
    .PrimaryVendorKey(PrimaryVendorKey)
    .SecondaryVendorKeys(SecondaryVendorKeys);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
