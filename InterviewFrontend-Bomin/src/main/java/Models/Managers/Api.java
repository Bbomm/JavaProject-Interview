package Models.Managers;

import Models.requestModels.*;
import Models.responseModels.*;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by 김보민 on 2017-08-17.
 */
public class Api {
    private static String baseUrl = "http://localhost:8080/InterviewerBackend/webapi";
    private static WebTarget client = ClientBuilder.newClient().target(baseUrl);

    public static UserResponseModel    postUser(UserRequestModel urm) {

        Entity entity = Entity.entity(urm, MediaType.APPLICATION_JSON);
        // make web target by url
        WebTarget webTarget = client.path("/interview/users");
        // request by GET method without body
        UserResponseModel u = webTarget.request().post(entity, UserResponseModel.class);
        return u;
    }

    public static Response postLogin(CredentialRequestModel cqm) {

        WebTarget webTarget = client.path("/interview/login");

        Entity entity = Entity.entity(cqm, MediaType.APPLICATION_JSON);

        Response response = webTarget.request().post(entity);

//        CredentialResponseModel c = webTarget.request().post(entity, CredentialResponseModel.class);

        return response;
    }

    public static InterviewResponseModel getInterview(InterviewRequestModel iqm) {

        WebTarget webTarget = client.path("/interview/topics/" + iqm.getTopic());

        InterviewResponseModel ism = webTarget.request().get(InterviewResponseModel.class);
//        InterviewResponseModel ism = webTarget.request().post(entity, InterviewResponseModel.class);
        return ism;
    }

    public static AnswerCollectionResponseModel postResult(AnswerCollectionRequestModel aqm) {

        WebTarget webTarget = client.path("/interview/" + aqm.getInterviewID());     // {interview_id}

        Entity entity = Entity.entity(aqm, MediaType.APPLICATION_JSON);

        AnswerCollectionResponseModel asm = webTarget.request().post(entity, AnswerCollectionResponseModel.class);
//        InterviewResponseModel ia
// sm = webTarget.request().post(entity, InterviewResponseModel.class);
        return asm;
    }

    public static HistoryResponseModel getHistory(HistoryRequestModel hrq) {

        WebTarget webTarget = client.path("/interview/history/user/" + hrq.getUserID());

        Entity entity = Entity.entity(hrq, MediaType.APPLICATION_JSON);

//        HistoryResponseModel hrs = webTarget.request().get().readEntity(HistoryResponseModel.class);
        HistoryResponseModel hrs = webTarget.request().get(HistoryResponseModel.class);

        return hrs;
    }

}
