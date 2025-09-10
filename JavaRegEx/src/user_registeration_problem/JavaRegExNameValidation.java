package user_registeration_problem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegExNameValidation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameValid = "[A-Z][a-z]{2,}$";

        System.out.println("Enter First name: ");
        String firstName = scan.nextLine();

        System.out.println("Enter last name");
        String lastName = scan.nextLine();

        if(matchName(nameValid, firstName))
            System.out.println("first name is valid");
        else
            System.out.println("first name is invalid");

        if(matchName(nameValid, lastName))
            System.out.println("last Name is invalid");
        else
            System.out.println("Last Name is invalid");
    }

    static boolean matchName(String validName, String name){
        Pattern pattern = Pattern.compile(validName);
        Matcher match = pattern.matcher(name);
        return match.matches();
    }
}
