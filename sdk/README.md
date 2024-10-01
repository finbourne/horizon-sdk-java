<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://fbn-prd.lusid.com/horizon*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*InstrumentApi* | [**createInstrument**](docs/InstrumentApi.md#createinstrument) | **POST** /api/instrument/onboarding/create | [EARLY ACCESS] CreateInstrument: Creates and masters instruments with third party vendors.
*InstrumentApi* | [**enrichInstrument**](docs/InstrumentApi.md#enrichinstrument) | **POST** /api/instrument/onboarding/enrich | [EARLY ACCESS] EnrichInstrument: Enriches an existing LUSID instrument using vendor data. Enrichment included identifiers, properties and market data.
*InstrumentApi* | [**getOpenFigiParameterOption**](docs/InstrumentApi.md#getopenfigiparameteroption) | **GET** /api/instrument/onboarding/search/openfigi/parameterOptions | [EARLY ACCESS] GetOpenFigiParameterOption: Get all supported market sector values for OpenFigi search
*InstrumentApi* | [**retrievePermIdResult**](docs/InstrumentApi.md#retrievepermidresult) | **GET** /api/instrument/onboarding/search/permid/{id} | [EARLY ACCESS] RetrievePermIdResult: Retrieve PermId results from a previous query.
*InstrumentApi* | [**searchOpenFigi**](docs/InstrumentApi.md#searchopenfigi) | **GET** /api/instrument/onboarding/search/openfigi | [EARLY ACCESS] SearchOpenFigi: Search OpenFigi for instruments that match the specified terms.
*InstrumentApi* | [**vendors**](docs/InstrumentApi.md#vendors) | **GET** /api/instrument/onboarding/vendors | [EARLY ACCESS] Vendors: Gets the VendorProducts of any supported and licenced integrations for a given market sector and security type.
*IntegrationsApi* | [**createInstance**](docs/IntegrationsApi.md#createinstance) | **POST** /api/integrations/instances | [EXPERIMENTAL] CreateInstance: Create a single integration instance.
*IntegrationsApi* | [**deleteInstance**](docs/IntegrationsApi.md#deleteinstance) | **DELETE** /api/integrations/instances/{instanceId} | [EXPERIMENTAL] DeleteInstance: Delete a single integration instance.
*IntegrationsApi* | [**executeInstance**](docs/IntegrationsApi.md#executeinstance) | **POST** /api/integrations/instances/{instanceId}/execute | [EXPERIMENTAL] ExecuteInstance: Execute an integration instance.
*IntegrationsApi* | [**getExecutionIdsForInstance**](docs/IntegrationsApi.md#getexecutionidsforinstance) | **GET** /api/integrations/instances/{instanceId}/executions | [EXPERIMENTAL] GetExecutionIdsForInstance: Get integration instance execution ids.
*IntegrationsApi* | [**getInstanceOptionalPropertyMapping**](docs/IntegrationsApi.md#getinstanceoptionalpropertymapping) | **GET** /api/integrations/instances/configuration/{integration}/{instanceId} | [EXPERIMENTAL] GetInstanceOptionalPropertyMapping: Get the Optional Property Mapping for an Integration Instance
*IntegrationsApi* | [**getIntegrationConfiguration**](docs/IntegrationsApi.md#getintegrationconfiguration) | **GET** /api/integrations/configuration/{integration} | [EXPERIMENTAL] GetIntegrationConfiguration: Get the Field and Property Mapping configuration for a given integration
*IntegrationsApi* | [**getSchema**](docs/IntegrationsApi.md#getschema) | **GET** /api/integrations/schema/{integration} | [EXPERIMENTAL] GetSchema: Get the JSON schema for the details section of an integration instance.
*IntegrationsApi* | [**listInstances**](docs/IntegrationsApi.md#listinstances) | **GET** /api/integrations/instances | [EXPERIMENTAL] ListInstances: List instances across all integrations.
*IntegrationsApi* | [**listIntegrations**](docs/IntegrationsApi.md#listintegrations) | **GET** /api/integrations | [EXPERIMENTAL] ListIntegrations: List available integrations.
*IntegrationsApi* | [**setInstanceOptionalPropertyMapping**](docs/IntegrationsApi.md#setinstanceoptionalpropertymapping) | **PUT** /api/integrations/instances/configuration/{integration}/{instanceId} | [EXPERIMENTAL] SetInstanceOptionalPropertyMapping: Set the Optional Property Mapping for an Integration Instance
*IntegrationsApi* | [**updateInstance**](docs/IntegrationsApi.md#updateinstance) | **PUT** /api/integrations/instances/{instanceId} | [EXPERIMENTAL] UpdateInstance: Update a single integration instance.
*LogsApi* | [**getIntegrationLogResults**](docs/LogsApi.md#getintegrationlogresults) | **GET** /api/logs | [EXPERIMENTAL] GetIntegrationLogResults: Get integration log results
*ProcessHistoryApi* | [**createCompleteEvent**](docs/ProcessHistoryApi.md#createcompleteevent) | **POST** /api/process-history/event/complete | [EARLY ACCESS] CreateCompleteEvent: Write a completed event to the Horizon Dashboard
*ProcessHistoryApi* | [**createUpdateEvent**](docs/ProcessHistoryApi.md#createupdateevent) | **POST** /api/process-history/event/update | [EARLY ACCESS] CreateUpdateEvent: Write an update event to the Horizon Dashboard
*ProcessHistoryApi* | [**getLatestRuns**](docs/ProcessHistoryApi.md#getlatestruns) | **GET** /api/process-history/$latestRuns | [EARLY ACCESS] GetLatestRuns: Get latest run for each process
*ProcessHistoryApi* | [**processEntryUpdates**](docs/ProcessHistoryApi.md#processentryupdates) | **POST** /api/process-history/entries/$query | [EARLY ACCESS] ProcessEntryUpdates: Get process entry updates for a query
*ProcessHistoryApi* | [**processHistoryEntries**](docs/ProcessHistoryApi.md#processhistoryentries) | **POST** /api/process-history/$query | [EARLY ACCESS] ProcessHistoryEntries: Get process history entries
*RunsApi* | [**getRunResults**](docs/RunsApi.md#getrunresults) | **GET** /api/runs | [EXPERIMENTAL] GetRunResults: Get run results
*RunsApi* | [**rerunInstance**](docs/RunsApi.md#reruninstance) | **PUT** /api/runs/{runId}/rerun | [EXPERIMENTAL] RerunInstance: Reruns a single instance execution.
*VendorApi* | [**getCoreFieldMappingsForProductEntity**](docs/VendorApi.md#getcorefieldmappingsforproductentity) | **GET** /api/vendor/mappings/fields | [EARLY ACCESS] GetCoreFieldMappingsForProductEntity: Get core field mappings for a given vendor product's entity.
*VendorApi* | [**getOptionalMappingsForProductEntity**](docs/VendorApi.md#getoptionalmappingsforproductentity) | **GET** /api/vendor/mappings/optional | [EARLY ACCESS] GetOptionalMappingsForProductEntity: Get a user defined LUSID property mappings for the specified vendor / LUSID entity.
*VendorApi* | [**getPropertyMappingsForProductEntity**](docs/VendorApi.md#getpropertymappingsforproductentity) | **GET** /api/vendor/mappings/properties | [EARLY ACCESS] GetPropertyMappingsForProductEntity: Gets the property mappings for a given vendor product's entity
*VendorApi* | [**queryVendors**](docs/VendorApi.md#queryvendors) | **POST** /api/vendor/$query | [EARLY ACCESS] QueryVendors: Query for vendors and their packages with entities and sub-entities.
*VendorApi* | [**setOptionalMappingsForProductEntity**](docs/VendorApi.md#setoptionalmappingsforproductentity) | **POST** /api/vendor/mappings/optional | [EARLY ACCESS] SetOptionalMappingsForProductEntity: Create a user defined LUSID property mappings for the specified vendor / LUSID entity.


<a id="documentation-for-models"></a>
## Documentation for Models

 - [AllowedParameterValue](docs/AllowedParameterValue.md)
 - [AuditCompleteRequest](docs/AuditCompleteRequest.md)
 - [AuditCompleteResponse](docs/AuditCompleteResponse.md)
 - [AuditCompleteStatus](docs/AuditCompleteStatus.md)
 - [AuditFileDetails](docs/AuditFileDetails.md)
 - [AuditFileType](docs/AuditFileType.md)
 - [AuditUpdateRequest](docs/AuditUpdateRequest.md)
 - [AuditUpdateResponse](docs/AuditUpdateResponse.md)
 - [CreateInstanceRequest](docs/CreateInstanceRequest.md)
 - [EnrichmentResponse](docs/EnrichmentResponse.md)
 - [ExecuteInstanceResponse](docs/ExecuteInstanceResponse.md)
 - [FieldMapping](docs/FieldMapping.md)
 - [FileDetails](docs/FileDetails.md)
 - [IIntegrationLogResponse](docs/IIntegrationLogResponse.md)
 - [Identifiers](docs/Identifiers.md)
 - [InstanceExecutionReferenceId](docs/InstanceExecutionReferenceId.md)
 - [InstanceIdentifier](docs/InstanceIdentifier.md)
 - [IntegrationDescription](docs/IntegrationDescription.md)
 - [IntegrationInstance](docs/IntegrationInstance.md)
 - [IntegrationPropertyConfiguration](docs/IntegrationPropertyConfiguration.md)
 - [IntegrationRerunResponse](docs/IntegrationRerunResponse.md)
 - [IntegrationRunIntegration](docs/IntegrationRunIntegration.md)
 - [IntegrationRunLog](docs/IntegrationRunLog.md)
 - [IntegrationRunLogLink](docs/IntegrationRunLogLink.md)
 - [IntegrationRunResponse](docs/IntegrationRunResponse.md)
 - [IntegrationRunVersion](docs/IntegrationRunVersion.md)
 - [Link](docs/Link.md)
 - [LusidEntity](docs/LusidEntity.md)
 - [LusidField](docs/LusidField.md)
 - [LusidProblemDetails](docs/LusidProblemDetails.md)
 - [LusidPropertyDefinition](docs/LusidPropertyDefinition.md)
 - [LusidPropertyDefinitionOverrides](docs/LusidPropertyDefinitionOverrides.md)
 - [LusidPropertyDefinitionOverridesByType](docs/LusidPropertyDefinitionOverridesByType.md)
 - [LusidPropertyDefinitionOverridesResponse](docs/LusidPropertyDefinitionOverridesResponse.md)
 - [LusidPropertyToVendorFieldMapping](docs/LusidPropertyToVendorFieldMapping.md)
 - [LusidValidationProblemDetails](docs/LusidValidationProblemDetails.md)
 - [OnboardInstrumentRequest](docs/OnboardInstrumentRequest.md)
 - [OnboardInstrumentResponse](docs/OnboardInstrumentResponse.md)
 - [OpenFigiData](docs/OpenFigiData.md)
 - [OpenFigiParameterOptionName](docs/OpenFigiParameterOptionName.md)
 - [OpenFigiPermIdResult](docs/OpenFigiPermIdResult.md)
 - [OpenFigiSearchResult](docs/OpenFigiSearchResult.md)
 - [Optionality](docs/Optionality.md)
 - [PagedResourceListOfProcessInformation](docs/PagedResourceListOfProcessInformation.md)
 - [PagedResourceListOfProcessUpdateResult](docs/PagedResourceListOfProcessUpdateResult.md)
 - [PagedResourceListOfVendorProduct](docs/PagedResourceListOfVendorProduct.md)
 - [PermIdData](docs/PermIdData.md)
 - [ProcessInformation](docs/ProcessInformation.md)
 - [ProcessSummary](docs/ProcessSummary.md)
 - [ProcessUpdateResult](docs/ProcessUpdateResult.md)
 - [PropertyMapping](docs/PropertyMapping.md)
 - [QueryRequest](docs/QueryRequest.md)
 - [QuerySpecification](docs/QuerySpecification.md)
 - [ResourceId](docs/ResourceId.md)
 - [RowDetails](docs/RowDetails.md)
 - [Trigger](docs/Trigger.md)
 - [UpdateInstanceRequest](docs/UpdateInstanceRequest.md)
 - [VendorField](docs/VendorField.md)
 - [VendorProduct](docs/VendorProduct.md)

