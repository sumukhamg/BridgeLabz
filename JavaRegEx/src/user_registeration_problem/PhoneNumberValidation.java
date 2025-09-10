package user_registeration_problem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
    public static void main(String[] args) {
        String phoneNumberValid = "^\\d{2,3}\\s\\d{10}";
        String phoneNumber = "91 1234567890";
        Pattern pattern = Pattern.compile(phoneNumberValid);
        Matcher matcher = pattern.matcher(phoneNumber);

        if(matcher.matches())
            System.out.println("phone number is valid");
        else
            System.out.println("phone number is invalid");
    }
}
