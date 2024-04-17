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
 * TransactionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T13:07:28.038327556+10:00[Australia/Brisbane]", comments = "Generator version: 7.4.0")
public class TransactionRequest {
  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private String nonce;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_MAX_FEE_PER_GAS = "maxFeePerGas";
  @SerializedName(SERIALIZED_NAME_MAX_FEE_PER_GAS)
  private String maxFeePerGas;

  public static final String SERIALIZED_NAME_MAX_PRIORITY_FEE_PER_GAS = "maxPriorityFeePerGas";
  @SerializedName(SERIALIZED_NAME_MAX_PRIORITY_FEE_PER_GAS)
  private String maxPriorityFeePerGas;

  public TransactionRequest() {
  }

  public TransactionRequest nonce(String nonce) {
    this.nonce = nonce;
    return this;
  }

   /**
   * Get nonce
   * @return nonce
  **/
  @javax.annotation.Nullable
  public String getNonce() {
    return nonce;
  }

  public void setNonce(String nonce) {
    this.nonce = nonce;
  }


  public TransactionRequest data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }


  public TransactionRequest value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public TransactionRequest to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @javax.annotation.Nullable
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }


  public TransactionRequest from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nullable
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }


  public TransactionRequest maxFeePerGas(String maxFeePerGas) {
    this.maxFeePerGas = maxFeePerGas;
    return this;
  }

   /**
   * Get maxFeePerGas
   * @return maxFeePerGas
  **/
  @javax.annotation.Nullable
  public String getMaxFeePerGas() {
    return maxFeePerGas;
  }

  public void setMaxFeePerGas(String maxFeePerGas) {
    this.maxFeePerGas = maxFeePerGas;
  }


  public TransactionRequest maxPriorityFeePerGas(String maxPriorityFeePerGas) {
    this.maxPriorityFeePerGas = maxPriorityFeePerGas;
    return this;
  }

   /**
   * Get maxPriorityFeePerGas
   * @return maxPriorityFeePerGas
  **/
  @javax.annotation.Nullable
  public String getMaxPriorityFeePerGas() {
    return maxPriorityFeePerGas;
  }

  public void setMaxPriorityFeePerGas(String maxPriorityFeePerGas) {
    this.maxPriorityFeePerGas = maxPriorityFeePerGas;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRequest transactionRequest = (TransactionRequest) o;
    return Objects.equals(this.nonce, transactionRequest.nonce) &&
        Objects.equals(this.data, transactionRequest.data) &&
        Objects.equals(this.value, transactionRequest.value) &&
        Objects.equals(this.to, transactionRequest.to) &&
        Objects.equals(this.from, transactionRequest.from) &&
        Objects.equals(this.maxFeePerGas, transactionRequest.maxFeePerGas) &&
        Objects.equals(this.maxPriorityFeePerGas, transactionRequest.maxPriorityFeePerGas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonce, data, value, to, from, maxFeePerGas, maxPriorityFeePerGas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRequest {\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    maxFeePerGas: ").append(toIndentedString(maxFeePerGas)).append("\n");
    sb.append("    maxPriorityFeePerGas: ").append(toIndentedString(maxPriorityFeePerGas)).append("\n");
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
    openapiFields.add("nonce");
    openapiFields.add("data");
    openapiFields.add("value");
    openapiFields.add("to");
    openapiFields.add("from");
    openapiFields.add("maxFeePerGas");
    openapiFields.add("maxPriorityFeePerGas");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TransactionRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionRequest is not found in the empty JSON string", TransactionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TransactionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("nonce") != null && !jsonObj.get("nonce").isJsonNull()) && !jsonObj.get("nonce").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nonce` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nonce").toString()));
      }
      if ((jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) && !jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("to") != null && !jsonObj.get("to").isJsonNull()) && !jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if ((jsonObj.get("from") != null && !jsonObj.get("from").isJsonNull()) && !jsonObj.get("from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from").toString()));
      }
      if ((jsonObj.get("maxFeePerGas") != null && !jsonObj.get("maxFeePerGas").isJsonNull()) && !jsonObj.get("maxFeePerGas").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxFeePerGas` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxFeePerGas").toString()));
      }
      if ((jsonObj.get("maxPriorityFeePerGas") != null && !jsonObj.get("maxPriorityFeePerGas").isJsonNull()) && !jsonObj.get("maxPriorityFeePerGas").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxPriorityFeePerGas` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxPriorityFeePerGas").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionRequest>() {
           @Override
           public void write(JsonWriter out, TransactionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionRequest
  * @throws IOException if the JSON string is invalid with respect to TransactionRequest
  */
  public static TransactionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionRequest.class);
  }

 /**
  * Convert an instance of TransactionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

