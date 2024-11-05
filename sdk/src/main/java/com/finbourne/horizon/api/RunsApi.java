/*
 * FINBOURNE Horizon API
 *
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.finbourne.horizon.api;

import com.finbourne.horizon.ApiCallback;
import com.finbourne.horizon.ApiClient;
import com.finbourne.horizon.ApiException;
import com.finbourne.horizon.ApiResponse;
import com.finbourne.horizon.Configuration;
import com.finbourne.horizon.Pair;
import com.finbourne.horizon.ProgressRequestBody;
import com.finbourne.horizon.ProgressResponseBody;
import com.finbourne.horizon.extensions.ConfigurationOptions;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.finbourne.horizon.model.IntegrationRerunResponse;
import com.finbourne.horizon.model.LusidProblemDetails;
import com.finbourne.horizon.model.PagedResourceListOfIntegrationRunResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RunsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RunsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RunsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getRunResultsCall(String filter, List<String> sortBy, Integer limit, String pageToken, final ApiCallback _callback) throws ApiException {
        return getRunResultsCall(filter, sortBy, limit, pageToken,  _callback, new ConfigurationOptions());
    }

    private okhttp3.Call getRunResultsCall(String filter, List<String> sortBy, Integer limit, String pageToken, final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/runs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (sortBy != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "sortBy", sortBy));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (pageToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageToken", pageToken));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, opts);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getRunResultsValidateBeforeCall(String filter, List<String> sortBy, Integer limit, String pageToken, final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
        return getRunResultsCall(filter, sortBy, limit, pageToken, _callback, opts);

    }


    private ApiResponse<PagedResourceListOfIntegrationRunResponse> getRunResultsWithHttpInfo(String filter, List<String> sortBy, Integer limit, String pageToken) throws ApiException {
        okhttp3.Call localVarCall = getRunResultsValidateBeforeCall(filter, sortBy, limit, pageToken, null, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<PagedResourceListOfIntegrationRunResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private ApiResponse<PagedResourceListOfIntegrationRunResponse> getRunResultsWithHttpInfo(String filter, List<String> sortBy, Integer limit, String pageToken, ConfigurationOptions opts) throws ApiException {
        okhttp3.Call localVarCall = getRunResultsValidateBeforeCall(filter, sortBy, limit, pageToken, null, opts);
        Type localVarReturnType = new TypeToken<PagedResourceListOfIntegrationRunResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getRunResultsAsync(String filter, List<String> sortBy, Integer limit, String pageToken, final ApiCallback<PagedResourceListOfIntegrationRunResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRunResultsValidateBeforeCall(filter, sortBy, limit, pageToken, _callback, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<PagedResourceListOfIntegrationRunResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    private okhttp3.Call getRunResultsAsync(String filter, List<String> sortBy, Integer limit, String pageToken, final ApiCallback<PagedResourceListOfIntegrationRunResponse> _callback, ConfigurationOptions opts) throws ApiException {

        okhttp3.Call localVarCall = getRunResultsValidateBeforeCall(filter, sortBy, limit, pageToken, _callback, opts);
        Type localVarReturnType = new TypeToken<PagedResourceListOfIntegrationRunResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetRunResultsRequest {
        private String filter;
        private List<String> sortBy;
        private Integer limit;
        private String pageToken;

        private APIgetRunResultsRequest() {
        }

        /**
         * Set filter
         * @param filter Expression to filter the result set. (optional)
         * @return APIgetRunResultsRequest
         */
        public APIgetRunResultsRequest filter(String filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Set sortBy
         * @param sortBy A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. (optional)
         * @return APIgetRunResultsRequest
         */
        public APIgetRunResultsRequest sortBy(List<String> sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Set limit
         * @param limit When paginating, limit the results to this number. (optional, default to 100)
         * @return APIgetRunResultsRequest
         */
        public APIgetRunResultsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set pageToken
         * @param pageToken The pagination token to use to continue listing integration runs; this value is returned from   the previous call. If a pagination token is provided, the &lt;i&gt;sortBy&lt;/i&gt; and &lt;i&gt;filter&lt;/i&gt; fields must not have changed since the original request. (optional, default to )
         * @return APIgetRunResultsRequest
         */
        public APIgetRunResultsRequest pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }

        /**
         * Build call for getRunResults
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getRunResultsCall(filter, sortBy, limit, pageToken, _callback);
        }

        /**
         * Execute getRunResults request
         * @return PagedResourceListOfIntegrationRunResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public PagedResourceListOfIntegrationRunResponse execute() throws ApiException {
            ApiResponse<PagedResourceListOfIntegrationRunResponse> localVarResp = getRunResultsWithHttpInfo(filter, sortBy, limit, pageToken);
            return localVarResp.getData();
        }

        /**
         * Execute getRunResults request. Use any specified configuration options to override any other configuration for this request only.
         * @return PagedResourceListOfIntegrationRunResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public PagedResourceListOfIntegrationRunResponse execute(ConfigurationOptions opts) throws ApiException {
            ApiResponse<PagedResourceListOfIntegrationRunResponse> localVarResp = getRunResultsWithHttpInfo(filter, sortBy, limit, pageToken, opts);
            return localVarResp.getData();
        }

        /**
         * Execute getRunResults request with HTTP info returned
         * @return ApiResponse&lt;PagedResourceListOfIntegrationRunResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PagedResourceListOfIntegrationRunResponse> executeWithHttpInfo() throws ApiException {
            return getRunResultsWithHttpInfo(filter, sortBy, limit, pageToken);
        }

        /**
         * Execute getRunResults request with HTTP info returned. Use any specified configuration options to override any other configuration for this request only.
         * @return ApiResponse&lt;PagedResourceListOfIntegrationRunResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PagedResourceListOfIntegrationRunResponse> executeWithHttpInfo(ConfigurationOptions opts) throws ApiException {
            return getRunResultsWithHttpInfo(filter, sortBy, limit, pageToken, opts);
        }

        /**
         * Execute getRunResults request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PagedResourceListOfIntegrationRunResponse> _callback) throws ApiException {
            return getRunResultsAsync(filter, sortBy, limit, pageToken, _callback);
        }

        /**
         * Execute getRunResults request (asynchronously). Use any specified configuration options to override any other configuration for this request only.
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PagedResourceListOfIntegrationRunResponse> _callback, ConfigurationOptions opts) throws ApiException {
            return getRunResultsAsync(filter, sortBy, limit, pageToken, _callback, opts);
        }
    }

    /**
     * [EXPERIMENTAL] GetRunResults: Get run results
     * Get run results
     * @return APIgetRunResultsRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public APIgetRunResultsRequest getRunResults() {
        return new APIgetRunResultsRequest();
    }
    private okhttp3.Call rerunInstanceCall(String runId, final ApiCallback _callback) throws ApiException {
        return rerunInstanceCall(runId,  _callback, new ConfigurationOptions());
    }

    private okhttp3.Call rerunInstanceCall(String runId, final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/runs/{runId}/rerun"
            .replace("{" + "runId" + "}", localVarApiClient.escapeString(runId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, opts);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call rerunInstanceValidateBeforeCall(String runId, final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
        // verify the required parameter 'runId' is set
        if (runId == null) {
            throw new ApiException("Missing the required parameter 'runId' when calling rerunInstance(Async)");
        }

        return rerunInstanceCall(runId, _callback, opts);

    }


    private ApiResponse<IntegrationRerunResponse> rerunInstanceWithHttpInfo(String runId) throws ApiException {
        okhttp3.Call localVarCall = rerunInstanceValidateBeforeCall(runId, null, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<IntegrationRerunResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private ApiResponse<IntegrationRerunResponse> rerunInstanceWithHttpInfo(String runId, ConfigurationOptions opts) throws ApiException {
        okhttp3.Call localVarCall = rerunInstanceValidateBeforeCall(runId, null, opts);
        Type localVarReturnType = new TypeToken<IntegrationRerunResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call rerunInstanceAsync(String runId, final ApiCallback<IntegrationRerunResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = rerunInstanceValidateBeforeCall(runId, _callback, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<IntegrationRerunResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    private okhttp3.Call rerunInstanceAsync(String runId, final ApiCallback<IntegrationRerunResponse> _callback, ConfigurationOptions opts) throws ApiException {

        okhttp3.Call localVarCall = rerunInstanceValidateBeforeCall(runId, _callback, opts);
        Type localVarReturnType = new TypeToken<IntegrationRerunResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIrerunInstanceRequest {
        private final String runId;

        private APIrerunInstanceRequest(String runId) {
            this.runId = runId;
        }

        /**
         * Build call for rerunInstance
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The instance was rerun. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The execution does not exist. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return rerunInstanceCall(runId, _callback);
        }

        /**
         * Execute rerunInstance request
         * @return IntegrationRerunResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The instance was rerun. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The execution does not exist. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public IntegrationRerunResponse execute() throws ApiException {
            ApiResponse<IntegrationRerunResponse> localVarResp = rerunInstanceWithHttpInfo(runId);
            return localVarResp.getData();
        }

        /**
         * Execute rerunInstance request. Use any specified configuration options to override any other configuration for this request only.
         * @return IntegrationRerunResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The instance was rerun. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The execution does not exist. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public IntegrationRerunResponse execute(ConfigurationOptions opts) throws ApiException {
            ApiResponse<IntegrationRerunResponse> localVarResp = rerunInstanceWithHttpInfo(runId, opts);
            return localVarResp.getData();
        }

        /**
         * Execute rerunInstance request with HTTP info returned
         * @return ApiResponse&lt;IntegrationRerunResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The instance was rerun. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The execution does not exist. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<IntegrationRerunResponse> executeWithHttpInfo() throws ApiException {
            return rerunInstanceWithHttpInfo(runId);
        }

        /**
         * Execute rerunInstance request with HTTP info returned. Use any specified configuration options to override any other configuration for this request only.
         * @return ApiResponse&lt;IntegrationRerunResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The instance was rerun. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The execution does not exist. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<IntegrationRerunResponse> executeWithHttpInfo(ConfigurationOptions opts) throws ApiException {
            return rerunInstanceWithHttpInfo(runId, opts);
        }

        /**
         * Execute rerunInstance request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The instance was rerun. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The execution does not exist. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<IntegrationRerunResponse> _callback) throws ApiException {
            return rerunInstanceAsync(runId, _callback);
        }

        /**
         * Execute rerunInstance request (asynchronously). Use any specified configuration options to override any other configuration for this request only.
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The instance was rerun. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The execution does not exist. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<IntegrationRerunResponse> _callback, ConfigurationOptions opts) throws ApiException {
            return rerunInstanceAsync(runId, _callback, opts);
        }
    }

    /**
     * [EXPERIMENTAL] RerunInstance: Reruns a single instance execution.
     * &lt;br&gt;Reruns an execution instance of an integration.  &lt;br /&gt;  &lt;br /&gt;  &lt;br&gt;The user must be authenticated, entitled to call this method, and the user&#39;s domain must be licensed for the integration.
     * @param runId Run identifier e.g. \&quot;b64135e7-98a0-41af-a845-d86167d54cc7\&quot;. (required)
     * @return APIrerunInstanceRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The instance was rerun. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The execution does not exist. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public APIrerunInstanceRequest rerunInstance(String runId) {
        return new APIrerunInstanceRequest(runId);
    }
}
