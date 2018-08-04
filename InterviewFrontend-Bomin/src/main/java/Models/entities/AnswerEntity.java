package Models.entities;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by 김보민 on 2017-08-10.
 */
public class  AnswerEntity {

//    private int interviewID;
//    private int userID;
    private int questionID;
    private String answer;


    public AnswerEntity(){}

    public AnswerEntity(int questionID, String answer) {
        this.questionID = questionID;
        this.answer = answer;
    }


    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
