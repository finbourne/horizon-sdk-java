

# AuditUpdateRequest

An incoming request for a Horizon Update Event

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique ID identifiying the source of the event |  |
|**userId** | **String** | A unique ID identifiying who owns the schedule |  |
|**schedulerRunId** | **String** | The GUID of the schedule run |  |
|**startTime** | **OffsetDateTime** | When the run was started in UTC |  |
|**message** | **String** | A descriptive message to accompany the status |  |
|**processNameOverride** | **String** | Optional Name for how the process appears in Data Feed Monitoring |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


