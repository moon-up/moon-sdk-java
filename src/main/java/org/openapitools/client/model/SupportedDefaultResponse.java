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
import org.openapitools.client.model.SupportedDefaultResponseDefaults;
import org.openapitools.client.model.SupportedDefaultResponseDefaultsId;

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
 * SupportedDefaultResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T19:39:59.155569+10:00[Australia/Brisbane]")
public class SupportedDefaultResponse {
  public static final String SERIALIZED_NAME_DEFAULTS = "defaults";
  @SerializedName(SERIALIZED_NAME_DEFAULTS)
  private SupportedDefaultResponseDefaults defaults;

  public static final String SERIALIZED_NAME_RECOMMENDED = "recommended";
  @SerializedName(SERIALIZED_NAME_RECOMMENDED)
  private SupportedDefaultResponseDefaultsId recommended;

  public SupportedDefaultResponse() {
  }

  public SupportedDefaultResponse defaults(SupportedDefaultResponseDefaults defaults) {
    
    this.defaults = defaults;
    return this;
  }

   /**
   * Get defaults
   * @return defaults
  **/
  @javax.annotation.Nonnull
  public SupportedDefaultResponseDefaults getDefaults() {
    return defaults;
  }


  public void setDefaults(SupportedDefaultResponseDefaults defaults) {
    this.defaults = defaults;
  }


  public SupportedDefaultResponse recommended(SupportedDefaultResponseDefaultsId recommended) {
    
    this.recommended = recommended;
    return this;
  }

   /**
   * Get recommended
   * @return recommended
  **/
  @javax.annotation.Nonnull
  public SupportedDefaultResponseDefaultsId getRecommended() {
    return recommended;
  }


  public void setRecommended(SupportedDefaultResponseDefaultsId recommended) {
    this.recommended = recommended;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedDefaultResponse supportedDefaultResponse = (SupportedDefaultResponse) o;
    return Objects.equals(this.defaults, supportedDefaultResponse.defaults) &&
        Objects.equals(this.recommended, supportedDefaultResponse.recommended);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaults, recommended);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedDefaultResponse {\n");
    sb.append("    defaults: ").append(toIndentedString(defaults)).append("\n");
    sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n");
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
    openapiFields.add("defaults");
    openapiFields.add("recommended");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("defaults");
    openapiRequiredFields.add("recommended");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SupportedDefaultResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SupportedDefaultResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SupportedDefaultResponse is not found in the empty JSON string", SupportedDefaultResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SupportedDefaultResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SupportedDefaultResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SupportedDefaultResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `defaults`
      SupportedDefaultResponseDefaults.validateJsonElement(jsonObj.get("defaults"));
      // validate the required field `recommended`
      SupportedDefaultResponseDefaultsId.validateJsonElement(jsonObj.get("recommended"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SupportedDefaultResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SupportedDefaultResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SupportedDefaultResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SupportedDefaultResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SupportedDefaultResponse>() {
           @Override
           public void write(JsonWriter out, SupportedDefaultResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SupportedDefaultResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SupportedDefaultResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SupportedDefaultResponse
  * @throws IOException if the JSON string is invalid with respect to SupportedDefaultResponse
  */
  public static SupportedDefaultResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SupportedDefaultResponse.class);
  }

 /**
  * Convert an instance of SupportedDefaultResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

