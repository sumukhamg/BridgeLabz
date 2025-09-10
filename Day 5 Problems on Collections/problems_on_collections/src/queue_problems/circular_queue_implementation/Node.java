package queue_problems.circular_queue_implementation;

public class Node<T> {
    Node<T> next;
    T data;

    Node(T data) {
        this.data = data;
    }

}
