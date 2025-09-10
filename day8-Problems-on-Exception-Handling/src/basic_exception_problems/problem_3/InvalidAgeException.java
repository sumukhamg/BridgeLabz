package basic_exception_problems.problem_3;

//Defining custom Exception class that extends Exceptuon.
public class InvalidAgeException extends Exception {

    @Override
    public String getMessage() {
        return "Age cannot be less than 18";
    }

}
