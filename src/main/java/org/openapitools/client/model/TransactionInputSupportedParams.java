/*
 * moon-vault-api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.TransactionInputSupportedParamsPartnerData;
import org.openapitools.client.model.TransactionInputSupportedParamsTheme;

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
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * TransactionInputSupportedParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T19:39:59.155569+10:00[Australia/Brisbane]")
public class TransactionInputSupportedParams {
  public static final String SERIALIZED_NAME_PARTNER_DATA = "partnerData";
  @SerializedName(SERIALIZED_NAME_PARTNER_DATA)
  private TransactionInputSupportedParamsPartnerData partnerData;

  public static final String SERIALIZED_NAME_THEME = "theme";
  @SerializedName(SERIALIZED_NAME_THEME)
  private TransactionInputSupportedParamsTheme theme;

  public TransactionInputSupportedParams() {
  }

  public TransactionInputSupportedParams partnerData(TransactionInputSupportedParamsPartnerData partnerData) {
    
    this.partnerData = partnerData;
    return this;
  }

   /**
   * Get partnerData
   * @return partnerData
  **/
  @javax.annotation.Nonnull
  public TransactionInputSupportedParamsPartnerData getPartnerData() {
    return partnerData;
  }


  public void setPartnerData(TransactionInputSupportedParamsPartnerData partnerData) {
    this.partnerData = partnerData;
  }


  public TransactionInputSupportedParams theme(TransactionInputSupportedParamsTheme theme) {
    
    this.theme = theme;
    return this;
  }

   /**
   * Get theme
   * @return theme
  **/
  @javax.annotation.Nonnull
  public TransactionInputSupportedParamsTheme getTheme() {
    return theme;
  }


  public void setTheme(TransactionInputSupportedParamsTheme theme) {
    this.theme = theme;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionInputSupportedParams transactionInputSupportedParams = (TransactionInputSupportedParams) o;
    return Objects.equals(this.partnerData, transactionInputSupportedParams.partnerData) &&
        Objects.equals(this.theme, transactionInputSupportedParams.theme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerData, theme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInputSupportedParams {\n");
    sb.append("    partnerData: ").append(toIndentedString(partnerData)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
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
    openapiFields.add("partnerData");
    openapiFields.add("theme");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("partnerData");
    openapiRequiredFields.add("theme");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TransactionInputSupportedParams
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionInputSupportedParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionInputSupportedParams is not found in the empty JSON string", TransactionInputSupportedParams.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TransactionInputSupportedParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionInputSupportedParams` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionInputSupportedParams.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `partnerData`
      TransactionInputSupportedParamsPartnerData.validateJsonElement(jsonObj.get("partnerData"));
      // validate the required field `theme`
      TransactionInputSupportedParamsTheme.validateJsonElement(jsonObj.get("theme"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionInputSupportedParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionInputSupportedParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionInputSupportedParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionInputSupportedParams.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionInputSupportedParams>() {
           @Override
           public void write(JsonWriter out, TransactionInputSupportedParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionInputSupportedParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionInputSupportedParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionInputSupportedParams
  * @throws IOException if the JSON string is invalid with respect to TransactionInputSupportedParams
  */
  public static TransactionInputSupportedParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionInputSupportedParams.class);
  }

 /**
  * Convert an instance of TransactionInputSupportedParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

