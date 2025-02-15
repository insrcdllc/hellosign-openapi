/**
 * The MIT License (MIT)
 *
 * Copyright (C) 2023 dropbox.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import { RequestFile, AttributeTypeMap, ObjectSerializer } from "./";
import { SubAttachment } from "./subAttachment";
import { SubCustomField } from "./subCustomField";
import { SubEditorOptions } from "./subEditorOptions";
import { SubFieldOptions } from "./subFieldOptions";
import { SubFormFieldGroup } from "./subFormFieldGroup";
import { SubFormFieldRule } from "./subFormFieldRule";
import { SubFormFieldsPerDocumentBase } from "./subFormFieldsPerDocumentBase";
import { SubSigningOptions } from "./subSigningOptions";
import { SubUnclaimedDraftSigner } from "./subUnclaimedDraftSigner";

export class UnclaimedDraftCreateEmbeddedRequest {
  /**
   * Client id of the app used to create the draft. Used to apply the branding and callback url defined for the app.
   */
  "clientId": string;
  /**
   * The email address of the user that should be designated as the requester of this draft, if the draft type is `request_signature`.
   */
  "requesterEmailAddress": string;
  /**
   * Use `files[]` to indicate the uploaded file(s) to send for signature.  This endpoint requires either **files** or **file_urls[]**, but not both.
   */
  "files"?: Array<RequestFile>;
  /**
   * Use `file_urls[]` to have Dropbox Sign download the file(s) to send for signature.  This endpoint requires either **files** or **file_urls[]**, but not both.
   */
  "fileUrls"?: Array<string>;
  /**
   * This allows the requester to specify whether the user is allowed to provide email addresses to CC when claiming the draft.
   */
  "allowCcs"?: boolean = true;
  /**
   * Allows signers to decline to sign a document if `true`. Defaults to `false`.
   */
  "allowDecline"?: boolean = false;
  /**
   * Allows signers to reassign their signature requests to other signers if set to `true`. Defaults to `false`.  **Note**: Only available for Premium plan and higher.
   */
  "allowReassign"?: boolean = false;
  /**
   * A list describing the attachments
   */
  "attachments"?: Array<SubAttachment>;
  /**
   * The email addresses that should be CCed.
   */
  "ccEmailAddresses"?: Array<string>;
  /**
   * When used together with merge fields, `custom_fields` allows users to add pre-filled data to their signature requests.  Pre-filled data can be used with \"send-once\" signature requests by adding merge fields with `form_fields_per_document` or [Text Tags](https://app.hellosign.com/api/textTagsWalkthrough#TextTagIntro) while passing values back with `custom_fields` together in one API call.  For using pre-filled on repeatable signature requests, merge fields are added to templates in the Dropbox Sign UI or by calling [/template/create_embedded_draft](/api/reference/operation/templateCreateEmbeddedDraft) and then passing `custom_fields` on subsequent signature requests referencing that template.
   */
  "customFields"?: Array<SubCustomField>;
  "editorOptions"?: SubEditorOptions;
  "fieldOptions"?: SubFieldOptions;
  /**
   * Provide users the ability to review/edit the signers.
   */
  "forceSignerPage"?: boolean = false;
  /**
   * Provide users the ability to review/edit the subject and message.
   */
  "forceSubjectMessage"?: boolean = false;
  /**
   * Group information for fields defined in `form_fields_per_document`. String-indexed JSON array with `group_label` and `requirement` keys. `form_fields_per_document` must contain fields referencing a group defined in `form_field_groups`.
   */
  "formFieldGroups"?: Array<SubFormFieldGroup>;
  /**
   * Conditional Logic rules for fields defined in `form_fields_per_document`.
   */
  "formFieldRules"?: Array<SubFormFieldRule>;
  /**
   * The fields that should appear on the document, expressed as an array of objects. (We\'re currently fixing a bug where this property only accepts a two-dimensional array. You can read about it here: [Using Form Fields per Document](/docs/openapi/form-fields-per-document).)  **NOTE**: Fields like **text**, **dropdown**, **checkbox**, **radio**, and **hyperlink** have additional required and optional parameters. Check out the list of [additional parameters](/api/reference/constants/#form-fields-per-document) for these field types.  * Text Field use `SubFormFieldsPerDocumentText` * Dropdown Field use `SubFormFieldsPerDocumentDropdown` * Hyperlink Field use `SubFormFieldsPerDocumentHyperlink` * Checkbox Field use `SubFormFieldsPerDocumentCheckbox` * Radio Field use `SubFormFieldsPerDocumentRadio` * Signature Field use `SubFormFieldsPerDocumentSignature` * Date Signed Field use `SubFormFieldsPerDocumentDateSigned` * Initials Field use `SubFormFieldsPerDocumentInitials` * Text Merge Field use `SubFormFieldsPerDocumentTextMerge` * Checkbox Merge Field use `SubFormFieldsPerDocumentCheckboxMerge`
   */
  "formFieldsPerDocument"?: Array<SubFormFieldsPerDocumentBase>;
  /**
   * Send with a value of `true` if you wish to enable automatic Text Tag removal. Defaults to `false`. When using Text Tags it is preferred that you set this to `false` and hide your tags with white text or something similar because the automatic removal system can cause unwanted clipping. See the [Text Tags](https://app.hellosign.com/api/textTagsWalkthrough#TextTagIntro) walkthrough for more details.
   */
  "hideTextTags"?: boolean = false;
  /**
   * The request from this draft will not automatically send to signers post-claim if set to `true`. Requester must [release](/api/reference/operation/signatureRequestReleaseHold/) the request from hold when ready to send. Defaults to `false`.
   */
  "holdRequest"?: boolean = false;
  /**
   * The request created from this draft will also be signable in embedded mode if set to `true`. Defaults to `false`.
   */
  "isForEmbeddedSigning"?: boolean = false;
  /**
   * The custom message in the email that will be sent to the signers.
   */
  "message"?: string;
  /**
   * Key-value data that should be attached to the signature request. This metadata is included in all API responses and events involving the signature request. For example, use the metadata field to store a signer\'s order number for look up when receiving events for the signature request.  Each request can include up to 10 metadata keys (or 50 nested metadata keys), with key names up to 40 characters long and values up to 1000 characters long.
   */
  "metadata"?: { [key: string]: any };
  /**
   * The URL you want signers redirected to after they successfully request a signature.
   */
  "requestingRedirectUrl"?: string;
  /**
   * This allows the requester to enable the editor/preview experience.  - `show_preview=true`: Allows requesters to enable the editor/preview experience. - `show_preview=false`: Allows requesters to disable the editor/preview experience.
   */
  "showPreview"?: boolean;
  /**
   * When only one step remains in the signature request process and this parameter is set to `false` then the progress stepper will be hidden.
   */
  "showProgressStepper"?: boolean = true;
  /**
   * Add Signers to your Unclaimed Draft Signature Request.
   */
  "signers"?: Array<SubUnclaimedDraftSigner>;
  "signingOptions"?: SubSigningOptions;
  /**
   * The URL you want signers redirected to after they successfully sign.
   */
  "signingRedirectUrl"?: string;
  /**
   * Disables the \"Me (Now)\" option for the person preparing the document. Does not work with type `send_document`. Defaults to `false`.
   */
  "skipMeNow"?: boolean = false;
  /**
   * The subject in the email that will be sent to the signers.
   */
  "subject"?: string;
  /**
   * Whether this is a test, the signature request created from this draft will not be legally binding if set to `true`. Defaults to `false`.
   */
  "testMode"?: boolean = false;
  /**
   * The type of the draft. By default this is `request_signature`, but you can set it to `send_document` if you want to self sign a document and download it.
   */
  "type"?: UnclaimedDraftCreateEmbeddedRequest.TypeEnum =
    UnclaimedDraftCreateEmbeddedRequest.TypeEnum.RequestSignature;
  /**
   * Set `use_text_tags` to `true` to enable [Text Tags](https://app.hellosign.com/api/textTagsWalkthrough#TextTagIntro) parsing in your document (defaults to disabled, or `false`). Alternatively, if your PDF contains pre-defined fields, enable the detection of these fields by setting the `use_preexisting_fields` to `true` (defaults to disabled, or `false`). Currently we only support use of either `use_text_tags` or `use_preexisting_fields` parameter, not both.
   */
  "usePreexistingFields"?: boolean = false;
  /**
   * Set `use_text_tags` to `true` to enable [Text Tags](https://app.hellosign.com/api/textTagsWalkthrough#TextTagIntro) parsing in your document (defaults to disabled, or `false`). Alternatively, if your PDF contains pre-defined fields, enable the detection of these fields by setting the `use_preexisting_fields` to `true` (defaults to disabled, or `false`). Currently we only support use of either `use_text_tags` or `use_preexisting_fields` parameter, not both.
   */
  "useTextTags"?: boolean = false;
  /**
   * Controls whether [auto fill fields](https://faq.hellosign.com/hc/en-us/articles/360051467511-Auto-Fill-Fields) can automatically populate a signer\'s information during signing.  ⚠️ **Note** ⚠️: Keep your signer\'s information safe by ensuring that the _signer on your signature request is the intended party_ before using this feature.
   */
  "populateAutoFillFields"?: boolean = false;
  /**
   * When the signature request will expire. Unsigned signatures will be moved to the expired status, and no longer signable. See [Signature Request Expiration Date](https://developers.hellosign.com/docs/signature-request/expiration/) for details.  **Note**: This does not correspond to the **expires_at** returned in the response.
   */
  "expiresAt"?: number | null;

  static discriminator: string | undefined = undefined;

  static attributeTypeMap: AttributeTypeMap = [
    {
      name: "clientId",
      baseName: "client_id",
      type: "string",
    },
    {
      name: "requesterEmailAddress",
      baseName: "requester_email_address",
      type: "string",
    },
    {
      name: "files",
      baseName: "files",
      type: "Array<RequestFile>",
    },
    {
      name: "fileUrls",
      baseName: "file_urls",
      type: "Array<string>",
    },
    {
      name: "allowCcs",
      baseName: "allow_ccs",
      type: "boolean",
    },
    {
      name: "allowDecline",
      baseName: "allow_decline",
      type: "boolean",
    },
    {
      name: "allowReassign",
      baseName: "allow_reassign",
      type: "boolean",
    },
    {
      name: "attachments",
      baseName: "attachments",
      type: "Array<SubAttachment>",
    },
    {
      name: "ccEmailAddresses",
      baseName: "cc_email_addresses",
      type: "Array<string>",
    },
    {
      name: "customFields",
      baseName: "custom_fields",
      type: "Array<SubCustomField>",
    },
    {
      name: "editorOptions",
      baseName: "editor_options",
      type: "SubEditorOptions",
    },
    {
      name: "fieldOptions",
      baseName: "field_options",
      type: "SubFieldOptions",
    },
    {
      name: "forceSignerPage",
      baseName: "force_signer_page",
      type: "boolean",
    },
    {
      name: "forceSubjectMessage",
      baseName: "force_subject_message",
      type: "boolean",
    },
    {
      name: "formFieldGroups",
      baseName: "form_field_groups",
      type: "Array<SubFormFieldGroup>",
    },
    {
      name: "formFieldRules",
      baseName: "form_field_rules",
      type: "Array<SubFormFieldRule>",
    },
    {
      name: "formFieldsPerDocument",
      baseName: "form_fields_per_document",
      type: "Array<SubFormFieldsPerDocumentBase>",
    },
    {
      name: "hideTextTags",
      baseName: "hide_text_tags",
      type: "boolean",
    },
    {
      name: "holdRequest",
      baseName: "hold_request",
      type: "boolean",
    },
    {
      name: "isForEmbeddedSigning",
      baseName: "is_for_embedded_signing",
      type: "boolean",
    },
    {
      name: "message",
      baseName: "message",
      type: "string",
    },
    {
      name: "metadata",
      baseName: "metadata",
      type: "{ [key: string]: any; }",
    },
    {
      name: "requestingRedirectUrl",
      baseName: "requesting_redirect_url",
      type: "string",
    },
    {
      name: "showPreview",
      baseName: "show_preview",
      type: "boolean",
    },
    {
      name: "showProgressStepper",
      baseName: "show_progress_stepper",
      type: "boolean",
    },
    {
      name: "signers",
      baseName: "signers",
      type: "Array<SubUnclaimedDraftSigner>",
    },
    {
      name: "signingOptions",
      baseName: "signing_options",
      type: "SubSigningOptions",
    },
    {
      name: "signingRedirectUrl",
      baseName: "signing_redirect_url",
      type: "string",
    },
    {
      name: "skipMeNow",
      baseName: "skip_me_now",
      type: "boolean",
    },
    {
      name: "subject",
      baseName: "subject",
      type: "string",
    },
    {
      name: "testMode",
      baseName: "test_mode",
      type: "boolean",
    },
    {
      name: "type",
      baseName: "type",
      type: "UnclaimedDraftCreateEmbeddedRequest.TypeEnum",
    },
    {
      name: "usePreexistingFields",
      baseName: "use_preexisting_fields",
      type: "boolean",
    },
    {
      name: "useTextTags",
      baseName: "use_text_tags",
      type: "boolean",
    },
    {
      name: "populateAutoFillFields",
      baseName: "populate_auto_fill_fields",
      type: "boolean",
    },
    {
      name: "expiresAt",
      baseName: "expires_at",
      type: "number",
    },
  ];

  static getAttributeTypeMap(): AttributeTypeMap {
    return UnclaimedDraftCreateEmbeddedRequest.attributeTypeMap;
  }

  /** Attempt to instantiate and hydrate a new instance of this class */
  static init(data: any): UnclaimedDraftCreateEmbeddedRequest {
    return ObjectSerializer.deserialize(
      data,
      "UnclaimedDraftCreateEmbeddedRequest"
    );
  }
}

export namespace UnclaimedDraftCreateEmbeddedRequest {
  export enum TypeEnum {
    SendDocument = "send_document",
    RequestSignature = "request_signature",
  }
}
