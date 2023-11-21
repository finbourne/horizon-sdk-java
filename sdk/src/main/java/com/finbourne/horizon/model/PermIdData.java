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
 * PermId Data Structure
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PermIdData {
  public static final String SERIALIZED_NAME_FIGI = "figi";
  @SerializedName(SERIALIZED_NAME_FIGI)
  private String figi;

  public static final String SERIALIZED_NAME_TICKER = "ticker";
  @SerializedName(SERIALIZED_NAME_TICKER)
  private String ticker;

  public static final String SERIALIZED_NAME_MIC = "mic";
  @SerializedName(SERIALIZED_NAME_MIC)
  private String mic;

  public static final String SERIALIZED_NAME_QUOTE_PERM_ID = "quotePermId";
  @SerializedName(SERIALIZED_NAME_QUOTE_PERM_ID)
  private String quotePermId;

  public static final String SERIALIZED_NAME_IS_PRIMARY_QUOTE = "isPrimaryQuote";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY_QUOTE)
  private Boolean isPrimaryQuote;

  public static final String SERIALIZED_NAME_LEGAL_ENTITY_IDENTIFIER = "legalEntityIdentifier";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY_IDENTIFIER)
  private String legalEntityIdentifier;

  public PermIdData() {
  }

  public PermIdData figi(String figi) {
    
    this.figi = figi;
    return this;
  }

   /**
   * &gt;FIGI assigned to the instrument.
   * @return figi
  **/
  @jakarta.annotation.Nonnull
  public String getFigi() {
    return figi;
  }


  public void setFigi(String figi) {
    this.figi = figi;
  }


  public PermIdData ticker(String ticker) {
    
    this.ticker = ticker;
    return this;
  }

   /**
   * Ticker assigned to the instrument
   * @return ticker
  **/
  @jakarta.annotation.Nonnull
  public String getTicker() {
    return ticker;
  }


  public void setTicker(String ticker) {
    this.ticker = ticker;
  }


  public PermIdData mic(String mic) {
    
    this.mic = mic;
    return this;
  }

   /**
   * ISO market identification code(MIC) of the desired instrument(s)
   * @return mic
  **/
  @jakarta.annotation.Nonnull
  public String getMic() {
    return mic;
  }


  public void setMic(String mic) {
    this.mic = mic;
  }


  public PermIdData quotePermId(String quotePermId) {
    
    this.quotePermId = quotePermId;
    return this;
  }

   /**
   * QuotePermId of the instrument
   * @return quotePermId
  **/
  @jakarta.annotation.Nonnull
  public String getQuotePermId() {
    return quotePermId;
  }


  public void setQuotePermId(String quotePermId) {
    this.quotePermId = quotePermId;
  }


  public PermIdData isPrimaryQuote(Boolean isPrimaryQuote) {
    
    this.isPrimaryQuote = isPrimaryQuote;
    return this;
  }

   /**
   * If the quote is primary
   * @return isPrimaryQuote
  **/
  @jakarta.annotation.Nonnull
  public Boolean getIsPrimaryQuote() {
    return isPrimaryQuote;
  }


  public void setIsPrimaryQuote(Boolean isPrimaryQuote) {
    this.isPrimaryQuote = isPrimaryQuote;
  }


  public PermIdData legalEntityIdentifier(String legalEntityIdentifier) {
    
    this.legalEntityIdentifier = legalEntityIdentifier;
    return this;
  }

   /**
   * LEI assigned to the instrument
   * @return legalEntityIdentifier
  **/
  @jakarta.annotation.Nullable
  public String getLegalEntityIdentifier() {
    return legalEntityIdentifier;
  }


  public void setLegalEntityIdentifier(String legalEntityIdentifier) {
    this.legalEntityIdentifier = legalEntityIdentifier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermIdData permIdData = (PermIdData) o;
    return Objects.equals(this.figi, permIdData.figi) &&
        Objects.equals(this.ticker, permIdData.ticker) &&
        Objects.equals(this.mic, permIdData.mic) &&
        Objects.equals(this.quotePermId, permIdData.quotePermId) &&
        Objects.equals(this.isPrimaryQuote, permIdData.isPrimaryQuote) &&
        Objects.equals(this.legalEntityIdentifier, permIdData.legalEntityIdentifier);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(figi, ticker, mic, quotePermId, isPrimaryQuote, legalEntityIdentifier);
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
    sb.append("class PermIdData {\n");
    sb.append("    figi: ").append(toIndentedString(figi)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    mic: ").append(toIndentedString(mic)).append("\n");
    sb.append("    quotePermId: ").append(toIndentedString(quotePermId)).append("\n");
    sb.append("    isPrimaryQuote: ").append(toIndentedString(isPrimaryQuote)).append("\n");
    sb.append("    legalEntityIdentifier: ").append(toIndentedString(legalEntityIdentifier)).append("\n");
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
    openapiFields.add("figi");
    openapiFields.add("ticker");
    openapiFields.add("mic");
    openapiFields.add("quotePermId");
    openapiFields.add("isPrimaryQuote");
    openapiFields.add("legalEntityIdentifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("figi");
    openapiRequiredFields.add("ticker");
    openapiRequiredFields.add("mic");
    openapiRequiredFields.add("quotePermId");
    openapiRequiredFields.add("isPrimaryQuote");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PermIdData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PermIdData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PermIdData is not found in the empty JSON string", PermIdData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PermIdData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("figi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `figi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("figi").toString()));
      }
      if (!jsonObj.get("ticker").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ticker` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ticker").toString()));
      }
      if (!jsonObj.get("mic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mic").toString()));
      }
      if (!jsonObj.get("quotePermId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quotePermId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quotePermId").toString()));
      }
      if ((jsonObj.get("legalEntityIdentifier") != null && !jsonObj.get("legalEntityIdentifier").isJsonNull()) && !jsonObj.get("legalEntityIdentifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legalEntityIdentifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legalEntityIdentifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PermIdData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PermIdData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PermIdData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PermIdData.class));

       return (TypeAdapter<T>) new TypeAdapter<PermIdData>() {
           @Override
           public void write(JsonWriter out, PermIdData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PermIdData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PermIdData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PermIdData
  * @throws IOException if the JSON string is invalid with respect to PermIdData
  */
  public static PermIdData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PermIdData.class);
  }

 /**
  * Convert an instance of PermIdData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
