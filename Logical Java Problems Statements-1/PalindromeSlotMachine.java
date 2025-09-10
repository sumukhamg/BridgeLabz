public class PalindromeSlotMachine {
    public static void main(String[] args) {
        int num = 969;
        if (isJackpot(num))
            System.out.println("Jackpot!");
        else
            System.out.println("Better Luck Next Time");
    }

    static boolean isJackpot(int n) {

        int sum = 0, rev = 0, t = n;
        while (n != 0) {
            int d = n % 10;
            sum = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }
        return rev == t && sum % 3 == 0;
    }

}
