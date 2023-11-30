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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.TriggerOutput;

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
 * IERC20Transfer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T19:39:59.155569+10:00[Australia/Brisbane]")
public class IERC20Transfer {
  public static final String SERIALIZED_NAME_TRANSACTION_HASH = "transactionHash";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_HASH)
  private String transactionHash;

  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  private String contract;

  public static final String SERIALIZED_NAME_LOG_INDEX = "logIndex";
  @SerializedName(SERIALIZED_NAME_LOG_INDEX)
  private String logIndex;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_TOKEN_DECIMALS = "tokenDecimals";
  @SerializedName(SERIALIZED_NAME_TOKEN_DECIMALS)
  private String tokenDecimals;

  public static final String SERIALIZED_NAME_TOKEN_NAME = "tokenName";
  @SerializedName(SERIALIZED_NAME_TOKEN_NAME)
  private String tokenName;

  public static final String SERIALIZED_NAME_TOKEN_SYMBOL = "tokenSymbol";
  @SerializedName(SERIALIZED_NAME_TOKEN_SYMBOL)
  private String tokenSymbol;

  public static final String SERIALIZED_NAME_VALUE_WITH_DECIMALS = "valueWithDecimals";
  @SerializedName(SERIALIZED_NAME_VALUE_WITH_DECIMALS)
  private String valueWithDecimals;

  public static final String SERIALIZED_NAME_TRIGGERS = "triggers";
  @SerializedName(SERIALIZED_NAME_TRIGGERS)
  private List<TriggerOutput> triggers;

  public IERC20Transfer() {
  }

  public IERC20Transfer transactionHash(String transactionHash) {
    
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * Get transactionHash
   * @return transactionHash
  **/
  @javax.annotation.Nonnull
  public String getTransactionHash() {
    return transactionHash;
  }


  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }


  public IERC20Transfer contract(String contract) {
    
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  @javax.annotation.Nonnull
  public String getContract() {
    return contract;
  }


  public void setContract(String contract) {
    this.contract = contract;
  }


  public IERC20Transfer logIndex(String logIndex) {
    
    this.logIndex = logIndex;
    return this;
  }

   /**
   * Get logIndex
   * @return logIndex
  **/
  @javax.annotation.Nonnull
  public String getLogIndex() {
    return logIndex;
  }


  public void setLogIndex(String logIndex) {
    this.logIndex = logIndex;
  }


  public IERC20Transfer from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nonnull
  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public IERC20Transfer to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @javax.annotation.Nonnull
  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public IERC20Transfer value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nonnull
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public IERC20Transfer tokenDecimals(String tokenDecimals) {
    
    this.tokenDecimals = tokenDecimals;
    return this;
  }

   /**
   * Get tokenDecimals
   * @return tokenDecimals
  **/
  @javax.annotation.Nonnull
  public String getTokenDecimals() {
    return tokenDecimals;
  }


  public void setTokenDecimals(String tokenDecimals) {
    this.tokenDecimals = tokenDecimals;
  }


  public IERC20Transfer tokenName(String tokenName) {
    
    this.tokenName = tokenName;
    return this;
  }

   /**
   * Get tokenName
   * @return tokenName
  **/
  @javax.annotation.Nonnull
  public String getTokenName() {
    return tokenName;
  }


  public void setTokenName(String tokenName) {
    this.tokenName = tokenName;
  }


  public IERC20Transfer tokenSymbol(String tokenSymbol) {
    
    this.tokenSymbol = tokenSymbol;
    return this;
  }

   /**
   * Get tokenSymbol
   * @return tokenSymbol
  **/
  @javax.annotation.Nonnull
  public String getTokenSymbol() {
    return tokenSymbol;
  }


  public void setTokenSymbol(String tokenSymbol) {
    this.tokenSymbol = tokenSymbol;
  }


  public IERC20Transfer valueWithDecimals(String valueWithDecimals) {
    
    this.valueWithDecimals = valueWithDecimals;
    return this;
  }

   /**
   * Get valueWithDecimals
   * @return valueWithDecimals
  **/
  @javax.annotation.Nullable
  public String getValueWithDecimals() {
    return valueWithDecimals;
  }


  public void setValueWithDecimals(String valueWithDecimals) {
    this.valueWithDecimals = valueWithDecimals;
  }


  public IERC20Transfer triggers(List<TriggerOutput> triggers) {
    
    this.triggers = triggers;
    return this;
  }

  public IERC20Transfer addTriggersItem(TriggerOutput triggersItem) {
    if (this.triggers == null) {
      this.triggers = new ArrayList<>();
    }
    this.triggers.add(triggersItem);
    return this;
  }

   /**
   * Get triggers
   * @return triggers
  **/
  @javax.annotation.Nullable
  public List<TriggerOutput> getTriggers() {
    return triggers;
  }


  public void setTriggers(List<TriggerOutput> triggers) {
    this.triggers = triggers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IERC20Transfer ieRC20Transfer = (IERC20Transfer) o;
    return Objects.equals(this.transactionHash, ieRC20Transfer.transactionHash) &&
        Objects.equals(this.contract, ieRC20Transfer.contract) &&
        Objects.equals(this.logIndex, ieRC20Transfer.logIndex) &&
        Objects.equals(this.from, ieRC20Transfer.from) &&
        Objects.equals(this.to, ieRC20Transfer.to) &&
        Objects.equals(this.value, ieRC20Transfer.value) &&
        Objects.equals(this.tokenDecimals, ieRC20Transfer.tokenDecimals) &&
        Objects.equals(this.tokenName, ieRC20Transfer.tokenName) &&
        Objects.equals(this.tokenSymbol, ieRC20Transfer.tokenSymbol) &&
        Objects.equals(this.valueWithDecimals, ieRC20Transfer.valueWithDecimals) &&
        Objects.equals(this.triggers, ieRC20Transfer.triggers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionHash, contract, logIndex, from, to, value, tokenDecimals, tokenName, tokenSymbol, valueWithDecimals, triggers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IERC20Transfer {\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    logIndex: ").append(toIndentedString(logIndex)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    tokenDecimals: ").append(toIndentedString(tokenDecimals)).append("\n");
    sb.append("    tokenName: ").append(toIndentedString(tokenName)).append("\n");
    sb.append("    tokenSymbol: ").append(toIndentedString(tokenSymbol)).append("\n");
    sb.append("    valueWithDecimals: ").append(toIndentedString(valueWithDecimals)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
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
    openapiFields.add("transactionHash");
    openapiFields.add("contract");
    openapiFields.add("logIndex");
    openapiFields.add("from");
    openapiFields.add("to");
    openapiFields.add("value");
    openapiFields.add("tokenDecimals");
    openapiFields.add("tokenName");
    openapiFields.add("tokenSymbol");
    openapiFields.add("valueWithDecimals");
    openapiFields.add("triggers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("transactionHash");
    openapiRequiredFields.add("contract");
    openapiRequiredFields.add("logIndex");
    openapiRequiredFields.add("from");
    openapiRequiredFields.add("to");
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("tokenDecimals");
    openapiRequiredFields.add("tokenName");
    openapiRequiredFields.add("tokenSymbol");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IERC20Transfer
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IERC20Transfer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IERC20Transfer is not found in the empty JSON string", IERC20Transfer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IERC20Transfer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IERC20Transfer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IERC20Transfer.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("transactionHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionHash").toString()));
      }
      if (!jsonObj.get("contract").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract").toString()));
      }
      if (!jsonObj.get("logIndex").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logIndex` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logIndex").toString()));
      }
      if (!jsonObj.get("from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from").toString()));
      }
      if (!jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if (!jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if (!jsonObj.get("tokenDecimals").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tokenDecimals` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tokenDecimals").toString()));
      }
      if (!jsonObj.get("tokenName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tokenName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tokenName").toString()));
      }
      if (!jsonObj.get("tokenSymbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tokenSymbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tokenSymbol").toString()));
      }
      if ((jsonObj.get("valueWithDecimals") != null && !jsonObj.get("valueWithDecimals").isJsonNull()) && !jsonObj.get("valueWithDecimals").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valueWithDecimals` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valueWithDecimals").toString()));
      }
      if (jsonObj.get("triggers") != null && !jsonObj.get("triggers").isJsonNull()) {
        JsonArray jsonArraytriggers = jsonObj.getAsJsonArray("triggers");
        if (jsonArraytriggers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("triggers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `triggers` to be an array in the JSON string but got `%s`", jsonObj.get("triggers").toString()));
          }

          // validate the optional field `triggers` (array)
          for (int i = 0; i < jsonArraytriggers.size(); i++) {
            TriggerOutput.validateJsonElement(jsonArraytriggers.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IERC20Transfer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IERC20Transfer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IERC20Transfer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IERC20Transfer.class));

       return (TypeAdapter<T>) new TypeAdapter<IERC20Transfer>() {
           @Override
           public void write(JsonWriter out, IERC20Transfer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IERC20Transfer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IERC20Transfer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IERC20Transfer
  * @throws IOException if the JSON string is invalid with respect to IERC20Transfer
  */
  public static IERC20Transfer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IERC20Transfer.class);
  }

 /**
  * Convert an instance of IERC20Transfer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
