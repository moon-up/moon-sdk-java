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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.usemoonai.moonsdk.models.GetSupportedOnRampsResponseMessageInner;

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
 * GetSupportedOnRampsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T13:07:28.038327556+10:00[Australia/Brisbane]", comments = "Generator version: 7.4.0")
public class GetSupportedOnRampsResponse {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private List<GetSupportedOnRampsResponseMessageInner> message = new ArrayList<>();

  public GetSupportedOnRampsResponse() {
  }

  public GetSupportedOnRampsResponse message(List<GetSupportedOnRampsResponseMessageInner> message) {
    this.message = message;
    return this;
  }

  public GetSupportedOnRampsResponse addMessageItem(GetSupportedOnRampsResponseMessageInner messageItem) {
    if (this.message == null) {
      this.message = new ArrayList<>();
    }
    this.message.add(messageItem);
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  public List<GetSupportedOnRampsResponseMessageInner> getMessage() {
    return message;
  }

  public void setMessage(List<GetSupportedOnRampsResponseMessageInner> message) {
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
    GetSupportedOnRampsResponse getSupportedOnRampsResponse = (GetSupportedOnRampsResponse) o;
    return Objects.equals(this.message, getSupportedOnRampsResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSupportedOnRampsResponse {\n");
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
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("message");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetSupportedOnRampsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetSupportedOnRampsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetSupportedOnRampsResponse is not found in the empty JSON string", GetSupportedOnRampsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetSupportedOnRampsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetSupportedOnRampsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetSupportedOnRampsResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("message").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be an array in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }

      JsonArray jsonArraymessage = jsonObj.getAsJsonArray("message");
      // validate the required field `message` (array)
      for (int i = 0; i < jsonArraymessage.size(); i++) {
        GetSupportedOnRampsResponseMessageInner.validateJsonElement(jsonArraymessage.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetSupportedOnRampsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetSupportedOnRampsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetSupportedOnRampsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetSupportedOnRampsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetSupportedOnRampsResponse>() {
           @Override
           public void write(JsonWriter out, GetSupportedOnRampsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetSupportedOnRampsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetSupportedOnRampsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetSupportedOnRampsResponse
  * @throws IOException if the JSON string is invalid with respect to GetSupportedOnRampsResponse
  */
  public static GetSupportedOnRampsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetSupportedOnRampsResponse.class);
  }

 /**
  * Convert an instance of GetSupportedOnRampsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

