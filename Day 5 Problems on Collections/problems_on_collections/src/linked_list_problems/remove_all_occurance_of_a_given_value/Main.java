package linked_list_problems.remove_all_occurance_of_a_given_value;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list1 = new LinkedList<>();

        list1.add(10);
        list1.add(10);
        list1.add(20);
        list1.add(10);
        list1.add(40);
        list1.add(60);
        list1.add(10);

        System.out.println("Enter the value which you want ro remove:");
        int n = scan.nextInt();

        removeOccurance(list1, n);
    }

    static void removeOccurance(List<Integer> list1, int n) {
        int i = 0;
        while (i < list1.size()) {
            if (list1.get(i) == n) {
                list1.remove(i);
            } else {
                i++;
            }
        }

        System.out.println("Final list: " + list1);

    }
}
