package Models.entities;

import java.util.Date;

/**
 * Created by 김보민 on 2017-08-02.
 */
public class ProfileEntity {

    private String firstName;
    private String lastName;
    private int userId;
    private String username;
    private String country;
    private Date joined;
    private String token;



    public ProfileEntity(String firstName, String lastName, int userId, String username, String country, Date joined, String token) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId = userId;
        this.username = username;
        this.country = country;
        this.joined = joined;
        this.token = token;
    }

    public ProfileEntity() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getJoined() {
        return joined;
    }

    public void setJoined(Date joined) {
        this.joined = joined;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
