package Models.entities;

/**
 * Created by 김보민 on 2017-08-02.
 */
public class CredentialEntity {

    String username;
    String password;

    public CredentialEntity(){}

    public CredentialEntity(String username, String password) {
        super();
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
