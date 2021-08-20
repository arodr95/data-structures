import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueReverser {
    Queue<Integer> queue = new ArrayDeque<>();
    Stack<Integer> stack = new Stack<>();

    public void add(int item) {
        queue.add(item);
    }

    public void reverse(int k) {
        if (k < 0 || k > queue.size())
            throw new IllegalArgumentException();

        dequeue_K_ItemsToStack(k);
        enqueue_K_ItemsFromStack();
        moveItemsAfter_K_ToBack(k);
    }

    private void moveItemsAfter_K_ToBack(int k) {
        for(int i = 0; i < queue.size() - k; i++)
            queue.add(queue.remove());
    }

    private void enqueue_K_ItemsFromStack() {
        while (!stack.isEmpty())
            queue.add(stack.pop());
    }

    private void dequeue_K_ItemsToStack(int k) {
        for(int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
