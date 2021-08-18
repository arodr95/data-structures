import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        var item = stack.peek();

        System.out.println(stack);
        System.out.println(item);

        while(!stack.isEmpty()){
            System.out.println(stack);
            System.out.println(stack.pop());
        }

        System.out.println(stack);
    }
}
