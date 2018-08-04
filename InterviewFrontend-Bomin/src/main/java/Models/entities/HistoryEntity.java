package Models.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 * Created by 김보민 on 2017-08-14.
 */
public class HistoryEntity {

    int userID;
    String topic;
    long date;
    int score;



    public HistoryEntity(int userID, String topic, long date, int score) {
        this.userID = userID;
        this.topic = topic;
        this.date = date;
        this.score = score;
    }

    public HistoryEntity() {
    }


    public String getDateAsFormatted() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM, yyyy", Locale.CANADA);
        return sdf.format(date);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
