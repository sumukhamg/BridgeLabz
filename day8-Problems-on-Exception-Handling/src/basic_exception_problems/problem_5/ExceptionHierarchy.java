package basic_exception_problems.problem_5;

import java.util.Scanner;

public class ExceptionHierarchy {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter choice(1, 2, 3)");
            int choice = scan.nextInt();
            if (choice == 1) {
                System.out.println(10 / 0);
            } else if (choice == 2) {

                String str = null;
                System.out.println(str.length());
            } else {
                int[] arr = { 1, 2, 3 };
                System.out.println(arr[5]);
            }
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Division by zero is not allowed.");
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Attempted to access a method on a null object.");
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e);
        }

        System.out.println("Program continues after exception handling.");
    }
}
