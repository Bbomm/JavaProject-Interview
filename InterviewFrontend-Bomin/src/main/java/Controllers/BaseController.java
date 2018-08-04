package Controllers;

import Models.Managers.APIManager;
import Models.Managers.AppManager;
import Models.entities.InterviewEntity;
import Models.entities.ProfileEntity;
import Models.exceptions.LoginException;

import java.util.Scanner;

/**
 * Created by 김보민 on 2017-08-02.
 */
public class BaseController {


    public static void mainMenu () {

        APIManager apiManager = new APIManager();
        ProfileEntity pe = new ProfileEntity("", "", 0, "", "", null, "");
        InterviewEntity ie = new InterviewEntity(0,"",0,null);

        System.out.println("Welcome to the Mock-up Interview:\n" +
                "* Login if you have already registered [Press L]\n" +
                "* Register if you are the first time user [Press R]\n" +
                "* Terminate the application [Press T]\n" +
                "* Return to Main Menu[Press M]");

        Scanner scan = new Scanner(System.in);
        String inputCh = scan.next();
        switch (inputCh.toUpperCase()) {
            case "L" :
                try {
                    pe = apiManager.login(LoginController.login());
                } catch (LoginException e) {
                    System.out.println(e.getError());
                    mainMenu();
                    return;
                }
                AppManager.setProfile(pe);
                ie = InterviewSelectionController.interviewMenu(pe);

                break;
            case "R" :
                pe = apiManager.createUser(RegistrationController.builder());
                AppManager.setProfile(pe);
                InterviewSelectionController.interviewMenu(pe);
                break;
            case "M" :
                mainMenu();
                break;
            case "T" :
                System.exit(0);
                break;
        }

    }






}
