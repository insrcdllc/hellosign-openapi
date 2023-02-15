/*
 * Dropbox Sign API
 *
 * Dropbox Sign v3 API
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: apisupport@hellosign.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using Dropbox.Sign.Client;
using Dropbox.Sign.Model;

namespace Dropbox.Sign.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IBulkSendJobApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get Bulk Send Job
        /// </summary>
        /// <remarks>
        /// Returns the status of the BulkSendJob and its SignatureRequests specified by the &#x60;bulk_send_job_id&#x60; parameter.
        /// </remarks>
        /// <exception cref="Dropbox.Sign.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bulkSendJobId">The id of the BulkSendJob to retrieve.</param>
        /// <param name="page">Which page number of the BulkSendJob list to return. Defaults to &#x60;1&#x60;. (optional, default to 1)</param>
        /// <param name="pageSize">Number of objects to be returned per page. Must be between &#x60;1&#x60; and &#x60;100&#x60;. Default is 20. (optional, default to 20)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>BulkSendJobGetResponse</returns>
        BulkSendJobGetResponse BulkSendJobGet(string bulkSendJobId, int? page = default(int?), int? pageSize = default(int?), int operationIndex = 0);

        /// <summary>
        /// Get Bulk Send Job
        /// </summary>
        /// <remarks>
        /// Returns the status of the BulkSendJob and its SignatureRequests specified by the &#x60;bulk_send_job_id&#x60; parameter.
        /// </remarks>
        /// <exception cref="Dropbox.Sign.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bulkSendJobId">The id of the BulkSendJob to retrieve.</param>
        /// <param name="page">Which page number of the BulkSendJob list to return. Defaults to &#x60;1&#x60;. (optional, default to 1)</param>
        /// <param name="pageSize">Number of objects to be returned per page. Must be between &#x60;1&#x60; and &#x60;100&#x60;. Default is 20. (optional, default to 20)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of BulkSendJobGetResponse</returns>
        ApiResponse<BulkSendJobGetResponse> BulkSendJobGetWithHttpInfo(string bulkSendJobId, int? page = default(int?), int? pageSize = default(int?), int operationIndex = 0);
        /// <summary>
        /// List Bulk Send Jobs
        /// </summary>
        /// <remarks>
        /// Returns a list of BulkSendJob that you can access.
        /// </remarks>
        /// <exception cref="Dropbox.Sign.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="page">Which page number of the BulkSendJob List to return. Defaults to &#x60;1&#x60;. (optional, default to 1)</param>
        /// <param name="pageSize">Number of objects to be returned per page. Must be between &#x60;1&#x60; and &#x60;100&#x60;. Default is 20. (optional, default to 20)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>BulkSendJobListResponse</returns>
        BulkSendJobListResponse BulkSendJobList(int? page = default(int?), int? pageSize = default(int?), int operationIndex = 0);

        /// <summary>
        /// List Bulk Send Jobs
        /// </summary>
        /// <remarks>
        /// Returns a list of BulkSendJob that you can access.
        /// </remarks>
        /// <exception cref="Dropbox.Sign.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="page">Which page number of the BulkSendJob List to return. Defaults to &#x60;1&#x60;. (optional, default to 1)</param>
        /// <param name="pageSize">Number of objects to be returned per page. Must be between &#x60;1&#x60; and &#x60;100&#x60;. Default is 20. (optional, default to 20)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of BulkSendJobListResponse</returns>
        ApiResponse<BulkSendJobListResponse> BulkSendJobListWithHttpInfo(int? page = default(int?), int? pageSize = default(int?), int operationIndex = 0);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IBulkSendJobApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get Bulk Send Job
        /// </summary>
        /// <remarks>
        /// Returns the status of the BulkSendJob and its SignatureRequests specified by the &#x60;bulk_send_job_id&#x60; parameter.
        /// </remarks>
        /// <exception cref="Dropbox.Sign.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bulkSendJobId">The id of the BulkSendJob to retrieve.</param>
        /// <param name="page">Which page number of the BulkSendJob list to return. Defaults to &#x60;1&#x60;. (optional, default to 1)</param>
        /// <param name="pageSize">Number of objects to be returned per page. Must be between &#x60;1&#x60; and &#x60;100&#x60;. Default is 20. (optional, default to 20)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of BulkSendJobGetResponse</returns>
        System.Threading.Tasks.Task<BulkSendJobGetResponse> BulkSendJobGetAsync(string bulkSendJobId, int? page = default(int?), int? pageSize = default(int?), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get Bulk Send Job
        /// </summary>
        /// <remarks>
        /// Returns the status of the BulkSendJob and its SignatureRequests specified by the &#x60;bulk_send_job_id&#x60; parameter.
        /// </remarks>
        /// <exception cref="Dropbox.Sign.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bulkSendJobId">The id of the BulkSendJob to retrieve.</param>
        /// <param name="page">Which page number of the BulkSendJob list to return. Defaults to &#x60;1&#x60;. (optional, default to 1)</param>
        /// <param name="pageSize">Number of objects to be returned per page. Must be between &#x60;1&#x60; and &#x60;100&#x60;. Default is 20. (optional, default to 20)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (BulkSendJobGetResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<BulkSendJobGetResponse>> BulkSendJobGetWithHttpInfoAsync(string bulkSendJobId, int? page = default(int?), int? pageSize = default(int?), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// List Bulk Send Jobs
        /// </summary>
        /// <remarks>
        /// Returns a list of BulkSendJob that you can access.
        /// </remarks>
        /// <exception cref="Dropbox.Sign.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="page">Which page number of the BulkSendJob List to return. Defaults to &#x60;1&#x60;. (optional, default to 1)</param>
        /// <param name="pageSize">Number of objects to be returned per page. Must be between &#x60;1&#x60; and &#x60;100&#x60;. Default is 20. (optional, default to 20)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of BulkSendJobListResponse</returns>
        System.Threading.Tasks.Task<BulkSendJobListResponse> BulkSendJobListAsync(int? page = default(int?), int? pageSize = default(int?), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// List Bulk Send Jobs
        /// </summary>
        /// <remarks>
        /// Returns a list of BulkSendJob that you can access.
        /// </remarks>
        /// <exception cref="Dropbox.Sign.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="page">Which page number of the BulkSendJob List to return. Defaults to &#x60;1&#x60;. (optional, default to 1)</param>
        /// <param name="pageSize">Number of objects to be returned per page. Must be between &#x60;1&#x60; and &#x60;100&#x60;. Default is 20. (optional, default to 20)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (BulkSendJobListResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<BulkSendJobListResponse>> BulkSendJobListWithHttpInfoAsync(int? page = default(int?), int? pageSize = default(int?), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IBulkSendJobApi : IBulkSendJobApiSync, IBulkSendJobApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class BulkSendJobApi : IBulkSendJobApi
    {
        private Dropbox.Sign.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="BulkSendJobApi"/> class.
        /// </summary>
        /// <returns></returns>
        public BulkSendJobApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="BulkSendJobApi"/> class.
        /// </summary>
        /// <returns></returns>
        public BulkSendJobApi(string basePath)
        {
            this.Configuration = Dropbox.Sign.Client.Configuration.MergeConfigurations(
                Dropbox.Sign.Client.GlobalConfiguration.Instance,
                new Dropbox.Sign.Client.Configuration { BasePath = basePath }
            );
            this.Client = new Dropbox.Sign.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new Dropbox.Sign.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = Dropbox.Sign.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="BulkSendJobApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public BulkSendJobApi(Dropbox.Sign.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = Dropbox.Sign.Client.Configuration.MergeConfigurations(
                Dropbox.Sign.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new Dropbox.Sign.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new Dropbox.Sign.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = Dropbox.Sign.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="BulkSendJobApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public BulkSendJobApi(Dropbox.Sign.Client.ISynchronousClient client, Dropbox.Sign.Client.IAsynchronousClient asyncClient, Dropbox.Sign.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = Dropbox.Sign.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public Dropbox.Sign.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public Dropbox.Sign.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public string GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Dropbox.Sign.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public Dropbox.Sign.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Get Bulk Send Job Returns the status of the BulkSendJob and its SignatureRequests specified by the &#x60;bulk_send_job_id&#x60; parameter.
        /// </summary>
        /// <exception cref="Dropbox.Sign.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bulkSendJobId">The id of the BulkSendJob to retrieve.</param>
        /// <param name="page">Which page number of the BulkSendJob list to return. Defaults to &#x60;1&#x60;. (optional, default to 1)</param>
        /// <param name="pageSize">Number of objects to be returned per page. Must be between &#x60;1&#x60; and &#x60;100&#x60;. Default is 20. (optional, default to 20)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>BulkSendJobGetResponse</returns>
        public BulkSendJobGetResponse BulkSendJobGet(string bulkSendJobId, int? page = default(int?), int? pageSize = default(int?), int operationIndex = 0)
        {
            Dropbox.Sign.Client.ApiResponse<BulkSendJobGetResponse> localVarResponse = BulkSendJobGetWithHttpInfo(bulkSendJobId, page, pageSize);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Bulk Send Job Returns the status of the BulkSendJob and its SignatureRequests specified by the &#x60;bulk_send_job_id&#x60; parameter.
        /// </summary>
        /// <exception cref="Dropbox.Sign.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bulkSendJobId">The id of the BulkSendJob to retrieve.</param>
        /// <param name="page">Which page number of the BulkSendJob list to return. Defaults to &#x60;1&#x60;. (optional, default to 1)</param>
        /// <param name="pageSize">Number of objects to be returned per page. Must be between &#x60;1&#x60; and &#x60;100&#x60;. Default is 20. (optional, default to 20)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of BulkSendJobGetResponse</returns>
        public Dropbox.Sign.Client.ApiResponse<BulkSendJobGetResponse> BulkSendJobGetWithHttpInfo(string bulkSendJobId, int? page = default(int?), int? pageSize = default(int?), int operationIndex = 0)
        {
            // verify the required parameter 'bulkSendJobId' is set
            if (bulkSendJobId == null)
            {
                throw new Dropbox.Sign.Client.ApiException(400, "Missing required parameter 'bulkSendJobId' when calling BulkSendJobApi->BulkSendJobGet");
            }

            Dropbox.Sign.Client.RequestOptions localVarRequestOptions = new Dropbox.Sign.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };
            var localVarContentType = Dropbox.Sign.Client.ClientUtils.SelectHeaderContentType(_contentTypes);

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = Dropbox.Sign.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("bulk_send_job_id", Dropbox.Sign.Client.ClientUtils.ParameterToString(bulkSendJobId)); // path parameter
            if (page != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dropbox.Sign.Client.ClientUtils.ParameterToMultiMap("", "page", page));
            }
            if (pageSize != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dropbox.Sign.Client.ClientUtils.ParameterToMultiMap("", "page_size", pageSize));
            }
            localVarRequestOptions.Operation = "BulkSendJobApi.BulkSendJobGet";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (api_key) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + Dropbox.Sign.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }
            // authentication (oauth2) required
            // bearer authentication required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // make the HTTP request
            var localVarResponse = this.Client.Get<BulkSendJobGetResponse>("/bulk_send_job/{bulk_send_job_id}", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("BulkSendJobGet", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get Bulk Send Job Returns the status of the BulkSendJob and its SignatureRequests specified by the &#x60;bulk_send_job_id&#x60; parameter.
        /// </summary>
        /// <exception cref="Dropbox.Sign.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bulkSendJobId">The id of the BulkSendJob to retrieve.</param>
        /// <param name="page">Which page number of the BulkSendJob list to return. Defaults to &#x60;1&#x60;. (optional, default to 1)</param>
        /// <param name="pageSize">Number of objects to be returned per page. Must be between &#x60;1&#x60; and &#x60;100&#x60;. Default is 20. (optional, default to 20)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of BulkSendJobGetResponse</returns>
        public async System.Threading.Tasks.Task<BulkSendJobGetResponse> BulkSendJobGetAsync(string bulkSendJobId, int? page = default(int?), int? pageSize = default(int?), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Dropbox.Sign.Client.ApiResponse<BulkSendJobGetResponse> localVarResponse = await BulkSendJobGetWithHttpInfoAsync(bulkSendJobId, page, pageSize, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Bulk Send Job Returns the status of the BulkSendJob and its SignatureRequests specified by the &#x60;bulk_send_job_id&#x60; parameter.
        /// </summary>
        /// <exception cref="Dropbox.Sign.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bulkSendJobId">The id of the BulkSendJob to retrieve.</param>
        /// <param name="page">Which page number of the BulkSendJob list to return. Defaults to &#x60;1&#x60;. (optional, default to 1)</param>
        /// <param name="pageSize">Number of objects to be returned per page. Must be between &#x60;1&#x60; and &#x60;100&#x60;. Default is 20. (optional, default to 20)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (BulkSendJobGetResponse)</returns>
        public async System.Threading.Tasks.Task<Dropbox.Sign.Client.ApiResponse<BulkSendJobGetResponse>> BulkSendJobGetWithHttpInfoAsync(string bulkSendJobId, int? page = default(int?), int? pageSize = default(int?), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'bulkSendJobId' is set
            if (bulkSendJobId == null)
            {
                throw new Dropbox.Sign.Client.ApiException(400, "Missing required parameter 'bulkSendJobId' when calling BulkSendJobApi->BulkSendJobGet");
            }


            Dropbox.Sign.Client.RequestOptions localVarRequestOptions = new Dropbox.Sign.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            var localVarContentType = Dropbox.Sign.Client.ClientUtils.SelectHeaderContentType(_contentTypes);

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = Dropbox.Sign.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("bulk_send_job_id", Dropbox.Sign.Client.ClientUtils.ParameterToString(bulkSendJobId)); // path parameter
            if (page != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dropbox.Sign.Client.ClientUtils.ParameterToMultiMap("", "page", page));
            }
            if (pageSize != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dropbox.Sign.Client.ClientUtils.ParameterToMultiMap("", "page_size", pageSize));
            }
            localVarRequestOptions.Operation = "BulkSendJobApi.BulkSendJobGet";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (api_key) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + Dropbox.Sign.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }
            // authentication (oauth2) required
            // bearer authentication required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<BulkSendJobGetResponse>("/bulk_send_job/{bulk_send_job_id}", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("BulkSendJobGet", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// List Bulk Send Jobs Returns a list of BulkSendJob that you can access.
        /// </summary>
        /// <exception cref="Dropbox.Sign.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="page">Which page number of the BulkSendJob List to return. Defaults to &#x60;1&#x60;. (optional, default to 1)</param>
        /// <param name="pageSize">Number of objects to be returned per page. Must be between &#x60;1&#x60; and &#x60;100&#x60;. Default is 20. (optional, default to 20)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>BulkSendJobListResponse</returns>
        public BulkSendJobListResponse BulkSendJobList(int? page = default(int?), int? pageSize = default(int?), int operationIndex = 0)
        {
            Dropbox.Sign.Client.ApiResponse<BulkSendJobListResponse> localVarResponse = BulkSendJobListWithHttpInfo(page, pageSize);
            return localVarResponse.Data;
        }

        /// <summary>
        /// List Bulk Send Jobs Returns a list of BulkSendJob that you can access.
        /// </summary>
        /// <exception cref="Dropbox.Sign.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="page">Which page number of the BulkSendJob List to return. Defaults to &#x60;1&#x60;. (optional, default to 1)</param>
        /// <param name="pageSize">Number of objects to be returned per page. Must be between &#x60;1&#x60; and &#x60;100&#x60;. Default is 20. (optional, default to 20)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of BulkSendJobListResponse</returns>
        public Dropbox.Sign.Client.ApiResponse<BulkSendJobListResponse> BulkSendJobListWithHttpInfo(int? page = default(int?), int? pageSize = default(int?), int operationIndex = 0)
        {
            Dropbox.Sign.Client.RequestOptions localVarRequestOptions = new Dropbox.Sign.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };
            var localVarContentType = Dropbox.Sign.Client.ClientUtils.SelectHeaderContentType(_contentTypes);

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = Dropbox.Sign.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            if (page != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dropbox.Sign.Client.ClientUtils.ParameterToMultiMap("", "page", page));
            }
            if (pageSize != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dropbox.Sign.Client.ClientUtils.ParameterToMultiMap("", "page_size", pageSize));
            }
            localVarRequestOptions.Operation = "BulkSendJobApi.BulkSendJobList";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (api_key) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + Dropbox.Sign.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }
            // authentication (oauth2) required
            // bearer authentication required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // make the HTTP request
            var localVarResponse = this.Client.Get<BulkSendJobListResponse>("/bulk_send_job/list", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("BulkSendJobList", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// List Bulk Send Jobs Returns a list of BulkSendJob that you can access.
        /// </summary>
        /// <exception cref="Dropbox.Sign.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="page">Which page number of the BulkSendJob List to return. Defaults to &#x60;1&#x60;. (optional, default to 1)</param>
        /// <param name="pageSize">Number of objects to be returned per page. Must be between &#x60;1&#x60; and &#x60;100&#x60;. Default is 20. (optional, default to 20)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of BulkSendJobListResponse</returns>
        public async System.Threading.Tasks.Task<BulkSendJobListResponse> BulkSendJobListAsync(int? page = default(int?), int? pageSize = default(int?), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Dropbox.Sign.Client.ApiResponse<BulkSendJobListResponse> localVarResponse = await BulkSendJobListWithHttpInfoAsync(page, pageSize, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// List Bulk Send Jobs Returns a list of BulkSendJob that you can access.
        /// </summary>
        /// <exception cref="Dropbox.Sign.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="page">Which page number of the BulkSendJob List to return. Defaults to &#x60;1&#x60;. (optional, default to 1)</param>
        /// <param name="pageSize">Number of objects to be returned per page. Must be between &#x60;1&#x60; and &#x60;100&#x60;. Default is 20. (optional, default to 20)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (BulkSendJobListResponse)</returns>
        public async System.Threading.Tasks.Task<Dropbox.Sign.Client.ApiResponse<BulkSendJobListResponse>> BulkSendJobListWithHttpInfoAsync(int? page = default(int?), int? pageSize = default(int?), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            Dropbox.Sign.Client.RequestOptions localVarRequestOptions = new Dropbox.Sign.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            var localVarContentType = Dropbox.Sign.Client.ClientUtils.SelectHeaderContentType(_contentTypes);

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = Dropbox.Sign.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            if (page != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dropbox.Sign.Client.ClientUtils.ParameterToMultiMap("", "page", page));
            }
            if (pageSize != null)
            {
                localVarRequestOptions.QueryParameters.Add(Dropbox.Sign.Client.ClientUtils.ParameterToMultiMap("", "page_size", pageSize));
            }
            localVarRequestOptions.Operation = "BulkSendJobApi.BulkSendJobList";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (api_key) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + Dropbox.Sign.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }
            // authentication (oauth2) required
            // bearer authentication required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<BulkSendJobListResponse>("/bulk_send_job/list", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("BulkSendJobList", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
