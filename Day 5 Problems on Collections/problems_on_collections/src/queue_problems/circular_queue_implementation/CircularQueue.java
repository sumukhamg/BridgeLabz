package queue_problems.circular_queue_implementation;

public class CircularQueue<T> {
    private Node<T> front;
    private Node<T> rear;

    public void enQueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (front == null) {
            front = rear = newNode;
            rear.next = front;
            return;
        }
        rear.next = newNode;
        rear = rear.next;
        rear.next = front;
    }

    public T deQueue() {
        if (front == null) {
            System.out.println("Queue is emppty");
            return null;
        }
        if (front == rear) {
            T data = rear.data;
            front = rear = null;
            return data;
        } else {
            T data = rear.data;
            front = front.next;
            rear.next = front;
            return data;
        }
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node<T> temp = front;
        System.out.print("Circular Queue: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);
        System.out.println();
    }
}
