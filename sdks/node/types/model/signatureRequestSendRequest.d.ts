import { RequestFile, AttributeTypeMap } from "./models";
import { SubAttachment } from "./subAttachment";
import { SubCustomField } from "./subCustomField";
import { SubFieldOptions } from "./subFieldOptions";
import { SubFormFieldGroup } from "./subFormFieldGroup";
import { SubFormFieldRule } from "./subFormFieldRule";
import { SubFormFieldsPerDocumentBase } from "./subFormFieldsPerDocumentBase";
import { SubSignatureRequestGroupedSigners } from "./subSignatureRequestGroupedSigners";
import { SubSignatureRequestSigner } from "./subSignatureRequestSigner";
import { SubSigningOptions } from "./subSigningOptions";
export declare class SignatureRequestSendRequest {
    "files"?: Array<RequestFile>;
    "fileUrls"?: Array<string>;
    "signers"?: Array<SubSignatureRequestSigner>;
    "groupedSigners"?: Array<SubSignatureRequestGroupedSigners>;
    "allowDecline"?: boolean;
    "allowReassign"?: boolean;
    "attachments"?: Array<SubAttachment>;
    "ccEmailAddresses"?: Array<string>;
    "clientId"?: string;
    "customFields"?: Array<SubCustomField>;
    "fieldOptions"?: SubFieldOptions;
    "formFieldGroups"?: Array<SubFormFieldGroup>;
    "formFieldRules"?: Array<SubFormFieldRule>;
    "formFieldsPerDocument"?: Array<SubFormFieldsPerDocumentBase>;
    "hideTextTags"?: boolean;
    "isQualifiedSignature"?: boolean;
    "message"?: string;
    "metadata"?: {
        [key: string]: any;
    };
    "signingOptions"?: SubSigningOptions;
    "signingRedirectUrl"?: string;
    "subject"?: string;
    "testMode"?: boolean;
    "title"?: string;
    "useTextTags"?: boolean;
    "expiresAt"?: number | null;
    static discriminator: string | undefined;
    static attributeTypeMap: AttributeTypeMap;
    static getAttributeTypeMap(): AttributeTypeMap;
}
