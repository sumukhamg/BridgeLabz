package realtime_example_to_handle_the_exceptions.problem_1;

public class PoorDrivingRecordException extends Exception {
    public PoorDrivingRecordException() {
        super("Driver has poor driving history");
    }

}
