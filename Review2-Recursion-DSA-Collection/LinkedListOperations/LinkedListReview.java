package LinkedListOperations;

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
    }
}

class LinkedListOperator {

    Node head;

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node temp = head;
        Node newNode = new Node(data);
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void add(int i, int data) {
        if (i == 1) {
            addFirst(data);
        }

        Node temp = head;
        for (int j = 0; j < i - 1 && temp != null; j++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(data);

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        head = head.next;
    }

    public void removeLast() {
        if (head == null || head.next == null) {
            removeFirst();
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void remove(int i) {
        if (i == 1) {
            removeFirst();
            return;
        }

        Node temp = head;
        for (int j = 0; j < i - 1 && temp != null; j++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid index");
            return;
        }

        temp.next = temp.next.next;

    }

    public int size() {
        if (head == null)
            return 0;
        Node temp = head;
        int i = 0;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        return i;
    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }

    public void rotate(int i) {
        Node temp = head;
        i = i % size();

        Node found = null;
        while (temp.next != null) {
            if (i == 1)
                found = temp;

            temp = temp.next;
            i--;
        }

        temp.next = head;
        head = found.next;
        found.next = null;

    }

    void display() {
        if (head == null) {
            System.out.println("Empty Stack");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class LinkedListReview {
    public static void main(String[] args) {
        LinkedListOperator list = new LinkedListOperator();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // list.addFirst(10);

        // list.add(2, 15);
        // list.add(20);

        // list.removeLast();
        // list.remove(3);
        list.display();
        System.out.println(list.size());
        // list.reverse();

        list.rotate(1);
        list.display();

    }

}
