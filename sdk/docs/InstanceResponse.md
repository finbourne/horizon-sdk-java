# com.finbourne.horizon.model.InstanceResponse
record containing details of a single instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  | [default to UUID]
**name** | **String** |  | [default to String]
**enabled** | **Boolean** |  | [default to Boolean]
**portfolios** | [**List&lt;TpfPortfolio&gt;**](TpfPortfolio.md) |  | [default to List<TpfPortfolio>]
**schedule** | **String** |  | [optional] [default to String]
**scheduleTimezone** | **String** |  | [optional] [default to String]
**lastRunAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**lastRunStatus** | **String** |  | [optional] [default to String]
**latestRunsIn24Hours** | **String** |  | [optional] [default to String]
**destinations** | [**List&lt;InstanceDestinations&gt;**](InstanceDestinations.md) |  | [default to List<InstanceDestinations>]

```java
import com.finbourne.horizon.model.InstanceResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

UUID Id = "example Id";
String Name = "example Name";
Boolean Enabled = true;
List<TpfPortfolio> Portfolios = new List<TpfPortfolio>();
@jakarta.annotation.Nullable String Schedule = "example Schedule";
@jakarta.annotation.Nullable String ScheduleTimezone = "example ScheduleTimezone";
@jakarta.annotation.Nullable OffsetDateTime LastRunAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String LastRunStatus = "example LastRunStatus";
@jakarta.annotation.Nullable String LatestRunsIn24Hours = "example LatestRunsIn24Hours";
List<InstanceDestinations> Destinations = new List<InstanceDestinations>();


InstanceResponse instanceResponseInstance = new InstanceResponse()
    .Id(Id)
    .Name(Name)
    .Enabled(Enabled)
    .Portfolios(Portfolios)
    .Schedule(Schedule)
    .ScheduleTimezone(ScheduleTimezone)
    .LastRunAt(LastRunAt)
    .LastRunStatus(LastRunStatus)
    .LatestRunsIn24Hours(LatestRunsIn24Hours)
    .Destinations(Destinations);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
