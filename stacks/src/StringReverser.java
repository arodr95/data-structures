import java.util.Stack;

public class StringReverser {
    public String reverse(String input) {
        Stack<Character> stack = new Stack<>();

        for(char ch : input.toCharArray())
            stack.push(ch);

        var reversed = "";
        while (!stack.empty())
            reversed += stack.pop().toString();
        return reversed;
    }
}
