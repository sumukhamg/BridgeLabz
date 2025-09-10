package basic_exception_problems.problem_1;

import java.util.Scanner;

public class TryAndCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try {
            int n = scan.nextInt();
            System.out.println("100 / " + n + " = " + 100 / n);
        } catch (ArithmeticException e) {
            System.out.println("Number cannot be divisible by zero");
        }

    }

}
