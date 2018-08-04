package Models.requestModels;

import Models.entities.CredentialEntity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by 김보민 on 2017-08-04.
 */

@XmlRootElement
public class CredentialRequestModel {


    String username;
    String password;

    public CredentialRequestModel(){}

    public CredentialRequestModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
