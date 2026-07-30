# com.finbourne.horizon.model.ProcessorDescription
Represents a processor in the Horizon integration system.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | [default to String]
**displayName** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**category** | **String** |  | [default to String]
**isActive** | **Boolean** |  | [default to Boolean]
**isConnectionRequired** | **Boolean** |  | [default to Boolean]
**relationships** | **List&lt;String&gt;** |  | [default to List<String>]

```java
import com.finbourne.horizon.model.ProcessorDescription;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
String DisplayName = "example DisplayName";
String Description = "example Description";
String Category = "example Category";
Boolean IsActive = true;
Boolean IsConnectionRequired = true;
List<String> Relationships = new List<String>();


ProcessorDescription processorDescriptionInstance = new ProcessorDescription()
    .Name(Name)
    .DisplayName(DisplayName)
    .Description(Description)
    .Category(Category)
    .IsActive(IsActive)
    .IsConnectionRequired(IsConnectionRequired)
    .Relationships(Relationships);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
