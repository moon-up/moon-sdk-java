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
import org.usemoonai.moonsdk.models.InputBody;
import org.usemoonai.moonsdk.models.Transaction;
import org.usemoonai.moonsdk.models.TransactionData;
import org.usemoonai.moonsdk.models.TransactionResponse;
import org.usemoonai.moonsdk.models.TransactionResponseTx;

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
 * ConveyorFinanceControllerResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-18T13:51:42.356170421+10:00[Australia/Brisbane]")
public class ConveyorFinanceControllerResponse {
  public static final String SERIALIZED_NAME_INPUT = "input";
  @SerializedName(SERIALIZED_NAME_INPUT)
  private InputBody input;

  public static final String SERIALIZED_NAME_CONVEY = "convey";
  @SerializedName(SERIALIZED_NAME_CONVEY)
  private TransactionResponse convey;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private TransactionData data;

  public static final String SERIALIZED_NAME_TX = "tx";
  @SerializedName(SERIALIZED_NAME_TX)
  private TransactionResponseTx tx;

  public static final String SERIALIZED_NAME_SIGNED = "signed";
  @SerializedName(SERIALIZED_NAME_SIGNED)
  private Transaction signed;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public ConveyorFinanceControllerResponse() {
  }

  public ConveyorFinanceControllerResponse input(InputBody input) {
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @javax.annotation.Nullable
  public InputBody getInput() {
    return input;
  }

  public void setInput(InputBody input) {
    this.input = input;
  }


  public ConveyorFinanceControllerResponse convey(TransactionResponse convey) {
    this.convey = convey;
    return this;
  }

   /**
   * Get convey
   * @return convey
  **/
  @javax.annotation.Nullable
  public TransactionResponse getConvey() {
    return convey;
  }

  public void setConvey(TransactionResponse convey) {
    this.convey = convey;
  }


  public ConveyorFinanceControllerResponse data(TransactionData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public TransactionData getData() {
    return data;
  }

  public void setData(TransactionData data) {
    this.data = data;
  }


  public ConveyorFinanceControllerResponse tx(TransactionResponseTx tx) {
    this.tx = tx;
    return this;
  }

   /**
   * Get tx
   * @return tx
  **/
  @javax.annotation.Nullable
  public TransactionResponseTx getTx() {
    return tx;
  }

  public void setTx(TransactionResponseTx tx) {
    this.tx = tx;
  }


  public ConveyorFinanceControllerResponse signed(Transaction signed) {
    this.signed = signed;
    return this;
  }

   /**
   * Get signed
   * @return signed
  **/
  @javax.annotation.Nullable
  public Transaction getSigned() {
    return signed;
  }

  public void setSigned(Transaction signed) {
    this.signed = signed;
  }


  public ConveyorFinanceControllerResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nonnull
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public ConveyorFinanceControllerResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConveyorFinanceControllerResponse conveyorFinanceControllerResponse = (ConveyorFinanceControllerResponse) o;
    return Objects.equals(this.input, conveyorFinanceControllerResponse.input) &&
        Objects.equals(this.convey, conveyorFinanceControllerResponse.convey) &&
        Objects.equals(this.data, conveyorFinanceControllerResponse.data) &&
        Objects.equals(this.tx, conveyorFinanceControllerResponse.tx) &&
        Objects.equals(this.signed, conveyorFinanceControllerResponse.signed) &&
        Objects.equals(this.success, conveyorFinanceControllerResponse.success) &&
        Objects.equals(this.message, conveyorFinanceControllerResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, convey, data, tx, signed, success, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConveyorFinanceControllerResponse {\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    convey: ").append(toIndentedString(convey)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    tx: ").append(toIndentedString(tx)).append("\n");
    sb.append("    signed: ").append(toIndentedString(signed)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("input");
    openapiFields.add("convey");
    openapiFields.add("data");
    openapiFields.add("tx");
    openapiFields.add("signed");
    openapiFields.add("success");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("success");
    openapiRequiredFields.add("message");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ConveyorFinanceControllerResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConveyorFinanceControllerResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConveyorFinanceControllerResponse is not found in the empty JSON string", ConveyorFinanceControllerResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConveyorFinanceControllerResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConveyorFinanceControllerResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConveyorFinanceControllerResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `input`
      if (jsonObj.get("input") != null && !jsonObj.get("input").isJsonNull()) {
        InputBody.validateJsonElement(jsonObj.get("input"));
      }
      // validate the optional field `convey`
      if (jsonObj.get("convey") != null && !jsonObj.get("convey").isJsonNull()) {
        TransactionResponse.validateJsonElement(jsonObj.get("convey"));
      }
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        TransactionData.validateJsonElement(jsonObj.get("data"));
      }
      // validate the optional field `tx`
      if (jsonObj.get("tx") != null && !jsonObj.get("tx").isJsonNull()) {
        TransactionResponseTx.validateJsonElement(jsonObj.get("tx"));
      }
      // validate the optional field `signed`
      if (jsonObj.get("signed") != null && !jsonObj.get("signed").isJsonNull()) {
        Transaction.validateJsonElement(jsonObj.get("signed"));
      }
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConveyorFinanceControllerResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConveyorFinanceControllerResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConveyorFinanceControllerResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConveyorFinanceControllerResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ConveyorFinanceControllerResponse>() {
           @Override
           public void write(JsonWriter out, ConveyorFinanceControllerResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConveyorFinanceControllerResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConveyorFinanceControllerResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConveyorFinanceControllerResponse
  * @throws IOException if the JSON string is invalid with respect to ConveyorFinanceControllerResponse
  */
  public static ConveyorFinanceControllerResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConveyorFinanceControllerResponse.class);
  }

 /**
  * Convert an instance of ConveyorFinanceControllerResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

