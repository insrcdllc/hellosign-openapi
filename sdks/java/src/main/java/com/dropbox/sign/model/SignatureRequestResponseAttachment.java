/*
 * Dropbox Sign API
 * Dropbox Sign v3 API
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: apisupport@hellosign.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dropbox.sign.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.dropbox.sign.JSON;


import com.dropbox.sign.ApiException;
/**
 * Signer attachments.
 */
@ApiModel(description = "Signer attachments.")
@JsonPropertyOrder({
    SignatureRequestResponseAttachment.JSON_PROPERTY_ID,
    SignatureRequestResponseAttachment.JSON_PROPERTY_SIGNER,
    SignatureRequestResponseAttachment.JSON_PROPERTY_NAME,
    SignatureRequestResponseAttachment.JSON_PROPERTY_REQUIRED,
    SignatureRequestResponseAttachment.JSON_PROPERTY_INSTRUCTIONS,
    SignatureRequestResponseAttachment.JSON_PROPERTY_UPLOADED_AT
})
@JsonIgnoreProperties(ignoreUnknown=true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SignatureRequestResponseAttachment {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SIGNER = "signer";
  private String signer;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REQUIRED = "required";
  private Boolean required;

  public static final String JSON_PROPERTY_INSTRUCTIONS = "instructions";
  private String instructions;

  public static final String JSON_PROPERTY_UPLOADED_AT = "uploaded_at";
  private Integer uploadedAt;

  public SignatureRequestResponseAttachment() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public SignatureRequestResponseAttachment init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, SignatureRequestResponseAttachment.class);
  }

  static public SignatureRequestResponseAttachment init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      SignatureRequestResponseAttachment.class
    );
  }

  public SignatureRequestResponseAttachment id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID for this attachment.
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique ID for this attachment.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public SignatureRequestResponseAttachment signer(String signer) {
    this.signer = signer;
    return this;
  }

   /**
   * The Signer this attachment is assigned to.
   * @return signer
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Signer this attachment is assigned to.")
  @JsonProperty(JSON_PROPERTY_SIGNER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSigner() {
    return signer;
  }


  @JsonProperty(JSON_PROPERTY_SIGNER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSigner(String signer) {
    this.signer = signer;
  }


  public SignatureRequestResponseAttachment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this attachment.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of this attachment.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public SignatureRequestResponseAttachment required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * A boolean value denoting if this attachment is required.
   * @return required
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A boolean value denoting if this attachment is required.")
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getRequired() {
    return required;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequired(Boolean required) {
    this.required = required;
  }


  public SignatureRequestResponseAttachment instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * Instructions for Signer.
   * @return instructions
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Instructions for Signer.")
  @JsonProperty(JSON_PROPERTY_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstructions() {
    return instructions;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }


  public SignatureRequestResponseAttachment uploadedAt(Integer uploadedAt) {
    this.uploadedAt = uploadedAt;
    return this;
  }

   /**
   * Timestamp when attachment was uploaded by Signer.
   * @return uploadedAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when attachment was uploaded by Signer.")
  @JsonProperty(JSON_PROPERTY_UPLOADED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUploadedAt() {
    return uploadedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPLOADED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadedAt(Integer uploadedAt) {
    this.uploadedAt = uploadedAt;
  }


  /**
   * Return true if this SignatureRequestResponseAttachment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureRequestResponseAttachment signatureRequestResponseAttachment = (SignatureRequestResponseAttachment) o;
    return Objects.equals(this.id, signatureRequestResponseAttachment.id) &&
        Objects.equals(this.signer, signatureRequestResponseAttachment.signer) &&
        Objects.equals(this.name, signatureRequestResponseAttachment.name) &&
        Objects.equals(this.required, signatureRequestResponseAttachment.required) &&
        Objects.equals(this.instructions, signatureRequestResponseAttachment.instructions) &&
        Objects.equals(this.uploadedAt, signatureRequestResponseAttachment.uploadedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, signer, name, required, instructions, uploadedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureRequestResponseAttachment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    signer: ").append(toIndentedString(signer)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    uploadedAt: ").append(toIndentedString(uploadedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (id != null) {
        if (isFileTypeOrListOfFiles(id)) {
            fileTypeFound = true;
        }

        if (id.getClass().equals(java.io.File.class) ||
            id.getClass().equals(Integer.class) ||
            id.getClass().equals(String.class) ||
            id.getClass().isEnum()) {
            map.put("id", id);
        } else if (isListOfFile(id)) {
            for(int i = 0; i< getListSize(id); i++) {
                map.put("id[" + i + "]", getFromList(id, i));
            }
        }
        else {
            map.put("id", JSON.getDefault().getMapper().writeValueAsString(id));
        }
    }
    if (signer != null) {
        if (isFileTypeOrListOfFiles(signer)) {
            fileTypeFound = true;
        }

        if (signer.getClass().equals(java.io.File.class) ||
            signer.getClass().equals(Integer.class) ||
            signer.getClass().equals(String.class) ||
            signer.getClass().isEnum()) {
            map.put("signer", signer);
        } else if (isListOfFile(signer)) {
            for(int i = 0; i< getListSize(signer); i++) {
                map.put("signer[" + i + "]", getFromList(signer, i));
            }
        }
        else {
            map.put("signer", JSON.getDefault().getMapper().writeValueAsString(signer));
        }
    }
    if (name != null) {
        if (isFileTypeOrListOfFiles(name)) {
            fileTypeFound = true;
        }

        if (name.getClass().equals(java.io.File.class) ||
            name.getClass().equals(Integer.class) ||
            name.getClass().equals(String.class) ||
            name.getClass().isEnum()) {
            map.put("name", name);
        } else if (isListOfFile(name)) {
            for(int i = 0; i< getListSize(name); i++) {
                map.put("name[" + i + "]", getFromList(name, i));
            }
        }
        else {
            map.put("name", JSON.getDefault().getMapper().writeValueAsString(name));
        }
    }
    if (required != null) {
        if (isFileTypeOrListOfFiles(required)) {
            fileTypeFound = true;
        }

        if (required.getClass().equals(java.io.File.class) ||
            required.getClass().equals(Integer.class) ||
            required.getClass().equals(String.class) ||
            required.getClass().isEnum()) {
            map.put("required", required);
        } else if (isListOfFile(required)) {
            for(int i = 0; i< getListSize(required); i++) {
                map.put("required[" + i + "]", getFromList(required, i));
            }
        }
        else {
            map.put("required", JSON.getDefault().getMapper().writeValueAsString(required));
        }
    }
    if (instructions != null) {
        if (isFileTypeOrListOfFiles(instructions)) {
            fileTypeFound = true;
        }

        if (instructions.getClass().equals(java.io.File.class) ||
            instructions.getClass().equals(Integer.class) ||
            instructions.getClass().equals(String.class) ||
            instructions.getClass().isEnum()) {
            map.put("instructions", instructions);
        } else if (isListOfFile(instructions)) {
            for(int i = 0; i< getListSize(instructions); i++) {
                map.put("instructions[" + i + "]", getFromList(instructions, i));
            }
        }
        else {
            map.put("instructions", JSON.getDefault().getMapper().writeValueAsString(instructions));
        }
    }
    if (uploadedAt != null) {
        if (isFileTypeOrListOfFiles(uploadedAt)) {
            fileTypeFound = true;
        }

        if (uploadedAt.getClass().equals(java.io.File.class) ||
            uploadedAt.getClass().equals(Integer.class) ||
            uploadedAt.getClass().equals(String.class) ||
            uploadedAt.getClass().isEnum()) {
            map.put("uploaded_at", uploadedAt);
        } else if (isListOfFile(uploadedAt)) {
            for(int i = 0; i< getListSize(uploadedAt); i++) {
                map.put("uploaded_at[" + i + "]", getFromList(uploadedAt, i));
            }
        }
        else {
            map.put("uploaded_at", JSON.getDefault().getMapper().writeValueAsString(uploadedAt));
        }
    }
    } catch (Exception e) {
        throw new ApiException(e);
    }

    return fileTypeFound ? map : new HashMap<>();
  }

  private boolean isFileTypeOrListOfFiles(Object obj) throws Exception {
    return obj.getClass().equals(java.io.File.class) || isListOfFile(obj);
  }

  private boolean isListOfFile(Object obj) throws Exception {
      return obj instanceof java.util.List && !isListEmpty(obj) && getFromList(obj, 0) instanceof java.io.File;
  }

  private boolean isListEmpty(Object obj) throws Exception {
    return (boolean) Class.forName(java.util.List.class.getName()).getMethod("isEmpty").invoke(obj);
  }

  private Object getFromList(Object obj, int index) throws Exception {
    return Class.forName(java.util.List.class.getName()).getMethod("get", int.class).invoke(obj, index);
  }

  private int getListSize(Object obj) throws Exception {
    return (int) Class.forName(java.util.List.class.getName()).getMethod("size").invoke(obj);
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

}

