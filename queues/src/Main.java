import java.io.PipedWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        PriorityQueue pq = new PriorityQueue();

        pq.add(5);
        pq.add(2);
        pq.add(3);
        pq.add(1);
        pq.add(4);
//        pq.add(7);
//        pq.add(6);

        System.out.println(pq);

        while(!pq.isEmpty()) {
            System.out.println("top is " + pq.peek());
            System.out.println("removing (" + pq.remove() + ") ...");
            System.out.println(pq);
        }

    }

    public static void reverse(Queue<Integer> queue) {
        var stack = new Stack<Integer>();
        while(!queue.isEmpty())
            stack.push(queue.remove());
        while(!stack.isEmpty())
            queue.add(stack.pop());
    }
}
