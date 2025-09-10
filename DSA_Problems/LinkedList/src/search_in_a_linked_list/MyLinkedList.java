package search_in_a_linked_list;

import common_files.LinkedListParent;
import common_files.Node;

class MyLinkedList<T> extends LinkedListParent<T> {

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int search(T key) {
        Node<T> current = head;
        int position = 1;
        while (current != null) {
            if (current.data.equals(key)) {
                return position;
            }
            current = current.next;
            position++;
        }
        return -1;
    }
}
