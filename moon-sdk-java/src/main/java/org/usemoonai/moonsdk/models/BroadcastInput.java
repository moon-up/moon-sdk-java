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
 * BroadcastInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T13:07:28.038327556+10:00[Australia/Brisbane]", comments = "Generator version: 7.4.0")
public class BroadcastInput {
  public static final String SERIALIZED_NAME_CHAIN_ID = "chainId";
  @SerializedName(SERIALIZED_NAME_CHAIN_ID)
  private String chainId;

  public static final String SERIALIZED_NAME_RAW_TRANSACTION = "rawTransaction";
  @SerializedName(SERIALIZED_NAME_RAW_TRANSACTION)
  private String rawTransaction;

  public BroadcastInput() {
  }

  public BroadcastInput chainId(String chainId) {
    this.chainId = chainId;
    return this;
  }

   /**
   * Get chainId
   * @return chainId
  **/
  @javax.annotation.Nonnull
  public String getChainId() {
    return chainId;
  }

  public void setChainId(String chainId) {
    this.chainId = chainId;
  }


  public BroadcastInput rawTransaction(String rawTransaction) {
    this.rawTransaction = rawTransaction;
    return this;
  }

   /**
   * Get rawTransaction
   * @return rawTransaction
  **/
  @javax.annotation.Nonnull
  public String getRawTransaction() {
    return rawTransaction;
  }

  public void setRawTransaction(String rawTransaction) {
    this.rawTransaction = rawTransaction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BroadcastInput broadcastInput = (BroadcastInput) o;
    return Objects.equals(this.chainId, broadcastInput.chainId) &&
        Objects.equals(this.rawTransaction, broadcastInput.rawTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chainId, rawTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BroadcastInput {\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    rawTransaction: ").append(toIndentedString(rawTransaction)).append("\n");
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
    openapiFields.add("chainId");
    openapiFields.add("rawTransaction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("chainId");
    openapiRequiredFields.add("rawTransaction");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BroadcastInput
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BroadcastInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BroadcastInput is not found in the empty JSON string", BroadcastInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BroadcastInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BroadcastInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BroadcastInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("chainId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chainId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chainId").toString()));
      }
      if (!jsonObj.get("rawTransaction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rawTransaction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rawTransaction").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BroadcastInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BroadcastInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BroadcastInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BroadcastInput.class));

       return (TypeAdapter<T>) new TypeAdapter<BroadcastInput>() {
           @Override
           public void write(JsonWriter out, BroadcastInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BroadcastInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BroadcastInput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BroadcastInput
  * @throws IOException if the JSON string is invalid with respect to BroadcastInput
  */
  public static BroadcastInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BroadcastInput.class);
  }

 /**
  * Convert an instance of BroadcastInput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

