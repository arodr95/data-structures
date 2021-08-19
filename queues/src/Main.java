import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        ArrayQueue queue = new ArrayQueue(3);
        queue.enqueue(1);
        System.out.println(queue);
        queue.enqueue(2);
        System.out.println(queue);
        System.out.println("removing (" + queue.dequeue() + ") ...");
        queue.enqueue(3);
        System.out.println(queue);
        queue.enqueue(4);
        System.out.println(queue);
        System.out.println("removing (" + queue.dequeue() + ") ...");
    }

    public static void reverse(Queue<Integer> queue) {
        var stack = new Stack<Integer>();
        while(!queue.isEmpty())
            stack.push(queue.remove());
        while(!stack.isEmpty())
            queue.add(stack.pop());
    }
}
