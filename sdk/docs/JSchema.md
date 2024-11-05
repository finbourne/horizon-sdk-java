

# JSchema


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemaVersion** | **URI** |  |  [optional] |
|**valid** | **Boolean** |  |  [optional] |
|**reference** | **URI** |  |  [optional] |
|**ref** | [**JSchema**](JSchema.md) |  |  [optional] |
|**recursiveReference** | **URI** |  |  [optional] |
|**recursiveAnchor** | **Boolean** |  |  [optional] |
|**id** | **URI** |  |  [optional] |
|**anchor** | **String** |  |  [optional] |
|**type** | **JSchemaType** |  |  [optional] |
|**_default** | **Object** |  |  [optional] |
|**properties** | [**Map&lt;String, JSchema&gt;**](JSchema.md) |  |  [readonly] |
|**items** | [**List&lt;JSchema&gt;**](JSchema.md) |  |  [readonly] |
|**itemsPositionValidation** | **Boolean** |  |  |
|**required** | **List&lt;String&gt;** |  |  [readonly] |
|**allOf** | [**List&lt;JSchema&gt;**](JSchema.md) |  |  [readonly] |
|**anyOf** | [**List&lt;JSchema&gt;**](JSchema.md) |  |  [readonly] |
|**oneOf** | [**List&lt;JSchema&gt;**](JSchema.md) |  |  [readonly] |
|**_if** | [**JSchema**](JSchema.md) |  |  [optional] |
|**then** | [**JSchema**](JSchema.md) |  |  [optional] |
|**_else** | [**JSchema**](JSchema.md) |  |  [optional] |
|**not** | [**JSchema**](JSchema.md) |  |  [optional] |
|**contains** | [**JSchema**](JSchema.md) |  |  [optional] |
|**propertyNames** | [**JSchema**](JSchema.md) |  |  [optional] |
|**_enum** | **List&lt;Object&gt;** |  |  [readonly] |
|**_const** | **Object** |  |  [optional] |
|**uniqueItems** | **Boolean** |  |  |
|**minimumLength** | **Long** |  |  [optional] |
|**maximumLength** | **Long** |  |  [optional] |
|**minimum** | **java.math.BigDecimal** |  |  [optional] |
|**maximum** | **java.math.BigDecimal** |  |  [optional] |
|**exclusiveMinimum** | **Boolean** |  |  |
|**exclusiveMaximum** | **Boolean** |  |  |
|**minimumItems** | **Long** |  |  [optional] |
|**maximumItems** | **Long** |  |  [optional] |
|**minimumProperties** | **Long** |  |  [optional] |
|**maximumProperties** | **Long** |  |  [optional] |
|**minimumContains** | **Long** |  |  [optional] |
|**maximumContains** | **Long** |  |  [optional] |
|**contentEncoding** | **String** |  |  [optional] |
|**contentMediaType** | **String** |  |  [optional] |
|**writeOnly** | **Boolean** |  |  [optional] |
|**readOnly** | **Boolean** |  |  [optional] |
|**extensionData** | **Map&lt;String, Object&gt;** |  |  [readonly] |
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**multipleOf** | **java.math.BigDecimal** |  |  [optional] |
|**pattern** | **String** |  |  [optional] |
|**dependencies** | **Map&lt;String, Object&gt;** |  |  [readonly] |
|**dependentRequired** | **Map&lt;String, List&lt;String&gt;&gt;** |  |  [readonly] |
|**dependentSchemas** | [**Map&lt;String, JSchema&gt;**](JSchema.md) |  |  [readonly] |
|**patternProperties** | [**Map&lt;String, JSchema&gt;**](JSchema.md) |  |  [readonly] |
|**additionalProperties** | [**JSchema**](JSchema.md) |  |  [optional] |
|**allowAdditionalProperties** | **Boolean** |  |  |
|**allowAdditionalPropertiesSpecified** | **Boolean** |  |  |
|**unevaluatedProperties** | [**JSchema**](JSchema.md) |  |  [optional] |
|**allowUnevaluatedProperties** | **Boolean** |  |  [optional] |
|**additionalItems** | [**JSchema**](JSchema.md) |  |  [optional] |
|**allowAdditionalItems** | **Boolean** |  |  |
|**allowAdditionalItemsSpecified** | **Boolean** |  |  |
|**unevaluatedItems** | [**JSchema**](JSchema.md) |  |  [optional] |
|**allowUnevaluatedItems** | **Boolean** |  |  [optional] |
|**format** | **String** |  |  [optional] |
|**validators** | **List&lt;Object&gt;** |  |  [readonly] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


