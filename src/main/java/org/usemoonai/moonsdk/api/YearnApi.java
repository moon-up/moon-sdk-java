/*
 * moon-vault-api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.usemoonai.moonsdk.api;

import org.usemoonai.moonsdk.client.ApiCallback;
import org.usemoonai.moonsdk.client.ApiClient;
import org.usemoonai.moonsdk.client.ApiException;
import org.usemoonai.moonsdk.client.ApiResponse;
import org.usemoonai.moonsdk.client.Configuration;
import org.usemoonai.moonsdk.client.Pair;
import org.usemoonai.moonsdk.client.ProgressRequestBody;
import org.usemoonai.moonsdk.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.usemoonai.moonsdk.models.AccountControllerResponse;
import org.usemoonai.moonsdk.models.InputBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YearnApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public YearnApi() {
        this(Configuration.getDefaultApiClient());
    }

    public YearnApi(ApiClient apiClient) {
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

    /**
     * Build call for addLiquidity
     * @param authorization  (required)
     * @param name  (required)
     * @param inputBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addLiquidityCall(String authorization, String name, InputBody inputBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = inputBody;

        // create path and map variables
        String localVarPath = "/yearn/{name}/add-liquidity"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (authorization != null) {
            localVarHeaderParams.put("Authorization", localVarApiClient.parameterToString(authorization));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addLiquidityValidateBeforeCall(String authorization, String name, InputBody inputBody, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling addLiquidity(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling addLiquidity(Async)");
        }

        // verify the required parameter 'inputBody' is set
        if (inputBody == null) {
            throw new ApiException("Missing the required parameter 'inputBody' when calling addLiquidity(Async)");
        }

        return addLiquidityCall(authorization, name, inputBody, _callback);

    }

    /**
     * 
     * 
     * @param authorization  (required)
     * @param name  (required)
     * @param inputBody  (required)
     * @return AccountControllerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public AccountControllerResponse addLiquidity(String authorization, String name, InputBody inputBody) throws ApiException {
        ApiResponse<AccountControllerResponse> localVarResp = addLiquidityWithHttpInfo(authorization, name, inputBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param authorization  (required)
     * @param name  (required)
     * @param inputBody  (required)
     * @return ApiResponse&lt;AccountControllerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccountControllerResponse> addLiquidityWithHttpInfo(String authorization, String name, InputBody inputBody) throws ApiException {
        okhttp3.Call localVarCall = addLiquidityValidateBeforeCall(authorization, name, inputBody, null);
        Type localVarReturnType = new TypeToken<AccountControllerResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param authorization  (required)
     * @param name  (required)
     * @param inputBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addLiquidityAsync(String authorization, String name, InputBody inputBody, final ApiCallback<AccountControllerResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = addLiquidityValidateBeforeCall(authorization, name, inputBody, _callback);
        Type localVarReturnType = new TypeToken<AccountControllerResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for addLiquidityWeth
     * @param authorization  (required)
     * @param name  (required)
     * @param inputBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addLiquidityWethCall(String authorization, String name, InputBody inputBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = inputBody;

        // create path and map variables
        String localVarPath = "/yearn/{name}/add-liquidity-weth"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (authorization != null) {
            localVarHeaderParams.put("Authorization", localVarApiClient.parameterToString(authorization));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addLiquidityWethValidateBeforeCall(String authorization, String name, InputBody inputBody, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling addLiquidityWeth(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling addLiquidityWeth(Async)");
        }

        // verify the required parameter 'inputBody' is set
        if (inputBody == null) {
            throw new ApiException("Missing the required parameter 'inputBody' when calling addLiquidityWeth(Async)");
        }

        return addLiquidityWethCall(authorization, name, inputBody, _callback);

    }

    /**
     * 
     * 
     * @param authorization  (required)
     * @param name  (required)
     * @param inputBody  (required)
     * @return AccountControllerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public AccountControllerResponse addLiquidityWeth(String authorization, String name, InputBody inputBody) throws ApiException {
        ApiResponse<AccountControllerResponse> localVarResp = addLiquidityWethWithHttpInfo(authorization, name, inputBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param authorization  (required)
     * @param name  (required)
     * @param inputBody  (required)
     * @return ApiResponse&lt;AccountControllerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccountControllerResponse> addLiquidityWethWithHttpInfo(String authorization, String name, InputBody inputBody) throws ApiException {
        okhttp3.Call localVarCall = addLiquidityWethValidateBeforeCall(authorization, name, inputBody, null);
        Type localVarReturnType = new TypeToken<AccountControllerResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param authorization  (required)
     * @param name  (required)
     * @param inputBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addLiquidityWethAsync(String authorization, String name, InputBody inputBody, final ApiCallback<AccountControllerResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = addLiquidityWethValidateBeforeCall(authorization, name, inputBody, _callback);
        Type localVarReturnType = new TypeToken<AccountControllerResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for removeLiquidity
     * @param authorization  (required)
     * @param name  (required)
     * @param inputBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call removeLiquidityCall(String authorization, String name, InputBody inputBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = inputBody;

        // create path and map variables
        String localVarPath = "/yearn/{name}/remove-liquidity"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (authorization != null) {
            localVarHeaderParams.put("Authorization", localVarApiClient.parameterToString(authorization));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call removeLiquidityValidateBeforeCall(String authorization, String name, InputBody inputBody, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling removeLiquidity(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling removeLiquidity(Async)");
        }

        // verify the required parameter 'inputBody' is set
        if (inputBody == null) {
            throw new ApiException("Missing the required parameter 'inputBody' when calling removeLiquidity(Async)");
        }

        return removeLiquidityCall(authorization, name, inputBody, _callback);

    }

    /**
     * 
     * 
     * @param authorization  (required)
     * @param name  (required)
     * @param inputBody  (required)
     * @return AccountControllerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public AccountControllerResponse removeLiquidity(String authorization, String name, InputBody inputBody) throws ApiException {
        ApiResponse<AccountControllerResponse> localVarResp = removeLiquidityWithHttpInfo(authorization, name, inputBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param authorization  (required)
     * @param name  (required)
     * @param inputBody  (required)
     * @return ApiResponse&lt;AccountControllerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccountControllerResponse> removeLiquidityWithHttpInfo(String authorization, String name, InputBody inputBody) throws ApiException {
        okhttp3.Call localVarCall = removeLiquidityValidateBeforeCall(authorization, name, inputBody, null);
        Type localVarReturnType = new TypeToken<AccountControllerResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param authorization  (required)
     * @param name  (required)
     * @param inputBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call removeLiquidityAsync(String authorization, String name, InputBody inputBody, final ApiCallback<AccountControllerResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeLiquidityValidateBeforeCall(authorization, name, inputBody, _callback);
        Type localVarReturnType = new TypeToken<AccountControllerResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for removeLiquidityWeth
     * @param authorization  (required)
     * @param name  (required)
     * @param inputBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call removeLiquidityWethCall(String authorization, String name, InputBody inputBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = inputBody;

        // create path and map variables
        String localVarPath = "/yearn/{name}/remove-liquidity-weth"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (authorization != null) {
            localVarHeaderParams.put("Authorization", localVarApiClient.parameterToString(authorization));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call removeLiquidityWethValidateBeforeCall(String authorization, String name, InputBody inputBody, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling removeLiquidityWeth(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling removeLiquidityWeth(Async)");
        }

        // verify the required parameter 'inputBody' is set
        if (inputBody == null) {
            throw new ApiException("Missing the required parameter 'inputBody' when calling removeLiquidityWeth(Async)");
        }

        return removeLiquidityWethCall(authorization, name, inputBody, _callback);

    }

    /**
     * 
     * 
     * @param authorization  (required)
     * @param name  (required)
     * @param inputBody  (required)
     * @return AccountControllerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public AccountControllerResponse removeLiquidityWeth(String authorization, String name, InputBody inputBody) throws ApiException {
        ApiResponse<AccountControllerResponse> localVarResp = removeLiquidityWethWithHttpInfo(authorization, name, inputBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param authorization  (required)
     * @param name  (required)
     * @param inputBody  (required)
     * @return ApiResponse&lt;AccountControllerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccountControllerResponse> removeLiquidityWethWithHttpInfo(String authorization, String name, InputBody inputBody) throws ApiException {
        okhttp3.Call localVarCall = removeLiquidityWethValidateBeforeCall(authorization, name, inputBody, null);
        Type localVarReturnType = new TypeToken<AccountControllerResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param authorization  (required)
     * @param name  (required)
     * @param inputBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call removeLiquidityWethAsync(String authorization, String name, InputBody inputBody, final ApiCallback<AccountControllerResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeLiquidityWethValidateBeforeCall(authorization, name, inputBody, _callback);
        Type localVarReturnType = new TypeToken<AccountControllerResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}