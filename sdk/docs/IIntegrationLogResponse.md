

# IIntegrationLogResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**logId** | **Long** |  |  [readonly] |
|**runId** | **UUID** |  |  [optional] [readonly] |
|**parentLogId** | **Long** |  |  [optional] [readonly] |
|**logType** | **String** |  |  [readonly] |
|**firstActivity** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastActivity** | **OffsetDateTime** |  |  [optional] [readonly] |
|**status** | **String** |  |  [optional] [readonly] |
|**sourceRecord** | [**IntegrationLogRecord**](IntegrationLogRecord.md) |  |  [optional] |
|**targetRecord** | [**IntegrationLogTargetRecord**](IntegrationLogTargetRecord.md) |  |  [optional] |
|**activities** | [**List&lt;IntegrationLogActivity&gt;**](IntegrationLogActivity.md) |  |  [readonly] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


