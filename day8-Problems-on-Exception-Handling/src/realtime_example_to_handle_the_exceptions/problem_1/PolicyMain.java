package realtime_example_to_handle_the_exceptions.problem_1;

public class PolicyMain {
    public static void main(String[] args) {
        try {
            PolicyApplication applicant = new PolicyApplication("John Doe", 72, false, true);
            applicant.processApplication();

        } catch (InvalidAgeException e) {
            System.err.println("Error: " + e.getMessage());

        } catch (PoorDrivingRecordException e) {
            System.err.println("Error: " + e.getMessage());

        } catch (HealthIssueException e) {
            System.err.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();

        } finally {
            System.out.println("Thank you");
        }
    }
}
