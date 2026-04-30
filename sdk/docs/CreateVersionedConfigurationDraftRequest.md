# com.finbourne.horizon.model.CreateVersionedConfigurationDraftRequest
Request to create a new draft versioned configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**majorVersion** | **Integer** | The major version for the new draft. Must be supplied together with minorVersion, or both omitted to auto-assign the next version. | [optional] [default to Integer]
**minorVersion** | **Integer** | The minor version for the new draft. Must be supplied together with MajorVersion, or both omitted to auto-assign the next version. | [optional] [default to Integer]
**sourceMajorVersion** | **Integer** | The major version of an existing record to copy the value from. Must be supplied together with SourceMinorVersion. If omitted, the new draft is initialised with an empty JSON object. | [optional] [default to Integer]
**sourceMinorVersion** | **Integer** | The minor version of an existing record to copy the value from. Must be supplied together with SourceMajorVersion. If omitted, the new draft is initialised with an empty JSON object. | [optional] [default to Integer]

```java
import com.finbourne.horizon.model.CreateVersionedConfigurationDraftRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Integer MajorVersion = new Integer("100.00");
@jakarta.annotation.Nullable Integer MinorVersion = new Integer("100.00");
@jakarta.annotation.Nullable Integer SourceMajorVersion = new Integer("100.00");
@jakarta.annotation.Nullable Integer SourceMinorVersion = new Integer("100.00");


CreateVersionedConfigurationDraftRequest createVersionedConfigurationDraftRequestInstance = new CreateVersionedConfigurationDraftRequest()
    .MajorVersion(MajorVersion)
    .MinorVersion(MinorVersion)
    .SourceMajorVersion(SourceMajorVersion)
    .SourceMinorVersion(SourceMinorVersion);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
