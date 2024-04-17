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
 * SolanaTransactionOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T13:07:28.038327556+10:00[Australia/Brisbane]", comments = "Generator version: 7.4.0")
public class SolanaTransactionOutput {
  public static final String SERIALIZED_NAME_SIGNED_TX = "signedTx";
  @SerializedName(SERIALIZED_NAME_SIGNED_TX)
  private String signedTx;

  public static final String SERIALIZED_NAME_TRANSACTION_HASH = "transaction_hash";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_HASH)
  private String transactionHash;

  public SolanaTransactionOutput() {
  }

  public SolanaTransactionOutput signedTx(String signedTx) {
    this.signedTx = signedTx;
    return this;
  }

   /**
   * Get signedTx
   * @return signedTx
  **/
  @javax.annotation.Nullable
  public String getSignedTx() {
    return signedTx;
  }

  public void setSignedTx(String signedTx) {
    this.signedTx = signedTx;
  }


  public SolanaTransactionOutput transactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * Get transactionHash
   * @return transactionHash
  **/
  @javax.annotation.Nullable
  public String getTransactionHash() {
    return transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolanaTransactionOutput solanaTransactionOutput = (SolanaTransactionOutput) o;
    return Objects.equals(this.signedTx, solanaTransactionOutput.signedTx) &&
        Objects.equals(this.transactionHash, solanaTransactionOutput.transactionHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signedTx, transactionHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolanaTransactionOutput {\n");
    sb.append("    signedTx: ").append(toIndentedString(signedTx)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
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
    openapiFields.add("signedTx");
    openapiFields.add("transaction_hash");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SolanaTransactionOutput
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SolanaTransactionOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SolanaTransactionOutput is not found in the empty JSON string", SolanaTransactionOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SolanaTransactionOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SolanaTransactionOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("signedTx") != null && !jsonObj.get("signedTx").isJsonNull()) && !jsonObj.get("signedTx").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signedTx` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signedTx").toString()));
      }
      if ((jsonObj.get("transaction_hash") != null && !jsonObj.get("transaction_hash").isJsonNull()) && !jsonObj.get("transaction_hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_hash").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SolanaTransactionOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SolanaTransactionOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SolanaTransactionOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SolanaTransactionOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<SolanaTransactionOutput>() {
           @Override
           public void write(JsonWriter out, SolanaTransactionOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SolanaTransactionOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SolanaTransactionOutput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SolanaTransactionOutput
  * @throws IOException if the JSON string is invalid with respect to SolanaTransactionOutput
  */
  public static SolanaTransactionOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SolanaTransactionOutput.class);
  }

 /**
  * Convert an instance of SolanaTransactionOutput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

