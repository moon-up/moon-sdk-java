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
import org.usemoonai.moonsdk.models.AbiInput;
import org.usemoonai.moonsdk.models.AbiOutput;

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
 * The abi to parse the log object of the contract
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-26T19:21:21.691562056+10:00[Australia/Brisbane]")
public class AbiItem {
  public static final String SERIALIZED_NAME_ANONYMOUS = "anonymous";
  @SerializedName(SERIALIZED_NAME_ANONYMOUS)
  private Boolean anonymous;

  public static final String SERIALIZED_NAME_CONSTANT = "constant";
  @SerializedName(SERIALIZED_NAME_CONSTANT)
  private Boolean constant;

  public static final String SERIALIZED_NAME_INPUTS = "inputs";
  @SerializedName(SERIALIZED_NAME_INPUTS)
  private List<AbiInput> inputs;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OUTPUTS = "outputs";
  @SerializedName(SERIALIZED_NAME_OUTPUTS)
  private List<AbiOutput> outputs;

  public static final String SERIALIZED_NAME_PAYABLE = "payable";
  @SerializedName(SERIALIZED_NAME_PAYABLE)
  private Boolean payable;

  public static final String SERIALIZED_NAME_STATE_MUTABILITY = "stateMutability";
  @SerializedName(SERIALIZED_NAME_STATE_MUTABILITY)
  private String stateMutability;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_GAS = "gas";
  @SerializedName(SERIALIZED_NAME_GAS)
  private Double gas;

  public AbiItem() {
  }

  public AbiItem anonymous(Boolean anonymous) {
    this.anonymous = anonymous;
    return this;
  }

   /**
   * Get anonymous
   * @return anonymous
  **/
  @javax.annotation.Nullable
  public Boolean getAnonymous() {
    return anonymous;
  }

  public void setAnonymous(Boolean anonymous) {
    this.anonymous = anonymous;
  }


  public AbiItem constant(Boolean constant) {
    this.constant = constant;
    return this;
  }

   /**
   * Get constant
   * @return constant
  **/
  @javax.annotation.Nullable
  public Boolean getConstant() {
    return constant;
  }

  public void setConstant(Boolean constant) {
    this.constant = constant;
  }


  public AbiItem inputs(List<AbiInput> inputs) {
    this.inputs = inputs;
    return this;
  }

  public AbiItem addInputsItem(AbiInput inputsItem) {
    if (this.inputs == null) {
      this.inputs = new ArrayList<>();
    }
    this.inputs.add(inputsItem);
    return this;
  }

   /**
   * Get inputs
   * @return inputs
  **/
  @javax.annotation.Nullable
  public List<AbiInput> getInputs() {
    return inputs;
  }

  public void setInputs(List<AbiInput> inputs) {
    this.inputs = inputs;
  }


  public AbiItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AbiItem outputs(List<AbiOutput> outputs) {
    this.outputs = outputs;
    return this;
  }

  public AbiItem addOutputsItem(AbiOutput outputsItem) {
    if (this.outputs == null) {
      this.outputs = new ArrayList<>();
    }
    this.outputs.add(outputsItem);
    return this;
  }

   /**
   * Get outputs
   * @return outputs
  **/
  @javax.annotation.Nullable
  public List<AbiOutput> getOutputs() {
    return outputs;
  }

  public void setOutputs(List<AbiOutput> outputs) {
    this.outputs = outputs;
  }


  public AbiItem payable(Boolean payable) {
    this.payable = payable;
    return this;
  }

   /**
   * Get payable
   * @return payable
  **/
  @javax.annotation.Nullable
  public Boolean getPayable() {
    return payable;
  }

  public void setPayable(Boolean payable) {
    this.payable = payable;
  }


  public AbiItem stateMutability(String stateMutability) {
    this.stateMutability = stateMutability;
    return this;
  }

   /**
   * Get stateMutability
   * @return stateMutability
  **/
  @javax.annotation.Nullable
  public String getStateMutability() {
    return stateMutability;
  }

  public void setStateMutability(String stateMutability) {
    this.stateMutability = stateMutability;
  }


  public AbiItem type(String type) {
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


  public AbiItem gas(Double gas) {
    this.gas = gas;
    return this;
  }

   /**
   * Get gas
   * @return gas
  **/
  @javax.annotation.Nullable
  public Double getGas() {
    return gas;
  }

  public void setGas(Double gas) {
    this.gas = gas;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbiItem abiItem = (AbiItem) o;
    return Objects.equals(this.anonymous, abiItem.anonymous) &&
        Objects.equals(this.constant, abiItem.constant) &&
        Objects.equals(this.inputs, abiItem.inputs) &&
        Objects.equals(this.name, abiItem.name) &&
        Objects.equals(this.outputs, abiItem.outputs) &&
        Objects.equals(this.payable, abiItem.payable) &&
        Objects.equals(this.stateMutability, abiItem.stateMutability) &&
        Objects.equals(this.type, abiItem.type) &&
        Objects.equals(this.gas, abiItem.gas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anonymous, constant, inputs, name, outputs, payable, stateMutability, type, gas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbiItem {\n");
    sb.append("    anonymous: ").append(toIndentedString(anonymous)).append("\n");
    sb.append("    constant: ").append(toIndentedString(constant)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    payable: ").append(toIndentedString(payable)).append("\n");
    sb.append("    stateMutability: ").append(toIndentedString(stateMutability)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    gas: ").append(toIndentedString(gas)).append("\n");
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
    openapiFields.add("anonymous");
    openapiFields.add("constant");
    openapiFields.add("inputs");
    openapiFields.add("name");
    openapiFields.add("outputs");
    openapiFields.add("payable");
    openapiFields.add("stateMutability");
    openapiFields.add("type");
    openapiFields.add("gas");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AbiItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AbiItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AbiItem is not found in the empty JSON string", AbiItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AbiItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AbiItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AbiItem.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("inputs") != null && !jsonObj.get("inputs").isJsonNull()) {
        JsonArray jsonArrayinputs = jsonObj.getAsJsonArray("inputs");
        if (jsonArrayinputs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("inputs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `inputs` to be an array in the JSON string but got `%s`", jsonObj.get("inputs").toString()));
          }

          // validate the optional field `inputs` (array)
          for (int i = 0; i < jsonArrayinputs.size(); i++) {
            AbiInput.validateJsonElement(jsonArrayinputs.get(i));
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("outputs") != null && !jsonObj.get("outputs").isJsonNull()) {
        JsonArray jsonArrayoutputs = jsonObj.getAsJsonArray("outputs");
        if (jsonArrayoutputs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("outputs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `outputs` to be an array in the JSON string but got `%s`", jsonObj.get("outputs").toString()));
          }

          // validate the optional field `outputs` (array)
          for (int i = 0; i < jsonArrayoutputs.size(); i++) {
            AbiOutput.validateJsonElement(jsonArrayoutputs.get(i));
          };
        }
      }
      if ((jsonObj.get("stateMutability") != null && !jsonObj.get("stateMutability").isJsonNull()) && !jsonObj.get("stateMutability").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stateMutability` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stateMutability").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AbiItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AbiItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AbiItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AbiItem.class));

       return (TypeAdapter<T>) new TypeAdapter<AbiItem>() {
           @Override
           public void write(JsonWriter out, AbiItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AbiItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AbiItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AbiItem
  * @throws IOException if the JSON string is invalid with respect to AbiItem
  */
  public static AbiItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AbiItem.class);
  }

 /**
  * Convert an instance of AbiItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

