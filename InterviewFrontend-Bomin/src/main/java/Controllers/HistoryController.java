package Controllers;

import Models.Managers.APIManager;
import Models.Managers.AppManager;
import Models.entities.HistoryCollectionEntity;
import Models.entities.ProfileEntity;

/**
 * Created by 김보민 on 2017-08-14.
 */
public class HistoryController {

    APIManager api = new APIManager();

    public HistoryCollectionEntity showHistory(ProfileEntity pe) {
        pe = AppManager.getProfile();
        return api.getHistory(pe.getUserId());
    }


    public void printHistory(HistoryCollectionEntity he) {
        if (he.getList().size() == 0) {
            System.out.println("you've never taken an interview so far!");
        } else {
            for (int i = 0; i < he.getList().size(); i++) {
                System.out.println("[\nHistory\n" + "Topic : " + he.getList().get(i).getTopic()
                        + "\n" + "Date : " + he.getList().get(i).getDateAsFormatted() + "\n" + "Score : "
                        + he.getList().get(i).getScore() + "\n]");
            }
        }
    }
}