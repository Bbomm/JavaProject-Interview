package Controllers;

import Models.Managers.APIManager;
import Models.entities.*;

import java.util.*;

/**
 * Created by 김보민 on 2017-08-06.
 */
public class QuestionController implements Models.Interfaces.Observer {
    static Timer timer = new Timer();
    static int delay = 1000;
    static int period = 1000;
    static int interval = 600;

    public static int setInterval() {
        if(interval == 0) {
            System.out.println("Time is over!");
            timer.cancel();
        } else if(interval == 300) {
            System.out.println("10mins left!");
        } else if(interval == 150) {
            System.out.println("5mins left! Hurry up!");
        }
        return --interval;
    }



    InterviewEntity interviewEntity;

    public static void showQuestions(InterviewEntity interviewEntity, InterviewSelectionEntity ise) {
        QuestionIterator iterator = new QuestionIterator(interviewEntity.getQuestions());
        AnswerController ac = new AnswerController(interviewEntity.getInterviewID(), ise); // AnswerCollectionEntity

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                setInterval();
            }
        }, delay, period);



        for (Question question : interviewEntity) {

            System.out.println(question.getQuestionID() + ". " + question.getDescription() + "\n   a) "
                    + question.getOpt1() + "\n   b) " + question.getOpt2() + "\n   c) " + question.getOpt3() + "\n   d) "
                    + question.getOpt4() + "\n   " + "DifficultyLevel : " + question.getDifficultyLevel());

             ac.readAnswer(question.getQuestionID());

        }



        ac.sayInterviewIsOver();

    }


    @Override
    public void update() {
        System.out.println("User put the answer of the question.");
    }

}
