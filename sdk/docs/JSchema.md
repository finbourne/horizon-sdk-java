# com.finbourne.horizon.model.JSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemaVersion** | [**URI**](URI.md) |  | [optional] [default to URI]
**valid** | **Boolean** |  | [optional] [default to Boolean]
**reference** | [**URI**](URI.md) |  | [optional] [default to URI]
**ref** | [**JSchema**](JSchema.md) |  | [optional] [default to JSchema]
**recursiveReference** | [**URI**](URI.md) |  | [optional] [default to URI]
**recursiveAnchor** | **Boolean** |  | [optional] [default to Boolean]
**id** | [**URI**](URI.md) |  | [optional] [default to URI]
**anchor** | **String** |  | [optional] [default to String]
**type** | [**JSchemaType**](JSchemaType.md) |  | [optional] [default to JSchemaType]
**_default** | **Object** |  | [optional] [default to Object]
**properties** | [**Map&lt;String, JSchema&gt;**](JSchema.md) |  | [readonly] [default to Map<String, JSchema>]
**items** | [**List&lt;JSchema&gt;**](JSchema.md) |  | [readonly] [default to List<JSchema>]
**itemsPositionValidation** | **Boolean** |  | [default to Boolean]
**required** | **List&lt;String&gt;** |  | [readonly] [default to List<String>]
**allOf** | [**List&lt;JSchema&gt;**](JSchema.md) |  | [readonly] [default to List<JSchema>]
**anyOf** | [**List&lt;JSchema&gt;**](JSchema.md) |  | [readonly] [default to List<JSchema>]
**oneOf** | [**List&lt;JSchema&gt;**](JSchema.md) |  | [readonly] [default to List<JSchema>]
**_if** | [**JSchema**](JSchema.md) |  | [optional] [default to JSchema]
**then** | [**JSchema**](JSchema.md) |  | [optional] [default to JSchema]
**_else** | [**JSchema**](JSchema.md) |  | [optional] [default to JSchema]
**not** | [**JSchema**](JSchema.md) |  | [optional] [default to JSchema]
**contains** | [**JSchema**](JSchema.md) |  | [optional] [default to JSchema]
**propertyNames** | [**JSchema**](JSchema.md) |  | [optional] [default to JSchema]
**_enum** | **List&lt;Object&gt;** |  | [readonly] [default to List<Object>]
**_const** | **Object** |  | [optional] [default to Object]
**uniqueItems** | **Boolean** |  | [default to Boolean]
**minimumLength** | **Long** |  | [optional] [default to Long]
**maximumLength** | **Long** |  | [optional] [default to Long]
**minimum** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**maximum** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**exclusiveMinimum** | **Boolean** |  | [default to Boolean]
**exclusiveMaximum** | **Boolean** |  | [default to Boolean]
**minimumItems** | **Long** |  | [optional] [default to Long]
**maximumItems** | **Long** |  | [optional] [default to Long]
**minimumProperties** | **Long** |  | [optional] [default to Long]
**maximumProperties** | **Long** |  | [optional] [default to Long]
**minimumContains** | **Long** |  | [optional] [default to Long]
**maximumContains** | **Long** |  | [optional] [default to Long]
**contentEncoding** | **String** |  | [optional] [default to String]
**contentMediaType** | **String** |  | [optional] [default to String]
**writeOnly** | **Boolean** |  | [optional] [default to Boolean]
**readOnly** | **Boolean** |  | [optional] [default to Boolean]
**extensionData** | **Map&lt;String, Object&gt;** |  | [readonly] [default to Map<String, Object>]
**title** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**multipleOf** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**pattern** | **String** |  | [optional] [default to String]
**dependencies** | **Map&lt;String, Object&gt;** |  | [readonly] [default to Map<String, Object>]
**dependentRequired** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) |  | [readonly] [default to Map<String, List<String>>]
**dependentSchemas** | [**Map&lt;String, JSchema&gt;**](JSchema.md) |  | [readonly] [default to Map<String, JSchema>]
**patternProperties** | [**Map&lt;String, JSchema&gt;**](JSchema.md) |  | [readonly] [default to Map<String, JSchema>]
**additionalProperties** | [**JSchema**](JSchema.md) |  | [optional] [default to JSchema]
**allowAdditionalProperties** | **Boolean** |  | [default to Boolean]
**allowAdditionalPropertiesSpecified** | **Boolean** |  | [default to Boolean]
**unevaluatedProperties** | [**JSchema**](JSchema.md) |  | [optional] [default to JSchema]
**allowUnevaluatedProperties** | **Boolean** |  | [optional] [default to Boolean]
**additionalItems** | [**JSchema**](JSchema.md) |  | [optional] [default to JSchema]
**allowAdditionalItems** | **Boolean** |  | [default to Boolean]
**allowAdditionalItemsSpecified** | **Boolean** |  | [default to Boolean]
**unevaluatedItems** | [**JSchema**](JSchema.md) |  | [optional] [default to JSchema]
**allowUnevaluatedItems** | **Boolean** |  | [optional] [default to Boolean]
**format** | **String** |  | [optional] [default to String]
**validators** | **List&lt;Object&gt;** |  | [readonly] [default to List<Object>]

