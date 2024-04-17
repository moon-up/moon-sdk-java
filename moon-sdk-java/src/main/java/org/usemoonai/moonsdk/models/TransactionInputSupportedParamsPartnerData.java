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


package org.usemoonai.moonsdk.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.usemoonai.moonsdk.models.TransactionInputSupportedParamsPartnerDataRedirectUrl;

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

import org.usemoonai.moonsdk.client.JSON;

/**
 * TransactionInputSupportedParamsPartnerData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T13:07:28.038327556+10:00[Australia/Brisbane]", comments = "Generator version: 7.4.0")
public class TransactionInputSupportedParamsPartnerData {
  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirectUrl";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private TransactionInputSupportedParamsPartnerDataRedirectUrl redirectUrl;

  public TransactionInputSupportedParamsPartnerData() {
  }

  public TransactionInputSupportedParamsPartnerData redirectUrl(TransactionInputSupportedParamsPartnerDataRedirectUrl redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * Get redirectUrl
   * @return redirectUrl
  **/
  @javax.annotation.Nonnull
  public TransactionInputSupportedParamsPartnerDataRedirectUrl getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(TransactionInputSupportedParamsPartnerDataRedirectUrl redirectUrl) {
    this.redirectUrl = redirectUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionInputSupportedParamsPartnerData transactionInputSupportedParamsPartnerData = (TransactionInputSupportedParamsPartnerData) o;
    return Objects.equals(this.redirectUrl, transactionInputSupportedParamsPartnerData.redirectUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInputSupportedParamsPartnerData {\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
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
    openapiFields.add("redirectUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("redirectUrl");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TransactionInputSupportedParamsPartnerData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionInputSupportedParamsPartnerData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionInputSupportedParamsPartnerData is not found in the empty JSON string", TransactionInputSupportedParamsPartnerData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TransactionInputSupportedParamsPartnerData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionInputSupportedParamsPartnerData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionInputSupportedParamsPartnerData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `redirectUrl`
      TransactionInputSupportedParamsPartnerDataRedirectUrl.validateJsonElement(jsonObj.get("redirectUrl"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionInputSupportedParamsPartnerData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionInputSupportedParamsPartnerData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionInputSupportedParamsPartnerData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionInputSupportedParamsPartnerData.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionInputSupportedParamsPartnerData>() {
           @Override
           public void write(JsonWriter out, TransactionInputSupportedParamsPartnerData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionInputSupportedParamsPartnerData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionInputSupportedParamsPartnerData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionInputSupportedParamsPartnerData
  * @throws IOException if the JSON string is invalid with respect to TransactionInputSupportedParamsPartnerData
  */
  public static TransactionInputSupportedParamsPartnerData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionInputSupportedParamsPartnerData.class);
  }

 /**
  * Convert an instance of TransactionInputSupportedParamsPartnerData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

