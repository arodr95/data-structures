import java.util.Stack;

public class StringReverser {
    public String reverse(String input) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++)
            stack.push(input.substring(i, i + 1));

        var newString = "";
        while (!stack.empty())
            newString += stack.pop();
        return newString;
    }
}
