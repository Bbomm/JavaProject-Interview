package Models.requestModels;

import Models.entities.ProfileEntity;
import sun.java2d.cmm.Profile;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by 김보민 on 2017-08-14.
 */

@XmlRootElement
public class HistoryRequestModel {

    int userID;
    ProfileEntity profileEntity;

    public HistoryRequestModel(){}

    public HistoryRequestModel(int userID) {
        this.userID = userID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }


    public HistoryRequestModel(ProfileEntity profileEntity) {
        this.profileEntity = profileEntity;
    }

    public ProfileEntity getProfileEntity() {
        return profileEntity;
    }

    public void setProfileEntity(ProfileEntity profileEntity) {
        this.profileEntity = profileEntity;
    }
}
