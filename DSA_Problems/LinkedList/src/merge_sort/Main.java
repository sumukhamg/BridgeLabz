package merge_sort;

import common_files.*;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        System.out.println("List 1:");
        System.out.println(list1);

        System.out.println("List 2:");
        System.out.println(list2);

        Node<Integer> list3 = MyLinkedList.merge(list1.head, list2.head);

        System.out.println("Merged Sorted List:");
        Node<Integer> current = list3;

        System.out.print("[");
        while (current != null) {
            if (current.next != null)
                System.out.print(current.data + " -> ");
            else
                System.out.print(current.data);
            current = current.next;
        }
        System.out.print("]");

    }

}
