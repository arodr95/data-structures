import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoStacks items = new TwoStacks(6);

        items.push1(1);
        items.push1(2);
        items.push1(3);
        items.push2(4);
        items.push2(5);
        items.push2(6);

        System.out.println(items);

        while(!items.isEmpty1()){
            System.out.println(items.pop1());
            System.out.println(items);
        }

        while(!items.isEmpty2()){
            System.out.println(items.pop2());
            System.out.println(items);
        }
    }
}
