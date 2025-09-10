package student_course_enrollment_simulation;

public class StudentEnrollment {
    public static void main(String[] args) {
        Student student1 = new Student(111, 75, "History");
        Student student2 = new Student(222, 60, "Biologii");
        Student student3 = new Student(333, 80, "Computer Science");

        student1.getAttendance();
        student1.getInfo();
        System.out.println();

        student2.getAttendance();
        student2.getInfo();
        System.out.println();

        student3.getAttendance();
        student3.getInfo();
        System.out.println();
    }
}
