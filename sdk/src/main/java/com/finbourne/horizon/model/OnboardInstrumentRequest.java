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
import com.finbourne.horizon.model.OpenFigiPermIdResult;
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
 * The full structure of a instrument creation / onboarding request
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OnboardInstrumentRequest {
  public static final String SERIALIZED_NAME_DATA_RESULTS = "dataResults";
  @SerializedName(SERIALIZED_NAME_DATA_RESULTS)
  private List<OpenFigiPermIdResult> dataResults = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRIMARY_VENDOR_KEY = "primaryVendorKey";
  @SerializedName(SERIALIZED_NAME_PRIMARY_VENDOR_KEY)
  private String primaryVendorKey;

  public static final String SERIALIZED_NAME_SECONDARY_VENDOR_KEYS = "secondaryVendorKeys";
  @SerializedName(SERIALIZED_NAME_SECONDARY_VENDOR_KEYS)
  private List<String> secondaryVendorKeys;

  public OnboardInstrumentRequest() {
  }

  public OnboardInstrumentRequest dataResults(List<OpenFigiPermIdResult> dataResults) {
    
    this.dataResults = dataResults;
    return this;
  }

  public OnboardInstrumentRequest addDataResultsItem(OpenFigiPermIdResult dataResultsItem) {
    if (this.dataResults == null) {
      this.dataResults = new ArrayList<>();
    }
    this.dataResults.add(dataResultsItem);
    return this;
  }

   /**
   * Enumerable packed OpenFigi/PermId information used to create instruments
   * @return dataResults
  **/
  @jakarta.annotation.Nonnull
  public List<OpenFigiPermIdResult> getDataResults() {
    return dataResults;
  }


  public void setDataResults(List<OpenFigiPermIdResult> dataResults) {
    this.dataResults = dataResults;
  }


  public OnboardInstrumentRequest primaryVendorKey(String primaryVendorKey) {
    
    this.primaryVendorKey = primaryVendorKey;
    return this;
  }

   /**
   * Primary vendor used to master instrument from Unknown to an asset type
   * @return primaryVendorKey
  **/
  @jakarta.annotation.Nullable
  public String getPrimaryVendorKey() {
    return primaryVendorKey;
  }


  public void setPrimaryVendorKey(String primaryVendorKey) {
    this.primaryVendorKey = primaryVendorKey;
  }


  public OnboardInstrumentRequest secondaryVendorKeys(List<String> secondaryVendorKeys) {
    
    this.secondaryVendorKeys = secondaryVendorKeys;
    return this;
  }

  public OnboardInstrumentRequest addSecondaryVendorKeysItem(String secondaryVendorKeysItem) {
    if (this.secondaryVendorKeys == null) {
      this.secondaryVendorKeys = new ArrayList<>();
    }
    this.secondaryVendorKeys.add(secondaryVendorKeysItem);
    return this;
  }

   /**
   * Secondary vendors used to decorate additional properties
   * @return secondaryVendorKeys
  **/
  @jakarta.annotation.Nullable
  public List<String> getSecondaryVendorKeys() {
    return secondaryVendorKeys;
  }


  public void setSecondaryVendorKeys(List<String> secondaryVendorKeys) {
    this.secondaryVendorKeys = secondaryVendorKeys;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnboardInstrumentRequest onboardInstrumentRequest = (OnboardInstrumentRequest) o;
    return Objects.equals(this.dataResults, onboardInstrumentRequest.dataResults) &&
        Objects.equals(this.primaryVendorKey, onboardInstrumentRequest.primaryVendorKey) &&
        Objects.equals(this.secondaryVendorKeys, onboardInstrumentRequest.secondaryVendorKeys);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataResults, primaryVendorKey, secondaryVendorKeys);
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
    sb.append("class OnboardInstrumentRequest {\n");
    sb.append("    dataResults: ").append(toIndentedString(dataResults)).append("\n");
    sb.append("    primaryVendorKey: ").append(toIndentedString(primaryVendorKey)).append("\n");
    sb.append("    secondaryVendorKeys: ").append(toIndentedString(secondaryVendorKeys)).append("\n");
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
    openapiFields.add("dataResults");
    openapiFields.add("primaryVendorKey");
    openapiFields.add("secondaryVendorKeys");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dataResults");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OnboardInstrumentRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OnboardInstrumentRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnboardInstrumentRequest is not found in the empty JSON string", OnboardInstrumentRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OnboardInstrumentRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("dataResults").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataResults` to be an array in the JSON string but got `%s`", jsonObj.get("dataResults").toString()));
      }

      JsonArray jsonArraydataResults = jsonObj.getAsJsonArray("dataResults");
      // validate the required field `dataResults` (array)
      for (int i = 0; i < jsonArraydataResults.size(); i++) {
        OpenFigiPermIdResult.validateJsonElement(jsonArraydataResults.get(i));
      };
      if ((jsonObj.get("primaryVendorKey") != null && !jsonObj.get("primaryVendorKey").isJsonNull()) && !jsonObj.get("primaryVendorKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryVendorKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryVendorKey").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("secondaryVendorKeys") != null && !jsonObj.get("secondaryVendorKeys").isJsonNull() && !jsonObj.get("secondaryVendorKeys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondaryVendorKeys` to be an array in the JSON string but got `%s`", jsonObj.get("secondaryVendorKeys").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnboardInstrumentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnboardInstrumentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnboardInstrumentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnboardInstrumentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OnboardInstrumentRequest>() {
           @Override
           public void write(JsonWriter out, OnboardInstrumentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OnboardInstrumentRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OnboardInstrumentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OnboardInstrumentRequest
  * @throws IOException if the JSON string is invalid with respect to OnboardInstrumentRequest
  */
  public static OnboardInstrumentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnboardInstrumentRequest.class);
  }

 /**
  * Convert an instance of OnboardInstrumentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
