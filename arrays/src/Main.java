public class Main {
    public static void main(String args[]) {
        Array numbers = new Array(3 );
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.print();
        System.out.println();
        numbers.removeAt(2);
        numbers.print();
        System.out.println();
        System.out.println(numbers.indexOf(20));
    }
}