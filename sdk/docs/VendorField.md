# com.finbourne.horizon.model.VendorField
Reference to a specific vendor field

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_package** | **String** | The vendor package it is included in | [default to String]
**field** | **String** | The name of the field | [default to String]

```java
import com.finbourne.horizon.model.VendorField;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Package = "example Package";
String Field = "example Field";


VendorField vendorFieldInstance = new VendorField()
    .Package(Package)
    .Field(Field);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
