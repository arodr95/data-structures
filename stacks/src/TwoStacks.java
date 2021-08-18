import java.util.Arrays;
import java.util.Stack;

public class TwoStacks {
    private int[] items;
    private int index1;
    private int index2;

    public TwoStacks(int size) {
        items = new int[size];
    }

    public boolean isEmpty1() {
        return index1 == 0;
    }

    public boolean isEmpty2() {
        return index2 == index1;
    }

    private boolean isFull() {
        return index2 > items.length;
    }

    public void push1(int item){
        if (isFull())
            throw new StackOverflowError();

        shiftStack2Right();
        items[index1++] = item;
    }

    public void push2(int item) {
        if (isFull())
            throw new StackOverflowError();

        items[index2++] = item;
    }

    public int pop1() {
        if (isEmpty1())
            throw new IllegalStateException();

        var item = items[index1 - 1];
        index1--;
        shiftStack2Left();
        return item;
    }

    public int pop2() {
        if (isEmpty2())
            throw new IllegalStateException();

        var item = items[index2 - 1];
        index2--;
        return item;
    }

    @Override
    public String toString() {
        var stack1 = Arrays.copyOfRange(items, 0, index1);
        var stack2 = Arrays.copyOfRange(items, index1, index2);
        return Arrays.toString(stack1) + Arrays.toString(stack2);
    }

    private void shiftStack2Right() {
        for(int i = index2; i > index1; i--)
            items[i] = items[i - 1];
        index2++;
    }

    private void shiftStack2Left() {
        index2--;
        for(int i = index1; i < index2; i++)
            items[i] = items[i+1];
    }
}
