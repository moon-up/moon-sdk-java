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
import org.usemoonai.moonsdk.models.TransactionInputMetaData;
import org.usemoonai.moonsdk.models.TransactionInputSupportedParams;
import org.usemoonai.moonsdk.models.TransactionInputWallet;

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
 * TransactionInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T13:07:28.038327556+10:00[Australia/Brisbane]", comments = "Generator version: 7.4.0")
public class TransactionInput {
  public static final String SERIALIZED_NAME_SUPPORTED_PARAMS = "supportedParams";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_PARAMS)
  private TransactionInputSupportedParams supportedParams;

  public static final String SERIALIZED_NAME_WALLET = "wallet";
  @SerializedName(SERIALIZED_NAME_WALLET)
  private TransactionInputWallet wallet;

  public static final String SERIALIZED_NAME_META_DATA = "metaData";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  private TransactionInputMetaData metaData;

  public static final String SERIALIZED_NAME_ORIGINATING_HOST = "originatingHost";
  @SerializedName(SERIALIZED_NAME_ORIGINATING_HOST)
  private String originatingHost;

  public static final String SERIALIZED_NAME_PARTNER_CONTEXT = "partnerContext";
  @SerializedName(SERIALIZED_NAME_PARTNER_CONTEXT)
  private String partnerContext;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "paymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private String paymentMethod;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private String destination;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_ONRAMP = "onramp";
  @SerializedName(SERIALIZED_NAME_ONRAMP)
  private String onramp;

  public TransactionInput() {
  }

  public TransactionInput supportedParams(TransactionInputSupportedParams supportedParams) {
    this.supportedParams = supportedParams;
    return this;
  }

   /**
   * Get supportedParams
   * @return supportedParams
  **/
  @javax.annotation.Nonnull
  public TransactionInputSupportedParams getSupportedParams() {
    return supportedParams;
  }

  public void setSupportedParams(TransactionInputSupportedParams supportedParams) {
    this.supportedParams = supportedParams;
  }


  public TransactionInput wallet(TransactionInputWallet wallet) {
    this.wallet = wallet;
    return this;
  }

   /**
   * Get wallet
   * @return wallet
  **/
  @javax.annotation.Nonnull
  public TransactionInputWallet getWallet() {
    return wallet;
  }

  public void setWallet(TransactionInputWallet wallet) {
    this.wallet = wallet;
  }


  public TransactionInput metaData(TransactionInputMetaData metaData) {
    this.metaData = metaData;
    return this;
  }

   /**
   * Get metaData
   * @return metaData
  **/
  @javax.annotation.Nonnull
  public TransactionInputMetaData getMetaData() {
    return metaData;
  }

  public void setMetaData(TransactionInputMetaData metaData) {
    this.metaData = metaData;
  }


  public TransactionInput originatingHost(String originatingHost) {
    this.originatingHost = originatingHost;
    return this;
  }

   /**
   * Get originatingHost
   * @return originatingHost
  **/
  @javax.annotation.Nonnull
  public String getOriginatingHost() {
    return originatingHost;
  }

  public void setOriginatingHost(String originatingHost) {
    this.originatingHost = originatingHost;
  }


  public TransactionInput partnerContext(String partnerContext) {
    this.partnerContext = partnerContext;
    return this;
  }

   /**
   * Get partnerContext
   * @return partnerContext
  **/
  @javax.annotation.Nonnull
  public String getPartnerContext() {
    return partnerContext;
  }

  public void setPartnerContext(String partnerContext) {
    this.partnerContext = partnerContext;
  }


  public TransactionInput uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nonnull
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public TransactionInput network(String network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nonnull
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }


  public TransactionInput paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nonnull
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public TransactionInput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public TransactionInput amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public TransactionInput destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @javax.annotation.Nonnull
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }


  public TransactionInput source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nonnull
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  public TransactionInput onramp(String onramp) {
    this.onramp = onramp;
    return this;
  }

   /**
   * Get onramp
   * @return onramp
  **/
  @javax.annotation.Nonnull
  public String getOnramp() {
    return onramp;
  }

  public void setOnramp(String onramp) {
    this.onramp = onramp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionInput transactionInput = (TransactionInput) o;
    return Objects.equals(this.supportedParams, transactionInput.supportedParams) &&
        Objects.equals(this.wallet, transactionInput.wallet) &&
        Objects.equals(this.metaData, transactionInput.metaData) &&
        Objects.equals(this.originatingHost, transactionInput.originatingHost) &&
        Objects.equals(this.partnerContext, transactionInput.partnerContext) &&
        Objects.equals(this.uuid, transactionInput.uuid) &&
        Objects.equals(this.network, transactionInput.network) &&
        Objects.equals(this.paymentMethod, transactionInput.paymentMethod) &&
        Objects.equals(this.type, transactionInput.type) &&
        Objects.equals(this.amount, transactionInput.amount) &&
        Objects.equals(this.destination, transactionInput.destination) &&
        Objects.equals(this.source, transactionInput.source) &&
        Objects.equals(this.onramp, transactionInput.onramp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedParams, wallet, metaData, originatingHost, partnerContext, uuid, network, paymentMethod, type, amount, destination, source, onramp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInput {\n");
    sb.append("    supportedParams: ").append(toIndentedString(supportedParams)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    originatingHost: ").append(toIndentedString(originatingHost)).append("\n");
    sb.append("    partnerContext: ").append(toIndentedString(partnerContext)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    onramp: ").append(toIndentedString(onramp)).append("\n");
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
    openapiFields.add("supportedParams");
    openapiFields.add("wallet");
    openapiFields.add("metaData");
    openapiFields.add("originatingHost");
    openapiFields.add("partnerContext");
    openapiFields.add("uuid");
    openapiFields.add("network");
    openapiFields.add("paymentMethod");
    openapiFields.add("type");
    openapiFields.add("amount");
    openapiFields.add("destination");
    openapiFields.add("source");
    openapiFields.add("onramp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("supportedParams");
    openapiRequiredFields.add("wallet");
    openapiRequiredFields.add("metaData");
    openapiRequiredFields.add("originatingHost");
    openapiRequiredFields.add("partnerContext");
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("network");
    openapiRequiredFields.add("paymentMethod");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("destination");
    openapiRequiredFields.add("source");
    openapiRequiredFields.add("onramp");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TransactionInput
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionInput is not found in the empty JSON string", TransactionInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TransactionInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `supportedParams`
      TransactionInputSupportedParams.validateJsonElement(jsonObj.get("supportedParams"));
      // validate the required field `wallet`
      TransactionInputWallet.validateJsonElement(jsonObj.get("wallet"));
      // validate the required field `metaData`
      TransactionInputMetaData.validateJsonElement(jsonObj.get("metaData"));
      if (!jsonObj.get("originatingHost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originatingHost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originatingHost").toString()));
      }
      if (!jsonObj.get("partnerContext").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerContext` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerContext").toString()));
      }
      if (!jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (!jsonObj.get("network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network").toString()));
      }
      if (!jsonObj.get("paymentMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentMethod").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("destination").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destination").toString()));
      }
      if (!jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if (!jsonObj.get("onramp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `onramp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("onramp").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionInput.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionInput>() {
           @Override
           public void write(JsonWriter out, TransactionInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionInput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionInput
  * @throws IOException if the JSON string is invalid with respect to TransactionInput
  */
  public static TransactionInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionInput.class);
  }

 /**
  * Convert an instance of TransactionInput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

