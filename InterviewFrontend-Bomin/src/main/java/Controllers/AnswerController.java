package Controllers;

import Models.Interfaces.Observable;
import Models.Interfaces.Observer;
import Models.Managers.APIManager;
import Models.Managers.AppManager;
import Models.entities.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 김보민 on 2017-08-10.
 */
public class AnswerController {

    AnswerEntity answerEntity;
    AnswerCollectionEntity answerCollectionEntity;
    InterviewEntity ie;

    Scanner scan = new Scanner(System.in);

    public AnswerController(int interviewID, InterviewSelectionEntity ise ) { /**/
        answerCollectionEntity = new AnswerCollectionEntity(interviewID, AppManager.getProfile().getUserId(), ise.getTopic());  /**/
    }

    public void readAnswer(int questionID) {
        String answer;
        do {
            System.out.println("Please answer the question among a to d : \n");
            System.out.println("If you don't know the answer, Press s.");
            answer = scan.nextLine();
        } while (!(answer.equals("a") || answer.equals("b") || answer.equals("c") || answer.equals("d") || answer.equals("s")));


        answerEntity = new AnswerEntity(questionID,  answer);
        answerCollectionEntity.addAnswer(answerEntity);
    }


    public void sayInterviewIsOver() {
        APIManager apiManager = new APIManager();
        System.out.println("This interview is over. Thank you so much for your effort!\n");
        ResultEntity result = apiManager.getResult(answerCollectionEntity);
        showingResult(result);

    }

    public void showingResult(ResultEntity re) {
//        ProfileEntity pe = new ProfileEntity();
//        AppManager.setProfile(pe);

        ProfileEntity pe = AppManager.getProfile();
        System.out.println("Dear " + pe.getFirstName() + " " + pe.getLastName() + "" +
                "Here is your result : \n");
        System.out.println("Date of Test : " + pe.getJoined()
                + "\nYour score : " + re.getScore() + " / 100"
                + "\nTotal number of questions : " + re.getTotal()
                + "\nCorrect responses : " + re.getCorrectAnswer()
                + "\nWrong responses : " + re.getWrongAnswer()
                + "\nSkipped responses : " + re.getSkippedAnswer()
                + "\nThe level of "
                + "\nWould you like to take another test? [Y/N]\n");

        String yesNo = scan.next();

        do {
            if (yesNo.equals("N")) {
                BaseController.mainMenu();
            } else if (yesNo.equals("Y")) {
                InterviewSelectionController.interviewMenu(pe);
            }
        } while (!(yesNo.equals("Y") || yesNo.equals("N")));
    }

}
