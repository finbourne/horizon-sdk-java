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
import com.finbourne.horizon.model.LusidEntity;
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
 * Denormalised information about vendors, the products they provide and the LUSID entity types they can be used to populate.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VendorProduct {
  public static final String SERIALIZED_NAME_VENDOR_NAME = "vendorName";
  @SerializedName(SERIALIZED_NAME_VENDOR_NAME)
  private String vendorName;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "productName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_VENDOR_PRODUCT_KEY = "vendorProductKey";
  @SerializedName(SERIALIZED_NAME_VENDOR_PRODUCT_KEY)
  private String vendorProductKey;

  public static final String SERIALIZED_NAME_LUSID_ENTITY = "lusidEntity";
  @SerializedName(SERIALIZED_NAME_LUSID_ENTITY)
  private LusidEntity lusidEntity;

  public VendorProduct() {
  }

  public VendorProduct vendorName(String vendorName) {
    
    this.vendorName = vendorName;
    return this;
  }

   /**
   * Get vendorName
   * @return vendorName
  **/
  @jakarta.annotation.Nonnull
  public String getVendorName() {
    return vendorName;
  }


  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }


  public VendorProduct productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @jakarta.annotation.Nonnull
  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public VendorProduct vendorProductKey(String vendorProductKey) {
    
    this.vendorProductKey = vendorProductKey;
    return this;
  }

   /**
   * Get vendorProductKey
   * @return vendorProductKey
  **/
  @jakarta.annotation.Nonnull
  public String getVendorProductKey() {
    return vendorProductKey;
  }


  public void setVendorProductKey(String vendorProductKey) {
    this.vendorProductKey = vendorProductKey;
  }


  public VendorProduct lusidEntity(LusidEntity lusidEntity) {
    
    this.lusidEntity = lusidEntity;
    return this;
  }

   /**
   * Get lusidEntity
   * @return lusidEntity
  **/
  @jakarta.annotation.Nonnull
  public LusidEntity getLusidEntity() {
    return lusidEntity;
  }


  public void setLusidEntity(LusidEntity lusidEntity) {
    this.lusidEntity = lusidEntity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorProduct vendorProduct = (VendorProduct) o;
    return Objects.equals(this.vendorName, vendorProduct.vendorName) &&
        Objects.equals(this.productName, vendorProduct.productName) &&
        Objects.equals(this.vendorProductKey, vendorProduct.vendorProductKey) &&
        Objects.equals(this.lusidEntity, vendorProduct.lusidEntity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorName, productName, vendorProductKey, lusidEntity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorProduct {\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    vendorProductKey: ").append(toIndentedString(vendorProductKey)).append("\n");
    sb.append("    lusidEntity: ").append(toIndentedString(lusidEntity)).append("\n");
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
    openapiFields.add("vendorName");
    openapiFields.add("productName");
    openapiFields.add("vendorProductKey");
    openapiFields.add("lusidEntity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("vendorName");
    openapiRequiredFields.add("productName");
    openapiRequiredFields.add("vendorProductKey");
    openapiRequiredFields.add("lusidEntity");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VendorProduct
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VendorProduct.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VendorProduct is not found in the empty JSON string", VendorProduct.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VendorProduct.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("vendorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorName").toString()));
      }
      if (!jsonObj.get("productName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productName").toString()));
      }
      if (!jsonObj.get("vendorProductKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorProductKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorProductKey").toString()));
      }
      // validate the required field `lusidEntity`
      LusidEntity.validateJsonElement(jsonObj.get("lusidEntity"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VendorProduct.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VendorProduct' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VendorProduct> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VendorProduct.class));

       return (TypeAdapter<T>) new TypeAdapter<VendorProduct>() {
           @Override
           public void write(JsonWriter out, VendorProduct value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VendorProduct read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VendorProduct given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VendorProduct
  * @throws IOException if the JSON string is invalid with respect to VendorProduct
  */
  public static VendorProduct fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VendorProduct.class);
  }

 /**
  * Convert an instance of VendorProduct to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
