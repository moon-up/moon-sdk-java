# OnramperApi

All URIs are relative to *https://moon-vault-api-git-ew-supabase-migration-moonup.vercel.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**onRamperCheckout**](OnramperApi.md#onRamperCheckout) | **POST** /onramper/fund/${accountName} |  |
| [**onRamperGetQuotesBuy**](OnramperApi.md#onRamperGetQuotesBuy) | **GET** /onramper/quotes/buy |  |
| [**onRamperGetQuotesSell**](OnramperApi.md#onRamperGetQuotesSell) | **GET** /onramper/quotes/sell |  |
| [**onRamperGetSupportedAssets**](OnramperApi.md#onRamperGetSupportedAssets) | **GET** /onramper/assets |  |
| [**onRamperGetSupportedCurrencies**](OnramperApi.md#onRamperGetSupportedCurrencies) | **GET** /onramper/currencies |  |
| [**onRamperGetSupportedDefaultsAll**](OnramperApi.md#onRamperGetSupportedDefaultsAll) | **GET** /onramper/defaults |  |
| [**onRamperGetSupportedOnRampsAll**](OnramperApi.md#onRamperGetSupportedOnRampsAll) | **GET** /onramper/onramps |  |
| [**onRamperGetSupportedPaymentTypes**](OnramperApi.md#onRamperGetSupportedPaymentTypes) | **GET** /onramper/payment-types |  |
| [**onRamperGetSupportedPaymentTypesFiat**](OnramperApi.md#onRamperGetSupportedPaymentTypesFiat) | **GET** /onramper/payment-types/fiat |  |


<a id="onRamperCheckout"></a>
# **onRamperCheckout**
> Object onRamperCheckout(authorization, accountName, transactionInput)



### Example
```java
// Import classes:
import org.usemoonai.moonsdk.client.ApiClient;
import org.usemoonai.moonsdk.client.ApiException;
import org.usemoonai.moonsdk.client.Configuration;
import org.usemoonai.moonsdk.client.auth.*;
import org.usemoonai.moonsdk.client.models.*;
import org.usemoonai.moonsdk.api.OnramperApi;

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

    OnramperApi apiInstance = new OnramperApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    String accountName = "accountName_example"; // String | 
    TransactionInput transactionInput = new TransactionInput(); // TransactionInput | 
    try {
      Object result = apiInstance.onRamperCheckout(authorization, accountName, transactionInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnramperApi#onRamperCheckout");
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
| **transactionInput** | [**TransactionInput**](TransactionInput.md)|  | |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="onRamperGetQuotesBuy"></a>
# **onRamperGetQuotesBuy**
> List&lt;Quote&gt; onRamperGetQuotesBuy(authorization, fiat, crypto, amount, paymentMethod, uuid, clientName, country)



### Example
```java
// Import classes:
import org.usemoonai.moonsdk.client.ApiClient;
import org.usemoonai.moonsdk.client.ApiException;
import org.usemoonai.moonsdk.client.Configuration;
import org.usemoonai.moonsdk.client.auth.*;
import org.usemoonai.moonsdk.client.models.*;
import org.usemoonai.moonsdk.api.OnramperApi;

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

    OnramperApi apiInstance = new OnramperApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    String fiat = "fiat_example"; // String | 
    String crypto = "crypto_example"; // String | 
    Double amount = 3.4D; // Double | 
    String paymentMethod = "creditcard"; // String | 
    String uuid = ""; // String | 
    String clientName = ""; // String | 
    String country = ""; // String | 
    try {
      List<Quote> result = apiInstance.onRamperGetQuotesBuy(authorization, fiat, crypto, amount, paymentMethod, uuid, clientName, country);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnramperApi#onRamperGetQuotesBuy");
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
| **fiat** | **String**|  | |
| **crypto** | **String**|  | |
| **amount** | **Double**|  | |
| **paymentMethod** | **String**|  | [optional] [default to creditcard] |
| **uuid** | **String**|  | [optional] [default to ] |
| **clientName** | **String**|  | [optional] [default to ] |
| **country** | **String**|  | [optional] [default to ] |

### Return type

[**List&lt;Quote&gt;**](Quote.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="onRamperGetQuotesSell"></a>
# **onRamperGetQuotesSell**
> List&lt;SellQuote&gt; onRamperGetQuotesSell(authorization, fiat, crypto, amount, paymentMethod, uuid, clientName, country)



### Example
```java
// Import classes:
import org.usemoonai.moonsdk.client.ApiClient;
import org.usemoonai.moonsdk.client.ApiException;
import org.usemoonai.moonsdk.client.Configuration;
import org.usemoonai.moonsdk.client.auth.*;
import org.usemoonai.moonsdk.client.models.*;
import org.usemoonai.moonsdk.api.OnramperApi;

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

    OnramperApi apiInstance = new OnramperApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    String fiat = "fiat_example"; // String | 
    String crypto = "crypto_example"; // String | 
    Double amount = 3.4D; // Double | 
    String paymentMethod = "creditcard"; // String | 
    String uuid = ""; // String | 
    String clientName = ""; // String | 
    String country = ""; // String | 
    try {
      List<SellQuote> result = apiInstance.onRamperGetQuotesSell(authorization, fiat, crypto, amount, paymentMethod, uuid, clientName, country);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnramperApi#onRamperGetQuotesSell");
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
| **fiat** | **String**|  | |
| **crypto** | **String**|  | |
| **amount** | **Double**|  | |
| **paymentMethod** | **String**|  | [optional] [default to creditcard] |
| **uuid** | **String**|  | [optional] [default to ] |
| **clientName** | **String**|  | [optional] [default to ] |
| **country** | **String**|  | [optional] [default to ] |

### Return type

[**List&lt;SellQuote&gt;**](SellQuote.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="onRamperGetSupportedAssets"></a>
# **onRamperGetSupportedAssets**
> SupportedAssetResponse onRamperGetSupportedAssets(authorization, source, country)



### Example
```java
// Import classes:
import org.usemoonai.moonsdk.client.ApiClient;
import org.usemoonai.moonsdk.client.ApiException;
import org.usemoonai.moonsdk.client.Configuration;
import org.usemoonai.moonsdk.client.auth.*;
import org.usemoonai.moonsdk.client.models.*;
import org.usemoonai.moonsdk.api.OnramperApi;

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

    OnramperApi apiInstance = new OnramperApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    String source = "source_example"; // String | 
    String country = "country_example"; // String | 
    try {
      SupportedAssetResponse result = apiInstance.onRamperGetSupportedAssets(authorization, source, country);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnramperApi#onRamperGetSupportedAssets");
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
| **source** | **String**|  | |
| **country** | **String**|  | |

### Return type

[**SupportedAssetResponse**](SupportedAssetResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="onRamperGetSupportedCurrencies"></a>
# **onRamperGetSupportedCurrencies**
> SupportedCurrenciesResponse onRamperGetSupportedCurrencies(authorization, type)



### Example
```java
// Import classes:
import org.usemoonai.moonsdk.client.ApiClient;
import org.usemoonai.moonsdk.client.ApiException;
import org.usemoonai.moonsdk.client.Configuration;
import org.usemoonai.moonsdk.client.auth.*;
import org.usemoonai.moonsdk.client.models.*;
import org.usemoonai.moonsdk.api.OnramperApi;

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

    OnramperApi apiInstance = new OnramperApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    String type = "type_example"; // String | 
    try {
      SupportedCurrenciesResponse result = apiInstance.onRamperGetSupportedCurrencies(authorization, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnramperApi#onRamperGetSupportedCurrencies");
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
| **type** | **String**|  | |

### Return type

[**SupportedCurrenciesResponse**](SupportedCurrenciesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="onRamperGetSupportedDefaultsAll"></a>
# **onRamperGetSupportedDefaultsAll**
> SupportedDefaultResponse onRamperGetSupportedDefaultsAll(authorization, country, type)



### Example
```java
// Import classes:
import org.usemoonai.moonsdk.client.ApiClient;
import org.usemoonai.moonsdk.client.ApiException;
import org.usemoonai.moonsdk.client.Configuration;
import org.usemoonai.moonsdk.client.auth.*;
import org.usemoonai.moonsdk.client.models.*;
import org.usemoonai.moonsdk.api.OnramperApi;

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

    OnramperApi apiInstance = new OnramperApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    String country = "country_example"; // String | 
    String type = "type_example"; // String | 
    try {
      SupportedDefaultResponse result = apiInstance.onRamperGetSupportedDefaultsAll(authorization, country, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnramperApi#onRamperGetSupportedDefaultsAll");
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
| **country** | **String**|  | |
| **type** | **String**|  | |

### Return type

[**SupportedDefaultResponse**](SupportedDefaultResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="onRamperGetSupportedOnRampsAll"></a>
# **onRamperGetSupportedOnRampsAll**
> GetSupportedOnRampsResponse onRamperGetSupportedOnRampsAll(authorization)



### Example
```java
// Import classes:
import org.usemoonai.moonsdk.client.ApiClient;
import org.usemoonai.moonsdk.client.ApiException;
import org.usemoonai.moonsdk.client.Configuration;
import org.usemoonai.moonsdk.client.auth.*;
import org.usemoonai.moonsdk.client.models.*;
import org.usemoonai.moonsdk.api.OnramperApi;

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

    OnramperApi apiInstance = new OnramperApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    try {
      GetSupportedOnRampsResponse result = apiInstance.onRamperGetSupportedOnRampsAll(authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnramperApi#onRamperGetSupportedOnRampsAll");
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

### Return type

[**GetSupportedOnRampsResponse**](GetSupportedOnRampsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="onRamperGetSupportedPaymentTypes"></a>
# **onRamperGetSupportedPaymentTypes**
> SupportedPaymentTypesCurrencyResponse onRamperGetSupportedPaymentTypes(authorization, fiat, country, type)



### Example
```java
// Import classes:
import org.usemoonai.moonsdk.client.ApiClient;
import org.usemoonai.moonsdk.client.ApiException;
import org.usemoonai.moonsdk.client.Configuration;
import org.usemoonai.moonsdk.client.auth.*;
import org.usemoonai.moonsdk.client.models.*;
import org.usemoonai.moonsdk.api.OnramperApi;

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

    OnramperApi apiInstance = new OnramperApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    String fiat = "fiat_example"; // String | 
    String country = "country_example"; // String | 
    String type = "type_example"; // String | 
    try {
      SupportedPaymentTypesCurrencyResponse result = apiInstance.onRamperGetSupportedPaymentTypes(authorization, fiat, country, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnramperApi#onRamperGetSupportedPaymentTypes");
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
| **fiat** | **String**|  | |
| **country** | **String**|  | |
| **type** | **String**|  | |

### Return type

[**SupportedPaymentTypesCurrencyResponse**](SupportedPaymentTypesCurrencyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a id="onRamperGetSupportedPaymentTypesFiat"></a>
# **onRamperGetSupportedPaymentTypesFiat**
> SupportedPaymentTypesCurrencyResponse onRamperGetSupportedPaymentTypesFiat(authorization, fiat, country)



### Example
```java
// Import classes:
import org.usemoonai.moonsdk.client.ApiClient;
import org.usemoonai.moonsdk.client.ApiException;
import org.usemoonai.moonsdk.client.Configuration;
import org.usemoonai.moonsdk.client.auth.*;
import org.usemoonai.moonsdk.client.models.*;
import org.usemoonai.moonsdk.api.OnramperApi;

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

    OnramperApi apiInstance = new OnramperApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    String fiat = "fiat_example"; // String | 
    String country = "country_example"; // String | 
    try {
      SupportedPaymentTypesCurrencyResponse result = apiInstance.onRamperGetSupportedPaymentTypesFiat(authorization, fiat, country);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnramperApi#onRamperGetSupportedPaymentTypesFiat");
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
| **fiat** | **String**|  | |
| **country** | **String**|  | |

### Return type

[**SupportedPaymentTypesCurrencyResponse**](SupportedPaymentTypesCurrencyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

