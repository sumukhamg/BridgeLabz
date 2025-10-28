public class Fib {
    public static int fibonacchi(int n) {
        if (n <= 0) {
            return n;
        }
        return fibonacchi(n - 1) + fibonacchi(n - 2);
    }

    static void printFibonacchi(int n) {
        if (n == 0)
            return;
        System.out.println(fibonacchi(n));
    }

    public static void main(String[] args) {
        printFibonacchi(5);
        System.out.println(fibonacchi(5));

        System.out.println("Sumukh".substring(1));

    }
}
