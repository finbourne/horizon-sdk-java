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
 * InstancePropertyDefinitionOverrides
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InstancePropertyDefinitionOverrides {
  public static final String SERIALIZED_NAME_DISPLAY_NAME_OVERRIDE = "displayNameOverride";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME_OVERRIDE)
  private String displayNameOverride;

  public static final String SERIALIZED_NAME_DESCRIPTION_OVERRIDE = "descriptionOverride";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_OVERRIDE)
  private String descriptionOverride;

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entityType";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private String entityType;

  public static final String SERIALIZED_NAME_ENTITY_SUB_TYPE = "entitySubType";
  @SerializedName(SERIALIZED_NAME_ENTITY_SUB_TYPE)
  private List<String> entitySubType;

  public static final String SERIALIZED_NAME_VENDOR_PACKAGE = "vendorPackage";
  @SerializedName(SERIALIZED_NAME_VENDOR_PACKAGE)
  private List<String> vendorPackage;

  public InstancePropertyDefinitionOverrides() {
  }

  public InstancePropertyDefinitionOverrides displayNameOverride(String displayNameOverride) {
    
    this.displayNameOverride = displayNameOverride;
    return this;
  }

   /**
   * Get displayNameOverride
   * @return displayNameOverride
  **/
  @jakarta.annotation.Nullable
  public String getDisplayNameOverride() {
    return displayNameOverride;
  }


  public void setDisplayNameOverride(String displayNameOverride) {
    this.displayNameOverride = displayNameOverride;
  }


  public InstancePropertyDefinitionOverrides descriptionOverride(String descriptionOverride) {
    
    this.descriptionOverride = descriptionOverride;
    return this;
  }

   /**
   * Get descriptionOverride
   * @return descriptionOverride
  **/
  @jakarta.annotation.Nullable
  public String getDescriptionOverride() {
    return descriptionOverride;
  }


  public void setDescriptionOverride(String descriptionOverride) {
    this.descriptionOverride = descriptionOverride;
  }


  public InstancePropertyDefinitionOverrides entityType(String entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @jakarta.annotation.Nonnull
  public String getEntityType() {
    return entityType;
  }


  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public InstancePropertyDefinitionOverrides entitySubType(List<String> entitySubType) {
    
    this.entitySubType = entitySubType;
    return this;
  }

  public InstancePropertyDefinitionOverrides addEntitySubTypeItem(String entitySubTypeItem) {
    if (this.entitySubType == null) {
      this.entitySubType = new ArrayList<>();
    }
    this.entitySubType.add(entitySubTypeItem);
    return this;
  }

   /**
   * Get entitySubType
   * @return entitySubType
  **/
  @jakarta.annotation.Nullable
  public List<String> getEntitySubType() {
    return entitySubType;
  }


  public void setEntitySubType(List<String> entitySubType) {
    this.entitySubType = entitySubType;
  }


  public InstancePropertyDefinitionOverrides vendorPackage(List<String> vendorPackage) {
    
    this.vendorPackage = vendorPackage;
    return this;
  }

  public InstancePropertyDefinitionOverrides addVendorPackageItem(String vendorPackageItem) {
    if (this.vendorPackage == null) {
      this.vendorPackage = new ArrayList<>();
    }
    this.vendorPackage.add(vendorPackageItem);
    return this;
  }

   /**
   * Get vendorPackage
   * @return vendorPackage
  **/
  @jakarta.annotation.Nullable
  public List<String> getVendorPackage() {
    return vendorPackage;
  }


  public void setVendorPackage(List<String> vendorPackage) {
    this.vendorPackage = vendorPackage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstancePropertyDefinitionOverrides instancePropertyDefinitionOverrides = (InstancePropertyDefinitionOverrides) o;
    return Objects.equals(this.displayNameOverride, instancePropertyDefinitionOverrides.displayNameOverride) &&
        Objects.equals(this.descriptionOverride, instancePropertyDefinitionOverrides.descriptionOverride) &&
        Objects.equals(this.entityType, instancePropertyDefinitionOverrides.entityType) &&
        Objects.equals(this.entitySubType, instancePropertyDefinitionOverrides.entitySubType) &&
        Objects.equals(this.vendorPackage, instancePropertyDefinitionOverrides.vendorPackage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayNameOverride, descriptionOverride, entityType, entitySubType, vendorPackage);
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
    sb.append("class InstancePropertyDefinitionOverrides {\n");
    sb.append("    displayNameOverride: ").append(toIndentedString(displayNameOverride)).append("\n");
    sb.append("    descriptionOverride: ").append(toIndentedString(descriptionOverride)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    entitySubType: ").append(toIndentedString(entitySubType)).append("\n");
    sb.append("    vendorPackage: ").append(toIndentedString(vendorPackage)).append("\n");
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
    openapiFields.add("displayNameOverride");
    openapiFields.add("descriptionOverride");
    openapiFields.add("entityType");
    openapiFields.add("entitySubType");
    openapiFields.add("vendorPackage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("entityType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InstancePropertyDefinitionOverrides
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InstancePropertyDefinitionOverrides.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstancePropertyDefinitionOverrides is not found in the empty JSON string", InstancePropertyDefinitionOverrides.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InstancePropertyDefinitionOverrides.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("displayNameOverride") != null && !jsonObj.get("displayNameOverride").isJsonNull()) && !jsonObj.get("displayNameOverride").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayNameOverride` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayNameOverride").toString()));
      }
      if ((jsonObj.get("descriptionOverride") != null && !jsonObj.get("descriptionOverride").isJsonNull()) && !jsonObj.get("descriptionOverride").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptionOverride` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptionOverride").toString()));
      }
      if (!jsonObj.get("entityType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityType").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("entitySubType") != null && !jsonObj.get("entitySubType").isJsonNull() && !jsonObj.get("entitySubType").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `entitySubType` to be an array in the JSON string but got `%s`", jsonObj.get("entitySubType").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("vendorPackage") != null && !jsonObj.get("vendorPackage").isJsonNull() && !jsonObj.get("vendorPackage").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorPackage` to be an array in the JSON string but got `%s`", jsonObj.get("vendorPackage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstancePropertyDefinitionOverrides.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstancePropertyDefinitionOverrides' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstancePropertyDefinitionOverrides> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstancePropertyDefinitionOverrides.class));

       return (TypeAdapter<T>) new TypeAdapter<InstancePropertyDefinitionOverrides>() {
           @Override
           public void write(JsonWriter out, InstancePropertyDefinitionOverrides value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstancePropertyDefinitionOverrides read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstancePropertyDefinitionOverrides given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstancePropertyDefinitionOverrides
  * @throws IOException if the JSON string is invalid with respect to InstancePropertyDefinitionOverrides
  */
  public static InstancePropertyDefinitionOverrides fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstancePropertyDefinitionOverrides.class);
  }

 /**
  * Convert an instance of InstancePropertyDefinitionOverrides to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}