# com.finbourne.horizon.model.LusidPropertyDefinitionOverridesByType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayNameOverride** | **String** |  | [optional] [default to String]
**descriptionOverride** | **String** |  | [optional] [default to String]
**entityType** | **String** |  | [optional] [default to String]
**entitySubType** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**vendorPackage** | **List&lt;String&gt;** |  | [optional] [default to List<String>]

```java
import com.finbourne.horizon.model.LusidPropertyDefinitionOverridesByType;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String DisplayNameOverride = "example DisplayNameOverride";
@jakarta.annotation.Nullable String DescriptionOverride = "example DescriptionOverride";
@jakarta.annotation.Nullable String EntityType = "example EntityType";
@jakarta.annotation.Nullable List<String> EntitySubType = new List<String>();
@jakarta.annotation.Nullable List<String> VendorPackage = new List<String>();


LusidPropertyDefinitionOverridesByType lusidPropertyDefinitionOverridesByTypeInstance = new LusidPropertyDefinitionOverridesByType()
    .DisplayNameOverride(DisplayNameOverride)
    .DescriptionOverride(DescriptionOverride)
    .EntityType(EntityType)
    .EntitySubType(EntitySubType)
    .VendorPackage(VendorPackage);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
