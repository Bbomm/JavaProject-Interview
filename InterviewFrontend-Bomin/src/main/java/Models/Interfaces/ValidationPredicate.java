package Models.Interfaces;

import jdk.nashorn.internal.runtime.regexp.joni.Matcher;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.regex.Pattern;

/**
 * Created by 김보민 on 2017-08-02.
 */
public interface ValidationPredicate<T> {

    public boolean validate(T t, Pattern pattern);

}
