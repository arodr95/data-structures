import java.util.Stack;

public class StackQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public StackQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        if (stack2.isEmpty())
            while(!stack1.isEmpty())
                stack2.push(stack1.pop());

        return stack2.pop();
    }

    public int peek() {
        while(!stack1.isEmpty())
            stack2.push(stack1.pop());

        return stack2.peek();
    }

    @Override
    public String toString() {
        while(!stack2.isEmpty())
            stack1.push(stack2.pop());
        return stack1.toString();
    }
}
