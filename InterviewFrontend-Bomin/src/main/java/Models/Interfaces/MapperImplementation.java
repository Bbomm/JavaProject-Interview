package Models.Interfaces;

import Models.entities.InterviewSelectionEntity;
import Models.entities.*;
import Models.requestModels.*;
import Models.responseModels.*;


/**
 * Created by 김보민 on 2017-08-03.
 */
public class MapperImplementation {

    // Register
    public static UserRequestModel convertToURQM (UserEntity ue) {
        return  new UserRequestModel(ue.getFirstname(), ue.getLastname(), ue.getCountry(), ue.getUsername(), ue.getPassword());
    }

    public static ProfileEntity convertToProfile(UserResponseModel us) {
        return new ProfileEntity(us.getFirstName(), us.getLastName(), us.getUserId(), us.getUsername(), us.getCountry(), us.getJoined(), us.getToken());
    }

    // Login
    public static CredentialRequestModel convertToCRQM (CredentialEntity ce) {
        return new CredentialRequestModel(ce.getUsername(), ce.getPassword());
    }

    public static ProfileEntity convertToProfile (CredentialResponseModel cr) {
        UserEntity userEntity = new UserEntity(cr.getFirstName(), cr.getLastName(), cr.getCountry(), cr.getUsername(), null);
        return new ProfileEntity(cr.getFirstName(), cr.getLastName(), cr.getUserId(), cr.getUsername(), cr.getCountry(), cr.getJoined(), cr.getToken());
    }

    // Interview
    public static InterviewRequestModel convertToInterviewRQ (InterviewSelectionEntity ism) {
        return new InterviewRequestModel(ism.getTopic());
    }

    public static InterviewEntity convertToInterviewEntity (InterviewResponseModel irm) {
        return new InterviewEntity(irm.getInterviewID(), irm.getTopic(), irm.getDuration(), irm.getQuestions());
    }


    // Answer
    public static AnswerCollectionRequestModel converToAnswerCollectionRQ (AnswerCollectionEntity ace) {
        return new AnswerCollectionRequestModel(ace.getInterviewID(), ace.getUserID(), ace.getTopic(), ace.getAnswers());
    }

    public static ResultEntity converToResultEntity (AnswerCollectionResponseModel acrm) {
        return new ResultEntity(acrm.getInterviewID(), acrm.getScore(), acrm.getCorrectAnswer(), acrm.getWrongAnswer(), acrm.getSkippedAnswer(), acrm.getDate(), acrm.getTotal());
    }

    // History

    public static HistoryRequestModel converToHistoryRQ (int userID) {
        return new HistoryRequestModel(userID);
    }

    public static HistoryCollectionEntity convertToHistoryCollectionEntity (HistoryResponseModel hr) {
        return new HistoryCollectionEntity(hr.getList());
    }

}
