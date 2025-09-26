# com.finbourne.horizon.model.IntegrationLogTargetRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordAction** | **String** |  | [optional] [default to String]
**recordType** | **String** |  | [optional] [default to String]
**idType** | **String** |  | [optional] [default to String]
**idValue** | **String** |  | [optional] [default to String]
**attributeName** | **String** |  | [optional] [default to String]
**attributeValue** | **String** |  | [optional] [default to String]

```java
import com.finbourne.horizon.model.IntegrationLogTargetRecord;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String RecordAction = "example RecordAction";
@jakarta.annotation.Nullable String RecordType = "example RecordType";
@jakarta.annotation.Nullable String IdType = "example IdType";
@jakarta.annotation.Nullable String IdValue = "example IdValue";
@jakarta.annotation.Nullable String AttributeName = "example AttributeName";
@jakarta.annotation.Nullable String AttributeValue = "example AttributeValue";


IntegrationLogTargetRecord integrationLogTargetRecordInstance = new IntegrationLogTargetRecord()
    .RecordAction(RecordAction)
    .RecordType(RecordType)
    .IdType(IdType)
    .IdValue(IdValue)
    .AttributeName(AttributeName)
    .AttributeValue(AttributeValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
