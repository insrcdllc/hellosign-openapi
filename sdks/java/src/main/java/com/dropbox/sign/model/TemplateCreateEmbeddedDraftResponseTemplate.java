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
import com.dropbox.sign.model.WarningResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.dropbox.sign.JSON;


import com.dropbox.sign.ApiException;
/**
 * Template object with parameters: &#x60;template_id&#x60;, &#x60;edit_url&#x60;, &#x60;expires_at&#x60;.
 */
@ApiModel(description = "Template object with parameters: `template_id`, `edit_url`, `expires_at`.")
@JsonPropertyOrder({
    TemplateCreateEmbeddedDraftResponseTemplate.JSON_PROPERTY_TEMPLATE_ID,
    TemplateCreateEmbeddedDraftResponseTemplate.JSON_PROPERTY_EDIT_URL,
    TemplateCreateEmbeddedDraftResponseTemplate.JSON_PROPERTY_EXPIRES_AT,
    TemplateCreateEmbeddedDraftResponseTemplate.JSON_PROPERTY_WARNINGS
})
@JsonIgnoreProperties(ignoreUnknown=true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateCreateEmbeddedDraftResponseTemplate {
  public static final String JSON_PROPERTY_TEMPLATE_ID = "template_id";
  private String templateId;

  public static final String JSON_PROPERTY_EDIT_URL = "edit_url";
  private String editUrl;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private Integer expiresAt;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<WarningResponse> warnings = null;

  public TemplateCreateEmbeddedDraftResponseTemplate() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public TemplateCreateEmbeddedDraftResponseTemplate init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, TemplateCreateEmbeddedDraftResponseTemplate.class);
  }

  static public TemplateCreateEmbeddedDraftResponseTemplate init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      TemplateCreateEmbeddedDraftResponseTemplate.class
    );
  }

  public TemplateCreateEmbeddedDraftResponseTemplate templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * The id of the Template.
   * @return templateId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The id of the Template.")
  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTemplateId() {
    return templateId;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public TemplateCreateEmbeddedDraftResponseTemplate editUrl(String editUrl) {
    this.editUrl = editUrl;
    return this;
  }

   /**
   * Link to edit the template.
   * @return editUrl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Link to edit the template.")
  @JsonProperty(JSON_PROPERTY_EDIT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEditUrl() {
    return editUrl;
  }


  @JsonProperty(JSON_PROPERTY_EDIT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEditUrl(String editUrl) {
    this.editUrl = editUrl;
  }


  public TemplateCreateEmbeddedDraftResponseTemplate expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * When the link expires.
   * @return expiresAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "When the link expires.")
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExpiresAt() {
    return expiresAt;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }


  public TemplateCreateEmbeddedDraftResponseTemplate warnings(List<WarningResponse> warnings) {
    this.warnings = warnings;
    return this;
  }

  public TemplateCreateEmbeddedDraftResponseTemplate addWarningsItem(WarningResponse warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * A list of warnings.
   * @return warnings
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A list of warnings.")
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WarningResponse> getWarnings() {
    return warnings;
  }


  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarnings(List<WarningResponse> warnings) {
    this.warnings = warnings;
  }


  /**
   * Return true if this TemplateCreateEmbeddedDraftResponseTemplate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateCreateEmbeddedDraftResponseTemplate templateCreateEmbeddedDraftResponseTemplate = (TemplateCreateEmbeddedDraftResponseTemplate) o;
    return Objects.equals(this.templateId, templateCreateEmbeddedDraftResponseTemplate.templateId) &&
        Objects.equals(this.editUrl, templateCreateEmbeddedDraftResponseTemplate.editUrl) &&
        Objects.equals(this.expiresAt, templateCreateEmbeddedDraftResponseTemplate.expiresAt) &&
        Objects.equals(this.warnings, templateCreateEmbeddedDraftResponseTemplate.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, editUrl, expiresAt, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateCreateEmbeddedDraftResponseTemplate {\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    editUrl: ").append(toIndentedString(editUrl)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (templateId != null) {
        if (isFileTypeOrListOfFiles(templateId)) {
            fileTypeFound = true;
        }

        if (templateId.getClass().equals(java.io.File.class) ||
            templateId.getClass().equals(Integer.class) ||
            templateId.getClass().equals(String.class) ||
            templateId.getClass().isEnum()) {
            map.put("template_id", templateId);
        } else if (isListOfFile(templateId)) {
            for(int i = 0; i< getListSize(templateId); i++) {
                map.put("template_id[" + i + "]", getFromList(templateId, i));
            }
        }
        else {
            map.put("template_id", JSON.getDefault().getMapper().writeValueAsString(templateId));
        }
    }
    if (editUrl != null) {
        if (isFileTypeOrListOfFiles(editUrl)) {
            fileTypeFound = true;
        }

        if (editUrl.getClass().equals(java.io.File.class) ||
            editUrl.getClass().equals(Integer.class) ||
            editUrl.getClass().equals(String.class) ||
            editUrl.getClass().isEnum()) {
            map.put("edit_url", editUrl);
        } else if (isListOfFile(editUrl)) {
            for(int i = 0; i< getListSize(editUrl); i++) {
                map.put("edit_url[" + i + "]", getFromList(editUrl, i));
            }
        }
        else {
            map.put("edit_url", JSON.getDefault().getMapper().writeValueAsString(editUrl));
        }
    }
    if (expiresAt != null) {
        if (isFileTypeOrListOfFiles(expiresAt)) {
            fileTypeFound = true;
        }

        if (expiresAt.getClass().equals(java.io.File.class) ||
            expiresAt.getClass().equals(Integer.class) ||
            expiresAt.getClass().equals(String.class) ||
            expiresAt.getClass().isEnum()) {
            map.put("expires_at", expiresAt);
        } else if (isListOfFile(expiresAt)) {
            for(int i = 0; i< getListSize(expiresAt); i++) {
                map.put("expires_at[" + i + "]", getFromList(expiresAt, i));
            }
        }
        else {
            map.put("expires_at", JSON.getDefault().getMapper().writeValueAsString(expiresAt));
        }
    }
    if (warnings != null) {
        if (isFileTypeOrListOfFiles(warnings)) {
            fileTypeFound = true;
        }

        if (warnings.getClass().equals(java.io.File.class) ||
            warnings.getClass().equals(Integer.class) ||
            warnings.getClass().equals(String.class) ||
            warnings.getClass().isEnum()) {
            map.put("warnings", warnings);
        } else if (isListOfFile(warnings)) {
            for(int i = 0; i< getListSize(warnings); i++) {
                map.put("warnings[" + i + "]", getFromList(warnings, i));
            }
        }
        else {
            map.put("warnings", JSON.getDefault().getMapper().writeValueAsString(warnings));
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

