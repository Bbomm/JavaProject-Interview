package Models.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by 김보민 on 2017-08-08.
 */
public class AnswerCollectionEntity {

    int interviewID;
    int userID;
    String topic;
    ArrayList<AnswerEntity> answers = new ArrayList<>();


    public AnswerCollectionEntity(int interviewID, int userID, String topic) {
        this.interviewID = interviewID;
        this.userID = userID;
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public AnswerCollectionEntity(){}

//    public AnswerCollectionEntity(int interviewID) {
//        this.interviewID = interviewID;
//    }


    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getInterviewID() {
        return interviewID;
    }


    public void setInterviewID(int interviewID) {
        this.interviewID = interviewID;
    }


    public ArrayList<AnswerEntity> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<AnswerEntity> answers) {
        this.answers = answers;
    }

    public void addAnswer(AnswerEntity answerEntity) {
        answers.add(answerEntity);
    }
}


