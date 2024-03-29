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
import com.finbourne.horizon.model.AuditCompleteStatus;
import com.finbourne.horizon.model.AuditFileDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * An incoming request for a Horizon Complete Event
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuditCompleteRequest {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_SCHEDULER_RUN_ID = "schedulerRunId";
  @SerializedName(SERIALIZED_NAME_SCHEDULER_RUN_ID)
  private String schedulerRunId;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AuditCompleteStatus status;

  public static final String SERIALIZED_NAME_ROWS_TOTAL = "rowsTotal";
  @SerializedName(SERIALIZED_NAME_ROWS_TOTAL)
  private Integer rowsTotal;

  public static final String SERIALIZED_NAME_ROWS_SUCCEEDED = "rowsSucceeded";
  @SerializedName(SERIALIZED_NAME_ROWS_SUCCEEDED)
  private Integer rowsSucceeded;

  public static final String SERIALIZED_NAME_ROWS_FAILED = "rowsFailed";
  @SerializedName(SERIALIZED_NAME_ROWS_FAILED)
  private Integer rowsFailed;

  public static final String SERIALIZED_NAME_ROWS_IGNORED = "rowsIgnored";
  @SerializedName(SERIALIZED_NAME_ROWS_IGNORED)
  private Integer rowsIgnored;

  public static final String SERIALIZED_NAME_AUDIT_FILES = "auditFiles";
  @SerializedName(SERIALIZED_NAME_AUDIT_FILES)
  private List<AuditFileDetails> auditFiles = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROCESS_NAME_OVERRIDE = "processNameOverride";
  @SerializedName(SERIALIZED_NAME_PROCESS_NAME_OVERRIDE)
  private String processNameOverride;

  public AuditCompleteRequest() {
  }

  public AuditCompleteRequest id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique ID identifiying the source of the event
   * @return id
  **/
  @jakarta.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AuditCompleteRequest userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * A unique ID identifiying who owns the schedule
   * @return userId
  **/
  @jakarta.annotation.Nonnull
  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public AuditCompleteRequest schedulerRunId(String schedulerRunId) {
    
    this.schedulerRunId = schedulerRunId;
    return this;
  }

   /**
   * The GUID of the schedule run
   * @return schedulerRunId
  **/
  @jakarta.annotation.Nonnull
  public String getSchedulerRunId() {
    return schedulerRunId;
  }


  public void setSchedulerRunId(String schedulerRunId) {
    this.schedulerRunId = schedulerRunId;
  }


  public AuditCompleteRequest startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * When the run was started in UTC
   * @return startTime
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public AuditCompleteRequest endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * When the run finished in UTC
   * @return endTime
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getEndTime() {
    return endTime;
  }


  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public AuditCompleteRequest message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * A descriptive message to accompany the status
   * @return message
  **/
  @jakarta.annotation.Nonnull
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public AuditCompleteRequest status(AuditCompleteStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nonnull
  public AuditCompleteStatus getStatus() {
    return status;
  }


  public void setStatus(AuditCompleteStatus status) {
    this.status = status;
  }


  public AuditCompleteRequest rowsTotal(Integer rowsTotal) {
    
    this.rowsTotal = rowsTotal;
    return this;
  }

   /**
   * The number of data rows operated on
   * @return rowsTotal
  **/
  @jakarta.annotation.Nonnull
  public Integer getRowsTotal() {
    return rowsTotal;
  }


  public void setRowsTotal(Integer rowsTotal) {
    this.rowsTotal = rowsTotal;
  }


  public AuditCompleteRequest rowsSucceeded(Integer rowsSucceeded) {
    
    this.rowsSucceeded = rowsSucceeded;
    return this;
  }

   /**
   * The number of data rows successfully operated on
   * @return rowsSucceeded
  **/
  @jakarta.annotation.Nonnull
  public Integer getRowsSucceeded() {
    return rowsSucceeded;
  }


  public void setRowsSucceeded(Integer rowsSucceeded) {
    this.rowsSucceeded = rowsSucceeded;
  }


  public AuditCompleteRequest rowsFailed(Integer rowsFailed) {
    
    this.rowsFailed = rowsFailed;
    return this;
  }

   /**
   * The number of data rows that failed to be operated on
   * @return rowsFailed
  **/
  @jakarta.annotation.Nonnull
  public Integer getRowsFailed() {
    return rowsFailed;
  }


  public void setRowsFailed(Integer rowsFailed) {
    this.rowsFailed = rowsFailed;
  }


  public AuditCompleteRequest rowsIgnored(Integer rowsIgnored) {
    
    this.rowsIgnored = rowsIgnored;
    return this;
  }

   /**
   * The number of data rows that had no actions taken
   * @return rowsIgnored
  **/
  @jakarta.annotation.Nonnull
  public Integer getRowsIgnored() {
    return rowsIgnored;
  }


  public void setRowsIgnored(Integer rowsIgnored) {
    this.rowsIgnored = rowsIgnored;
  }


  public AuditCompleteRequest auditFiles(List<AuditFileDetails> auditFiles) {
    
    this.auditFiles = auditFiles;
    return this;
  }

  public AuditCompleteRequest addAuditFilesItem(AuditFileDetails auditFilesItem) {
    if (this.auditFiles == null) {
      this.auditFiles = new ArrayList<>();
    }
    this.auditFiles.add(auditFilesItem);
    return this;
  }

   /**
   * A list of file details for attaching to the event
   * @return auditFiles
  **/
  @jakarta.annotation.Nonnull
  public List<AuditFileDetails> getAuditFiles() {
    return auditFiles;
  }


  public void setAuditFiles(List<AuditFileDetails> auditFiles) {
    this.auditFiles = auditFiles;
  }


  public AuditCompleteRequest processNameOverride(String processNameOverride) {
    
    this.processNameOverride = processNameOverride;
    return this;
  }

   /**
   * Optional Name for how the process appears in Data Feed Monitoring
   * @return processNameOverride
  **/
  @jakarta.annotation.Nullable
  public String getProcessNameOverride() {
    return processNameOverride;
  }


  public void setProcessNameOverride(String processNameOverride) {
    this.processNameOverride = processNameOverride;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditCompleteRequest auditCompleteRequest = (AuditCompleteRequest) o;
    return Objects.equals(this.id, auditCompleteRequest.id) &&
        Objects.equals(this.userId, auditCompleteRequest.userId) &&
        Objects.equals(this.schedulerRunId, auditCompleteRequest.schedulerRunId) &&
        Objects.equals(this.startTime, auditCompleteRequest.startTime) &&
        Objects.equals(this.endTime, auditCompleteRequest.endTime) &&
        Objects.equals(this.message, auditCompleteRequest.message) &&
        Objects.equals(this.status, auditCompleteRequest.status) &&
        Objects.equals(this.rowsTotal, auditCompleteRequest.rowsTotal) &&
        Objects.equals(this.rowsSucceeded, auditCompleteRequest.rowsSucceeded) &&
        Objects.equals(this.rowsFailed, auditCompleteRequest.rowsFailed) &&
        Objects.equals(this.rowsIgnored, auditCompleteRequest.rowsIgnored) &&
        Objects.equals(this.auditFiles, auditCompleteRequest.auditFiles) &&
        Objects.equals(this.processNameOverride, auditCompleteRequest.processNameOverride);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, schedulerRunId, startTime, endTime, message, status, rowsTotal, rowsSucceeded, rowsFailed, rowsIgnored, auditFiles, processNameOverride);
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
    sb.append("class AuditCompleteRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    schedulerRunId: ").append(toIndentedString(schedulerRunId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    rowsTotal: ").append(toIndentedString(rowsTotal)).append("\n");
    sb.append("    rowsSucceeded: ").append(toIndentedString(rowsSucceeded)).append("\n");
    sb.append("    rowsFailed: ").append(toIndentedString(rowsFailed)).append("\n");
    sb.append("    rowsIgnored: ").append(toIndentedString(rowsIgnored)).append("\n");
    sb.append("    auditFiles: ").append(toIndentedString(auditFiles)).append("\n");
    sb.append("    processNameOverride: ").append(toIndentedString(processNameOverride)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("userId");
    openapiFields.add("schedulerRunId");
    openapiFields.add("startTime");
    openapiFields.add("endTime");
    openapiFields.add("message");
    openapiFields.add("status");
    openapiFields.add("rowsTotal");
    openapiFields.add("rowsSucceeded");
    openapiFields.add("rowsFailed");
    openapiFields.add("rowsIgnored");
    openapiFields.add("auditFiles");
    openapiFields.add("processNameOverride");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("userId");
    openapiRequiredFields.add("schedulerRunId");
    openapiRequiredFields.add("startTime");
    openapiRequiredFields.add("endTime");
    openapiRequiredFields.add("message");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("rowsTotal");
    openapiRequiredFields.add("rowsSucceeded");
    openapiRequiredFields.add("rowsFailed");
    openapiRequiredFields.add("rowsIgnored");
    openapiRequiredFields.add("auditFiles");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AuditCompleteRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuditCompleteRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuditCompleteRequest is not found in the empty JSON string", AuditCompleteRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AuditCompleteRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if (!jsonObj.get("schedulerRunId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schedulerRunId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schedulerRunId").toString()));
      }
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("auditFiles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `auditFiles` to be an array in the JSON string but got `%s`", jsonObj.get("auditFiles").toString()));
      }

      JsonArray jsonArrayauditFiles = jsonObj.getAsJsonArray("auditFiles");
      // validate the required field `auditFiles` (array)
      for (int i = 0; i < jsonArrayauditFiles.size(); i++) {
        AuditFileDetails.validateJsonElement(jsonArrayauditFiles.get(i));
      };
      if ((jsonObj.get("processNameOverride") != null && !jsonObj.get("processNameOverride").isJsonNull()) && !jsonObj.get("processNameOverride").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processNameOverride` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processNameOverride").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuditCompleteRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuditCompleteRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuditCompleteRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuditCompleteRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AuditCompleteRequest>() {
           @Override
           public void write(JsonWriter out, AuditCompleteRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuditCompleteRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuditCompleteRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuditCompleteRequest
  * @throws IOException if the JSON string is invalid with respect to AuditCompleteRequest
  */
  public static AuditCompleteRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuditCompleteRequest.class);
  }

 /**
  * Convert an instance of AuditCompleteRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
