package linked_list_problems.merge_two_sorted_list;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        list2.add(70);
        list2.add(80);
        list2.add(90);
        list2.add(100);
        list2.add(101);

        List<Integer> list3 = mergeTwoList(list1, list2);
        System.out.println(list3);

    }

    static LinkedList<Integer> mergeTwoList(List<Integer> list1, List<Integer> list2) {
        List<Integer> list3 = new LinkedList<>();
        int idx1 = 0;
        int idx2 = 0;
        while (idx1 < list1.size() && idx2 < list2.size()) {
            if (list1.get(idx1) < list2.get(idx2)) {
                list3.add(list1.get(idx1));
                idx1++;
            } else {
                list3.add(list2.get(idx2));
                idx2++;
            }
        }

        while (idx1 < list1.size()) {
            list3.add(list1.get(idx1));
            idx1++;
        }

        while (idx2 < list2.size()) {
            list3.add(list2.get(idx2));
            idx2++;
        }
        return (LinkedList<Integer>) list3;
    }
}
