# com.finbourne.horizon.model.ExternalLogRecord
Represents an external log record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logid** | **Long** | The unique log identifier. | [default to Long]
**parentlogid** | **Long** | The parent log identifier (null is allowed). | [optional] [default to Long]
**loglevel** | **String** | The log level. | [default to String]
**logstatus** | **String** | The log status. | [default to String]
**sourcerecordtype** | **String** | The source record type. | [optional] [default to String]
**sourceprimaryidtype** | **String** | The source primary ID type. | [optional] [default to String]
**sourceprimaryidvalue** | **String** | The source primary ID value. | [optional] [default to String]
**targetrecordtype** | **String** | The target record type. | [optional] [default to String]
**targetrecordaction** | **String** | The target record action. | [optional] [default to String]
**targetprimaryidtype** | **String** | The target primary ID type. | [optional] [default to String]
**targetprimaryidvalue** | **String** | The target primary ID value. | [optional] [default to String]
**message** | **String** | The log message. | [optional] [default to String]
**messagetype** | **String** | The message type. | [optional] [default to String]
**timestamp** | **String** | The timestamp of the log record. | [default to String]

```java
import com.finbourne.horizon.model.ExternalLogRecord;
import java.util.*;
import java.lang.System;
import java.net.URI;

Long Logid = new Long("100.00");
@jakarta.annotation.Nullable Long Parentlogid = new Long("100.00");
String Loglevel = "example Loglevel";
String Logstatus = "example Logstatus";
@jakarta.annotation.Nullable String Sourcerecordtype = "example Sourcerecordtype";
@jakarta.annotation.Nullable String Sourceprimaryidtype = "example Sourceprimaryidtype";
@jakarta.annotation.Nullable String Sourceprimaryidvalue = "example Sourceprimaryidvalue";
@jakarta.annotation.Nullable String Targetrecordtype = "example Targetrecordtype";
@jakarta.annotation.Nullable String Targetrecordaction = "example Targetrecordaction";
@jakarta.annotation.Nullable String Targetprimaryidtype = "example Targetprimaryidtype";
@jakarta.annotation.Nullable String Targetprimaryidvalue = "example Targetprimaryidvalue";
@jakarta.annotation.Nullable String Message = "example Message";
@jakarta.annotation.Nullable String Messagetype = "example Messagetype";
String Timestamp = "example Timestamp";


ExternalLogRecord externalLogRecordInstance = new ExternalLogRecord()
    .Logid(Logid)
    .Parentlogid(Parentlogid)
    .Loglevel(Loglevel)
    .Logstatus(Logstatus)
    .Sourcerecordtype(Sourcerecordtype)
    .Sourceprimaryidtype(Sourceprimaryidtype)
    .Sourceprimaryidvalue(Sourceprimaryidvalue)
    .Targetrecordtype(Targetrecordtype)
    .Targetrecordaction(Targetrecordaction)
    .Targetprimaryidtype(Targetprimaryidtype)
    .Targetprimaryidvalue(Targetprimaryidvalue)
    .Message(Message)
    .Messagetype(Messagetype)
    .Timestamp(Timestamp);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
