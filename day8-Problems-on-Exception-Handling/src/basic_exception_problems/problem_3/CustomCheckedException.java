package basic_exception_problems.problem_3;

import java.util.Scanner;

public class CustomCheckedException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter persons age: ");
        try {
            int age = scan.nextInt();
            // if age is < 18 throw InvalidAgeException
            if (age < 18)
                throw new InvalidAgeException();
            else
                System.out.println("Age of person: " + age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
