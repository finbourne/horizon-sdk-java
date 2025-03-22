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
import com.finbourne.horizon.model.ExternalLogRecord;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * ExternalLogInsertionRequest
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalLogInsertionRequest {
  public static final String SERIALIZED_NAME_LOGS = "logs";
  @SerializedName(SERIALIZED_NAME_LOGS)
  private List<ExternalLogRecord> logs = new ArrayList<>();

  public ExternalLogInsertionRequest() {
  }

  public ExternalLogInsertionRequest logs(List<ExternalLogRecord> logs) {
    
    this.logs = logs;
    return this;
  }

  public ExternalLogInsertionRequest addLogsItem(ExternalLogRecord logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<>();
    }
    this.logs.add(logsItem);
    return this;
  }

   /**
   * Get logs
   * @return logs
  **/
  @jakarta.annotation.Nonnull
  public List<ExternalLogRecord> getLogs() {
    return logs;
  }


  public void setLogs(List<ExternalLogRecord> logs) {
    this.logs = logs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalLogInsertionRequest externalLogInsertionRequest = (ExternalLogInsertionRequest) o;
    return Objects.equals(this.logs, externalLogInsertionRequest.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalLogInsertionRequest {\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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
    openapiFields.add("logs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("logs");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExternalLogInsertionRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExternalLogInsertionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalLogInsertionRequest is not found in the empty JSON string", ExternalLogInsertionRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExternalLogInsertionRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("logs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `logs` to be an array in the JSON string but got `%s`", jsonObj.get("logs").toString()));
      }

      JsonArray jsonArraylogs = jsonObj.getAsJsonArray("logs");
      // validate the required field `logs` (array)
      for (int i = 0; i < jsonArraylogs.size(); i++) {
        ExternalLogRecord.validateJsonElement(jsonArraylogs.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalLogInsertionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalLogInsertionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalLogInsertionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalLogInsertionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalLogInsertionRequest>() {
           @Override
           public void write(JsonWriter out, ExternalLogInsertionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExternalLogInsertionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExternalLogInsertionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalLogInsertionRequest
  * @throws IOException if the JSON string is invalid with respect to ExternalLogInsertionRequest
  */
  public static ExternalLogInsertionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalLogInsertionRequest.class);
  }

 /**
  * Convert an instance of ExternalLogInsertionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
