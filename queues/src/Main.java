import java.io.PipedWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        PriorityQueue pq = new PriorityQueue(3);

        pq.enqueue(3);
        pq.enqueue(1);
        pq.enqueue(2);
        System.out.println(pq);

    }

    public static void reverse(Queue<Integer> queue) {
        var stack = new Stack<Integer>();
        while(!queue.isEmpty())
            stack.push(queue.remove());
        while(!stack.isEmpty())
            queue.add(stack.pop());
    }
}
