package Models.requestModels;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by 김보민 on 2017-08-06.
 */
@XmlRootElement
public class InterviewRequestModel {

    String topic;    // JAVA, SQL

    public InterviewRequestModel(){}

    public InterviewRequestModel(String topic) {
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
