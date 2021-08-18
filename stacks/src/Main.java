import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoStacks items = new TwoStacks(5);

        System.out.println(items);

        items.push2(4);
        items.push2(5);

        var item = items.pop1();

        System.out.println(item);
        System.out.println(items);
    }
}
