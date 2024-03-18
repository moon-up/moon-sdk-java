# Erc4337Api

All URIs are relative to *https://moon-vault-api-git-ew-supabase-migration-moonup.vercel.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAddress**](Erc4337Api.md#getAddress) | **POST** /erc4337/{accountName}/address |  |
| [**signBroadcastUserOpTx**](Erc4337Api.md#signBroadcastUserOpTx) | **POST** /erc4337/{accountName}/sign-broadcast-userop-tx |  |


<a id="getAddress"></a>
# **getAddress**
> AccountAPIResponse getAddress(authorization, accountName, inputBody)



### Example
```java
// Import classes:
import org.usemoonai.moonsdk.client.ApiClient;
import org.usemoonai.moonsdk.client.ApiException;
import org.usemoonai.moonsdk.client.Configuration;
import org.usemoonai.moonsdk.client.auth.*;
import org.usemoonai.moonsdk.client.models.*;
import org.usemoonai.moonsdk.api.Erc4337Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://moon-vault-api-git-ew-supabase-migration-moonup.vercel.app");
    
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

    Erc4337Api apiInstance = new Erc4337Api(defaultClient);
    String authorization = "authorization_example"; // String | 
    String accountName = "accountName_example"; // String | 
    InputBody inputBody = new InputBody(); // InputBody | 
    try {
      AccountAPIResponse result = apiInstance.getAddress(authorization, accountName, inputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Erc4337Api#getAddress");
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
| **accountName** | **String**|  | |
| **inputBody** | [**InputBody**](InputBody.md)|  | |

### Return type

[**AccountAPIResponse**](AccountAPIResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="signBroadcastUserOpTx"></a>
# **signBroadcastUserOpTx**
> TransactionAPIResponse signBroadcastUserOpTx(authorization, accountName, inputBody)



### Example
```java
// Import classes:
import org.usemoonai.moonsdk.client.ApiClient;
import org.usemoonai.moonsdk.client.ApiException;
import org.usemoonai.moonsdk.client.Configuration;
import org.usemoonai.moonsdk.client.auth.*;
import org.usemoonai.moonsdk.client.models.*;
import org.usemoonai.moonsdk.api.Erc4337Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://moon-vault-api-git-ew-supabase-migration-moonup.vercel.app");
    
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

    Erc4337Api apiInstance = new Erc4337Api(defaultClient);
    String authorization = "authorization_example"; // String | 
    String accountName = "accountName_example"; // String | 
    InputBody inputBody = new InputBody(); // InputBody | 
    try {
      TransactionAPIResponse result = apiInstance.signBroadcastUserOpTx(authorization, accountName, inputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Erc4337Api#signBroadcastUserOpTx");
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
| **accountName** | **String**|  | |
| **inputBody** | [**InputBody**](InputBody.md)|  | |

### Return type

[**TransactionAPIResponse**](TransactionAPIResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

