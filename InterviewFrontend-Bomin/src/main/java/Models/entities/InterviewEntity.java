package Models.entities;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by 김보민 on 2017-08-04.
 */
public class InterviewEntity implements  Iterable<Question> {

    int interviewID;
    String topic;    // JAVA, SQL
    int duration;   // Spending time
    ArrayList<Question> questions = new ArrayList<>();

    public InterviewEntity (){}

    public InterviewEntity(int interviewID, String topic, int duration, ArrayList<Question> questions) {
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

    @Override
    public Iterator<Question> iterator() {
        return  new QuestionIterator(questions);
    }
}
