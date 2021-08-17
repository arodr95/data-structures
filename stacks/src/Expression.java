import java.util.Stack;

public class Expression {
    private String input;

    public Expression(String string) {
        input = string;
    }

    public boolean isBalancedExpression() {
        if (input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();
        for(char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[' || ch == '<')
                stack.push(ch);
            if(ch == ')' || ch == '}' || ch == ']' || ch == '>') {
                if (stack.empty()) return false;
                var top = stack.pop();
                if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[') || (ch == '>' && top != '<')) return false;
            }
        }

        return stack.empty();
    }
}
