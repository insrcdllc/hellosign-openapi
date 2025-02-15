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
import com.dropbox.sign.model.SubFormFieldsPerDocumentBase;
import com.dropbox.sign.model.SubFormFieldsPerDocumentCheckbox;
import com.dropbox.sign.model.SubFormFieldsPerDocumentCheckboxMerge;
import com.dropbox.sign.model.SubFormFieldsPerDocumentDateSigned;
import com.dropbox.sign.model.SubFormFieldsPerDocumentDropdown;
import com.dropbox.sign.model.SubFormFieldsPerDocumentHyperlink;
import com.dropbox.sign.model.SubFormFieldsPerDocumentInitials;
import com.dropbox.sign.model.SubFormFieldsPerDocumentRadio;
import com.dropbox.sign.model.SubFormFieldsPerDocumentSignature;
import com.dropbox.sign.model.SubFormFieldsPerDocumentText;
import com.dropbox.sign.model.SubFormFieldsPerDocumentTextMerge;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
 * This class extends &#x60;SubFormFieldsPerDocumentBase&#x60;.
 */
@ApiModel(description = "This class extends `SubFormFieldsPerDocumentBase`.")
@JsonPropertyOrder({
    SubFormFieldsPerDocumentRadio.JSON_PROPERTY_TYPE,
    SubFormFieldsPerDocumentRadio.JSON_PROPERTY_GROUP,
    SubFormFieldsPerDocumentRadio.JSON_PROPERTY_IS_CHECKED
})
@JsonIgnoreProperties(ignoreUnknown=true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentCheckbox.class, name = "checkbox"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentCheckboxMerge.class, name = "checkbox-merge"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentDateSigned.class, name = "date_signed"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentDropdown.class, name = "dropdown"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentHyperlink.class, name = "hyperlink"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentInitials.class, name = "initials"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentRadio.class, name = "radio"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentSignature.class, name = "signature"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentText.class, name = "text"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentTextMerge.class, name = "text-merge"),
})

public class SubFormFieldsPerDocumentRadio extends SubFormFieldsPerDocumentBase {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "radio";

  public static final String JSON_PROPERTY_GROUP = "group";
  private String group;

  public static final String JSON_PROPERTY_IS_CHECKED = "is_checked";
  private Boolean isChecked;

  public SubFormFieldsPerDocumentRadio() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public SubFormFieldsPerDocumentRadio init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, SubFormFieldsPerDocumentRadio.class);
  }

  static public SubFormFieldsPerDocumentRadio init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      SubFormFieldsPerDocumentRadio.class
    );
  }

  public SubFormFieldsPerDocumentRadio type(String type) {
    this.type = type;
    return this;
  }

   /**
   * An input field for radios. Use the &#x60;SubFormFieldsPerDocumentRadio&#x60; class.
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An input field for radios. Use the `SubFormFieldsPerDocumentRadio` class.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public SubFormFieldsPerDocumentRadio group(String group) {
    this.group = group;
    return this;
  }

   /**
   * String referencing group defined in &#x60;form_field_groups&#x60; parameter.
   * @return group
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "String referencing group defined in `form_field_groups` parameter.")
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGroup() {
    return group;
  }


  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroup(String group) {
    this.group = group;
  }


  public SubFormFieldsPerDocumentRadio isChecked(Boolean isChecked) {
    this.isChecked = isChecked;
    return this;
  }

   /**
   * &#x60;true&#x60; for checking the radio field by default, otherwise &#x60;false&#x60;. Only one radio field per group can be &#x60;true&#x60;.
   * @return isChecked
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "`true` for checking the radio field by default, otherwise `false`. Only one radio field per group can be `true`.")
  @JsonProperty(JSON_PROPERTY_IS_CHECKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsChecked() {
    return isChecked;
  }


  @JsonProperty(JSON_PROPERTY_IS_CHECKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsChecked(Boolean isChecked) {
    this.isChecked = isChecked;
  }


  /**
   * Return true if this SubFormFieldsPerDocumentRadio object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubFormFieldsPerDocumentRadio subFormFieldsPerDocumentRadio = (SubFormFieldsPerDocumentRadio) o;
    return Objects.equals(this.type, subFormFieldsPerDocumentRadio.type) &&
        Objects.equals(this.group, subFormFieldsPerDocumentRadio.group) &&
        Objects.equals(this.isChecked, subFormFieldsPerDocumentRadio.isChecked) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, group, isChecked, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubFormFieldsPerDocumentRadio {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    isChecked: ").append(toIndentedString(isChecked)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
     map.putAll(super.createFormData());
    try {
    if (type != null) {
        if (isFileTypeOrListOfFiles(type)) {
            fileTypeFound = true;
        }

        if (type.getClass().equals(java.io.File.class) ||
            type.getClass().equals(Integer.class) ||
            type.getClass().equals(String.class) ||
            type.getClass().isEnum()) {
            map.put("type", type);
        } else if (isListOfFile(type)) {
            for(int i = 0; i< getListSize(type); i++) {
                map.put("type[" + i + "]", getFromList(type, i));
            }
        }
        else {
            map.put("type", JSON.getDefault().getMapper().writeValueAsString(type));
        }
    }
    if (group != null) {
        if (isFileTypeOrListOfFiles(group)) {
            fileTypeFound = true;
        }

        if (group.getClass().equals(java.io.File.class) ||
            group.getClass().equals(Integer.class) ||
            group.getClass().equals(String.class) ||
            group.getClass().isEnum()) {
            map.put("group", group);
        } else if (isListOfFile(group)) {
            for(int i = 0; i< getListSize(group); i++) {
                map.put("group[" + i + "]", getFromList(group, i));
            }
        }
        else {
            map.put("group", JSON.getDefault().getMapper().writeValueAsString(group));
        }
    }
    if (isChecked != null) {
        if (isFileTypeOrListOfFiles(isChecked)) {
            fileTypeFound = true;
        }

        if (isChecked.getClass().equals(java.io.File.class) ||
            isChecked.getClass().equals(Integer.class) ||
            isChecked.getClass().equals(String.class) ||
            isChecked.getClass().isEnum()) {
            map.put("is_checked", isChecked);
        } else if (isListOfFile(isChecked)) {
            for(int i = 0; i< getListSize(isChecked); i++) {
                map.put("is_checked[" + i + "]", getFromList(isChecked, i));
            }
        }
        else {
            map.put("is_checked", JSON.getDefault().getMapper().writeValueAsString(isChecked));
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

static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("checkbox", SubFormFieldsPerDocumentCheckbox.class);
  mappings.put("checkbox-merge", SubFormFieldsPerDocumentCheckboxMerge.class);
  mappings.put("date_signed", SubFormFieldsPerDocumentDateSigned.class);
  mappings.put("dropdown", SubFormFieldsPerDocumentDropdown.class);
  mappings.put("hyperlink", SubFormFieldsPerDocumentHyperlink.class);
  mappings.put("initials", SubFormFieldsPerDocumentInitials.class);
  mappings.put("radio", SubFormFieldsPerDocumentRadio.class);
  mappings.put("signature", SubFormFieldsPerDocumentSignature.class);
  mappings.put("text", SubFormFieldsPerDocumentText.class);
  mappings.put("text-merge", SubFormFieldsPerDocumentTextMerge.class);
  mappings.put("SubFormFieldsPerDocumentRadio", SubFormFieldsPerDocumentRadio.class);
  JSON.registerDiscriminator(SubFormFieldsPerDocumentRadio.class, "type", mappings);
}
}

