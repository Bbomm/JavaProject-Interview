package Models.responseModels;

import Models.entities.Question;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by 김보민 on 2017-08-06.
 */
@XmlRootElement
public class InterviewResponseModel {

    int interviewID;
    String topic;    // JAVA, SQL
    int duration;   // Spending time
    ArrayList<Question> questions = new ArrayList<>();

    public InterviewResponseModel (){}

    public InterviewResponseModel(int interviewID, String topic, int duration, ArrayList<Question> questions) {
       this.interviewID = interviewID;
        this.topic = topic;
        this.duration = duration;
        this.questions = questions;
    }


    public int getInterviewID() {
        return interviewID;
    }

    public void setInterviewID(int interviewID) {
        this.interviewID = interviewID;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

}
