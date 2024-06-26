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
 * Erc1155Request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T13:07:28.038327556+10:00[Australia/Brisbane]", comments = "Generator version: 7.4.0")
public class Erc1155Request {
  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_INPUT = "input";
  @SerializedName(SERIALIZED_NAME_INPUT)
  private String input;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private String nonce;

  public static final String SERIALIZED_NAME_GAS = "gas";
  @SerializedName(SERIALIZED_NAME_GAS)
  private String gas;

  public static final String SERIALIZED_NAME_GAS_PRICE = "gasPrice";
  @SerializedName(SERIALIZED_NAME_GAS_PRICE)
  private String gasPrice;

  public static final String SERIALIZED_NAME_CHAIN_ID = "chain_id";
  @SerializedName(SERIALIZED_NAME_CHAIN_ID)
  private String chainId;

  public static final String SERIALIZED_NAME_ENCODING = "encoding";
  @SerializedName(SERIALIZED_NAME_ENCODING)
  private String encoding;

  public static final String SERIALIZED_NAME_E_O_A = "EOA";
  @SerializedName(SERIALIZED_NAME_E_O_A)
  private Boolean EOA;

  public static final String SERIALIZED_NAME_CONTRACT_ADDRESS = "contract_address";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ADDRESS)
  private String contractAddress;

  public static final String SERIALIZED_NAME_TOKEN_ID = "token_id";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public static final String SERIALIZED_NAME_TOKEN_IDS = "token_ids";
  @SerializedName(SERIALIZED_NAME_TOKEN_IDS)
  private String tokenIds;

  public static final String SERIALIZED_NAME_APPROVED = "approved";
  @SerializedName(SERIALIZED_NAME_APPROVED)
  private Boolean approved;

  public static final String SERIALIZED_NAME_BROADCAST = "broadcast";
  @SerializedName(SERIALIZED_NAME_BROADCAST)
  private Boolean broadcast;

  public Erc1155Request() {
  }

  public Erc1155Request to(String to) {
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


  public Erc1155Request data(String data) {
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


  public Erc1155Request input(String input) {
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @javax.annotation.Nullable
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }


  public Erc1155Request value(String value) {
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


  public Erc1155Request nonce(String nonce) {
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


  public Erc1155Request gas(String gas) {
    this.gas = gas;
    return this;
  }

   /**
   * Get gas
   * @return gas
  **/
  @javax.annotation.Nullable
  public String getGas() {
    return gas;
  }

  public void setGas(String gas) {
    this.gas = gas;
  }


  public Erc1155Request gasPrice(String gasPrice) {
    this.gasPrice = gasPrice;
    return this;
  }

   /**
   * Get gasPrice
   * @return gasPrice
  **/
  @javax.annotation.Nullable
  public String getGasPrice() {
    return gasPrice;
  }

  public void setGasPrice(String gasPrice) {
    this.gasPrice = gasPrice;
  }


  public Erc1155Request chainId(String chainId) {
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


  public Erc1155Request encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Get encoding
   * @return encoding
  **/
  @javax.annotation.Nullable
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }


  public Erc1155Request EOA(Boolean EOA) {
    this.EOA = EOA;
    return this;
  }

   /**
   * Get EOA
   * @return EOA
  **/
  @javax.annotation.Nullable
  public Boolean getEOA() {
    return EOA;
  }

  public void setEOA(Boolean EOA) {
    this.EOA = EOA;
  }


  public Erc1155Request contractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * Get contractAddress
   * @return contractAddress
  **/
  @javax.annotation.Nullable
  public String getContractAddress() {
    return contractAddress;
  }

  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
  }


  public Erc1155Request tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Get tokenId
   * @return tokenId
  **/
  @javax.annotation.Nullable
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  public Erc1155Request tokenIds(String tokenIds) {
    this.tokenIds = tokenIds;
    return this;
  }

   /**
   * Get tokenIds
   * @return tokenIds
  **/
  @javax.annotation.Nullable
  public String getTokenIds() {
    return tokenIds;
  }

  public void setTokenIds(String tokenIds) {
    this.tokenIds = tokenIds;
  }


  public Erc1155Request approved(Boolean approved) {
    this.approved = approved;
    return this;
  }

   /**
   * Get approved
   * @return approved
  **/
  @javax.annotation.Nullable
  public Boolean getApproved() {
    return approved;
  }

  public void setApproved(Boolean approved) {
    this.approved = approved;
  }


  public Erc1155Request broadcast(Boolean broadcast) {
    this.broadcast = broadcast;
    return this;
  }

   /**
   * Get broadcast
   * @return broadcast
  **/
  @javax.annotation.Nullable
  public Boolean getBroadcast() {
    return broadcast;
  }

  public void setBroadcast(Boolean broadcast) {
    this.broadcast = broadcast;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Erc1155Request erc1155Request = (Erc1155Request) o;
    return Objects.equals(this.to, erc1155Request.to) &&
        Objects.equals(this.data, erc1155Request.data) &&
        Objects.equals(this.input, erc1155Request.input) &&
        Objects.equals(this.value, erc1155Request.value) &&
        Objects.equals(this.nonce, erc1155Request.nonce) &&
        Objects.equals(this.gas, erc1155Request.gas) &&
        Objects.equals(this.gasPrice, erc1155Request.gasPrice) &&
        Objects.equals(this.chainId, erc1155Request.chainId) &&
        Objects.equals(this.encoding, erc1155Request.encoding) &&
        Objects.equals(this.EOA, erc1155Request.EOA) &&
        Objects.equals(this.contractAddress, erc1155Request.contractAddress) &&
        Objects.equals(this.tokenId, erc1155Request.tokenId) &&
        Objects.equals(this.tokenIds, erc1155Request.tokenIds) &&
        Objects.equals(this.approved, erc1155Request.approved) &&
        Objects.equals(this.broadcast, erc1155Request.broadcast);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, data, input, value, nonce, gas, gasPrice, chainId, encoding, EOA, contractAddress, tokenId, tokenIds, approved, broadcast);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Erc1155Request {\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    gas: ").append(toIndentedString(gas)).append("\n");
    sb.append("    gasPrice: ").append(toIndentedString(gasPrice)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    EOA: ").append(toIndentedString(EOA)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    tokenIds: ").append(toIndentedString(tokenIds)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    broadcast: ").append(toIndentedString(broadcast)).append("\n");
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
    openapiFields.add("to");
    openapiFields.add("data");
    openapiFields.add("input");
    openapiFields.add("value");
    openapiFields.add("nonce");
    openapiFields.add("gas");
    openapiFields.add("gasPrice");
    openapiFields.add("chain_id");
    openapiFields.add("encoding");
    openapiFields.add("EOA");
    openapiFields.add("contract_address");
    openapiFields.add("token_id");
    openapiFields.add("token_ids");
    openapiFields.add("approved");
    openapiFields.add("broadcast");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Erc1155Request
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Erc1155Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Erc1155Request is not found in the empty JSON string", Erc1155Request.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Erc1155Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Erc1155Request` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("to") != null && !jsonObj.get("to").isJsonNull()) && !jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if ((jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) && !jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      if ((jsonObj.get("input") != null && !jsonObj.get("input").isJsonNull()) && !jsonObj.get("input").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `input` to be a primitive type in the JSON string but got `%s`", jsonObj.get("input").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("nonce") != null && !jsonObj.get("nonce").isJsonNull()) && !jsonObj.get("nonce").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nonce` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nonce").toString()));
      }
      if ((jsonObj.get("gas") != null && !jsonObj.get("gas").isJsonNull()) && !jsonObj.get("gas").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gas` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gas").toString()));
      }
      if ((jsonObj.get("gasPrice") != null && !jsonObj.get("gasPrice").isJsonNull()) && !jsonObj.get("gasPrice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gasPrice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gasPrice").toString()));
      }
      if ((jsonObj.get("chain_id") != null && !jsonObj.get("chain_id").isJsonNull()) && !jsonObj.get("chain_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chain_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chain_id").toString()));
      }
      if ((jsonObj.get("encoding") != null && !jsonObj.get("encoding").isJsonNull()) && !jsonObj.get("encoding").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encoding` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encoding").toString()));
      }
      if ((jsonObj.get("contract_address") != null && !jsonObj.get("contract_address").isJsonNull()) && !jsonObj.get("contract_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_address").toString()));
      }
      if ((jsonObj.get("token_id") != null && !jsonObj.get("token_id").isJsonNull()) && !jsonObj.get("token_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_id").toString()));
      }
      if ((jsonObj.get("token_ids") != null && !jsonObj.get("token_ids").isJsonNull()) && !jsonObj.get("token_ids").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_ids` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Erc1155Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Erc1155Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Erc1155Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Erc1155Request.class));

       return (TypeAdapter<T>) new TypeAdapter<Erc1155Request>() {
           @Override
           public void write(JsonWriter out, Erc1155Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Erc1155Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Erc1155Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Erc1155Request
  * @throws IOException if the JSON string is invalid with respect to Erc1155Request
  */
  public static Erc1155Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Erc1155Request.class);
  }

 /**
  * Convert an instance of Erc1155Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

