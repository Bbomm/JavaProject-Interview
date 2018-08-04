package Controllers;

import Models.Interfaces.IntegerValidationPredicate;
import Models.Interfaces.StringValidationPredicate;
import Models.entities.UserEntity;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;

/**
 * Created by 김보민 on 2017-08-02.
 */
public class RegistrationController extends BaseController {

    public static UserEntity builder() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Registration : ");
        System.out.println("* Firstname : ");
        String firstname = scanner.next();
        System.out.println("* Lastname : ");
        String lastname = scanner.next();
        System.out.println("* Country of Location :");
        String country = scanner.next();

        String username;
        Pattern patternForUsername = Pattern.compile("^[0-9a-zA-Z]+@[.0-9a-zA-Z]+$");
        StringValidationPredicate stringV = new StringValidationPredicate();
        do {
            System.out.println("* Username : ");
            username = scanner.next();
        } while (!stringV.validate(username, patternForUsername));

        String password;
        Pattern patternForPassword = Pattern.compile("(?=([a-zA-Z0-9].*(\\W))|((\\W).*[a-zA-Z0-9])$).{8,12}");
        IntegerValidationPredicate IntegerV = new IntegerValidationPredicate();
        do {
            System.out.println("* Password : ");
            password = scanner.next();
        } while (IntegerV.validate(password, patternForPassword));

//        if( (usernameValidity == true) && (passwordValidity == true)) {
//            System.out.println("Valied username and password : ");
//            user = new UserEntity(firstname, lastname, country, username, password);
//        } else {
//            System.out.println("Try again!");
//            builder();
//        }
        UserEntity user = null;

        user = new UserEntity(firstname, lastname, country, username, password);
//        do {
//            System.out.println("Valied username and password : ");
//        } while ((usernameValidity == false) && (passwordValidity == false));

        return user;

    }


}
