package Models.Managers;

import Models.Interfaces.MapperImplementation;
import Models.entities.InterviewSelectionEntity;
import Models.entities.*;
import Models.exceptions.LoginException;
import Models.requestModels.*;
import Models.responseModels.*;

import javax.ws.rs.core.Response;


public class  APIManager {

        // 어떻게 UserEntity의 입력값을 받았을 때 추가 내용을 적을껀지 적음.
        // API -> request sth and get back that from the server.
                // send a request(ususally JSON)
                // get the response
                // authentication

    // Register
    public ProfileEntity createUser(UserEntity ue) {

        UserRequestModel urm =  Mapper.convertRQ(ue, MapperImplementation::convertToURQM);

        UserResponseModel u =  Api.postUser(urm);

        // check response. Now we're checking only status code.
        // translate response body into User class
        String firstname = u.getFirstName().substring(0,1).toUpperCase() + u.getFirstName().substring(1);
        String lastname = u.getLastName().substring(0,1).toUpperCase() + u.getLastName().substring(1);

        System.out.println("*** Welcome to join us, " + firstname + " " + lastname + "! ***");
        System.out.println("Here is your information.");
        System.out.println("Firstname : " + firstname + "\nLastname : " + lastname + "\nCountry : " + u.getCountry() );
        ProfileEntity pe = Mapper.convertToProfileEntity(u, MapperImplementation::convertToProfile);

       return pe;

    }

    // Login
    public static ProfileEntity login (CredentialEntity ce) throws LoginException {

        CredentialRequestModel cqm = Mapper.convertToCredentialRQ(ce, MapperImplementation::convertToCRQM);

        Response response = Api.postLogin(cqm);
        if (response.getStatus() != Response.Status.OK.getStatusCode()) {
            throw new LoginException(response.readEntity(String.class));
        }

        CredentialResponseModel c = response.readEntity(CredentialResponseModel.class);

        String firstname = c.getFirstName().substring(0,1).toUpperCase() + c.getFirstName().substring(1);
        String lastname = c.getLastName().substring(0,1).toUpperCase() + c.getLastName().substring(1);

        System.out.println("*** Welcome, " + firstname + " " + lastname + "! ***");
        System.out.println("Here is your information.");
        System.out.println("Firstname : " + firstname + "\nLastname : " + lastname + "\nCountry : " + c.getCountry());

        ProfileEntity pe = Mapper.convertToProfileEntity(c, MapperImplementation::convertToProfile);
        return pe;
    }

    // Select topic of interview
    public InterviewEntity getInterview(InterviewSelectionEntity ism) {

        InterviewRequestModel irs = Mapper.convertToInterviewRQ(ism, MapperImplementation::convertToInterviewRQ);

        InterviewResponseModel irm = Api.getInterview(irs);
        System.out.println("*** Let's start Interview! ***");

        InterviewEntity ie = Mapper.convertToInterviewEntity(irm, MapperImplementation::convertToInterviewEntity);
        return ie;
    }


    // Get result of the quesions
    public ResultEntity getResult (AnswerCollectionEntity ac) {

        AnswerCollectionRequestModel acr = Mapper.converToAnswerCollectionRQ(ac, MapperImplementation::converToAnswerCollectionRQ);

        AnswerCollectionResponseModel acrm = Api.postResult(acr);
        System.out.println("Here is your result of the test. ");

        ResultEntity re = Mapper.converToResultEntity(acrm, MapperImplementation::converToResultEntity);

        return re;
    }

    // Get information of the User's histrory

    public HistoryCollectionEntity getHistory (int userID) {

        HistoryRequestModel hrq = Mapper.converToHistoryRQ(userID, MapperImplementation::converToHistoryRQ);
        HistoryResponseModel hrs = Api.getHistory(hrq);
//        System.out.println(hrs.getList().get(0).getScore() + "score in APImanager");
        System.out.println("These are all of your past interview history.");

        HistoryCollectionEntity hce = Mapper.convertToHistoryCollectionEntity(hrs, MapperImplementation::convertToHistoryCollectionEntity);

        return hce;
    }

}
//    String baseUrl = "https://calm-wave-21290.herokuapp.com";
//    Client client = ClientBuilder.newClient();
//
//    // make web target by url
//    WebTarget webTarget = client.target(baseUrl).path("/interview/login");
//
//    Response res = null;
//    Entity<?> entity = Entity.entity(cqm, MediaType.APPLICATION_JSON);
//    // request by GET method without body
//    res = webTarget.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(entity);
//    // check response. Now we're checking only status code.
//        if (res.getStatus() != Response.Status.OK.getStatusCode()) {
//        System.out.println("error");
//    }
//
//    // translate response body into User class
//    CredentialResponseModel u = res.readEntity(CredentialResponseModel.class);
