package Models.Managers;

import Models.entities.ProfileEntity;

/**
 * Created by 김보민 on 2017-09-01.
 */
public class AppManager {
    private static ProfileEntity profile;

    public static void setProfile(ProfileEntity pe) {
        profile = pe;
    }

    public static ProfileEntity getProfile() {
        return profile;
    }
}
