package Models.responseModels;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by 김보민 on 2017-08-13.
 */
@XmlRootElement
public class AnswerCollectionResponseModel {

    private int interviewID;
    private int score;
    private int correctAnswer;
    private int wrongAnswer;
    private int skippedAnswer;
    private Date date;
    private int total;

    public AnswerCollectionResponseModel() {}


    public AnswerCollectionResponseModel(int interviewID, int score, int correctAnswer, int wrongAnswer, int skippedAnswer, Date date, int total) {
        this.interviewID = interviewID;
        this.score = score;
        this.correctAnswer = correctAnswer;
        this.wrongAnswer = wrongAnswer;
        this.skippedAnswer = skippedAnswer;
        this.date = date;
        this.total = total;
    }


    public int getWrongAnswer() {
        return wrongAnswer;
    }


    public void setWrongAnswer(int wrongAnswer) {
        this.wrongAnswer = wrongAnswer;
    }


    public int getSkippedAnswer() {
        return skippedAnswer;
    }


    public void setSkippedAnswer(int skippedAnswer) {
        this.skippedAnswer = skippedAnswer;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public int getInterviewID() {
        return interviewID;
    }

    public void setInterviewID(int interviewID) {
        this.interviewID = interviewID;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
