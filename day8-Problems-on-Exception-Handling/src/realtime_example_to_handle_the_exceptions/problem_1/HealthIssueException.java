package realtime_example_to_handle_the_exceptions.problem_1;

public class HealthIssueException extends Exception {
    public HealthIssueException() {
        super("Persons has health issue");
    }
}
