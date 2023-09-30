package org.openapitools.client;// Import classes:

import front.Desktop;
import front.clients.ClientWindow;
import org.openapitools.client.api.PetControllerApi;
import org.openapitools.client.model.Client;
import org.openapitools.client.model.ClientRequest;
import org.openapitools.client.api.ClientControllerApi;
import org.openapitools.client.model.Pet;
import org.openapitools.client.model.PetRequest;

import java.time.LocalDate;
import java.util.List;

public class Start {
    public static ClientWindow clientWindow;
    private static final ApiClient defaultClient = Configuration.getDefaultApiClient();
    private static final PetControllerApi petApiInstance = new PetControllerApi(defaultClient);
    private static final ClientControllerApi clientApiInstance = new ClientControllerApi(defaultClient);


    public static void main(String[] args) {

        new Desktop();
        defaultClient.setBasePath("http://localhost:8080");

        //petControllerTest();
    }

    public static Integer clientCreate(String surname, String name, String patronymic, String document, LocalDate birthday) {

        ClientRequest clientRequest = new ClientRequest(); // ClientRequest |

        try {
            clientRequest.setFirstname(name);
            clientRequest.setSurname(surname);
            clientRequest.setPatronymic(patronymic);
            clientRequest.setDocument(document);
            clientRequest.setBirthday(birthday);

            return clientApiInstance.create5(clientRequest);

        } catch (ApiException e) {
            System.err.println("Exception when calling ClientControllerApi#create2");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }

    //update client request
    public static Integer clientUpdate(String clientId, String surname, String name, String patronymic, String document, LocalDate birthday) {

        ClientRequest clientRequest = new ClientRequest(); // ClientRequest |

        try {
            clientRequest.setFirstname(name);
            clientRequest.setSurname(surname);
            clientRequest.setPatronymic(patronymic);
            clientRequest.setDocument(document);
            clientRequest.setBirthday(birthday);
            return clientApiInstance.create2(Integer.valueOf(clientId), clientRequest);


        } catch (ApiException e) {
            System.err.println("Exception when calling ClientControllerApi#create2");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }

    //getall client request
    public static List<Client> getAll() {
        try {
            return clientApiInstance.showAll2();

        } catch (ApiException e) {
            System.err.println("Exception when calling ClientControllerApi#create2");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }

    //delete client request
    public static Integer deleteClient(String clientId) {
        try {
            return clientApiInstance.delete2(Integer.valueOf(clientId));
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientControllerApi#create2");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }

    //getbyid client request
    public static Client getById(String clientId) {
        try {
            return clientApiInstance.getById2(Integer.valueOf(clientId));
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientControllerApi#create2");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }


    //region petControllerTests
    public static void petControllerTest() {

        Integer petId = 1; // Integer |
        PetRequest petRequest = new PetRequest(); // PetRequest |

        try {
            //create pet request
            petRequest.setName("Leya");
            petRequest.setBirthday(LocalDate.of(2020, 10, 22));
            Integer createResult = petApiInstance.create3(petRequest);

            System.out.println(createResult);


            //update pet request
            petRequest.setName("Musya");
            petRequest.setBirthday(LocalDate.of(2021, 01, 11));
            Integer updateResult = petApiInstance.create(petId, petRequest);

            System.out.println(updateResult);

            //getbyid pet request
            Pet petById = petApiInstance.getById(petId);

            System.out.println(petById);

            //delete pet request
            Integer deletePetById = petApiInstance.delete(petId);
            System.out.println("Deleted items: " + deletePetById);

        } catch (ApiException e) {
            System.err.println("Exception when calling ClientControllerApi#create2");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
    //endregion
}