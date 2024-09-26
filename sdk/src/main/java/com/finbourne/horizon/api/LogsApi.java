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


import com.finbourne.horizon.model.IIntegrationLogResponse;
import com.finbourne.horizon.model.LusidProblemDetails;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LogsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LogsApi(ApiClient apiClient) {
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

    private okhttp3.Call getIntegrationLogResultsCall(String filter, List<String> sortBy, Integer limit, String pageToken, final ApiCallback _callback) throws ApiException {
        return getIntegrationLogResultsCall(filter, sortBy, limit, pageToken,  _callback, new ConfigurationOptions());
    }

    private okhttp3.Call getIntegrationLogResultsCall(String filter, List<String> sortBy, Integer limit, String pageToken, final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
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
        String localVarPath = "/api/logs";

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
    private okhttp3.Call getIntegrationLogResultsValidateBeforeCall(String filter, List<String> sortBy, Integer limit, String pageToken, final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
        return getIntegrationLogResultsCall(filter, sortBy, limit, pageToken, _callback, opts);

    }


    private ApiResponse<IIntegrationLogResponse> getIntegrationLogResultsWithHttpInfo(String filter, List<String> sortBy, Integer limit, String pageToken) throws ApiException {
        okhttp3.Call localVarCall = getIntegrationLogResultsValidateBeforeCall(filter, sortBy, limit, pageToken, null, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<IIntegrationLogResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private ApiResponse<IIntegrationLogResponse> getIntegrationLogResultsWithHttpInfo(String filter, List<String> sortBy, Integer limit, String pageToken, ConfigurationOptions opts) throws ApiException {
        okhttp3.Call localVarCall = getIntegrationLogResultsValidateBeforeCall(filter, sortBy, limit, pageToken, null, opts);
        Type localVarReturnType = new TypeToken<IIntegrationLogResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getIntegrationLogResultsAsync(String filter, List<String> sortBy, Integer limit, String pageToken, final ApiCallback<IIntegrationLogResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getIntegrationLogResultsValidateBeforeCall(filter, sortBy, limit, pageToken, _callback, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<IIntegrationLogResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    private okhttp3.Call getIntegrationLogResultsAsync(String filter, List<String> sortBy, Integer limit, String pageToken, final ApiCallback<IIntegrationLogResponse> _callback, ConfigurationOptions opts) throws ApiException {

        okhttp3.Call localVarCall = getIntegrationLogResultsValidateBeforeCall(filter, sortBy, limit, pageToken, _callback, opts);
        Type localVarReturnType = new TypeToken<IIntegrationLogResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetIntegrationLogResultsRequest {
        private String filter;
        private List<String> sortBy;
        private Integer limit;
        private String pageToken;

        private APIgetIntegrationLogResultsRequest() {
        }

        /**
         * Set filter
         * @param filter Expression to filter the result set. (optional)
         * @return APIgetIntegrationLogResultsRequest
         */
        public APIgetIntegrationLogResultsRequest filter(String filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Set sortBy
         * @param sortBy A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. (optional)
         * @return APIgetIntegrationLogResultsRequest
         */
        public APIgetIntegrationLogResultsRequest sortBy(List<String> sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Set limit
         * @param limit When paginating, limit the results to this number. (optional, default to 100)
         * @return APIgetIntegrationLogResultsRequest
         */
        public APIgetIntegrationLogResultsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set pageToken
         * @param pageToken The pagination token to use to continue listing integration logs; this value is returned from   the previous call. If a pagination token is provided, the &lt;i&gt;sortBy&lt;/i&gt; and &lt;i&gt;filter&lt;/i&gt; fields must not have changed since the original request.   For more information, see https://support.lusid.com/knowledgebase/article/KA-01915. (optional, default to )
         * @return APIgetIntegrationLogResultsRequest
         */
        public APIgetIntegrationLogResultsRequest pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }

        /**
         * Build call for getIntegrationLogResults
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
            return getIntegrationLogResultsCall(filter, sortBy, limit, pageToken, _callback);
        }

        /**
         * Execute getIntegrationLogResults request
         * @return IIntegrationLogResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public IIntegrationLogResponse execute() throws ApiException {
            ApiResponse<IIntegrationLogResponse> localVarResp = getIntegrationLogResultsWithHttpInfo(filter, sortBy, limit, pageToken);
            return localVarResp.getData();
        }

        /**
         * Execute getIntegrationLogResults request. Use any specified configuration options to override any other configuration for this request only.
         * @return IIntegrationLogResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public IIntegrationLogResponse execute(ConfigurationOptions opts) throws ApiException {
            ApiResponse<IIntegrationLogResponse> localVarResp = getIntegrationLogResultsWithHttpInfo(filter, sortBy, limit, pageToken, opts);
            return localVarResp.getData();
        }

        /**
         * Execute getIntegrationLogResults request with HTTP info returned
         * @return ApiResponse&lt;IIntegrationLogResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<IIntegrationLogResponse> executeWithHttpInfo() throws ApiException {
            return getIntegrationLogResultsWithHttpInfo(filter, sortBy, limit, pageToken);
        }

        /**
         * Execute getIntegrationLogResults request with HTTP info returned. Use any specified configuration options to override any other configuration for this request only.
         * @return ApiResponse&lt;IIntegrationLogResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<IIntegrationLogResponse> executeWithHttpInfo(ConfigurationOptions opts) throws ApiException {
            return getIntegrationLogResultsWithHttpInfo(filter, sortBy, limit, pageToken, opts);
        }

        /**
         * Execute getIntegrationLogResults request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<IIntegrationLogResponse> _callback) throws ApiException {
            return getIntegrationLogResultsAsync(filter, sortBy, limit, pageToken, _callback);
        }

        /**
         * Execute getIntegrationLogResults request (asynchronously). Use any specified configuration options to override any other configuration for this request only.
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
        public okhttp3.Call executeAsync(final ApiCallback<IIntegrationLogResponse> _callback, ConfigurationOptions opts) throws ApiException {
            return getIntegrationLogResultsAsync(filter, sortBy, limit, pageToken, _callback, opts);
        }
    }

    /**
     * [EXPERIMENTAL] GetIntegrationLogResults: Get integration log results
     * Get integration log results
     * @return APIgetIntegrationLogResultsRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public APIgetIntegrationLogResultsRequest getIntegrationLogResults() {
        return new APIgetIntegrationLogResultsRequest();
    }
}
