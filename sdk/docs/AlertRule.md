# com.finbourne.horizon.model.AlertRule
An alert rule on an integration instance. Finbourne.Horizon.Integrations.Web.Dto.AlertRule.Type selects the rule and decides which of the optional fields apply. A field that does not belong to the selected type is rejected.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The rule type (Allowed: MustStartBy, MaxDuration, FailedAfterRetries) | [default to String]
**severity** | **String** | The severity alerts from this rule are raised at (Allowed: Critical, High, Medium, Low, Informational). Critical pages on-call for a client-facing outage. High needs action today. Medium is a missed or late run. Low is an overrun or record-count check. Informational never pages. Defaults per type when omitted: MustStartBy and FailedAfterRetries Medium, MaxDuration Low. | [optional] [default to String]
**timeOfDay** | **String** | MustStartBy only. The local time of day, as HH:mm, by which a run must have started. | [optional] [default to String]
**timeZone** | **String** | MustStartBy only. The IANA or Windows time zone id that TimeOfDay is expressed in. | [optional] [default to String]
**daysOfWeek** | **List&lt;String&gt;** | MustStartBy only. The days the rule applies on, by name (e.g. Monday). Every day when omitted. | [optional] [default to List<String>]
**graceMinutes** | **Integer** | MustStartBy only. Minutes after TimeOfDay before a missing run counts as a breach. 0 when omitted. | [optional] [default to Integer]
**maxMinutes** | **Integer** | MaxDuration only. Alert once a run has been running for longer than this many minutes. Minimum 10. | [optional] [default to Integer]
**includePaused** | **Boolean** | MaxDuration only. Also measure paused runs. False when omitted. | [optional] [default to Boolean]
**alertOnFirstFailure** | **Boolean** | FailedAfterRetries only. Also alert on the first failure of a retry chain, not only when the retries are exhausted. False when omitted. | [optional] [default to Boolean]

```java
import com.finbourne.horizon.model.AlertRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
@jakarta.annotation.Nullable String Severity = "example Severity";
@jakarta.annotation.Nullable String TimeOfDay = "example TimeOfDay";
@jakarta.annotation.Nullable String TimeZone = "example TimeZone";
@jakarta.annotation.Nullable List<String> DaysOfWeek = new List<String>();
@jakarta.annotation.Nullable Integer GraceMinutes = new Integer("100.00");
@jakarta.annotation.Nullable Integer MaxMinutes = new Integer("100.00");
@jakarta.annotation.Nullable Boolean IncludePaused = true;
@jakarta.annotation.Nullable Boolean AlertOnFirstFailure = true;


AlertRule alertRuleInstance = new AlertRule()
    .Type(Type)
    .Severity(Severity)
    .TimeOfDay(TimeOfDay)
    .TimeZone(TimeZone)
    .DaysOfWeek(DaysOfWeek)
    .GraceMinutes(GraceMinutes)
    .MaxMinutes(MaxMinutes)
    .IncludePaused(IncludePaused)
    .AlertOnFirstFailure(AlertOnFirstFailure);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
