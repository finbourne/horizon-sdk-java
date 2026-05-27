# com.finbourne.horizon.model.InstanceDestinations
record containing details of the destinations for an instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinationType** | **String** |  | [default to String]
**name** | **String** |  | [default to String]
**destinationPath** | **String** |  | [default to String]

```java
import com.finbourne.horizon.model.InstanceDestinations;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DestinationType = "example DestinationType";
String Name = "example Name";
String DestinationPath = "example DestinationPath";


InstanceDestinations instanceDestinationsInstance = new InstanceDestinations()
    .DestinationType(DestinationType)
    .Name(Name)
    .DestinationPath(DestinationPath);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
