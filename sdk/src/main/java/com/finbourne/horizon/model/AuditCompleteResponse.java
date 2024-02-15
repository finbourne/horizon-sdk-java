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
import java.util.Arrays;

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
 * Response type for Horizon Audit Event
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuditCompleteResponse {
  public static final String SERIALIZED_NAME_PROCESS_NAME = "processName";
  @SerializedName(SERIALIZED_NAME_PROCESS_NAME)
  private String processName;

  public AuditCompleteResponse() {
  }

  public AuditCompleteResponse processName(String processName) {
    
    this.processName = processName;
    return this;
  }

   /**
   * The name of the Process the events will be visible under
   * @return processName
  **/
  @jakarta.annotation.Nonnull
  public String getProcessName() {
    return processName;
  }


  public void setProcessName(String processName) {
    this.processName = processName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditCompleteResponse auditCompleteResponse = (AuditCompleteResponse) o;
    return Objects.equals(this.processName, auditCompleteResponse.processName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditCompleteResponse {\n");
    sb.append("    processName: ").append(toIndentedString(processName)).append("\n");
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
    openapiFields.add("processName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("processName");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AuditCompleteResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuditCompleteResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuditCompleteResponse is not found in the empty JSON string", AuditCompleteResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AuditCompleteResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("processName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuditCompleteResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuditCompleteResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuditCompleteResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuditCompleteResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AuditCompleteResponse>() {
           @Override
           public void write(JsonWriter out, AuditCompleteResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuditCompleteResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuditCompleteResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuditCompleteResponse
  * @throws IOException if the JSON string is invalid with respect to AuditCompleteResponse
  */
  public static AuditCompleteResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuditCompleteResponse.class);
  }

 /**
  * Convert an instance of AuditCompleteResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
