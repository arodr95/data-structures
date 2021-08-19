import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MinStack stack = new MinStack();

        stack.push(20);
        stack.push(10);
        stack.push(5);

        while(!stack.isEmpty()){
            System.out.println(stack);
            System.out.println("minimum value is " + stack.min());
            System.out.println("removing min (" + stack.pop() + ") ...");
            System.out.println();
        }
    }
}
