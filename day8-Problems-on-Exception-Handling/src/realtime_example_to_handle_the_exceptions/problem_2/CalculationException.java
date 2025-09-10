package realtime_example_to_handle_the_exceptions.problem_2;

public class CalculationException extends Exception {
    @Override
    public String getMessage() {
        return "Calculation Missing!...";
    }

}
