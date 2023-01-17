curl -X POST 'https://api.hellosign.com/v3/signature_request/create_embedded' \
  -u 'YOUR_API_KEY:' \
  -F 'client_id=YOUR_CLIENT_ID' \
  -F 'files[0]=@mutual-NDA-example.pdf' \
  -F 'title=NDA with Acme Co.' \
  -F 'subject=The NDA we talked about' \
  -F 'message=Please sign this NDA and then we can discuss more. Let me know if you have any questions.' \
  -F 'signers[0][email_address]=jack@example.com' \
  -F 'signers[0][name]=Jack' \
  -F 'signers[0][order]=0' \
  -F 'signers[1][email_address]=jill@example.com' \
  -F 'signers[1][name]=Jill' \
  -F 'signers[1][order]=1' \
  -F 'cc_email_addresses[]=lawyer@dropboxsign.com' \
  -F 'cc_email_addresses[]=lawyer@dropboxsign.com' \
  -F 'signing_options[draw]=1' \
  -F 'signing_options[type]=1' \
  -F 'signing_options[upload]=1' \
  -F 'signing_options[phone]=1' \
  -F 'signing_options[default_type]=draw' \
  -F 'test_mode=1'
