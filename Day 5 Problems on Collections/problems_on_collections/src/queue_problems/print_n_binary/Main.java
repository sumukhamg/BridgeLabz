package queue_problems.print_n_binary;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");

        int n = sc.nextInt();
        generateBinary(n);
    }

    public static void generateBinary(int n) {
        Deque<String> deque = new LinkedList<>();
        deque.add("1");

        for (int i = 1; i <= n; i++) {
            String current = deque.poll();
            System.out.println(current);

            deque.add(current + "0");
            deque.add(current + "1");
        }

    }
}
