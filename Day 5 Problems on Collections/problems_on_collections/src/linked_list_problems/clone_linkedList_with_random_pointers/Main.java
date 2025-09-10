package linked_list_problems.clone_linkedList_with_random_pointers;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        System.out.println("Enter the pointer");
        int n = scan.nextInt();

        List<Integer> list2 = getMergedList(list1, n);

        if (list2 != null)
            System.out.println(list2);
        else
            System.out.println("Error");
    }

    public static List<Integer> getMergedList(List<Integer> list1, int n) {
        List<Integer> list2 = new LinkedList<>();

        if (n > list1.size()) {
            System.out.println("Invalid number");
            return null;
        }

        for (int i = 0, j = n - 1; i < list1.size(); i++, j--) {
            list2.add(list1.get(i));
            if (j >= 0)
                list2.add(list1.get(j));
        }

        return (LinkedList<Integer>) list2;

    }

}
