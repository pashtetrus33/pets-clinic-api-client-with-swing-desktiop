# ClientControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create2**](ClientControllerApi.md#create2) | **PUT** /api/v1/clinic/clients/update/{clientId} |  |
| [**create5**](ClientControllerApi.md#create5) | **POST** /api/v1/clinic/clients/create |  |
| [**delete2**](ClientControllerApi.md#delete2) | **DELETE** /api/v1/clinic/clients/delete/{clientId} |  |
| [**getById2**](ClientControllerApi.md#getById2) | **GET** /api/v1/clinic/clients/getbyid/{clientId} |  |
| [**showAll2**](ClientControllerApi.md#showAll2) | **GET** /api/v1/clinic/clients/getall |  |


<a name="create2"></a>
# **create2**
> Integer create2(clientId, clientRequest)



### org.openapitools.client.Start
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientControllerApi;

public class org.openapitools.client.Start {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ClientControllerApi apiInstance = new ClientControllerApi(defaultClient);
    Integer clientId = 56; // Integer | 
    ClientRequest clientRequest = new ClientRequest(); // ClientRequest | 
    try {
      Integer result = apiInstance.create2(clientId, clientRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientControllerApi#create2");
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
| **clientId** | **Integer**|  | |
| **clientRequest** | [**ClientRequest**](ClientRequest.md)|  | |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="create5"></a>
# **create5**
> Integer create5(clientRequest)



### org.openapitools.client.Start
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientControllerApi;

public class org.openapitools.client.Start {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ClientControllerApi apiInstance = new ClientControllerApi(defaultClient);
    ClientRequest clientRequest = new ClientRequest(); // ClientRequest | 
    try {
      Integer result = apiInstance.create5(clientRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientControllerApi#create5");
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
| **clientRequest** | [**ClientRequest**](ClientRequest.md)|  | |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="delete2"></a>
# **delete2**
> Integer delete2(clientId)



### org.openapitools.client.Start
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientControllerApi;

public class org.openapitools.client.Start {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ClientControllerApi apiInstance = new ClientControllerApi(defaultClient);
    Integer clientId = 56; // Integer | 
    try {
      Integer result = apiInstance.delete2(clientId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientControllerApi#delete2");
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
| **clientId** | **Integer**|  | |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getById2"></a>
# **getById2**
> Client getById2(clientId)



### org.openapitools.client.Start
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientControllerApi;

public class org.openapitools.client.Start {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ClientControllerApi apiInstance = new ClientControllerApi(defaultClient);
    Integer clientId = 56; // Integer | 
    try {
      Client result = apiInstance.getById2(clientId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientControllerApi#getById2");
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
| **clientId** | **Integer**|  | |

### Return type

[**Client**](Client.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="showAll2"></a>
# **showAll2**
> List&lt;Client&gt; showAll2()



### org.openapitools.client.Start
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientControllerApi;

public class org.openapitools.client.Start {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ClientControllerApi apiInstance = new ClientControllerApi(defaultClient);
    try {
      List<Client> result = apiInstance.showAll2();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientControllerApi#showAll2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Client&gt;**](Client.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

