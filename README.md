# Урок 11. Сервис-ориентированные архитектуры
Постарайтесь поработать с разработанным трехзвенным приложением (десктопный клиент -> web-сервис -> БД)
Конечно, желательно, повторить всю работу, проделанную на семинаре, постараться самостоятельно создать клиент, библиотеку классов,
сгенерировать клиент и поработать с нашим Web-сервисом.
Если вам тяжело работать в рамках языка C#, вы можете поработать с вашим сервисом в рамках языка Java,
постараться протестировать работу вашего сервиса (вызвать несколько методов), создав ЛЮБОЙ клиент (можно обычный, консольный).

# API клиент сгенерирован утилитой openapi-generator-cli-6.1.0

![1](https://github.com/pashtetrus33/pets-clinic-api-client-with-swing-desktiop/assets/86385554/7f799f44-67e4-4171-9641-4fa36136dd09)
![2](https://github.com/pashtetrus33/pets-clinic-api-client-with-swing-desktiop/assets/86385554/e38c999e-5c23-466a-9e13-56b9d70fecd0)
![3](https://github.com/pashtetrus33/pets-clinic-api-client-with-swing-desktiop/assets/86385554/65eb1440-f78a-4d63-99f1-72f9c2832499)
![4](https://github.com/pashtetrus33/pets-clinic-api-client-with-swing-desktiop/assets/86385554/284da629-a997-4516-9c7a-ea0a56e67736)

# openapi-java-client

OpenAPI definition
- API version: v0
  - Build date: 2023-09-30T01:10:19.762+03:00[Europe/Moscow]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>v0</version>
  <scope>compile</scope>
</dependency>
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ClientControllerApi* | [**create2**](docs/ClientControllerApi.md#create2) | **PUT** /api/v1/clinic/clients/update/{clientId} | 
*ClientControllerApi* | [**create5**](docs/ClientControllerApi.md#create5) | **POST** /api/v1/clinic/clients/create | 
*ClientControllerApi* | [**delete2**](docs/ClientControllerApi.md#delete2) | **DELETE** /api/v1/clinic/clients/delete/{clientId} | 
*ClientControllerApi* | [**getById2**](docs/ClientControllerApi.md#getById2) | **GET** /api/v1/clinic/clients/getbyid/{clientId} | 
*ClientControllerApi* | [**showAll2**](docs/ClientControllerApi.md#showAll2) | **GET** /api/v1/clinic/clients/getall | 
*ConsultationControllerApi* | [**create1**](docs/ConsultationControllerApi.md#create1) | **PUT** /api/v1/clinic/consultations/update/{consultationId} | 
*ConsultationControllerApi* | [**create4**](docs/ConsultationControllerApi.md#create4) | **POST** /api/v1/clinic/consultations/create | 
*ConsultationControllerApi* | [**delete1**](docs/ConsultationControllerApi.md#delete1) | **DELETE** /api/v1/clinic/consultations/delete/{consultationId} | 
*ConsultationControllerApi* | [**getById1**](docs/ConsultationControllerApi.md#getById1) | **GET** /api/v1/clinic/consultations/getbyid/{consultationId} | 
*ConsultationControllerApi* | [**showAll1**](docs/ConsultationControllerApi.md#showAll1) | **GET** /api/v1/clinic/consultations/getall | 
*PetControllerApi* | [**create**](docs/PetControllerApi.md#create) | **PUT** /api/v1/clinic/pets/update/{petId} | 
*PetControllerApi* | [**create3**](docs/PetControllerApi.md#create3) | **POST** /api/v1/clinic/pets/create | 
*PetControllerApi* | [**delete**](docs/PetControllerApi.md#delete) | **DELETE** /api/v1/clinic/pets/delete/{petId} | 
*PetControllerApi* | [**getById**](docs/PetControllerApi.md#getById) | **GET** /api/v1/clinic/pets/getbyid/{petId} | 
*PetControllerApi* | [**showAll**](docs/PetControllerApi.md#showAll) | **GET** /api/v1/clinic/pets/getall | 


## Documentation for Models

 - [Client](docs/Client.md)
 - [ClientRequest](docs/ClientRequest.md)
 - [Consultation](docs/Consultation.md)
 - [ConsultationRequest](docs/ConsultationRequest.md)
 - [Pet](docs/Pet.md)
 - [PetRequest](docs/PetRequest.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



