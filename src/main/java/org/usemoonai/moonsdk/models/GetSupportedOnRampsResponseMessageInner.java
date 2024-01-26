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
import org.usemoonai.moonsdk.models.GetSupportedOnRampsResponseMessageInnerIcons;

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
 * GetSupportedOnRampsResponseMessageInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-26T19:21:21.691562056+10:00[Australia/Brisbane]")
public class GetSupportedOnRampsResponseMessageInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_ICONS = "icons";
  @SerializedName(SERIALIZED_NAME_ICONS)
  private GetSupportedOnRampsResponseMessageInnerIcons icons;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public GetSupportedOnRampsResponseMessageInner() {
  }

  public GetSupportedOnRampsResponseMessageInner id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public GetSupportedOnRampsResponseMessageInner displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nonnull
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public GetSupportedOnRampsResponseMessageInner icons(GetSupportedOnRampsResponseMessageInnerIcons icons) {
    this.icons = icons;
    return this;
  }

   /**
   * Get icons
   * @return icons
  **/
  @javax.annotation.Nonnull
  public GetSupportedOnRampsResponseMessageInnerIcons getIcons() {
    return icons;
  }

  public void setIcons(GetSupportedOnRampsResponseMessageInnerIcons icons) {
    this.icons = icons;
  }


  public GetSupportedOnRampsResponseMessageInner icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @javax.annotation.Nonnull
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSupportedOnRampsResponseMessageInner getSupportedOnRampsResponseMessageInner = (GetSupportedOnRampsResponseMessageInner) o;
    return Objects.equals(this.id, getSupportedOnRampsResponseMessageInner.id) &&
        Objects.equals(this.displayName, getSupportedOnRampsResponseMessageInner.displayName) &&
        Objects.equals(this.icons, getSupportedOnRampsResponseMessageInner.icons) &&
        Objects.equals(this.icon, getSupportedOnRampsResponseMessageInner.icon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, icons, icon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSupportedOnRampsResponseMessageInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    icons: ").append(toIndentedString(icons)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("displayName");
    openapiFields.add("icons");
    openapiFields.add("icon");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("icons");
    openapiRequiredFields.add("icon");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetSupportedOnRampsResponseMessageInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetSupportedOnRampsResponseMessageInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetSupportedOnRampsResponseMessageInner is not found in the empty JSON string", GetSupportedOnRampsResponseMessageInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetSupportedOnRampsResponseMessageInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetSupportedOnRampsResponseMessageInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetSupportedOnRampsResponseMessageInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      // validate the required field `icons`
      GetSupportedOnRampsResponseMessageInnerIcons.validateJsonElement(jsonObj.get("icons"));
      if (!jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetSupportedOnRampsResponseMessageInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetSupportedOnRampsResponseMessageInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetSupportedOnRampsResponseMessageInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetSupportedOnRampsResponseMessageInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetSupportedOnRampsResponseMessageInner>() {
           @Override
           public void write(JsonWriter out, GetSupportedOnRampsResponseMessageInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetSupportedOnRampsResponseMessageInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetSupportedOnRampsResponseMessageInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetSupportedOnRampsResponseMessageInner
  * @throws IOException if the JSON string is invalid with respect to GetSupportedOnRampsResponseMessageInner
  */
  public static GetSupportedOnRampsResponseMessageInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetSupportedOnRampsResponseMessageInner.class);
  }

 /**
  * Convert an instance of GetSupportedOnRampsResponseMessageInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
