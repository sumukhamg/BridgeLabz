public class NumberIsReversible {
    public static void main(String args[]) {
        int n = 34;
        if (isReversible(n))
            System.out.println("Number " + n + " is reversible");
        else
            System.out.println("Number " + n + " is not reversible");

    }

    static boolean isReversible(int n) {
        int rev = getReversed(n) + n;
        while (rev != 0) {
            int d = rev % 10;
            if (d % 2 == 0)
                return false;
            rev /= 10;
        }

        return true;
    }

    static int getReversed(int n) {
        int rev = 0;
        do {
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        } while (n != 0);

        return rev;
    }

}
