package realtime_example_to_handle_the_exceptions.problem_1;

public class InvalidAgeException extends Exception {

    public InvalidAgeException() {
        super("Age should be below 60 and above 18");
    }

}
