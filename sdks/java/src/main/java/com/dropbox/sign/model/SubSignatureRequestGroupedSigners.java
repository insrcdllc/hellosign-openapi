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
import com.dropbox.sign.model.SubSignatureRequestSigner;
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
 * SubSignatureRequestGroupedSigners
 */
@JsonPropertyOrder({
    SubSignatureRequestGroupedSigners.JSON_PROPERTY_GROUP,
    SubSignatureRequestGroupedSigners.JSON_PROPERTY_SIGNERS,
    SubSignatureRequestGroupedSigners.JSON_PROPERTY_ORDER
})
@JsonIgnoreProperties(ignoreUnknown=true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubSignatureRequestGroupedSigners {
  public static final String JSON_PROPERTY_GROUP = "group";
  private String group;

  public static final String JSON_PROPERTY_SIGNERS = "signers";
  private List<SubSignatureRequestSigner> signers = new ArrayList<>();

  public static final String JSON_PROPERTY_ORDER = "order";
  private Integer order;

  public SubSignatureRequestGroupedSigners() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public SubSignatureRequestGroupedSigners init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, SubSignatureRequestGroupedSigners.class);
  }

  static public SubSignatureRequestGroupedSigners init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      SubSignatureRequestGroupedSigners.class
    );
  }

  public SubSignatureRequestGroupedSigners group(String group) {
    this.group = group;
    return this;
  }

   /**
   * The name of the group.
   * @return group
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the group.")
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


  public SubSignatureRequestGroupedSigners signers(List<SubSignatureRequestSigner> signers) {
    this.signers = signers;
    return this;
  }

  public SubSignatureRequestGroupedSigners addSignersItem(SubSignatureRequestSigner signersItem) {
    this.signers.add(signersItem);
    return this;
  }

   /**
   * Signers belonging to this Group.  **NOTE**: Only &#x60;name&#x60;, &#x60;email_address&#x60;, and &#x60;pin&#x60; are available to Grouped Signers. We will ignore all other properties, even though they are listed below.
   * @return signers
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Signers belonging to this Group.  **NOTE**: Only `name`, `email_address`, and `pin` are available to Grouped Signers. We will ignore all other properties, even though they are listed below.")
  @JsonProperty(JSON_PROPERTY_SIGNERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SubSignatureRequestSigner> getSigners() {
    return signers;
  }


  @JsonProperty(JSON_PROPERTY_SIGNERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSigners(List<SubSignatureRequestSigner> signers) {
    this.signers = signers;
  }


  public SubSignatureRequestGroupedSigners order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * The order the group is required to sign in. Use this instead of Signer-level &#x60;order&#x60;.
   * @return order
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The order the group is required to sign in. Use this instead of Signer-level `order`.")
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOrder() {
    return order;
  }


  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(Integer order) {
    this.order = order;
  }


  /**
   * Return true if this SubSignatureRequestGroupedSigners object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubSignatureRequestGroupedSigners subSignatureRequestGroupedSigners = (SubSignatureRequestGroupedSigners) o;
    return Objects.equals(this.group, subSignatureRequestGroupedSigners.group) &&
        Objects.equals(this.signers, subSignatureRequestGroupedSigners.signers) &&
        Objects.equals(this.order, subSignatureRequestGroupedSigners.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, signers, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubSignatureRequestGroupedSigners {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
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
    if (signers != null) {
        if (isFileTypeOrListOfFiles(signers)) {
            fileTypeFound = true;
        }

        if (signers.getClass().equals(java.io.File.class) ||
            signers.getClass().equals(Integer.class) ||
            signers.getClass().equals(String.class) ||
            signers.getClass().isEnum()) {
            map.put("signers", signers);
        } else if (isListOfFile(signers)) {
            for(int i = 0; i< getListSize(signers); i++) {
                map.put("signers[" + i + "]", getFromList(signers, i));
            }
        }
        else {
            map.put("signers", JSON.getDefault().getMapper().writeValueAsString(signers));
        }
    }
    if (order != null) {
        if (isFileTypeOrListOfFiles(order)) {
            fileTypeFound = true;
        }

        if (order.getClass().equals(java.io.File.class) ||
            order.getClass().equals(Integer.class) ||
            order.getClass().equals(String.class) ||
            order.getClass().isEnum()) {
            map.put("order", order);
        } else if (isListOfFile(order)) {
            for(int i = 0; i< getListSize(order); i++) {
                map.put("order[" + i + "]", getFromList(order, i));
            }
        }
        else {
            map.put("order", JSON.getDefault().getMapper().writeValueAsString(order));
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

