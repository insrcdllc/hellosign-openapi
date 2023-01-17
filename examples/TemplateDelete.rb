require "hellosign-ruby-sdk"

HelloSign.configure do |config|
  # Configure HTTP basic authorization: api_key
  config.username = "YOUR_API_KEY"

  # or, configure Bearer (JWT) authorization: oauth2
  # config.access_token = "YOUR_ACCESS_TOKEN"
end

template_api = HelloSign::TemplateApi.new

template_id = "5de8179668f2033afac48da1868d0093bf133266"

begin
  result = template_api.template_delete(template_id)
  p result
rescue HelloSign::ApiError => e
  puts "Exception when calling Dropbox Sign API: #{e}"
end
