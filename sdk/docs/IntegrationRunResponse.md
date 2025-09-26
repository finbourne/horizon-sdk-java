# com.finbourne.horizon.model.IntegrationRunResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**UUID**](UUID.md) |  | [default to UUID]
**refRunId** | [**UUID**](UUID.md) |  | [optional] [default to UUID]
**attempt** | **Integer** |  | [default to Integer]
**instanceId** | [**UUID**](UUID.md) |  | [optional] [default to UUID]
**instanceName** | **String** |  | [optional] [default to String]
**status** | **String** |  | [optional] [default to String]
**message** | **String** |  | [optional] [default to String]
**integration** | [**IntegrationRunIntegration**](IntegrationRunIntegration.md) |  | [default to IntegrationRunIntegration]
**version** | [**IntegrationRunVersion**](IntegrationRunVersion.md) |  | [default to IntegrationRunVersion]
**integrationLogs** | [**Map&lt;String, Map&lt;String, IntegrationRunLog&gt;&gt;**](Map.md) |  | [optional] [default to Map<String, Map<String, IntegrationRunLog>>]

```java
import com.finbourne.horizon.model.IntegrationRunResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

UUID RunId = "example RunId";
@jakarta.annotation.Nullable UUID RefRunId = "example RefRunId";
Integer Attempt = new Integer("100.00");
@jakarta.annotation.Nullable UUID InstanceId = "example InstanceId";
@jakarta.annotation.Nullable String InstanceName = "example InstanceName";
@jakarta.annotation.Nullable String Status = "example Status";
@jakarta.annotation.Nullable String Message = "example Message";
IntegrationRunIntegration Integration = new IntegrationRunIntegration();
IntegrationRunVersion Version = new IntegrationRunVersion();
@jakarta.annotation.Nullable Map<String, Map<String, IntegrationRunLog>> IntegrationLogs = new Map<String, Map<String, IntegrationRunLog>>();


IntegrationRunResponse integrationRunResponseInstance = new IntegrationRunResponse()
    .RunId(RunId)
    .RefRunId(RefRunId)
    .Attempt(Attempt)
    .InstanceId(InstanceId)
    .InstanceName(InstanceName)
    .Status(Status)
    .Message(Message)
    .Integration(Integration)
    .Version(Version)
    .IntegrationLogs(IntegrationLogs);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
