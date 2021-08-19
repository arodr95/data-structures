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

        queue[tail] = item;
        count++;
        tail = (tail + 1) % queue.length;
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();

        var item = queue[head];
        queue[head] = 0;
        count--;
        head = (head + 1) % queue.length;

        return item;
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        return queue[head];
    }

    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
}
