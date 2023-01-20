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
 * When used together with merge fields, &#x60;custom_fields&#x60; allows users to add pre-filled data to their signature requests.  Pre-filled data can be used with \&quot;send-once\&quot; signature requests by adding merge fields with &#x60;form_fields_per_document&#x60; or [Text Tags](https://app.hellosign.com/api/textTagsWalkthrough#TextTagIntro) while passing values back with &#x60;custom_fields&#x60; together in one API call.  For using pre-filled on repeatable signature requests, merge fields are added to templates in the Dropbox Sign UI or by calling [/template/create_embedded_draft](/api/reference/operation/templateCreateEmbeddedDraft) and then passing &#x60;custom_fields&#x60; on subsequent signature requests referencing that template.
 */
@ApiModel(description = "When used together with merge fields, `custom_fields` allows users to add pre-filled data to their signature requests.  Pre-filled data can be used with \"send-once\" signature requests by adding merge fields with `form_fields_per_document` or [Text Tags](https://app.hellosign.com/api/textTagsWalkthrough#TextTagIntro) while passing values back with `custom_fields` together in one API call.  For using pre-filled on repeatable signature requests, merge fields are added to templates in the Dropbox Sign UI or by calling [/template/create_embedded_draft](/api/reference/operation/templateCreateEmbeddedDraft) and then passing `custom_fields` on subsequent signature requests referencing that template.")
@JsonPropertyOrder({
    SubCustomField.JSON_PROPERTY_NAME,
    SubCustomField.JSON_PROPERTY_EDITOR,
    SubCustomField.JSON_PROPERTY_REQUIRED,
    SubCustomField.JSON_PROPERTY_VALUE
})
@JsonIgnoreProperties(ignoreUnknown=true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubCustomField {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_EDITOR = "editor";
  private String editor;

  public static final String JSON_PROPERTY_REQUIRED = "required";
  private Boolean required = false;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public SubCustomField() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public SubCustomField init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, SubCustomField.class);
  }

  public SubCustomField name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of a custom field. When working with pre-filled data, the custom field&#39;s name must have a matching merge field name or the field will remain empty on the document during signing.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of a custom field. When working with pre-filled data, the custom field's name must have a matching merge field name or the field will remain empty on the document during signing.")
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


  public SubCustomField editor(String editor) {
    this.editor = editor;
    return this;
  }

   /**
   * Used to create editable merge fields. When the value matches a role passed in with &#x60;signers&#x60;, that role can edit the data that was pre-filled to that field. This field is optional, but required when this custom field object is set to &#x60;required &#x3D; true&#x60;.  **Note**: Editable merge fields are only supported for single signer requests (or the first signer in ordered signature requests). If used when there are multiple signers in an unordered signature request, the editor value is ignored and the field won&#39;t be editable.
   * @return editor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to create editable merge fields. When the value matches a role passed in with `signers`, that role can edit the data that was pre-filled to that field. This field is optional, but required when this custom field object is set to `required = true`.  **Note**: Editable merge fields are only supported for single signer requests (or the first signer in ordered signature requests). If used when there are multiple signers in an unordered signature request, the editor value is ignored and the field won't be editable.")
  @JsonProperty(JSON_PROPERTY_EDITOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEditor() {
    return editor;
  }


  @JsonProperty(JSON_PROPERTY_EDITOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEditor(String editor) {
    this.editor = editor;
  }


  public SubCustomField required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Used to set an editable merge field when working with pre-filled data. When &#x60;true&#x60;, the custom field must specify a signer role in &#x60;editor&#x60;.
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to set an editable merge field when working with pre-filled data. When `true`, the custom field must specify a signer role in `editor`.")
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequired() {
    return required;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequired(Boolean required) {
    this.required = required;
  }


  public SubCustomField value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The string that resolves (aka \&quot;pre-fills\&quot;) to the merge field on the final document(s) used for signing.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The string that resolves (aka \"pre-fills\") to the merge field on the final document(s) used for signing.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Return true if this SubCustomField object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubCustomField subCustomField = (SubCustomField) o;
    return Objects.equals(this.name, subCustomField.name) &&
        Objects.equals(this.editor, subCustomField.editor) &&
        Objects.equals(this.required, subCustomField.required) &&
        Objects.equals(this.value, subCustomField.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, editor, required, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubCustomField {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
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
    if (editor != null) {
        if (isFileTypeOrListOfFiles(editor)) {
            fileTypeFound = true;
        }

        if (editor.getClass().equals(java.io.File.class) ||
            editor.getClass().equals(Integer.class) ||
            editor.getClass().equals(String.class) ||
            editor.getClass().isEnum()) {
            map.put("editor", editor);
        } else if (isListOfFile(editor)) {
            for(int i = 0; i< getListSize(editor); i++) {
                map.put("editor[" + i + "]", getFromList(editor, i));
            }
        }
        else {
            map.put("editor", JSON.getDefault().getMapper().writeValueAsString(editor));
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
    if (value != null) {
        if (isFileTypeOrListOfFiles(value)) {
            fileTypeFound = true;
        }

        if (value.getClass().equals(java.io.File.class) ||
            value.getClass().equals(Integer.class) ||
            value.getClass().equals(String.class) ||
            value.getClass().isEnum()) {
            map.put("value", value);
        } else if (isListOfFile(value)) {
            for(int i = 0; i< getListSize(value); i++) {
                map.put("value[" + i + "]", getFromList(value, i));
            }
        }
        else {
            map.put("value", JSON.getDefault().getMapper().writeValueAsString(value));
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

