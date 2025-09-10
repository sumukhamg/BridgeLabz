package user_registeration_problem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        String emailValidation = "^[a-z0-9]+@[a-z]+\\.[a-z]{2,}";


//        System.out.println("Enter email: ");
        String email = "sumukha@gmail.com";
        Pattern pattern = Pattern.compile(emailValidation);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches())
            System.out.println("email is valid");
        else
            System.out.println("email is invalid");
    }
}
