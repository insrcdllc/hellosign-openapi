# # TemplateResponseDocumentCustomField



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
| `name` | ```string``` |  The name of the Custom Field.  |  |
| `type` | ```string``` |  The type of this Custom Field. Only `text` and `checkbox` are currently supported.  |  |
| `signer` | ```string``` |  The signer of the Custom Field.  |  |
| `x` | ```int``` |  The horizontal offset in pixels for this form field.  |  |
| `y` | ```int``` |  The vertical offset in pixels for this form field.  |  |
| `width` | ```int``` |  The width in pixels of this form field.  |  |
| `height` | ```int``` |  The height in pixels of this form field.  |  |
| `required` | ```bool``` |  Boolean showing whether or not this field is required.  |  |
| `api_id` | ```string``` |  The unique ID for this field.  |  |
| `group` | ```string``` |  The name of the group this field is in. If this field is not a group, this defaults to `null`.  |  |
| `avg_text_length` | [```\HelloSignSDK\Model\TemplateResponseFieldAvgTextLength```](TemplateResponseFieldAvgTextLength.md) |    |  |
| `is_multiline` | ```bool``` |  Whether this form field is multiline text.  |  |
| `original_font_size` | ```int``` |  Original font size used in this form field&#39;s text.  |  |
| `font_family` | ```string``` |  Font family used in this form field&#39;s text.  |  |
| `named_form_fields` | ```array``` |  Deprecated. Use `form_fields` inside the [documents](https://developers.hellosign.com/api/reference/operation/templateGet/#!c&#x3D;200&amp;path&#x3D;template/documents&amp;t&#x3D;response) array instead.  |  |
| `reusable_form_id` | ```string``` |    |  |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)