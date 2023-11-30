# UniSwapApi

All URIs are relative to *https://vault-api.usemoon.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addLiquidity**](UniSwapApi.md#addLiquidity) | **POST** /uniswap/{name}/add-liquidity |  |
| [**removeLiquidity**](UniSwapApi.md#removeLiquidity) | **POST** /uniswap/{name}/remove-liquidity |  |
| [**swapExactETHForTokens**](UniSwapApi.md#swapExactETHForTokens) | **POST** /uniswap/{name}/swap-exact-eth-for-tokens |  |
| [**swapExactTokensForTokens**](UniSwapApi.md#swapExactTokensForTokens) | **POST** /uniswap/{name}/swap-exact-tokens-for-tokens |  |


<a id="addLiquidity"></a>
# **addLiquidity**
> AccountControllerResponse addLiquidity(authorization, name, uniswapInput)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UniSwapApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vault-api.usemoon.ai");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    UniSwapApi apiInstance = new UniSwapApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    String name = "name_example"; // String | 
    UniswapInput uniswapInput = new UniswapInput(); // UniswapInput | 
    try {
      AccountControllerResponse result = apiInstance.addLiquidity(authorization, name, uniswapInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UniSwapApi#addLiquidity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | |
| **name** | **String**|  | |
| **uniswapInput** | [**UniswapInput**](UniswapInput.md)|  | |

### Return type

[**AccountControllerResponse**](AccountControllerResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="removeLiquidity"></a>
# **removeLiquidity**
> AccountControllerResponse removeLiquidity(authorization, name, uniswapInput)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UniSwapApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vault-api.usemoon.ai");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    UniSwapApi apiInstance = new UniSwapApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    String name = "name_example"; // String | 
    UniswapInput uniswapInput = new UniswapInput(); // UniswapInput | 
    try {
      AccountControllerResponse result = apiInstance.removeLiquidity(authorization, name, uniswapInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UniSwapApi#removeLiquidity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | |
| **name** | **String**|  | |
| **uniswapInput** | [**UniswapInput**](UniswapInput.md)|  | |

### Return type

[**AccountControllerResponse**](AccountControllerResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="swapExactETHForTokens"></a>
# **swapExactETHForTokens**
> AccountControllerResponse swapExactETHForTokens(authorization, name, uniswapInput)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UniSwapApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vault-api.usemoon.ai");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    UniSwapApi apiInstance = new UniSwapApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    String name = "name_example"; // String | 
    UniswapInput uniswapInput = new UniswapInput(); // UniswapInput | 
    try {
      AccountControllerResponse result = apiInstance.swapExactETHForTokens(authorization, name, uniswapInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UniSwapApi#swapExactETHForTokens");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | |
| **name** | **String**|  | |
| **uniswapInput** | [**UniswapInput**](UniswapInput.md)|  | |

### Return type

[**AccountControllerResponse**](AccountControllerResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="swapExactTokensForTokens"></a>
# **swapExactTokensForTokens**
> AccountControllerResponse swapExactTokensForTokens(authorization, name, uniswapInput)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UniSwapApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vault-api.usemoon.ai");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    UniSwapApi apiInstance = new UniSwapApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    String name = "name_example"; // String | 
    UniswapInput uniswapInput = new UniswapInput(); // UniswapInput | 
    try {
      AccountControllerResponse result = apiInstance.swapExactTokensForTokens(authorization, name, uniswapInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UniSwapApi#swapExactTokensForTokens");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | |
| **name** | **String**|  | |
| **uniswapInput** | [**UniswapInput**](UniswapInput.md)|  | |

### Return type

[**AccountControllerResponse**](AccountControllerResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

