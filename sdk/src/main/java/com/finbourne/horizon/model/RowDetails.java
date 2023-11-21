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
 * Information about the nuber of rows processed.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RowDetails {
  public static final String SERIALIZED_NAME_ROWS_TOTAL = "rowsTotal";
  @SerializedName(SERIALIZED_NAME_ROWS_TOTAL)
  private Integer rowsTotal;

  public static final String SERIALIZED_NAME_ROWS_SUCCEEDED = "rowsSucceeded";
  @SerializedName(SERIALIZED_NAME_ROWS_SUCCEEDED)
  private Integer rowsSucceeded;

  public static final String SERIALIZED_NAME_ROWS_IGNORED = "rowsIgnored";
  @SerializedName(SERIALIZED_NAME_ROWS_IGNORED)
  private Integer rowsIgnored;

  public static final String SERIALIZED_NAME_ROWS_FAILED = "rowsFailed";
  @SerializedName(SERIALIZED_NAME_ROWS_FAILED)
  private Integer rowsFailed;

  public RowDetails() {
  }

  public RowDetails rowsTotal(Integer rowsTotal) {
    
    this.rowsTotal = rowsTotal;
    return this;
  }

   /**
   * The number of rows processed.
   * @return rowsTotal
  **/
  @jakarta.annotation.Nullable
  public Integer getRowsTotal() {
    return rowsTotal;
  }


  public void setRowsTotal(Integer rowsTotal) {
    this.rowsTotal = rowsTotal;
  }


  public RowDetails rowsSucceeded(Integer rowsSucceeded) {
    
    this.rowsSucceeded = rowsSucceeded;
    return this;
  }

   /**
   * The number of rows that were successfully processed.
   * @return rowsSucceeded
  **/
  @jakarta.annotation.Nullable
  public Integer getRowsSucceeded() {
    return rowsSucceeded;
  }


  public void setRowsSucceeded(Integer rowsSucceeded) {
    this.rowsSucceeded = rowsSucceeded;
  }


  public RowDetails rowsIgnored(Integer rowsIgnored) {
    
    this.rowsIgnored = rowsIgnored;
    return this;
  }

   /**
   * The number of rows that were not processed.
   * @return rowsIgnored
  **/
  @jakarta.annotation.Nullable
  public Integer getRowsIgnored() {
    return rowsIgnored;
  }


  public void setRowsIgnored(Integer rowsIgnored) {
    this.rowsIgnored = rowsIgnored;
  }


  public RowDetails rowsFailed(Integer rowsFailed) {
    
    this.rowsFailed = rowsFailed;
    return this;
  }

   /**
   * The number of rows that failed when being processed.
   * @return rowsFailed
  **/
  @jakarta.annotation.Nullable
  public Integer getRowsFailed() {
    return rowsFailed;
  }


  public void setRowsFailed(Integer rowsFailed) {
    this.rowsFailed = rowsFailed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RowDetails rowDetails = (RowDetails) o;
    return Objects.equals(this.rowsTotal, rowDetails.rowsTotal) &&
        Objects.equals(this.rowsSucceeded, rowDetails.rowsSucceeded) &&
        Objects.equals(this.rowsIgnored, rowDetails.rowsIgnored) &&
        Objects.equals(this.rowsFailed, rowDetails.rowsFailed);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowsTotal, rowsSucceeded, rowsIgnored, rowsFailed);
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
    sb.append("class RowDetails {\n");
    sb.append("    rowsTotal: ").append(toIndentedString(rowsTotal)).append("\n");
    sb.append("    rowsSucceeded: ").append(toIndentedString(rowsSucceeded)).append("\n");
    sb.append("    rowsIgnored: ").append(toIndentedString(rowsIgnored)).append("\n");
    sb.append("    rowsFailed: ").append(toIndentedString(rowsFailed)).append("\n");
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
    openapiFields.add("rowsTotal");
    openapiFields.add("rowsSucceeded");
    openapiFields.add("rowsIgnored");
    openapiFields.add("rowsFailed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RowDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RowDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RowDetails is not found in the empty JSON string", RowDetails.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RowDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RowDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RowDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RowDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<RowDetails>() {
           @Override
           public void write(JsonWriter out, RowDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RowDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RowDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RowDetails
  * @throws IOException if the JSON string is invalid with respect to RowDetails
  */
  public static RowDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RowDetails.class);
  }

 /**
  * Convert an instance of RowDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
