import java.util.Arrays;

public class ArrayQueue {
    private int[] queue;
    private int head;
    private int tail;
    private int count;

    public ArrayQueue(int size) {
        queue = new int[size];
    }

    public boolean isFull() {
        return count == queue.length;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void enqueue(int item) {
        if (isFull())
            throw new StackOverflowError();

        queue[tail++] = item;
        count++;
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();

        count--;
        return queue[head++];
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        return queue[head];
    }

    @Override
    public String toString() {
        var items = Arrays.copyOfRange(queue, head, tail);
        return Arrays.toString(items);
    }
}
