

# AuditCompleteRequest

An incoming request for a Horizon Complete Event

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique ID identifiying the source of the event |  |
|**userId** | **String** | A unique ID identifiying who owns the schedule |  |
|**schedulerRunId** | **UUID** | The GUID of the schedule run |  |
|**startTime** | **OffsetDateTime** | When the run was started in UTC |  |
|**endTime** | **OffsetDateTime** | When the run finished in UTC |  |
|**message** | **String** | A descriptive message to accompany the status |  |
|**status** | **AuditCompleteStatus** |  |  |
|**rowsTotal** | **Integer** | The number of data rows operated on |  |
|**rowsSucceeded** | **Integer** | The number of data rows successfully operated on |  |
|**rowsFailed** | **Integer** | The number of data rows that failed to be operated on |  |
|**rowsIgnored** | **Integer** | The number of data rows that had no actions taken |  |
|**auditFiles** | [**List&lt;AuditFileDetails&gt;**](AuditFileDetails.md) | A list of file details for attaching to the event |  |



