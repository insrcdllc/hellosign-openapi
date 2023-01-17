<?php

require_once __DIR__ . "/vendor/autoload.php";

$config = HelloSign\Configuration::getDefaultConfiguration();

// Configure HTTP basic authorization: api_key
$config->setUsername("YOUR_API_KEY");

// or, configure Bearer (JWT) authorization: oauth2
// $config->setAccessToken("YOUR_ACCESS_TOKEN");

$signatureRequestApi = new HelloSign\Api\SignatureRequestApi($config);

$data = new HelloSign\Model\SignatureRequestRemindRequest();
$data->setEmailAddress("john@example.com");

$signatureRequestId = "2f9781e1a8e2045224d808c153c2e1d3df6f8f2f";

try {
    $result = $signatureRequestApi->signatureRequestRemind($signatureRequestId, $data);
    print_r($result);
} catch (HelloSign\ApiException $e) {
    $error = $e->getResponseObject();
    echo "Exception when calling Dropbox Sign API: "
        . print_r($error->getError());
}
