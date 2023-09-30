# ConsultationControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create1**](ConsultationControllerApi.md#create1) | **PUT** /api/v1/clinic/consultations/update/{consultationId} |  |
| [**create4**](ConsultationControllerApi.md#create4) | **POST** /api/v1/clinic/consultations/create |  |
| [**delete1**](ConsultationControllerApi.md#delete1) | **DELETE** /api/v1/clinic/consultations/delete/{consultationId} |  |
| [**getById1**](ConsultationControllerApi.md#getById1) | **GET** /api/v1/clinic/consultations/getbyid/{consultationId} |  |
| [**showAll1**](ConsultationControllerApi.md#showAll1) | **GET** /api/v1/clinic/consultations/getall |  |


<a name="create1"></a>
# **create1**
> Integer create1(consultationId, consultationRequest)



### org.openapitools.client.Start
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConsultationControllerApi;

public class org.openapitools.client.Start {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ConsultationControllerApi apiInstance = new ConsultationControllerApi(defaultClient);
    Integer consultationId = 56; // Integer | 
    ConsultationRequest consultationRequest = new ConsultationRequest(); // ConsultationRequest | 
    try {
      Integer result = apiInstance.create1(consultationId, consultationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsultationControllerApi#create1");
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
| **consultationId** | **Integer**|  | |
| **consultationRequest** | [**ConsultationRequest**](ConsultationRequest.md)|  | |

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

<a name="create4"></a>
# **create4**
> Integer create4(consultationRequest)



### org.openapitools.client.Start
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConsultationControllerApi;

public class org.openapitools.client.Start {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ConsultationControllerApi apiInstance = new ConsultationControllerApi(defaultClient);
    ConsultationRequest consultationRequest = new ConsultationRequest(); // ConsultationRequest | 
    try {
      Integer result = apiInstance.create4(consultationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsultationControllerApi#create4");
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
| **consultationRequest** | [**ConsultationRequest**](ConsultationRequest.md)|  | |

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

<a name="delete1"></a>
# **delete1**
> Integer delete1(consultationId)



### org.openapitools.client.Start
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConsultationControllerApi;

public class org.openapitools.client.Start {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ConsultationControllerApi apiInstance = new ConsultationControllerApi(defaultClient);
    Integer consultationId = 56; // Integer | 
    try {
      Integer result = apiInstance.delete1(consultationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsultationControllerApi#delete1");
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
| **consultationId** | **Integer**|  | |

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

<a name="getById1"></a>
# **getById1**
> Consultation getById1(consultationId)



### org.openapitools.client.Start
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConsultationControllerApi;

public class org.openapitools.client.Start {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ConsultationControllerApi apiInstance = new ConsultationControllerApi(defaultClient);
    Integer consultationId = 56; // Integer | 
    try {
      Consultation result = apiInstance.getById1(consultationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsultationControllerApi#getById1");
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
| **consultationId** | **Integer**|  | |

### Return type

[**Consultation**](Consultation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="showAll1"></a>
# **showAll1**
> List&lt;Consultation&gt; showAll1()



### org.openapitools.client.Start
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConsultationControllerApi;

public class org.openapitools.client.Start {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ConsultationControllerApi apiInstance = new ConsultationControllerApi(defaultClient);
    try {
      List<Consultation> result = apiInstance.showAll1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsultationControllerApi#showAll1");
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

[**List&lt;Consultation&gt;**](Consultation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

