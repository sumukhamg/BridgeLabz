package merge_two_sorted_list;

import common_files.Node;

public class MergeTwoSortedList {

    public static void main(String[] args) {
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        MyLinkedList<Integer> list2 = new MyLinkedList<>();

        list1.add(10);
        list1.add(20);
        list1.add(60);
        list1.add(70);
        list1.add(80);

        list2.add(20);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list2.add(70);

        System.out.println("list1:");
        System.out.println(list1);

        System.out.println("list2:");
        System.out.println(list2);

        Node<Integer> list3 = MyLinkedList.merge(list1.head, list2.head);
        Node<Integer> current = list3;

        while (current != null) {
            if (current.next != null)
                System.out.print(current.data + " -> ");
            System.out.print(current.data);
            current = current.next;
        }
    }

}
