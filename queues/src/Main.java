import java.io.PipedWriter;
import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        StackWithTwoQueues stack = new StackWithTwoQueues();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        while(!stack.isEmpty()) {
            System.out.println(stack);
            System.out.println("top is " + stack.peek() + "");
            System.out.println("removing (" + stack.pop() + ") ...");
        }

        System.out.println(stack);
    }

    public static void reverse(Queue<Integer> queue) {
        var stack = new Stack<Integer>();
        while(!queue.isEmpty())
            stack.push(queue.remove());
        while(!stack.isEmpty())
            queue.add(stack.pop());
    }
}
