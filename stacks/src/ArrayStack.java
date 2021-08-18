import java.util.Arrays;

public class ArrayStack {
    private int[] stack;
    private int count;

    public ArrayStack() {
        stack = new int[0];
        count = 0;
    }

    private boolean isFull() {
        return count >= stack.length;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    private void increaseSize() {
        var newStack = new int [count + 1];
        var index = 0;
        for(int item : stack) {
            newStack[index] = item;
            index++;
        }
        stack = newStack;
    }

    public void push(int item) {
        if(isFull() || isEmpty()) {
            increaseSize();
        }

        stack[count] = item;
        count++;
    }

    public int pop() {
        if (isEmpty())
            throw new IllegalStateException();

        count--;
        var top = stack[count];

        var newStack = new int[count];
        for (int i = 0; i < newStack.length; i++)
            newStack[i] = stack[i];
        stack = newStack;

        return top;
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        return stack[count - 1];
    }

    @Override
    public String toString() {
        return Arrays.toString(stack);
    }
}
