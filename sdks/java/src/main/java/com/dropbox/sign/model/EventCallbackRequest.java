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
import com.dropbox.sign.model.AccountResponse;
import com.dropbox.sign.model.EventCallbackRequestEvent;
import com.dropbox.sign.model.SignatureRequestResponse;
import com.dropbox.sign.model.TemplateResponse;
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
 * EventCallbackRequest
 */
@JsonPropertyOrder({
    EventCallbackRequest.JSON_PROPERTY_EVENT,
    EventCallbackRequest.JSON_PROPERTY_ACCOUNT,
    EventCallbackRequest.JSON_PROPERTY_SIGNATURE_REQUEST,
    EventCallbackRequest.JSON_PROPERTY_TEMPLATE
})
@JsonIgnoreProperties(ignoreUnknown=true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventCallbackRequest {
  public static final String JSON_PROPERTY_EVENT = "event";
  private EventCallbackRequestEvent event;

  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private AccountResponse account;

  public static final String JSON_PROPERTY_SIGNATURE_REQUEST = "signature_request";
  private SignatureRequestResponse signatureRequest;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private TemplateResponse template;

  public EventCallbackRequest() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public EventCallbackRequest init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, EventCallbackRequest.class);
  }

  static public EventCallbackRequest init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      EventCallbackRequest.class
    );
  }

  public EventCallbackRequest event(EventCallbackRequestEvent event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EventCallbackRequestEvent getEvent() {
    return event;
  }


  @JsonProperty(JSON_PROPERTY_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEvent(EventCallbackRequestEvent event) {
    this.event = event;
  }


  public EventCallbackRequest account(AccountResponse account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountResponse getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccount(AccountResponse account) {
    this.account = account;
  }


  public EventCallbackRequest signatureRequest(SignatureRequestResponse signatureRequest) {
    this.signatureRequest = signatureRequest;
    return this;
  }

   /**
   * Get signatureRequest
   * @return signatureRequest
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIGNATURE_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SignatureRequestResponse getSignatureRequest() {
    return signatureRequest;
  }


  @JsonProperty(JSON_PROPERTY_SIGNATURE_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignatureRequest(SignatureRequestResponse signatureRequest) {
    this.signatureRequest = signatureRequest;
  }


  public EventCallbackRequest template(TemplateResponse template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TemplateResponse getTemplate() {
    return template;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplate(TemplateResponse template) {
    this.template = template;
  }


  /**
   * Return true if this EventCallbackRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventCallbackRequest eventCallbackRequest = (EventCallbackRequest) o;
    return Objects.equals(this.event, eventCallbackRequest.event) &&
        Objects.equals(this.account, eventCallbackRequest.account) &&
        Objects.equals(this.signatureRequest, eventCallbackRequest.signatureRequest) &&
        Objects.equals(this.template, eventCallbackRequest.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, account, signatureRequest, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCallbackRequest {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    signatureRequest: ").append(toIndentedString(signatureRequest)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (event != null) {
        if (isFileTypeOrListOfFiles(event)) {
            fileTypeFound = true;
        }

        if (event.getClass().equals(java.io.File.class) ||
            event.getClass().equals(Integer.class) ||
            event.getClass().equals(String.class) ||
            event.getClass().isEnum()) {
            map.put("event", event);
        } else if (isListOfFile(event)) {
            for(int i = 0; i< getListSize(event); i++) {
                map.put("event[" + i + "]", getFromList(event, i));
            }
        }
        else {
            map.put("event", JSON.getDefault().getMapper().writeValueAsString(event));
        }
    }
    if (account != null) {
        if (isFileTypeOrListOfFiles(account)) {
            fileTypeFound = true;
        }

        if (account.getClass().equals(java.io.File.class) ||
            account.getClass().equals(Integer.class) ||
            account.getClass().equals(String.class) ||
            account.getClass().isEnum()) {
            map.put("account", account);
        } else if (isListOfFile(account)) {
            for(int i = 0; i< getListSize(account); i++) {
                map.put("account[" + i + "]", getFromList(account, i));
            }
        }
        else {
            map.put("account", JSON.getDefault().getMapper().writeValueAsString(account));
        }
    }
    if (signatureRequest != null) {
        if (isFileTypeOrListOfFiles(signatureRequest)) {
            fileTypeFound = true;
        }

        if (signatureRequest.getClass().equals(java.io.File.class) ||
            signatureRequest.getClass().equals(Integer.class) ||
            signatureRequest.getClass().equals(String.class) ||
            signatureRequest.getClass().isEnum()) {
            map.put("signature_request", signatureRequest);
        } else if (isListOfFile(signatureRequest)) {
            for(int i = 0; i< getListSize(signatureRequest); i++) {
                map.put("signature_request[" + i + "]", getFromList(signatureRequest, i));
            }
        }
        else {
            map.put("signature_request", JSON.getDefault().getMapper().writeValueAsString(signatureRequest));
        }
    }
    if (template != null) {
        if (isFileTypeOrListOfFiles(template)) {
            fileTypeFound = true;
        }

        if (template.getClass().equals(java.io.File.class) ||
            template.getClass().equals(Integer.class) ||
            template.getClass().equals(String.class) ||
            template.getClass().isEnum()) {
            map.put("template", template);
        } else if (isListOfFile(template)) {
            for(int i = 0; i< getListSize(template); i++) {
                map.put("template[" + i + "]", getFromList(template, i));
            }
        }
        else {
            map.put("template", JSON.getDefault().getMapper().writeValueAsString(template));
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

