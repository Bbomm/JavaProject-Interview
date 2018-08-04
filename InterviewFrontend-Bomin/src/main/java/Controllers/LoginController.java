package Controllers;

import Models.Managers.APIManager;
import Models.entities.CredentialEntity;
import Models.entities.ProfileEntity;

import java.util.Scanner;

/**
 * Created by 김보민 on 2017-08-04.
 */
public class LoginController {

    public static CredentialEntity login () {

        System.out.println("Login: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("* Username : ");
        String username = scanner.next();
        System.out.println("* Password : ");
        String password = scanner.next();



        CredentialEntity ce = new CredentialEntity(username, password);
        return ce;
    }
}
