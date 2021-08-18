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

    public String toString() {
        return Arrays.toString(stack);
    }
}
