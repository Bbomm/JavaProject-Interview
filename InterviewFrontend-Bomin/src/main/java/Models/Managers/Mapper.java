package Models.Managers;

import Models.Interfaces.MAPFunction;
import Models.entities.InterviewSelectionEntity;
import Models.entities.*;
import Models.requestModels.*;
import Models.responseModels.*;

/**
 * Created by 김보민 on 2017-08-03.
 */
public class Mapper {


    // Login
    public static UserRequestModel convertRQ (UserEntity ue, MAPFunction<UserEntity, UserRequestModel> mapFunction ) {
        return mapFunction.mapping(ue);
    }
    // UserEntity는 가입을 할때 한 내용인데 그것을 서버에다가 요청하는 메소드

    public static ProfileEntity convertToProfileEntity(UserResponseModel urm, MAPFunction<UserResponseModel, ProfileEntity> mapFunction ) {
        return mapFunction.mapping(urm);
    }

    /**
     * UserEntity에 적은 내용들을 서버에다가 요청했을 때 (by UserRequestModel), 서버가 그 것에 대한 response를 (ex. 가입날짜,..등등)
     * ProfileEntity의 타입으로 리턴해준다.
      */

    // Register
    public static CredentialRequestModel convertToCredentialRQ
            (CredentialEntity ce, MAPFunction<CredentialEntity, CredentialRequestModel> mapFunction) {
        return mapFunction.mapping(ce);
    }

    public static ProfileEntity convertToProfileEntity
            (CredentialResponseModel crm, MAPFunction<CredentialResponseModel, ProfileEntity> mapFunction) {
        return mapFunction.mapping(crm);
    }


    // Interview
    public static InterviewRequestModel convertToInterviewRQ
            (InterviewSelectionEntity ism, MAPFunction<InterviewSelectionEntity, InterviewRequestModel> mapFunction) {
        return mapFunction.mapping(ism);
    }

    public static InterviewEntity convertToInterviewEntity
            (InterviewResponseModel irm, MAPFunction<InterviewResponseModel, InterviewEntity> mapFunction) {
        return mapFunction.mapping(irm);
    }


    // answer
    public static AnswerCollectionRequestModel converToAnswerCollectionRQ
            (AnswerCollectionEntity ace, MAPFunction<AnswerCollectionEntity, AnswerCollectionRequestModel> mapFunction) {
        return mapFunction.mapping(ace);
    }

    public static  ResultEntity converToResultEntity
            (AnswerCollectionResponseModel acr, MAPFunction<AnswerCollectionResponseModel, ResultEntity> mapFunction) {
        return mapFunction.mapping(acr);
    }

    // history
    public static HistoryRequestModel converToHistoryRQ (int userID, MAPFunction<Integer, HistoryRequestModel> mapFunction) {
        return mapFunction.mapping(userID);
    }

    public static HistoryCollectionEntity convertToHistoryCollectionEntity (HistoryResponseModel hr, MAPFunction<HistoryResponseModel, HistoryCollectionEntity> mapFunction) {
        return mapFunction.mapping(hr);
    }

}
