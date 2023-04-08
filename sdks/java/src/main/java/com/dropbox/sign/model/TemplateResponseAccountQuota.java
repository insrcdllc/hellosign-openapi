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
 * An array of the designated CC roles that must be specified when sending a SignatureRequest using this Template.
 */
@ApiModel(description = "An array of the designated CC roles that must be specified when sending a SignatureRequest using this Template.")
@JsonPropertyOrder({
    TemplateResponseAccountQuota.JSON_PROPERTY_TEMPLATES_LEFT,
    TemplateResponseAccountQuota.JSON_PROPERTY_API_SIGNATURE_REQUESTS_LEFT,
    TemplateResponseAccountQuota.JSON_PROPERTY_DOCUMENTS_LEFT,
    TemplateResponseAccountQuota.JSON_PROPERTY_SMS_VERIFICATIONS_LEFT
})
@JsonIgnoreProperties(ignoreUnknown=true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateResponseAccountQuota {
  public static final String JSON_PROPERTY_TEMPLATES_LEFT = "templates_left";
  private Integer templatesLeft;

  public static final String JSON_PROPERTY_API_SIGNATURE_REQUESTS_LEFT = "api_signature_requests_left";
  private Integer apiSignatureRequestsLeft;

  public static final String JSON_PROPERTY_DOCUMENTS_LEFT = "documents_left";
  private Integer documentsLeft;

  public static final String JSON_PROPERTY_SMS_VERIFICATIONS_LEFT = "sms_verifications_left";
  private Integer smsVerificationsLeft;

  public TemplateResponseAccountQuota() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public TemplateResponseAccountQuota init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, TemplateResponseAccountQuota.class);
  }

  static public TemplateResponseAccountQuota init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      TemplateResponseAccountQuota.class
    );
  }

  public TemplateResponseAccountQuota templatesLeft(Integer templatesLeft) {
    this.templatesLeft = templatesLeft;
    return this;
  }

   /**
   * API templates remaining.
   * @return templatesLeft
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "API templates remaining.")
  @JsonProperty(JSON_PROPERTY_TEMPLATES_LEFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTemplatesLeft() {
    return templatesLeft;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATES_LEFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplatesLeft(Integer templatesLeft) {
    this.templatesLeft = templatesLeft;
  }


  public TemplateResponseAccountQuota apiSignatureRequestsLeft(Integer apiSignatureRequestsLeft) {
    this.apiSignatureRequestsLeft = apiSignatureRequestsLeft;
    return this;
  }

   /**
   * API signature requests remaining.
   * @return apiSignatureRequestsLeft
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "API signature requests remaining.")
  @JsonProperty(JSON_PROPERTY_API_SIGNATURE_REQUESTS_LEFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getApiSignatureRequestsLeft() {
    return apiSignatureRequestsLeft;
  }


  @JsonProperty(JSON_PROPERTY_API_SIGNATURE_REQUESTS_LEFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiSignatureRequestsLeft(Integer apiSignatureRequestsLeft) {
    this.apiSignatureRequestsLeft = apiSignatureRequestsLeft;
  }


  public TemplateResponseAccountQuota documentsLeft(Integer documentsLeft) {
    this.documentsLeft = documentsLeft;
    return this;
  }

   /**
   * Signature requests remaining.
   * @return documentsLeft
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Signature requests remaining.")
  @JsonProperty(JSON_PROPERTY_DOCUMENTS_LEFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDocumentsLeft() {
    return documentsLeft;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENTS_LEFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentsLeft(Integer documentsLeft) {
    this.documentsLeft = documentsLeft;
  }


  public TemplateResponseAccountQuota smsVerificationsLeft(Integer smsVerificationsLeft) {
    this.smsVerificationsLeft = smsVerificationsLeft;
    return this;
  }

   /**
   * SMS verifications remaining.
   * @return smsVerificationsLeft
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "SMS verifications remaining.")
  @JsonProperty(JSON_PROPERTY_SMS_VERIFICATIONS_LEFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSmsVerificationsLeft() {
    return smsVerificationsLeft;
  }


  @JsonProperty(JSON_PROPERTY_SMS_VERIFICATIONS_LEFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmsVerificationsLeft(Integer smsVerificationsLeft) {
    this.smsVerificationsLeft = smsVerificationsLeft;
  }


  /**
   * Return true if this TemplateResponseAccountQuota object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateResponseAccountQuota templateResponseAccountQuota = (TemplateResponseAccountQuota) o;
    return Objects.equals(this.templatesLeft, templateResponseAccountQuota.templatesLeft) &&
        Objects.equals(this.apiSignatureRequestsLeft, templateResponseAccountQuota.apiSignatureRequestsLeft) &&
        Objects.equals(this.documentsLeft, templateResponseAccountQuota.documentsLeft) &&
        Objects.equals(this.smsVerificationsLeft, templateResponseAccountQuota.smsVerificationsLeft);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templatesLeft, apiSignatureRequestsLeft, documentsLeft, smsVerificationsLeft);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateResponseAccountQuota {\n");
    sb.append("    templatesLeft: ").append(toIndentedString(templatesLeft)).append("\n");
    sb.append("    apiSignatureRequestsLeft: ").append(toIndentedString(apiSignatureRequestsLeft)).append("\n");
    sb.append("    documentsLeft: ").append(toIndentedString(documentsLeft)).append("\n");
    sb.append("    smsVerificationsLeft: ").append(toIndentedString(smsVerificationsLeft)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (templatesLeft != null) {
        if (isFileTypeOrListOfFiles(templatesLeft)) {
            fileTypeFound = true;
        }

        if (templatesLeft.getClass().equals(java.io.File.class) ||
            templatesLeft.getClass().equals(Integer.class) ||
            templatesLeft.getClass().equals(String.class) ||
            templatesLeft.getClass().isEnum()) {
            map.put("templates_left", templatesLeft);
        } else if (isListOfFile(templatesLeft)) {
            for(int i = 0; i< getListSize(templatesLeft); i++) {
                map.put("templates_left[" + i + "]", getFromList(templatesLeft, i));
            }
        }
        else {
            map.put("templates_left", JSON.getDefault().getMapper().writeValueAsString(templatesLeft));
        }
    }
    if (apiSignatureRequestsLeft != null) {
        if (isFileTypeOrListOfFiles(apiSignatureRequestsLeft)) {
            fileTypeFound = true;
        }

        if (apiSignatureRequestsLeft.getClass().equals(java.io.File.class) ||
            apiSignatureRequestsLeft.getClass().equals(Integer.class) ||
            apiSignatureRequestsLeft.getClass().equals(String.class) ||
            apiSignatureRequestsLeft.getClass().isEnum()) {
            map.put("api_signature_requests_left", apiSignatureRequestsLeft);
        } else if (isListOfFile(apiSignatureRequestsLeft)) {
            for(int i = 0; i< getListSize(apiSignatureRequestsLeft); i++) {
                map.put("api_signature_requests_left[" + i + "]", getFromList(apiSignatureRequestsLeft, i));
            }
        }
        else {
            map.put("api_signature_requests_left", JSON.getDefault().getMapper().writeValueAsString(apiSignatureRequestsLeft));
        }
    }
    if (documentsLeft != null) {
        if (isFileTypeOrListOfFiles(documentsLeft)) {
            fileTypeFound = true;
        }

        if (documentsLeft.getClass().equals(java.io.File.class) ||
            documentsLeft.getClass().equals(Integer.class) ||
            documentsLeft.getClass().equals(String.class) ||
            documentsLeft.getClass().isEnum()) {
            map.put("documents_left", documentsLeft);
        } else if (isListOfFile(documentsLeft)) {
            for(int i = 0; i< getListSize(documentsLeft); i++) {
                map.put("documents_left[" + i + "]", getFromList(documentsLeft, i));
            }
        }
        else {
            map.put("documents_left", JSON.getDefault().getMapper().writeValueAsString(documentsLeft));
        }
    }
    if (smsVerificationsLeft != null) {
        if (isFileTypeOrListOfFiles(smsVerificationsLeft)) {
            fileTypeFound = true;
        }

        if (smsVerificationsLeft.getClass().equals(java.io.File.class) ||
            smsVerificationsLeft.getClass().equals(Integer.class) ||
            smsVerificationsLeft.getClass().equals(String.class) ||
            smsVerificationsLeft.getClass().isEnum()) {
            map.put("sms_verifications_left", smsVerificationsLeft);
        } else if (isListOfFile(smsVerificationsLeft)) {
            for(int i = 0; i< getListSize(smsVerificationsLeft); i++) {
                map.put("sms_verifications_left[" + i + "]", getFromList(smsVerificationsLeft, i));
            }
        }
        else {
            map.put("sms_verifications_left", JSON.getDefault().getMapper().writeValueAsString(smsVerificationsLeft));
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

