package Controllers;

import Models.Managers.AppManager;
import Models.entities.HistoryCollectionEntity;
import Models.entities.InterviewSelectionEntity;
import Models.Managers.APIManager;
import Models.entities.InterviewEntity;
import Models.entities.ProfileEntity;

import java.util.Scanner;

/**
 * Created by 김보민 on 2017-08-04.
 */
public class InterviewSelectionController {

    public static InterviewEntity interviewMenu(ProfileEntity pe) {

        InterviewEntity ie = null;
        InterviewSelectionEntity ism = new InterviewSelectionEntity(null);

        do {
            Scanner scan = new Scanner(System.in);
            HistoryController historyController = new HistoryController();
            APIManager apiManager = new APIManager();
            System.out.println("\n********************************************************");
                System.out.println("* Start an interview in Java [Press J]\n" +
                    "* Start an interview in SQL[Press S]\n" +
                    "* See the history of past interviews [Press H]\n" +
                    "* Return to Main Menu [Press M]");

            String input = scan.next();

            // ProfilmeEntity is for HistoryController
//            ProfileEntity profileEntity = new ProfileEntity("", "", 0, "", "", null, "");

            switch (input) {
                case "J":
                    System.out.println(pe.getFirstName() + " " + AppManager.getProfile().getCountry());
                    ism = new InterviewSelectionEntity("JAVA");
                    System.out.println("Welcome to Java interview Questions. You will be shown 20 Java questions." );
                    String startJ;
                    do {
                        System.out.println("\n* When ready, write 'start' to begin the interview.");
                        startJ = scan.next();
                    } while(!startJ.equals("start"));
                        ie =  apiManager.getInterview(ism);
                        QuestionController.showQuestions(ie, ism); /**/
                    return ie; //break;

                case "S":
                    ism = new InterviewSelectionEntity("SQL");
                    String startS;
                    do {
                        System.out.println("\n* When ready, write 'start' to begin the interview.");
                        startS = scan.next();
                    } while(!startS.equals("start"));
                        ie =  apiManager.getInterview(ism);
                        QuestionController.showQuestions(ie, ism);  /**/
                    return ie;

                case "M":
                    System.out.println("\n*********************************************************");
                    BaseController.mainMenu();

                case "H":
//                    historyController.printHistory(historyController.showHistory(pe));

                    HistoryCollectionEntity hce = historyController.showHistory(pe);
                    historyController.printHistory(hce);
            }
        } while(ie == null);
        return ie;
    }


}
