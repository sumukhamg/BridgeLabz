package common_files;

public class LinkedListParent<T> {
    public Node<T> head;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    @Override
    public String toString() {

        System.out.print("[");
        Node<T> temp = head;
        while (temp != null) {
            if (temp.next != null)
                System.out.print(temp.data + " -> ");
            else
                System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.print("]");
        return "";
    }

}
