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
 * OpenFIGI data structure
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OpenFigiData {
  public static final String SERIALIZED_NAME_FIGI = "figi";
  @SerializedName(SERIALIZED_NAME_FIGI)
  private String figi;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TICKER = "ticker";
  @SerializedName(SERIALIZED_NAME_TICKER)
  private String ticker;

  public static final String SERIALIZED_NAME_EXCHANGE_CODE = "exchangeCode";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_CODE)
  private String exchangeCode;

  public static final String SERIALIZED_NAME_MIC = "mic";
  @SerializedName(SERIALIZED_NAME_MIC)
  private String mic;

  public static final String SERIALIZED_NAME_EXCHANGE_NAME = "exchangeName";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_NAME)
  private String exchangeName;

  public static final String SERIALIZED_NAME_MARKET_SECTOR = "marketSector";
  @SerializedName(SERIALIZED_NAME_MARKET_SECTOR)
  private String marketSector;

  public static final String SERIALIZED_NAME_GENERAL_SECURITY_TYPE = "generalSecurityType";
  @SerializedName(SERIALIZED_NAME_GENERAL_SECURITY_TYPE)
  private String generalSecurityType;

  public static final String SERIALIZED_NAME_SECURITY_TYPE = "securityType";
  @SerializedName(SERIALIZED_NAME_SECURITY_TYPE)
  private String securityType;

  public static final String SERIALIZED_NAME_SECURITY_DESCRIPTION = "securityDescription";
  @SerializedName(SERIALIZED_NAME_SECURITY_DESCRIPTION)
  private String securityDescription;

  public static final String SERIALIZED_NAME_COMPOSITE_FIGI = "compositeFigi";
  @SerializedName(SERIALIZED_NAME_COMPOSITE_FIGI)
  private String compositeFigi;

  public static final String SERIALIZED_NAME_SHARE_CLASS_FIGI = "shareClassFigi";
  @SerializedName(SERIALIZED_NAME_SHARE_CLASS_FIGI)
  private String shareClassFigi;

  public static final String SERIALIZED_NAME_MATCH_TYPE = "matchType";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private String matchType;

  public static final String SERIALIZED_NAME_SEARCH_INPUT = "searchInput";
  @SerializedName(SERIALIZED_NAME_SEARCH_INPUT)
  private String searchInput;

  public static final String SERIALIZED_NAME_LUSID_INSTRUMENT_ID = "lusidInstrumentId";
  @SerializedName(SERIALIZED_NAME_LUSID_INSTRUMENT_ID)
  private String lusidInstrumentId;

  public static final String SERIALIZED_NAME_LUSID_INSTRUMENT_SCOPE = "lusidInstrumentScope";
  @SerializedName(SERIALIZED_NAME_LUSID_INSTRUMENT_SCOPE)
  private String lusidInstrumentScope;

  public OpenFigiData() {
  }

  public OpenFigiData figi(String figi) {
    
    this.figi = figi;
    return this;
  }

   /**
   * FIGI assigned to the instrument.
   * @return figi
  **/
  @jakarta.annotation.Nonnull
  public String getFigi() {
    return figi;
  }


  public void setFigi(String figi) {
    this.figi = figi;
  }


  public OpenFigiData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Various attributes of the instrument
   * @return name
  **/
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OpenFigiData ticker(String ticker) {
    
    this.ticker = ticker;
    return this;
  }

   /**
   * Various attributes of the instrument
   * @return ticker
  **/
  @jakarta.annotation.Nullable
  public String getTicker() {
    return ticker;
  }


  public void setTicker(String ticker) {
    this.ticker = ticker;
  }


  public OpenFigiData exchangeCode(String exchangeCode) {
    
    this.exchangeCode = exchangeCode;
    return this;
  }

   /**
   * Exchange code of the desired instrument(s)
   * @return exchangeCode
  **/
  @jakarta.annotation.Nullable
  public String getExchangeCode() {
    return exchangeCode;
  }


  public void setExchangeCode(String exchangeCode) {
    this.exchangeCode = exchangeCode;
  }


  public OpenFigiData mic(String mic) {
    
    this.mic = mic;
    return this;
  }

   /**
   * ISO market identification code(MIC) of the desired instrument(s)
   * @return mic
  **/
  @jakarta.annotation.Nullable
  public String getMic() {
    return mic;
  }


  public void setMic(String mic) {
    this.mic = mic;
  }


  public OpenFigiData exchangeName(String exchangeName) {
    
    this.exchangeName = exchangeName;
    return this;
  }

   /**
   * Exchange name of the desired instrument(s)
   * @return exchangeName
  **/
  @jakarta.annotation.Nullable
  public String getExchangeName() {
    return exchangeName;
  }


  public void setExchangeName(String exchangeName) {
    this.exchangeName = exchangeName;
  }


  public OpenFigiData marketSector(String marketSector) {
    
    this.marketSector = marketSector;
    return this;
  }

   /**
   * Market sector description of the desired instrument(s)
   * @return marketSector
  **/
  @jakarta.annotation.Nullable
  public String getMarketSector() {
    return marketSector;
  }


  public void setMarketSector(String marketSector) {
    this.marketSector = marketSector;
  }


  public OpenFigiData generalSecurityType(String generalSecurityType) {
    
    this.generalSecurityType = generalSecurityType;
    return this;
  }

   /**
   * Enum-like attributes of the instrument
   * @return generalSecurityType
  **/
  @jakarta.annotation.Nullable
  public String getGeneralSecurityType() {
    return generalSecurityType;
  }


  public void setGeneralSecurityType(String generalSecurityType) {
    this.generalSecurityType = generalSecurityType;
  }


  public OpenFigiData securityType(String securityType) {
    
    this.securityType = securityType;
    return this;
  }

   /**
   * Enum-like attributes of the instrument
   * @return securityType
  **/
  @jakarta.annotation.Nullable
  public String getSecurityType() {
    return securityType;
  }


  public void setSecurityType(String securityType) {
    this.securityType = securityType;
  }


  public OpenFigiData securityDescription(String securityDescription) {
    
    this.securityDescription = securityDescription;
    return this;
  }

   /**
   * Various attributes of the instrument
   * @return securityDescription
  **/
  @jakarta.annotation.Nullable
  public String getSecurityDescription() {
    return securityDescription;
  }


  public void setSecurityDescription(String securityDescription) {
    this.securityDescription = securityDescription;
  }


  public OpenFigiData compositeFigi(String compositeFigi) {
    
    this.compositeFigi = compositeFigi;
    return this;
  }

   /**
   * Various attributes of the instrument
   * @return compositeFigi
  **/
  @jakarta.annotation.Nullable
  public String getCompositeFigi() {
    return compositeFigi;
  }


  public void setCompositeFigi(String compositeFigi) {
    this.compositeFigi = compositeFigi;
  }


  public OpenFigiData shareClassFigi(String shareClassFigi) {
    
    this.shareClassFigi = shareClassFigi;
    return this;
  }

   /**
   * Various attributes of the instrument
   * @return shareClassFigi
  **/
  @jakarta.annotation.Nullable
  public String getShareClassFigi() {
    return shareClassFigi;
  }


  public void setShareClassFigi(String shareClassFigi) {
    this.shareClassFigi = shareClassFigi;
  }


  public OpenFigiData matchType(String matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Type that the instrument matched against
   * @return matchType
  **/
  @jakarta.annotation.Nullable
  public String getMatchType() {
    return matchType;
  }


  public void setMatchType(String matchType) {
    this.matchType = matchType;
  }


  public OpenFigiData searchInput(String searchInput) {
    
    this.searchInput = searchInput;
    return this;
  }

   /**
   * Search input used to generate this response
   * @return searchInput
  **/
  @jakarta.annotation.Nullable
  public String getSearchInput() {
    return searchInput;
  }


  public void setSearchInput(String searchInput) {
    this.searchInput = searchInput;
  }


  public OpenFigiData lusidInstrumentId(String lusidInstrumentId) {
    
    this.lusidInstrumentId = lusidInstrumentId;
    return this;
  }

   /**
   * If an instrument with this FIGI exists, the LUID of that instrument in LUSID
   * @return lusidInstrumentId
  **/
  @jakarta.annotation.Nullable
  public String getLusidInstrumentId() {
    return lusidInstrumentId;
  }


  public void setLusidInstrumentId(String lusidInstrumentId) {
    this.lusidInstrumentId = lusidInstrumentId;
  }


  public OpenFigiData lusidInstrumentScope(String lusidInstrumentScope) {
    
    this.lusidInstrumentScope = lusidInstrumentScope;
    return this;
  }

   /**
   * If an instrument with this FIGI exists, the Scope of that instrument in LUSID
   * @return lusidInstrumentScope
  **/
  @jakarta.annotation.Nullable
  public String getLusidInstrumentScope() {
    return lusidInstrumentScope;
  }


  public void setLusidInstrumentScope(String lusidInstrumentScope) {
    this.lusidInstrumentScope = lusidInstrumentScope;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenFigiData openFigiData = (OpenFigiData) o;
    return Objects.equals(this.figi, openFigiData.figi) &&
        Objects.equals(this.name, openFigiData.name) &&
        Objects.equals(this.ticker, openFigiData.ticker) &&
        Objects.equals(this.exchangeCode, openFigiData.exchangeCode) &&
        Objects.equals(this.mic, openFigiData.mic) &&
        Objects.equals(this.exchangeName, openFigiData.exchangeName) &&
        Objects.equals(this.marketSector, openFigiData.marketSector) &&
        Objects.equals(this.generalSecurityType, openFigiData.generalSecurityType) &&
        Objects.equals(this.securityType, openFigiData.securityType) &&
        Objects.equals(this.securityDescription, openFigiData.securityDescription) &&
        Objects.equals(this.compositeFigi, openFigiData.compositeFigi) &&
        Objects.equals(this.shareClassFigi, openFigiData.shareClassFigi) &&
        Objects.equals(this.matchType, openFigiData.matchType) &&
        Objects.equals(this.searchInput, openFigiData.searchInput) &&
        Objects.equals(this.lusidInstrumentId, openFigiData.lusidInstrumentId) &&
        Objects.equals(this.lusidInstrumentScope, openFigiData.lusidInstrumentScope);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(figi, name, ticker, exchangeCode, mic, exchangeName, marketSector, generalSecurityType, securityType, securityDescription, compositeFigi, shareClassFigi, matchType, searchInput, lusidInstrumentId, lusidInstrumentScope);
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
    sb.append("class OpenFigiData {\n");
    sb.append("    figi: ").append(toIndentedString(figi)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    exchangeCode: ").append(toIndentedString(exchangeCode)).append("\n");
    sb.append("    mic: ").append(toIndentedString(mic)).append("\n");
    sb.append("    exchangeName: ").append(toIndentedString(exchangeName)).append("\n");
    sb.append("    marketSector: ").append(toIndentedString(marketSector)).append("\n");
    sb.append("    generalSecurityType: ").append(toIndentedString(generalSecurityType)).append("\n");
    sb.append("    securityType: ").append(toIndentedString(securityType)).append("\n");
    sb.append("    securityDescription: ").append(toIndentedString(securityDescription)).append("\n");
    sb.append("    compositeFigi: ").append(toIndentedString(compositeFigi)).append("\n");
    sb.append("    shareClassFigi: ").append(toIndentedString(shareClassFigi)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    searchInput: ").append(toIndentedString(searchInput)).append("\n");
    sb.append("    lusidInstrumentId: ").append(toIndentedString(lusidInstrumentId)).append("\n");
    sb.append("    lusidInstrumentScope: ").append(toIndentedString(lusidInstrumentScope)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("ticker");
    openapiFields.add("exchangeCode");
    openapiFields.add("mic");
    openapiFields.add("exchangeName");
    openapiFields.add("marketSector");
    openapiFields.add("generalSecurityType");
    openapiFields.add("securityType");
    openapiFields.add("securityDescription");
    openapiFields.add("compositeFigi");
    openapiFields.add("shareClassFigi");
    openapiFields.add("matchType");
    openapiFields.add("searchInput");
    openapiFields.add("lusidInstrumentId");
    openapiFields.add("lusidInstrumentScope");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("figi");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OpenFigiData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OpenFigiData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpenFigiData is not found in the empty JSON string", OpenFigiData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OpenFigiData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("figi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `figi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("figi").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("ticker") != null && !jsonObj.get("ticker").isJsonNull()) && !jsonObj.get("ticker").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ticker` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ticker").toString()));
      }
      if ((jsonObj.get("exchangeCode") != null && !jsonObj.get("exchangeCode").isJsonNull()) && !jsonObj.get("exchangeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exchangeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exchangeCode").toString()));
      }
      if ((jsonObj.get("mic") != null && !jsonObj.get("mic").isJsonNull()) && !jsonObj.get("mic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mic").toString()));
      }
      if ((jsonObj.get("exchangeName") != null && !jsonObj.get("exchangeName").isJsonNull()) && !jsonObj.get("exchangeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exchangeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exchangeName").toString()));
      }
      if ((jsonObj.get("marketSector") != null && !jsonObj.get("marketSector").isJsonNull()) && !jsonObj.get("marketSector").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `marketSector` to be a primitive type in the JSON string but got `%s`", jsonObj.get("marketSector").toString()));
      }
      if ((jsonObj.get("generalSecurityType") != null && !jsonObj.get("generalSecurityType").isJsonNull()) && !jsonObj.get("generalSecurityType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `generalSecurityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("generalSecurityType").toString()));
      }
      if ((jsonObj.get("securityType") != null && !jsonObj.get("securityType").isJsonNull()) && !jsonObj.get("securityType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `securityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("securityType").toString()));
      }
      if ((jsonObj.get("securityDescription") != null && !jsonObj.get("securityDescription").isJsonNull()) && !jsonObj.get("securityDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `securityDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("securityDescription").toString()));
      }
      if ((jsonObj.get("compositeFigi") != null && !jsonObj.get("compositeFigi").isJsonNull()) && !jsonObj.get("compositeFigi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `compositeFigi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("compositeFigi").toString()));
      }
      if ((jsonObj.get("shareClassFigi") != null && !jsonObj.get("shareClassFigi").isJsonNull()) && !jsonObj.get("shareClassFigi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shareClassFigi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shareClassFigi").toString()));
      }
      if ((jsonObj.get("matchType") != null && !jsonObj.get("matchType").isJsonNull()) && !jsonObj.get("matchType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matchType").toString()));
      }
      if ((jsonObj.get("searchInput") != null && !jsonObj.get("searchInput").isJsonNull()) && !jsonObj.get("searchInput").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchInput` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searchInput").toString()));
      }
      if ((jsonObj.get("lusidInstrumentId") != null && !jsonObj.get("lusidInstrumentId").isJsonNull()) && !jsonObj.get("lusidInstrumentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lusidInstrumentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lusidInstrumentId").toString()));
      }
      if ((jsonObj.get("lusidInstrumentScope") != null && !jsonObj.get("lusidInstrumentScope").isJsonNull()) && !jsonObj.get("lusidInstrumentScope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lusidInstrumentScope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lusidInstrumentScope").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpenFigiData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpenFigiData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpenFigiData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpenFigiData.class));

       return (TypeAdapter<T>) new TypeAdapter<OpenFigiData>() {
           @Override
           public void write(JsonWriter out, OpenFigiData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OpenFigiData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OpenFigiData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OpenFigiData
  * @throws IOException if the JSON string is invalid with respect to OpenFigiData
  */
  public static OpenFigiData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenFigiData.class);
  }

 /**
  * Convert an instance of OpenFigiData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
