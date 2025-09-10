package basic_exception_problems.problem_4;

import java.util.Scanner;

public class CustomUncheckedException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        checkNumber(number);
    }

    static void checkNumber(int num) {
        try {
            if (num < 0)
                throw new NegativeNumberException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
