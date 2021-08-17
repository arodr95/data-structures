public class Main {
    public static void main(String[] args) {
        var string = "(>";

        Expression expression = new Expression(string);
        var result = expression.isBalancedExpression();
        System.out.println(result);
    }
}
