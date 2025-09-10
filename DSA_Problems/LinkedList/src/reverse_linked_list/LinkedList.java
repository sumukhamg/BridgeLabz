package reverse_linked_list;

import common_files.LinkedListParent;
import common_files.Node;

public class LinkedList<T> extends LinkedListParent<T> {

    public void reverse() {
        if (super.head == null) {
            System.out.println("Empty List");
            return;
        }
        Node<T> prev = null;
        Node<T> temp = head;
        Node<T> next = null;

        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        head = prev;
    }

}
