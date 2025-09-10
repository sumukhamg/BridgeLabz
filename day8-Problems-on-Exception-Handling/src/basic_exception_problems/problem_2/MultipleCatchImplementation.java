package basic_exception_problems.problem_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchImplementation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        try {
            int number1 = scan.nextInt();
            int number2 = scan.nextInt();
            int divide = number1 / number2;
            System.out.println("Number enetred: " + number1 + " and  " + number2 + " result is: " + divide);
        } catch (ArithmeticException e) {
            System.out.println("Number cannot be divisible by zero");
        } catch (InputMismatchException e) {
            System.out.println("Please enter only integer values");
        }

    }

}
