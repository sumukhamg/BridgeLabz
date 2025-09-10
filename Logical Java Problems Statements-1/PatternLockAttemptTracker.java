import java.util.Scanner;

public class PatternLockAttemptTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pass;
        int attempt = 5;
        System.out.println("Enter password");
        while (attempt != 0) {
            pass = sc.nextInt();
            if (pass == 1234) {
                System.out.println("Success");
                return;
            } else if (attempt > 1)
                System.out.println("Try again...");
            attempt--;
        }

        System.out.println("Locked system");
    }
}
