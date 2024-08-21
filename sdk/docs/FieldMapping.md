

# FieldMapping

Mapping from a set of Vendor Fields to a LUSID core entity field

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fieldName** | **String** | The LUSID core entity field |  |
|**defaultValue** | **String** | Default value if needed |  [optional] |
|**vendorFields** | [**List&lt;VendorField&gt;**](VendorField.md) | Fields that will be used to map to this field |  |
|**transformationDescription** | **String** | The transformation, if required, to map from VendorFields to the LUSID Property |  [optional] |
|**entityType** | **String** | The LUSID Entity this is valid for |  |
|**entitySubType** | **String** | The LUSID Entity sub type this is valid for |  [optional] |
|**versions** | **List&lt;String&gt;** | The versions of the Vendor integration this mapping is valid for |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


