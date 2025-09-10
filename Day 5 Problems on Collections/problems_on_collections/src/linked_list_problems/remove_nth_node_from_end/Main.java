package linked_list_problems.remove_nth_node_from_end;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Enter the value of n");
        int n = scan.nextInt();

        System.out.println(removeNthFromLast(list, n));

        // list.set(0, scan.nextLine());
        // System.out.println(list);

        // }

    }

    private static List<Integer> removeNthFromLast(List<Integer> list, int n) {
        if (list.size() == 0 || list.size() < n) {
            System.out.println("Invalid size");
            return list;
        }

        list.remove(list.size() - n);
        return list;

    }

}
