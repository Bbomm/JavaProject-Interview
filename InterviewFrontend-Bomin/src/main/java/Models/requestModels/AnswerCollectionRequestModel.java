package Models.requestModels;

import Models.entities.AnswerCollectionEntity;
import Models.entities.AnswerEntity;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by 김보민 on 2017-08-13.
 */

@XmlRootElement
public class AnswerCollectionRequestModel {
    int interviewID;
    int userID;
    String topic;
    ArrayList<AnswerEntity> answers = new ArrayList<>();

    public AnswerCollectionRequestModel(int interviewID, int userID,String topic, ArrayList<AnswerEntity> answers) {
        this.interviewID = interviewID;
        this.userID = userID;
        this.topic = topic;
        this.answers = answers;
    }

    public AnswerCollectionRequestModel() {}

//
//    public static void addAnswers(AnswerEntity ae) {
//        ArrayList<AnswerEntity> answers = new ArrayList<>();
//        answers.add(ae);
//    }
//


    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getInterviewID() {return interviewID;}

    public void setInterviewID(int interviewID) {
        this.interviewID = interviewID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public ArrayList<AnswerEntity> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<AnswerEntity> answers) {
        this.answers = answers;
    }
}
