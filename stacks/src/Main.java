import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        var item = stack.peek();

        System.out.println(item);
        System.out.println(stack.toString());

        var item2 = stack.pop();
        var item3 = stack.pop();
        var item4 = stack.pop();

        System.out.println(item2);
        System.out.println(item3);
        System.out.println(item4);
        System.out.println(stack.toString());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        while(!stack.isEmpty()){
            System.out.println(stack.toString());
            System.out.println(stack.pop());
        }

        System.out.println(stack.toString());

    }
}
