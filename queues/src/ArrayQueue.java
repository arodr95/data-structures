import java.util.Arrays;

public class ArrayQueue {
    private int[] queue;
    private int head;
    private int tail;

    public ArrayQueue(int size) {
        queue = new int[size];
        head = 0;
        tail = 0;
    }

    public boolean isFull() {
        return tail == queue.length;
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public void enqueue(int item) {
        if (isFull())
            throw new StackOverflowError();



        queue[tail++] = item;
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();

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
