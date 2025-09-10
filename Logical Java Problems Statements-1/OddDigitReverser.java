public class OddDigitReverser {
    public static void main(String[] args) {
        int num = 111;
        int rev = getReversed(num);
        System.out.println("Odd reversed number is: " + rev);
    }

    static int getReversed(int n) {
        int rev = 0;
        while (n != 0) {
            int d = n % 10;
            if (d % 2 == 1)
                rev = rev * 10 + d;
            n /= 10;
        }
        return rev;
    }
}
