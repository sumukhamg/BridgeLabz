package merge_two_sorted_list;

import common_files.LinkedListParent;
import common_files.Node;

public class MyLinkedList<T extends Comparable<T>> extends LinkedListParent<T> {
    // Node<T> head;

    public static <T extends Comparable<T>> Node<T> merge(Node<T> l1, Node<T> l2) {
        Node<T> dummy = new Node<>(null);
        Node<T> tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data.compareTo(l2.data) <= 0) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if (l1 != null)
            tail.next = l1;
        if (l2 != null)
            tail.next = l2;

        return dummy.next;
    }
}
