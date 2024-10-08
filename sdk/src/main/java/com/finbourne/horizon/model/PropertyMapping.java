/*
 * FINBOURNE Horizon API
 *
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.finbourne.horizon.model;

import java.util.Objects;
import com.finbourne.horizon.model.LusidPropertyDefinition;
import com.finbourne.horizon.model.Optionality;
import com.finbourne.horizon.model.VendorField;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.finbourne.horizon.JSON;

/**
 * Mapping from a set of VendorFields to a LUSID Property
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PropertyMapping {
  public static final String SERIALIZED_NAME_PROPERTY = "property";
  @SerializedName(SERIALIZED_NAME_PROPERTY)
  private LusidPropertyDefinition property;

  public static final String SERIALIZED_NAME_VENDOR_FIELDS = "vendorFields";
  @SerializedName(SERIALIZED_NAME_VENDOR_FIELDS)
  private List<VendorField> vendorFields = new ArrayList<>();

  public static final String SERIALIZED_NAME_OPTIONALITY = "optionality";
  @SerializedName(SERIALIZED_NAME_OPTIONALITY)
  private Optionality optionality;

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entityType";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private String entityType;

  public static final String SERIALIZED_NAME_ENTITY_SUB_TYPE = "entitySubType";
  @SerializedName(SERIALIZED_NAME_ENTITY_SUB_TYPE)
  private String entitySubType;

  public static final String SERIALIZED_NAME_TRANSFORMATION_DESCRIPTION = "transformationDescription";
  @SerializedName(SERIALIZED_NAME_TRANSFORMATION_DESCRIPTION)
  private String transformationDescription;

  public static final String SERIALIZED_NAME_VERSIONS = "versions";
  @SerializedName(SERIALIZED_NAME_VERSIONS)
  private List<String> versions = new ArrayList<>();

  public PropertyMapping() {
  }

  public PropertyMapping property(LusidPropertyDefinition property) {
    
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @jakarta.annotation.Nonnull
  public LusidPropertyDefinition getProperty() {
    return property;
  }


  public void setProperty(LusidPropertyDefinition property) {
    this.property = property;
  }


  public PropertyMapping vendorFields(List<VendorField> vendorFields) {
    
    this.vendorFields = vendorFields;
    return this;
  }

  public PropertyMapping addVendorFieldsItem(VendorField vendorFieldsItem) {
    if (this.vendorFields == null) {
      this.vendorFields = new ArrayList<>();
    }
    this.vendorFields.add(vendorFieldsItem);
    return this;
  }

   /**
   * Fields that will be used to map to this Property Definition
   * @return vendorFields
  **/
  @jakarta.annotation.Nonnull
  public List<VendorField> getVendorFields() {
    return vendorFields;
  }


  public void setVendorFields(List<VendorField> vendorFields) {
    this.vendorFields = vendorFields;
  }


  public PropertyMapping optionality(Optionality optionality) {
    
    this.optionality = optionality;
    return this;
  }

   /**
   * Get optionality
   * @return optionality
  **/
  @jakarta.annotation.Nonnull
  public Optionality getOptionality() {
    return optionality;
  }


  public void setOptionality(Optionality optionality) {
    this.optionality = optionality;
  }


  public PropertyMapping entityType(String entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * The LUSID Entity this is valid for
   * @return entityType
  **/
  @jakarta.annotation.Nonnull
  public String getEntityType() {
    return entityType;
  }


  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public PropertyMapping entitySubType(String entitySubType) {
    
    this.entitySubType = entitySubType;
    return this;
  }

   /**
   * The LUSID Entity sub type this is valid for
   * @return entitySubType
  **/
  @jakarta.annotation.Nullable
  public String getEntitySubType() {
    return entitySubType;
  }


  public void setEntitySubType(String entitySubType) {
    this.entitySubType = entitySubType;
  }


  public PropertyMapping transformationDescription(String transformationDescription) {
    
    this.transformationDescription = transformationDescription;
    return this;
  }

   /**
   * The transformation, if required, to map from VendorFields to the LUSID Property
   * @return transformationDescription
  **/
  @jakarta.annotation.Nullable
  public String getTransformationDescription() {
    return transformationDescription;
  }


  public void setTransformationDescription(String transformationDescription) {
    this.transformationDescription = transformationDescription;
  }


  public PropertyMapping versions(List<String> versions) {
    
    this.versions = versions;
    return this;
  }

  public PropertyMapping addVersionsItem(String versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<>();
    }
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * The versions of the Vendor integration this mapping is valid for
   * @return versions
  **/
  @jakarta.annotation.Nonnull
  public List<String> getVersions() {
    return versions;
  }


  public void setVersions(List<String> versions) {
    this.versions = versions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyMapping propertyMapping = (PropertyMapping) o;
    return Objects.equals(this.property, propertyMapping.property) &&
        Objects.equals(this.vendorFields, propertyMapping.vendorFields) &&
        Objects.equals(this.optionality, propertyMapping.optionality) &&
        Objects.equals(this.entityType, propertyMapping.entityType) &&
        Objects.equals(this.entitySubType, propertyMapping.entitySubType) &&
        Objects.equals(this.transformationDescription, propertyMapping.transformationDescription) &&
        Objects.equals(this.versions, propertyMapping.versions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, vendorFields, optionality, entityType, entitySubType, transformationDescription, versions);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyMapping {\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    vendorFields: ").append(toIndentedString(vendorFields)).append("\n");
    sb.append("    optionality: ").append(toIndentedString(optionality)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    entitySubType: ").append(toIndentedString(entitySubType)).append("\n");
    sb.append("    transformationDescription: ").append(toIndentedString(transformationDescription)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("property");
    openapiFields.add("vendorFields");
    openapiFields.add("optionality");
    openapiFields.add("entityType");
    openapiFields.add("entitySubType");
    openapiFields.add("transformationDescription");
    openapiFields.add("versions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("property");
    openapiRequiredFields.add("vendorFields");
    openapiRequiredFields.add("optionality");
    openapiRequiredFields.add("entityType");
    openapiRequiredFields.add("versions");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PropertyMapping
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PropertyMapping.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PropertyMapping is not found in the empty JSON string", PropertyMapping.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PropertyMapping.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `property`
      LusidPropertyDefinition.validateJsonElement(jsonObj.get("property"));
      // ensure the json data is an array
      if (!jsonObj.get("vendorFields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorFields` to be an array in the JSON string but got `%s`", jsonObj.get("vendorFields").toString()));
      }

      JsonArray jsonArrayvendorFields = jsonObj.getAsJsonArray("vendorFields");
      // validate the required field `vendorFields` (array)
      for (int i = 0; i < jsonArrayvendorFields.size(); i++) {
        VendorField.validateJsonElement(jsonArrayvendorFields.get(i));
      };
      if (!jsonObj.get("entityType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityType").toString()));
      }
      if ((jsonObj.get("entitySubType") != null && !jsonObj.get("entitySubType").isJsonNull()) && !jsonObj.get("entitySubType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entitySubType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entitySubType").toString()));
      }
      if ((jsonObj.get("transformationDescription") != null && !jsonObj.get("transformationDescription").isJsonNull()) && !jsonObj.get("transformationDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transformationDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transformationDescription").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("versions") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("versions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `versions` to be an array in the JSON string but got `%s`", jsonObj.get("versions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PropertyMapping.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PropertyMapping' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PropertyMapping> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PropertyMapping.class));

       return (TypeAdapter<T>) new TypeAdapter<PropertyMapping>() {
           @Override
           public void write(JsonWriter out, PropertyMapping value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PropertyMapping read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PropertyMapping given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PropertyMapping
  * @throws IOException if the JSON string is invalid with respect to PropertyMapping
  */
  public static PropertyMapping fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PropertyMapping.class);
  }

 /**
  * Convert an instance of PropertyMapping to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
