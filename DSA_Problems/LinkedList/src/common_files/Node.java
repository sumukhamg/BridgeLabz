package common_files;

public class Node<T> {
    public T data;
    // public Node<T> head;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
