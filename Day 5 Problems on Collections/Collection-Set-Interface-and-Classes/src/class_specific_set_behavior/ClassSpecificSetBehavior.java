package class_specific_set_behavior;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ClassSpecificSetBehavior {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            List<Integer> list = new ArrayList<>();

            list.add(5);
            list.add(3);
            list.add(5);
            list.add(1);
            list.add(2);

            System.out.println("Make a choice: ");
            System.out.println("1.HashSet: ");
            System.out.println("2.LinkedHashSet: ");
            System.out.println("3.TreeSet: ");

            int choice = scan.nextInt();

            // Using switch-case to give output according to user choice.
            switch (choice) {
                case 1:
                    // case1: returns Hashset. Stores the values according to hashing algorithm
                    Set<Integer> set = new HashSet<>(list);
                    System.out.println(set);
                    break;

                case 2:
                    // case2: Returns LinkedHashSet. Which preservs insertion order
                    Set<Integer> linkedHashSet = new LinkedHashSet<>(list);
                    System.out.println(linkedHashSet);
                    break;

                case 3:
                    // case3: Returns TreeSet. To display output in sorted order(Ascending)
                    Set<Integer> treeSet = new TreeSet<>(list);
                    System.out.println(treeSet);
                    break;

                default:
                    System.out.println("Exiting main...");
                    break;
            }
        }

    }

}
