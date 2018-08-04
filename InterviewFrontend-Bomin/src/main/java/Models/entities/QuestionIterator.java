package Models.entities;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by 김보민 on 2017-08-07.
 */
public class QuestionIterator implements Iterator<Question> {


    ArrayList<Question> questions = new ArrayList<>();
    int counter;

    public QuestionIterator() {
    }

    public QuestionIterator(ArrayList<Question> questions) {
        this.questions = questions;
        this.counter = counter;
    }

    @Override
    public boolean hasNext() {
        return counter < questions.size();
    }

    @Override
    public Question next() {
        if(hasNext()) {
            Question quetion = questions.get(counter);
            this.counter++;
            return quetion;
        }
        return null;
    }
}
