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
import com.finbourne.horizon.model.IntegrationRunIntegration;
import com.finbourne.horizon.model.IntegrationRunLog;
import com.finbourne.horizon.model.IntegrationRunVersion;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
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
 * IntegrationRunResponse
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IntegrationRunResponse {
  public static final String SERIALIZED_NAME_RUN_ID = "runId";
  @SerializedName(SERIALIZED_NAME_RUN_ID)
  private UUID runId;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instanceId";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private UUID instanceId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_INTEGRATION = "integration";
  @SerializedName(SERIALIZED_NAME_INTEGRATION)
  private IntegrationRunIntegration integration;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private IntegrationRunVersion version;

  public static final String SERIALIZED_NAME_INTEGRATION_LOGS = "integrationLogs";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_LOGS)
  private Map<String, Map<String, IntegrationRunLog>> integrationLogs;

  public IntegrationRunResponse() {
  }

  public IntegrationRunResponse runId(UUID runId) {
    
    this.runId = runId;
    return this;
  }

   /**
   * Get runId
   * @return runId
  **/
  @jakarta.annotation.Nonnull
  public UUID getRunId() {
    return runId;
  }


  public void setRunId(UUID runId) {
    this.runId = runId;
  }


  public IntegrationRunResponse instanceId(UUID instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @jakarta.annotation.Nullable
  public UUID getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(UUID instanceId) {
    this.instanceId = instanceId;
  }


  public IntegrationRunResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public IntegrationRunResponse integration(IntegrationRunIntegration integration) {
    
    this.integration = integration;
    return this;
  }

   /**
   * Get integration
   * @return integration
  **/
  @jakarta.annotation.Nonnull
  public IntegrationRunIntegration getIntegration() {
    return integration;
  }


  public void setIntegration(IntegrationRunIntegration integration) {
    this.integration = integration;
  }


  public IntegrationRunResponse version(IntegrationRunVersion version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @jakarta.annotation.Nonnull
  public IntegrationRunVersion getVersion() {
    return version;
  }


  public void setVersion(IntegrationRunVersion version) {
    this.version = version;
  }


  public IntegrationRunResponse integrationLogs(Map<String, Map<String, IntegrationRunLog>> integrationLogs) {
    
    this.integrationLogs = integrationLogs;
    return this;
  }

  public IntegrationRunResponse putIntegrationLogsItem(String key, Map<String, IntegrationRunLog> integrationLogsItem) {
    if (this.integrationLogs == null) {
      this.integrationLogs = new HashMap<>();
    }
    this.integrationLogs.put(key, integrationLogsItem);
    return this;
  }

   /**
   * Get integrationLogs
   * @return integrationLogs
  **/
  @jakarta.annotation.Nullable
  public Map<String, Map<String, IntegrationRunLog>> getIntegrationLogs() {
    return integrationLogs;
  }


  public void setIntegrationLogs(Map<String, Map<String, IntegrationRunLog>> integrationLogs) {
    this.integrationLogs = integrationLogs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationRunResponse integrationRunResponse = (IntegrationRunResponse) o;
    return Objects.equals(this.runId, integrationRunResponse.runId) &&
        Objects.equals(this.instanceId, integrationRunResponse.instanceId) &&
        Objects.equals(this.status, integrationRunResponse.status) &&
        Objects.equals(this.integration, integrationRunResponse.integration) &&
        Objects.equals(this.version, integrationRunResponse.version) &&
        Objects.equals(this.integrationLogs, integrationRunResponse.integrationLogs);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId, instanceId, status, integration, version, integrationLogs);
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
    sb.append("class IntegrationRunResponse {\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    integrationLogs: ").append(toIndentedString(integrationLogs)).append("\n");
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
    openapiFields.add("runId");
    openapiFields.add("instanceId");
    openapiFields.add("status");
    openapiFields.add("integration");
    openapiFields.add("version");
    openapiFields.add("integrationLogs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("runId");
    openapiRequiredFields.add("integration");
    openapiRequiredFields.add("version");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IntegrationRunResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IntegrationRunResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntegrationRunResponse is not found in the empty JSON string", IntegrationRunResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IntegrationRunResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("runId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runId").toString()));
      }
      if ((jsonObj.get("instanceId") != null && !jsonObj.get("instanceId").isJsonNull()) && !jsonObj.get("instanceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instanceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instanceId").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `integration`
      IntegrationRunIntegration.validateJsonElement(jsonObj.get("integration"));
      // validate the required field `version`
      IntegrationRunVersion.validateJsonElement(jsonObj.get("version"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntegrationRunResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntegrationRunResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntegrationRunResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntegrationRunResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<IntegrationRunResponse>() {
           @Override
           public void write(JsonWriter out, IntegrationRunResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IntegrationRunResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IntegrationRunResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IntegrationRunResponse
  * @throws IOException if the JSON string is invalid with respect to IntegrationRunResponse
  */
  public static IntegrationRunResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntegrationRunResponse.class);
  }

 /**
  * Convert an instance of IntegrationRunResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}