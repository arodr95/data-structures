import java.util.ArrayDeque;
import java.util.Queue;

public class StackWithTwoQueues {
    Queue<Integer> queue1 = new ArrayDeque();
    Queue<Integer> queue2 = new ArrayDeque();
    private int top;

    // O(1)
    public boolean isEmpty() {
        return queue1.size() == 0;
    }

    // O(1)
    public int size() {
        return queue1.size();
    }

    // O(1)
    public void push(int item) {
        queue1.add(item);
        top = item;
    }

    // O(n)
    public int pop() {
        if (isEmpty())
            throw new IllegalStateException();

        while(queue1.size() > 1) {
            top = queue1.remove();
            queue2.add(top);
        }

        swapQueues();

        return queue2.remove();
    }

    private void swapQueues() {
        var temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // O(n)
    public int peek() {
        if (queue1.isEmpty())
            throw new IllegalStateException();

        return top;
    }

    @Override
    public String toString() {
        return queue1.toString();
    }
}
