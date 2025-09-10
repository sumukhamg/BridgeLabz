package basic_exception_problems.problem_4;

public class NegativeNumberException extends Exception {
    @Override
    public String getMessage() {
        return "Number cannot be negetive";
    }
}
