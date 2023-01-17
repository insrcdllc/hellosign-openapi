import * as HelloSign from "hellosign-sdk";

const accountApi = new HelloSign.AccountApi();

// Configure HTTP basic authorization: api_key
accountApi.username = "YOUR_API_KEY";

// or, configure Bearer (JWT) authorization: oauth2
// accountApi.accessToken = "YOUR_ACCESS_TOKEN";

const data: HelloSign.AccountCreateRequest = {
  emailAddress: "newuser@dropboxsign.com",
};

const result = accountApi.accountCreate(data);
result.then(response => {
  console.log(response.body);
}).catch(error => {
  console.log("Exception when calling Dropbox Sign API:");
  console.log(error.body);
});
