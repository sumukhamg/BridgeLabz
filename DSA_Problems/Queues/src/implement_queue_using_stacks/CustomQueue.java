package implement_queue_using_stacks;

public class CustomQueue<T> {

    CustomStack<T> originalStack = new CustomStack<>();
    CustomStack<T> tempStack = new CustomStack<>();

    public void add(T data) {
        if (originalStack.size() == 1) {
            originalStack.push(data);
        }
        
        originalStack.push(data);

    }
}