```java
import com.finbourne.horizon.model.JSchema;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI SchemaVersion = URI.create("http://example.com/SchemaVersion");
@jakarta.annotation.Nullable Boolean Valid = true;
@jakarta.annotation.Nullable URI Reference = URI.create("http://example.com/Reference");
JSchema Ref = new JSchema();
@jakarta.annotation.Nullable URI RecursiveReference = URI.create("http://example.com/RecursiveReference");
@jakarta.annotation.Nullable Boolean RecursiveAnchor = true;
@jakarta.annotation.Nullable URI Id = URI.create("http://example.com/Id");
@jakarta.annotation.Nullable String Anchor = "example Anchor";
JSchemaType @jakarta.annotation.Nullable Object Map<String, JSchema> Properties = new Map<String, JSchema>();
List<JSchema> Items = new List<JSchema>();
Boolean ItemsPositionValidation = true;
List<String> Required = new List<String>();
List<JSchema> AllOf = new List<JSchema>();
List<JSchema> AnyOf = new List<JSchema>();
List<JSchema> OneOf = new List<JSchema>();
JSchema If = new JSchema();
JSchema Then = new JSchema();
JSchema Else = new JSchema();
JSchema Not = new JSchema();
JSchema Contains = new JSchema();
JSchema PropertyNames = new JSchema();
List<Object> Enum = new List<Object>();
@jakarta.annotation.Nullable Object Boolean UniqueItems = true;
@jakarta.annotation.Nullable Long MinimumLength = new Long("100.00");
@jakarta.annotation.Nullable Long MaximumLength = new Long("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Minimum = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Maximum = new java.math.BigDecimal("100.00");
Boolean ExclusiveMinimum = true;
Boolean ExclusiveMaximum = true;
@jakarta.annotation.Nullable Long MinimumItems = new Long("100.00");
@jakarta.annotation.Nullable Long MaximumItems = new Long("100.00");
@jakarta.annotation.Nullable Long MinimumProperties = new Long("100.00");
@jakarta.annotation.Nullable Long MaximumProperties = new Long("100.00");
@jakarta.annotation.Nullable Long MinimumContains = new Long("100.00");
@jakarta.annotation.Nullable Long MaximumContains = new Long("100.00");
@jakarta.annotation.Nullable String ContentEncoding = "example ContentEncoding";
@jakarta.annotation.Nullable String ContentMediaType = "example ContentMediaType";
@jakarta.annotation.Nullable Boolean WriteOnly = true;
@jakarta.annotation.Nullable Boolean ReadOnly = true;
Map<String, Object> ExtensionData = new Map<String, Object>();
@jakarta.annotation.Nullable String Title = "example Title";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable java.math.BigDecimal MultipleOf = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Pattern = "example Pattern";
Map<String, Object> Dependencies = new Map<String, Object>();
Map<String, List<String>> DependentRequired = new Map<String, List<String>>();
Map<String, JSchema> DependentSchemas = new Map<String, JSchema>();
Map<String, JSchema> PatternProperties = new Map<String, JSchema>();
JSchema AdditionalProperties = new JSchema();
Boolean AllowAdditionalProperties = true;
Boolean AllowAdditionalPropertiesSpecified = true;
JSchema UnevaluatedProperties = new JSchema();
@jakarta.annotation.Nullable Boolean AllowUnevaluatedProperties = true;
JSchema AdditionalItems = new JSchema();
Boolean AllowAdditionalItems = true;
Boolean AllowAdditionalItemsSpecified = true;
JSchema UnevaluatedItems = new JSchema();
@jakarta.annotation.Nullable Boolean AllowUnevaluatedItems = true;
@jakarta.annotation.Nullable String Format = "example Format";
List<Object> Validators = new List<Object>();


JSchema jSchemaInstance = new JSchema()
    .SchemaVersion(SchemaVersion)
    .Valid(Valid)
    .Reference(Reference)
    .Ref(Ref)
    .RecursiveReference(RecursiveReference)
    .RecursiveAnchor(RecursiveAnchor)
    .Id(Id)
    .Anchor(Anchor)
    .Type(Type)
    .Default(Default)
    .Properties(Properties)
    .Items(Items)
    .ItemsPositionValidation(ItemsPositionValidation)
    .Required(Required)
    .AllOf(AllOf)
    .AnyOf(AnyOf)
    .OneOf(OneOf)
    .If(If)
    .Then(Then)
    .Else(Else)
    .Not(Not)
    .Contains(Contains)
    .PropertyNames(PropertyNames)
    .Enum(Enum)
    .Const(Const)
    .UniqueItems(UniqueItems)
    .MinimumLength(MinimumLength)
    .MaximumLength(MaximumLength)
    .Minimum(Minimum)
    .Maximum(Maximum)
    .ExclusiveMinimum(ExclusiveMinimum)
    .ExclusiveMaximum(ExclusiveMaximum)
    .MinimumItems(MinimumItems)
    .MaximumItems(MaximumItems)
    .MinimumProperties(MinimumProperties)
    .MaximumProperties(MaximumProperties)
    .MinimumContains(MinimumContains)
    .MaximumContains(MaximumContains)
    .ContentEncoding(ContentEncoding)
    .ContentMediaType(ContentMediaType)
    .WriteOnly(WriteOnly)
    .ReadOnly(ReadOnly)
    .ExtensionData(ExtensionData)
    .Title(Title)
    .Description(Description)
    .MultipleOf(MultipleOf)
    .Pattern(Pattern)
    .Dependencies(Dependencies)
    .DependentRequired(DependentRequired)
    .DependentSchemas(DependentSchemas)
    .PatternProperties(PatternProperties)
    .AdditionalProperties(AdditionalProperties)
    .AllowAdditionalProperties(AllowAdditionalProperties)
    .AllowAdditionalPropertiesSpecified(AllowAdditionalPropertiesSpecified)
    .UnevaluatedProperties(UnevaluatedProperties)
    .AllowUnevaluatedProperties(AllowUnevaluatedProperties)
    .AdditionalItems(AdditionalItems)
    .AllowAdditionalItems(AllowAdditionalItems)
    .AllowAdditionalItemsSpecified(AllowAdditionalItemsSpecified)
    .UnevaluatedItems(UnevaluatedItems)
    .AllowUnevaluatedItems(AllowUnevaluatedItems)
    .Format(Format)
    .Validators(Validators);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
