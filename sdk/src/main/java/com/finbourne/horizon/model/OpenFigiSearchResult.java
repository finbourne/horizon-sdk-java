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
import com.finbourne.horizon.model.OpenFigiData;
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
 * Response coming back from a search request to OpenFIGI
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OpenFigiSearchResult {
  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<OpenFigiData> results = new ArrayList<>();

  public static final String SERIALIZED_NAME_PERM_ID_URI = "permIdUri";
  @SerializedName(SERIALIZED_NAME_PERM_ID_URI)
  private String permIdUri;

  public OpenFigiSearchResult() {
  }

  public OpenFigiSearchResult results(List<OpenFigiData> results) {
    
    this.results = results;
    return this;
  }

  public OpenFigiSearchResult addResultsItem(OpenFigiData resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Enumerable list of OpenFIGI results
   * @return results
  **/
  @jakarta.annotation.Nonnull
  public List<OpenFigiData> getResults() {
    return results;
  }


  public void setResults(List<OpenFigiData> results) {
    this.results = results;
  }


  public OpenFigiSearchResult permIdUri(String permIdUri) {
    
    this.permIdUri = permIdUri;
    return this;
  }

   /**
   * URI of the related PermID response, if requested
   * @return permIdUri
  **/
  @jakarta.annotation.Nullable
  public String getPermIdUri() {
    return permIdUri;
  }


  public void setPermIdUri(String permIdUri) {
    this.permIdUri = permIdUri;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenFigiSearchResult openFigiSearchResult = (OpenFigiSearchResult) o;
    return Objects.equals(this.results, openFigiSearchResult.results) &&
        Objects.equals(this.permIdUri, openFigiSearchResult.permIdUri);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, permIdUri);
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
    sb.append("class OpenFigiSearchResult {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    permIdUri: ").append(toIndentedString(permIdUri)).append("\n");
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
    openapiFields.add("results");
    openapiFields.add("permIdUri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("results");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OpenFigiSearchResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OpenFigiSearchResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpenFigiSearchResult is not found in the empty JSON string", OpenFigiSearchResult.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OpenFigiSearchResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("results").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results").toString()));
      }

      JsonArray jsonArrayresults = jsonObj.getAsJsonArray("results");
      // validate the required field `results` (array)
      for (int i = 0; i < jsonArrayresults.size(); i++) {
        OpenFigiData.validateJsonElement(jsonArrayresults.get(i));
      };
      if ((jsonObj.get("permIdUri") != null && !jsonObj.get("permIdUri").isJsonNull()) && !jsonObj.get("permIdUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permIdUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permIdUri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpenFigiSearchResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpenFigiSearchResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpenFigiSearchResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpenFigiSearchResult.class));

       return (TypeAdapter<T>) new TypeAdapter<OpenFigiSearchResult>() {
           @Override
           public void write(JsonWriter out, OpenFigiSearchResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OpenFigiSearchResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OpenFigiSearchResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OpenFigiSearchResult
  * @throws IOException if the JSON string is invalid with respect to OpenFigiSearchResult
  */
  public static OpenFigiSearchResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenFigiSearchResult.class);
  }

 /**
  * Convert an instance of OpenFigiSearchResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
