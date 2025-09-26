# com.finbourne.horizon.model.Trigger

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | [default to String]
**cronExpression** | **String** |  | [default to String]
**timeZone** | **String** |  | [default to String]

```java
import com.finbourne.horizon.model.Trigger;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
String CronExpression = "example CronExpression";
String TimeZone = "example TimeZone";


Trigger triggerInstance = new Trigger()
    .Type(Type)
    .CronExpression(CronExpression)
    .TimeZone(TimeZone);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
