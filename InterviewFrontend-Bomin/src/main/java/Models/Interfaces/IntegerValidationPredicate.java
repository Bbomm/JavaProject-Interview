package Models.Interfaces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 김보민 on 2017-08-02.
 */
public class IntegerValidationPredicate implements ValidationPredicate {

    @Override
    public boolean validate(Object o, Pattern pattern) {
        Matcher m = pattern.matcher(o.toString());

        if(m.find()) {
            return true;
        }
        return false;
    }
}
