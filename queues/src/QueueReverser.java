import java.util.ArrayDeque;
import java.util.LinkedList;
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

        for(int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty())
            queue.add(stack.pop());

        for(int i = 0; i < queue.size() - k; i++)
            queue.add(queue.remove());
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
