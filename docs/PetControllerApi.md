# PetControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](PetControllerApi.md#create) | **PUT** /api/v1/clinic/pets/update/{petId} |  |
| [**create3**](PetControllerApi.md#create3) | **POST** /api/v1/clinic/pets/create |  |
| [**delete**](PetControllerApi.md#delete) | **DELETE** /api/v1/clinic/pets/delete/{petId} |  |
| [**getById**](PetControllerApi.md#getById) | **GET** /api/v1/clinic/pets/getbyid/{petId} |  |
| [**showAll**](PetControllerApi.md#showAll) | **GET** /api/v1/clinic/pets/getall |  |


<a name="create"></a>
# **create**
> Integer create(petId, petRequest)



### org.openapitools.client.Start
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetControllerApi;

public class org.openapitools.client.Start {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    PetControllerApi apiInstance = new PetControllerApi(defaultClient);
    Integer petId = 56; // Integer | 
    PetRequest petRequest = new PetRequest(); // PetRequest | 
    try {
      Integer result = apiInstance.create(petId, petRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PetControllerApi#create");
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
| **petId** | **Integer**|  | |
| **petRequest** | [**PetRequest**](PetRequest.md)|  | |

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

<a name="create3"></a>
# **create3**
> Integer create3(petRequest)



### org.openapitools.client.Start
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetControllerApi;

public class org.openapitools.client.Start {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    PetControllerApi apiInstance = new PetControllerApi(defaultClient);
    PetRequest petRequest = new PetRequest(); // PetRequest | 
    try {
      Integer result = apiInstance.create3(petRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PetControllerApi#create3");
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
| **petRequest** | [**PetRequest**](PetRequest.md)|  | |

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

<a name="delete"></a>
# **delete**
> Integer delete(petId)



### org.openapitools.client.Start
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetControllerApi;

public class org.openapitools.client.Start {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    PetControllerApi apiInstance = new PetControllerApi(defaultClient);
    Integer petId = 56; // Integer | 
    try {
      Integer result = apiInstance.delete(petId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PetControllerApi#delete");
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
| **petId** | **Integer**|  | |

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

<a name="getById"></a>
# **getById**
> Pet getById(petId)



### org.openapitools.client.Start
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetControllerApi;

public class org.openapitools.client.Start {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    PetControllerApi apiInstance = new PetControllerApi(defaultClient);
    Integer petId = 56; // Integer | 
    try {
      Pet result = apiInstance.getById(petId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PetControllerApi#getById");
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
| **petId** | **Integer**|  | |

### Return type

[**Pet**](Pet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="showAll"></a>
# **showAll**
> List&lt;Pet&gt; showAll()



### org.openapitools.client.Start
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetControllerApi;

public class org.openapitools.client.Start {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    PetControllerApi apiInstance = new PetControllerApi(defaultClient);
    try {
      List<Pet> result = apiInstance.showAll();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PetControllerApi#showAll");
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

[**List&lt;Pet&gt;**](Pet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

