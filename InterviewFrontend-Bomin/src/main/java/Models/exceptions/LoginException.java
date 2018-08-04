package Models.exceptions;

/**
 * Created by 김보민 on 2017-08-30.
 */
public class LoginException extends Exception {
    private String error;

    public LoginException(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
