import java.util.ArrayDeque;
import java.util.Queue;

public class StackWithTwoQueues {
    Queue<Integer> queue1 = new ArrayDeque();
    Queue<Integer> queue2 = new ArrayDeque();

    // O(1)
    public void push(int item) {
        queue1.add(item);
    }

    // O(n)
    public int pop() {
        if (queue1.isEmpty())
            throw new IllegalStateException();

        while(queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        var item = queue1.remove();
        queue1 = queue2;

        return item;
    }
}
