package realtime_example_to_handle_the_exceptions.problem_2;

public class DataNotFoundException extends Exception {
    @Override
    public String getMessage() {
        return "Some data you provided in invalid or unavailable";
    }
}
