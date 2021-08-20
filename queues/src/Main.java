import java.io.PipedWriter;
import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        QueueReverser queue = new QueueReverser();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        queue.reverse(3);

        System.out.println(queue);

    }

    public static void reverse(Queue<Integer> queue) {
        var stack = new Stack<Integer>();
        while(!queue.isEmpty())
            stack.push(queue.remove());
        while(!stack.isEmpty())
            queue.add(stack.pop());
    }
}
