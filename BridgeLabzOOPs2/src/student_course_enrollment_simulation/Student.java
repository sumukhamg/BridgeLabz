package student_course_enrollment_simulation;

public class Student {
    private int attendence;
    private int rollNo;
    CourseImpl course;

    Student(int rollNo, int attendence, String courseName) {
        course = new CourseImpl(courseName);
        this.attendence = attendence;
        this.rollNo = rollNo;
    }

    public int getAttendance() {
        return attendence;
    }

    public int getRollNo() {
        return rollNo;
    }

    public Course getCourse() {
        return course;
    }

    public void getInfo() {
        System.out.println("--------Student details--------");
        System.out.println("Student RollNumber: " + rollNo);
        System.out.println("Student attendence: " + attendence);
        course.enroll();
        course.viewContent();
    }

}
