package Models.entities;

/**
 * Created by 김보민 on 2017-08-06.
 */
public class InterviewSelectionEntity {

    String topic;

    public InterviewSelectionEntity(){}

    public InterviewSelectionEntity(String topic) {
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
