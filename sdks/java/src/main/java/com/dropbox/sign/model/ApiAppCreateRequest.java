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
import com.dropbox.sign.model.SubOAuth;
import com.dropbox.sign.model.SubOptions;
import com.dropbox.sign.model.SubWhiteLabelingOptions;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.dropbox.sign.JSON;


import com.dropbox.sign.ApiException;
/**
 * ApiAppCreateRequest
 */
@JsonPropertyOrder({
    ApiAppCreateRequest.JSON_PROPERTY_DOMAINS,
    ApiAppCreateRequest.JSON_PROPERTY_NAME,
    ApiAppCreateRequest.JSON_PROPERTY_CALLBACK_URL,
    ApiAppCreateRequest.JSON_PROPERTY_CUSTOM_LOGO_FILE,
    ApiAppCreateRequest.JSON_PROPERTY_OAUTH,
    ApiAppCreateRequest.JSON_PROPERTY_OPTIONS,
    ApiAppCreateRequest.JSON_PROPERTY_WHITE_LABELING_OPTIONS
})
@JsonIgnoreProperties(ignoreUnknown=true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiAppCreateRequest {
  public static final String JSON_PROPERTY_DOMAINS = "domains";
  private List<String> domains = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CALLBACK_URL = "callback_url";
  private String callbackUrl;

  public static final String JSON_PROPERTY_CUSTOM_LOGO_FILE = "custom_logo_file";
  private File customLogoFile;

  public static final String JSON_PROPERTY_OAUTH = "oauth";
  private SubOAuth oauth;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private SubOptions options;

  public static final String JSON_PROPERTY_WHITE_LABELING_OPTIONS = "white_labeling_options";
  private SubWhiteLabelingOptions whiteLabelingOptions;

  public ApiAppCreateRequest() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public ApiAppCreateRequest init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, ApiAppCreateRequest.class);
  }

  static public ApiAppCreateRequest init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      ApiAppCreateRequest.class
    );
  }

  public ApiAppCreateRequest domains(List<String> domains) {
    this.domains = domains;
    return this;
  }

  public ApiAppCreateRequest addDomainsItem(String domainsItem) {
    this.domains.add(domainsItem);
    return this;
  }

   /**
   * The domain names the ApiApp will be associated with.
   * @return domains
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The domain names the ApiApp will be associated with.")
  @JsonProperty(JSON_PROPERTY_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getDomains() {
    return domains;
  }


  @JsonProperty(JSON_PROPERTY_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDomains(List<String> domains) {
    this.domains = domains;
  }


  public ApiAppCreateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name you want to assign to the ApiApp.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name you want to assign to the ApiApp.")
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


  public ApiAppCreateRequest callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * The URL at which the ApiApp should receive event callbacks.
   * @return callbackUrl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The URL at which the ApiApp should receive event callbacks.")
  @JsonProperty(JSON_PROPERTY_CALLBACK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallbackUrl() {
    return callbackUrl;
  }


  @JsonProperty(JSON_PROPERTY_CALLBACK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  public ApiAppCreateRequest customLogoFile(File customLogoFile) {
    this.customLogoFile = customLogoFile;
    return this;
  }

   /**
   * An image file to use as a custom logo in embedded contexts. (Only applies to some API plans)
   * @return customLogoFile
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "An image file to use as a custom logo in embedded contexts. (Only applies to some API plans)")
  @JsonProperty(JSON_PROPERTY_CUSTOM_LOGO_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public File getCustomLogoFile() {
    return customLogoFile;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_LOGO_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomLogoFile(File customLogoFile) {
    this.customLogoFile = customLogoFile;
  }


  public ApiAppCreateRequest oauth(SubOAuth oauth) {
    this.oauth = oauth;
    return this;
  }

   /**
   * Get oauth
   * @return oauth
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OAUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubOAuth getOauth() {
    return oauth;
  }


  @JsonProperty(JSON_PROPERTY_OAUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOauth(SubOAuth oauth) {
    this.oauth = oauth;
  }


  public ApiAppCreateRequest options(SubOptions options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubOptions getOptions() {
    return options;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptions(SubOptions options) {
    this.options = options;
  }


  public ApiAppCreateRequest whiteLabelingOptions(SubWhiteLabelingOptions whiteLabelingOptions) {
    this.whiteLabelingOptions = whiteLabelingOptions;
    return this;
  }

   /**
   * Get whiteLabelingOptions
   * @return whiteLabelingOptions
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WHITE_LABELING_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubWhiteLabelingOptions getWhiteLabelingOptions() {
    return whiteLabelingOptions;
  }


  @JsonProperty(JSON_PROPERTY_WHITE_LABELING_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWhiteLabelingOptions(SubWhiteLabelingOptions whiteLabelingOptions) {
    this.whiteLabelingOptions = whiteLabelingOptions;
  }


  /**
   * Return true if this ApiAppCreateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAppCreateRequest apiAppCreateRequest = (ApiAppCreateRequest) o;
    return Objects.equals(this.domains, apiAppCreateRequest.domains) &&
        Objects.equals(this.name, apiAppCreateRequest.name) &&
        Objects.equals(this.callbackUrl, apiAppCreateRequest.callbackUrl) &&
        Objects.equals(this.customLogoFile, apiAppCreateRequest.customLogoFile) &&
        Objects.equals(this.oauth, apiAppCreateRequest.oauth) &&
        Objects.equals(this.options, apiAppCreateRequest.options) &&
        Objects.equals(this.whiteLabelingOptions, apiAppCreateRequest.whiteLabelingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domains, name, callbackUrl, customLogoFile, oauth, options, whiteLabelingOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAppCreateRequest {\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    customLogoFile: ").append(toIndentedString(customLogoFile)).append("\n");
    sb.append("    oauth: ").append(toIndentedString(oauth)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    whiteLabelingOptions: ").append(toIndentedString(whiteLabelingOptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (domains != null) {
        if (isFileTypeOrListOfFiles(domains)) {
            fileTypeFound = true;
        }

        if (domains.getClass().equals(java.io.File.class) ||
            domains.getClass().equals(Integer.class) ||
            domains.getClass().equals(String.class) ||
            domains.getClass().isEnum()) {
            map.put("domains", domains);
        } else if (isListOfFile(domains)) {
            for(int i = 0; i< getListSize(domains); i++) {
                map.put("domains[" + i + "]", getFromList(domains, i));
            }
        }
        else {
            map.put("domains", JSON.getDefault().getMapper().writeValueAsString(domains));
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
    if (callbackUrl != null) {
        if (isFileTypeOrListOfFiles(callbackUrl)) {
            fileTypeFound = true;
        }

        if (callbackUrl.getClass().equals(java.io.File.class) ||
            callbackUrl.getClass().equals(Integer.class) ||
            callbackUrl.getClass().equals(String.class) ||
            callbackUrl.getClass().isEnum()) {
            map.put("callback_url", callbackUrl);
        } else if (isListOfFile(callbackUrl)) {
            for(int i = 0; i< getListSize(callbackUrl); i++) {
                map.put("callback_url[" + i + "]", getFromList(callbackUrl, i));
            }
        }
        else {
            map.put("callback_url", JSON.getDefault().getMapper().writeValueAsString(callbackUrl));
        }
    }
    if (customLogoFile != null) {
        if (isFileTypeOrListOfFiles(customLogoFile)) {
            fileTypeFound = true;
        }

        if (customLogoFile.getClass().equals(java.io.File.class) ||
            customLogoFile.getClass().equals(Integer.class) ||
            customLogoFile.getClass().equals(String.class) ||
            customLogoFile.getClass().isEnum()) {
            map.put("custom_logo_file", customLogoFile);
        } else if (isListOfFile(customLogoFile)) {
            for(int i = 0; i< getListSize(customLogoFile); i++) {
                map.put("custom_logo_file[" + i + "]", getFromList(customLogoFile, i));
            }
        }
        else {
            map.put("custom_logo_file", JSON.getDefault().getMapper().writeValueAsString(customLogoFile));
        }
    }
    if (oauth != null) {
        if (isFileTypeOrListOfFiles(oauth)) {
            fileTypeFound = true;
        }

        if (oauth.getClass().equals(java.io.File.class) ||
            oauth.getClass().equals(Integer.class) ||
            oauth.getClass().equals(String.class) ||
            oauth.getClass().isEnum()) {
            map.put("oauth", oauth);
        } else if (isListOfFile(oauth)) {
            for(int i = 0; i< getListSize(oauth); i++) {
                map.put("oauth[" + i + "]", getFromList(oauth, i));
            }
        }
        else {
            map.put("oauth", JSON.getDefault().getMapper().writeValueAsString(oauth));
        }
    }
    if (options != null) {
        if (isFileTypeOrListOfFiles(options)) {
            fileTypeFound = true;
        }

        if (options.getClass().equals(java.io.File.class) ||
            options.getClass().equals(Integer.class) ||
            options.getClass().equals(String.class) ||
            options.getClass().isEnum()) {
            map.put("options", options);
        } else if (isListOfFile(options)) {
            for(int i = 0; i< getListSize(options); i++) {
                map.put("options[" + i + "]", getFromList(options, i));
            }
        }
        else {
            map.put("options", JSON.getDefault().getMapper().writeValueAsString(options));
        }
    }
    if (whiteLabelingOptions != null) {
        if (isFileTypeOrListOfFiles(whiteLabelingOptions)) {
            fileTypeFound = true;
        }

        if (whiteLabelingOptions.getClass().equals(java.io.File.class) ||
            whiteLabelingOptions.getClass().equals(Integer.class) ||
            whiteLabelingOptions.getClass().equals(String.class) ||
            whiteLabelingOptions.getClass().isEnum()) {
            map.put("white_labeling_options", whiteLabelingOptions);
        } else if (isListOfFile(whiteLabelingOptions)) {
            for(int i = 0; i< getListSize(whiteLabelingOptions); i++) {
                map.put("white_labeling_options[" + i + "]", getFromList(whiteLabelingOptions, i));
            }
        }
        else {
            map.put("white_labeling_options", JSON.getDefault().getMapper().writeValueAsString(whiteLabelingOptions));
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

