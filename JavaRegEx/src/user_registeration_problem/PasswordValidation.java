package user_registeration_problem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
    public static void main(String[] args) {
        String password = "1Sumukha$";
        String passwordValidation = "^[a-zA-Z0-9]*[!@#$%^&*()_+\\-=\\[\\]{}|;:'\",.<>\\ /?]{1}[a-zA-Z0-9]*$\n";

        Pattern pattern = Pattern.compile(passwordValidation);
        Matcher match = pattern.matcher(password);

        if(match.matches())
            System.out.println("Password is valid");
        else
            System.out.println("Password is invalid");

    }
}
