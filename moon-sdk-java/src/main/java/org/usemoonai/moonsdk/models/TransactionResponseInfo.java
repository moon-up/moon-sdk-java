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
 * TransactionResponseInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T13:07:28.038327556+10:00[Australia/Brisbane]", comments = "Generator version: 7.4.0")
public class TransactionResponseInfo {
  public static final String SERIALIZED_NAME_CONVEYOR_GAS = "conveyorGas";
  @SerializedName(SERIALIZED_NAME_CONVEYOR_GAS)
  private String conveyorGas;

  public static final String SERIALIZED_NAME_AFFILIATE_GAS = "affiliateGas";
  @SerializedName(SERIALIZED_NAME_AFFILIATE_GAS)
  private String affiliateGas;

  public static final String SERIALIZED_NAME_AFFILIATE_AGGREGATOR = "affiliateAggregator";
  @SerializedName(SERIALIZED_NAME_AFFILIATE_AGGREGATOR)
  private String affiliateAggregator;

  public static final String SERIALIZED_NAME_AMOUNT_OUT = "amountOut";
  @SerializedName(SERIALIZED_NAME_AMOUNT_OUT)
  private String amountOut;

  public static final String SERIALIZED_NAME_AMOUNT_OUT_MIN = "amountOutMin";
  @SerializedName(SERIALIZED_NAME_AMOUNT_OUT_MIN)
  private String amountOutMin;

  public TransactionResponseInfo() {
  }

  public TransactionResponseInfo conveyorGas(String conveyorGas) {
    this.conveyorGas = conveyorGas;
    return this;
  }

   /**
   * Get conveyorGas
   * @return conveyorGas
  **/
  @javax.annotation.Nonnull
  public String getConveyorGas() {
    return conveyorGas;
  }

  public void setConveyorGas(String conveyorGas) {
    this.conveyorGas = conveyorGas;
  }


  public TransactionResponseInfo affiliateGas(String affiliateGas) {
    this.affiliateGas = affiliateGas;
    return this;
  }

   /**
   * Get affiliateGas
   * @return affiliateGas
  **/
  @javax.annotation.Nonnull
  public String getAffiliateGas() {
    return affiliateGas;
  }

  public void setAffiliateGas(String affiliateGas) {
    this.affiliateGas = affiliateGas;
  }


  public TransactionResponseInfo affiliateAggregator(String affiliateAggregator) {
    this.affiliateAggregator = affiliateAggregator;
    return this;
  }

   /**
   * Get affiliateAggregator
   * @return affiliateAggregator
  **/
  @javax.annotation.Nonnull
  public String getAffiliateAggregator() {
    return affiliateAggregator;
  }

  public void setAffiliateAggregator(String affiliateAggregator) {
    this.affiliateAggregator = affiliateAggregator;
  }


  public TransactionResponseInfo amountOut(String amountOut) {
    this.amountOut = amountOut;
    return this;
  }

   /**
   * Get amountOut
   * @return amountOut
  **/
  @javax.annotation.Nonnull
  public String getAmountOut() {
    return amountOut;
  }

  public void setAmountOut(String amountOut) {
    this.amountOut = amountOut;
  }


  public TransactionResponseInfo amountOutMin(String amountOutMin) {
    this.amountOutMin = amountOutMin;
    return this;
  }

   /**
   * Get amountOutMin
   * @return amountOutMin
  **/
  @javax.annotation.Nonnull
  public String getAmountOutMin() {
    return amountOutMin;
  }

  public void setAmountOutMin(String amountOutMin) {
    this.amountOutMin = amountOutMin;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionResponseInfo transactionResponseInfo = (TransactionResponseInfo) o;
    return Objects.equals(this.conveyorGas, transactionResponseInfo.conveyorGas) &&
        Objects.equals(this.affiliateGas, transactionResponseInfo.affiliateGas) &&
        Objects.equals(this.affiliateAggregator, transactionResponseInfo.affiliateAggregator) &&
        Objects.equals(this.amountOut, transactionResponseInfo.amountOut) &&
        Objects.equals(this.amountOutMin, transactionResponseInfo.amountOutMin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conveyorGas, affiliateGas, affiliateAggregator, amountOut, amountOutMin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionResponseInfo {\n");
    sb.append("    conveyorGas: ").append(toIndentedString(conveyorGas)).append("\n");
    sb.append("    affiliateGas: ").append(toIndentedString(affiliateGas)).append("\n");
    sb.append("    affiliateAggregator: ").append(toIndentedString(affiliateAggregator)).append("\n");
    sb.append("    amountOut: ").append(toIndentedString(amountOut)).append("\n");
    sb.append("    amountOutMin: ").append(toIndentedString(amountOutMin)).append("\n");
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
    openapiFields.add("conveyorGas");
    openapiFields.add("affiliateGas");
    openapiFields.add("affiliateAggregator");
    openapiFields.add("amountOut");
    openapiFields.add("amountOutMin");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("conveyorGas");
    openapiRequiredFields.add("affiliateGas");
    openapiRequiredFields.add("affiliateAggregator");
    openapiRequiredFields.add("amountOut");
    openapiRequiredFields.add("amountOutMin");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TransactionResponseInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionResponseInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionResponseInfo is not found in the empty JSON string", TransactionResponseInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TransactionResponseInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionResponseInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionResponseInfo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("conveyorGas").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conveyorGas` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conveyorGas").toString()));
      }
      if (!jsonObj.get("affiliateGas").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `affiliateGas` to be a primitive type in the JSON string but got `%s`", jsonObj.get("affiliateGas").toString()));
      }
      if (!jsonObj.get("affiliateAggregator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `affiliateAggregator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("affiliateAggregator").toString()));
      }
      if (!jsonObj.get("amountOut").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amountOut` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amountOut").toString()));
      }
      if (!jsonObj.get("amountOutMin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amountOutMin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amountOutMin").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionResponseInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionResponseInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionResponseInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionResponseInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionResponseInfo>() {
           @Override
           public void write(JsonWriter out, TransactionResponseInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionResponseInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionResponseInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionResponseInfo
  * @throws IOException if the JSON string is invalid with respect to TransactionResponseInfo
  */
  public static TransactionResponseInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionResponseInfo.class);
  }

 /**
  * Convert an instance of TransactionResponseInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

