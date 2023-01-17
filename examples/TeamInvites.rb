require "hellosign-ruby-sdk"

HelloSign.configure do |config|
  # Configure HTTP basic authorization: api_key
  config.username = "YOUR_API_KEY"

  # or, configure Bearer (JWT) authorization: oauth2
  # config.access_token = "YOUR_ACCESS_TOKEN"
end

team_api = HelloSign::TeamApi.new

email_address = "user@dropboxsign.com"

begin
  result = team_api.team_invites({email_address: email_address})
  p result
rescue HelloSign::ApiError => e
  puts "Exception when calling Dropbox Sign API: #{e}"
end
