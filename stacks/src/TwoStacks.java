import java.util.Arrays;
import java.util.Stack;

public class TwoStacks {
    private int[] items;
    private int size;
    private int index1;
    private int index2;

    public TwoStacks(int size) {
        items = new int[size];
        this.size = size;
        index2 = size - 1;
        index1 = 0;
    }

    public boolean isEmpty1() {
        return index1 == 0;
    }

    public boolean isEmpty2() {
        return index2 == size - 1;
    }

    private boolean isFull() {
        return index1 > index2;
    }

    public void push1(int item) {
        if (isFull())
            throw new StackOverflowError();

        items[index1++] = item;
    }

    public void push2(int item) {
        if (isFull())
            throw new StackOverflowError();

        items[index2--] = item;
    }

    public int pop1() {
        if (isEmpty1())
            throw new IllegalStateException();

        index1--;
        var item = items[index1];
        items[index1] = 0;
        return item;
    }

    public int pop2() {
        if (isEmpty2())
            throw new IllegalStateException();

        index2++;
        var item = items[index2];
        items[index2] = 0;
        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
