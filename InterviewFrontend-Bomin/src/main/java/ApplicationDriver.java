import Controllers.AnswerController;
import Controllers.BaseController;
import Controllers.QuestionController;
import Models.entities.Question;

import java.util.ArrayList;

/**
 * Created by 김보민 on 2017-08-04.
 */
public class ApplicationDriver {

    public static void main(String[] args) {
        ArrayList<Question> question = new ArrayList<>();

//        System.out.println(question.add(new Question("What is java?", "a", "b", "c", "d", "")));
//        question.add(new Question("Where is java?", "a", "b", "c", "d", ""));

        BaseController.mainMenu();

    }
}
