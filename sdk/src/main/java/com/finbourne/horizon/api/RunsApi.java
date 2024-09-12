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


import com.finbourne.horizon.model.IntegrationRunResponse;
import com.finbourne.horizon.model.LusidProblemDetails;

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


    private ApiResponse<IntegrationRunResponse> getRunResultsWithHttpInfo(String filter, List<String> sortBy, Integer limit, String pageToken) throws ApiException {
        okhttp3.Call localVarCall = getRunResultsValidateBeforeCall(filter, sortBy, limit, pageToken, null, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<IntegrationRunResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private ApiResponse<IntegrationRunResponse> getRunResultsWithHttpInfo(String filter, List<String> sortBy, Integer limit, String pageToken, ConfigurationOptions opts) throws ApiException {
        okhttp3.Call localVarCall = getRunResultsValidateBeforeCall(filter, sortBy, limit, pageToken, null, opts);
        Type localVarReturnType = new TypeToken<IntegrationRunResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getRunResultsAsync(String filter, List<String> sortBy, Integer limit, String pageToken, final ApiCallback<IntegrationRunResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRunResultsValidateBeforeCall(filter, sortBy, limit, pageToken, _callback, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<IntegrationRunResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    private okhttp3.Call getRunResultsAsync(String filter, List<String> sortBy, Integer limit, String pageToken, final ApiCallback<IntegrationRunResponse> _callback, ConfigurationOptions opts) throws ApiException {

        okhttp3.Call localVarCall = getRunResultsValidateBeforeCall(filter, sortBy, limit, pageToken, _callback, opts);
        Type localVarReturnType = new TypeToken<IntegrationRunResponse>(){}.getType();
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
         * @param filter  (optional)
         * @return APIgetRunResultsRequest
         */
        public APIgetRunResultsRequest filter(String filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Set sortBy
         * @param sortBy  (optional)
         * @return APIgetRunResultsRequest
         */
        public APIgetRunResultsRequest sortBy(List<String> sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Set limit
         * @param limit  (optional, default to 10)
         * @return APIgetRunResultsRequest
         */
        public APIgetRunResultsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set pageToken
         * @param pageToken  (optional, default to )
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
         * @return IntegrationRunResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public IntegrationRunResponse execute() throws ApiException {
            ApiResponse<IntegrationRunResponse> localVarResp = getRunResultsWithHttpInfo(filter, sortBy, limit, pageToken);
            return localVarResp.getData();
        }

        /**
         * Execute getRunResults request. Use any specified configuration options to override any other configuration for this request only.
         * @return IntegrationRunResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public IntegrationRunResponse execute(ConfigurationOptions opts) throws ApiException {
            ApiResponse<IntegrationRunResponse> localVarResp = getRunResultsWithHttpInfo(filter, sortBy, limit, pageToken, opts);
            return localVarResp.getData();
        }

        /**
         * Execute getRunResults request with HTTP info returned
         * @return ApiResponse&lt;IntegrationRunResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<IntegrationRunResponse> executeWithHttpInfo() throws ApiException {
            return getRunResultsWithHttpInfo(filter, sortBy, limit, pageToken);
        }

        /**
         * Execute getRunResults request with HTTP info returned. Use any specified configuration options to override any other configuration for this request only.
         * @return ApiResponse&lt;IntegrationRunResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<IntegrationRunResponse> executeWithHttpInfo(ConfigurationOptions opts) throws ApiException {
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
        public okhttp3.Call executeAsync(final ApiCallback<IntegrationRunResponse> _callback) throws ApiException {
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
        public okhttp3.Call executeAsync(final ApiCallback<IntegrationRunResponse> _callback, ConfigurationOptions opts) throws ApiException {
            return getRunResultsAsync(filter, sortBy, limit, pageToken, _callback, opts);
        }
    }

    /**
     * [EXPERIMENTAL] GetRunResults: 
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
}
