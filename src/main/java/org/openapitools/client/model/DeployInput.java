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
 * DeployInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T19:39:59.155569+10:00[Australia/Brisbane]")
public class DeployInput {
  public static final String SERIALIZED_NAME_CHAIN_ID = "chain_id";
  @SerializedName(SERIALIZED_NAME_CHAIN_ID)
  private String chainId;

  public static final String SERIALIZED_NAME_ABI = "abi";
  @SerializedName(SERIALIZED_NAME_ABI)
  private String abi;

  public static final String SERIALIZED_NAME_BYTECODE = "bytecode";
  @SerializedName(SERIALIZED_NAME_BYTECODE)
  private String bytecode;

  public static final String SERIALIZED_NAME_CONSTRUCTOR_ARGS = "constructor_args";
  @SerializedName(SERIALIZED_NAME_CONSTRUCTOR_ARGS)
  private String constructorArgs;

  public DeployInput() {
  }

  public DeployInput chainId(String chainId) {
    
    this.chainId = chainId;
    return this;
  }

   /**
   * Get chainId
   * @return chainId
  **/
  @javax.annotation.Nullable
  public String getChainId() {
    return chainId;
  }


  public void setChainId(String chainId) {
    this.chainId = chainId;
  }


  public DeployInput abi(String abi) {
    
    this.abi = abi;
    return this;
  }

   /**
   * Get abi
   * @return abi
  **/
  @javax.annotation.Nonnull
  public String getAbi() {
    return abi;
  }


  public void setAbi(String abi) {
    this.abi = abi;
  }


  public DeployInput bytecode(String bytecode) {
    
    this.bytecode = bytecode;
    return this;
  }

   /**
   * Get bytecode
   * @return bytecode
  **/
  @javax.annotation.Nonnull
  public String getBytecode() {
    return bytecode;
  }


  public void setBytecode(String bytecode) {
    this.bytecode = bytecode;
  }


  public DeployInput constructorArgs(String constructorArgs) {
    
    this.constructorArgs = constructorArgs;
    return this;
  }

   /**
   * Get constructorArgs
   * @return constructorArgs
  **/
  @javax.annotation.Nullable
  public String getConstructorArgs() {
    return constructorArgs;
  }


  public void setConstructorArgs(String constructorArgs) {
    this.constructorArgs = constructorArgs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeployInput deployInput = (DeployInput) o;
    return Objects.equals(this.chainId, deployInput.chainId) &&
        Objects.equals(this.abi, deployInput.abi) &&
        Objects.equals(this.bytecode, deployInput.bytecode) &&
        Objects.equals(this.constructorArgs, deployInput.constructorArgs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chainId, abi, bytecode, constructorArgs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeployInput {\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    abi: ").append(toIndentedString(abi)).append("\n");
    sb.append("    bytecode: ").append(toIndentedString(bytecode)).append("\n");
    sb.append("    constructorArgs: ").append(toIndentedString(constructorArgs)).append("\n");
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
    openapiFields.add("chain_id");
    openapiFields.add("abi");
    openapiFields.add("bytecode");
    openapiFields.add("constructor_args");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("abi");
    openapiRequiredFields.add("bytecode");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DeployInput
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeployInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeployInput is not found in the empty JSON string", DeployInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeployInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeployInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeployInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("chain_id") != null && !jsonObj.get("chain_id").isJsonNull()) && !jsonObj.get("chain_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chain_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chain_id").toString()));
      }
      if (!jsonObj.get("abi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `abi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("abi").toString()));
      }
      if (!jsonObj.get("bytecode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bytecode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bytecode").toString()));
      }
      if ((jsonObj.get("constructor_args") != null && !jsonObj.get("constructor_args").isJsonNull()) && !jsonObj.get("constructor_args").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `constructor_args` to be a primitive type in the JSON string but got `%s`", jsonObj.get("constructor_args").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeployInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeployInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeployInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeployInput.class));

       return (TypeAdapter<T>) new TypeAdapter<DeployInput>() {
           @Override
           public void write(JsonWriter out, DeployInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeployInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeployInput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeployInput
  * @throws IOException if the JSON string is invalid with respect to DeployInput
  */
  public static DeployInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeployInput.class);
  }

 /**
  * Convert an instance of DeployInput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

