package realtime_example_to_handle_the_exceptions.problem_1;

public class PolicyApplication {
    private String name;
    private int age;
    private boolean hasPoorDrivingRecord;
    private boolean hasHealthIssues;

    public PolicyApplication(String name, int age, boolean hasPoorDrivingRecord, boolean hasHealthIssues) {
        this.name = name;
        this.age = age;
        this.hasPoorDrivingRecord = hasPoorDrivingRecord;
        this.hasHealthIssues = hasHealthIssues;
    }

    // method to check age validation
    public void validateAge() throws InvalidAgeException {
        if (age < 18 || age > 70) {
            throw new InvalidAgeException();
        }
    }

    // Method to validate driving history
    public void validateDrivingHistory() throws PoorDrivingRecordException {
        if (hasPoorDrivingRecord) {
            throw new PoorDrivingRecordException();
        }
    }

    // Method to validate health records
    public void validateHealth() throws HealthIssueException {
        if (hasHealthIssues) {
            throw new HealthIssueException();
        }
    }

    // Method to process the policy application
    public void processApplication() throws InvalidAgeException, PoorDrivingRecordException, HealthIssueException {
        validateAge();
        validateDrivingHistory();
        validateHealth();
        System.out.println("Policy Application Approved for " + name);
    }

}
