package student_course_enrollment_simulation;

public class CourseImpl implements Course {
    String courseName;
    String facultyName = "";
    boolean enrolment;

    CourseImpl(String courseName) {
        this.courseName = courseName;

    }

    public void getFaculty() {
        if (courseName.equalsIgnoreCase("History")) {
            facultyName = "Mahesh";
        } else if (courseName.equalsIgnoreCase("Computer Science")) {
            facultyName = "Suresh";
        } else if (courseName.equalsIgnoreCase("Biology")) {
            facultyName = "Santosh";
        } else {
            System.out.println("Please re-check subject name");
        }
    }

    @Override
    public void enroll() {
        if (courseName.equals("History") || courseName.equals("Biology") || courseName.equals("Computer Science")) {
            enrolment = true;
            getFaculty();
            System.out.println("Student has enrolled " + courseName);
        } else {
            System.out.println("Student didn't enrolled to any subject yet");
        }
    }

    @Override
    public void viewContent() {
        System.out.println("\nEnrollment Details: ");
        if (enrolment) {
            System.out.println("Subject Enrolled: " + courseName);
            System.out.println("Faculty name: " + facultyName);
        } else {
            System.out.println("Please enroll");
        }
    }

}
