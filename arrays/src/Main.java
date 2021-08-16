public class Main {
    public static void main(String args[]) {
        Array numbers = new Array(3 );
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        Array numbers2 = new Array(5);
        numbers2.insert(20);
        numbers2.insert(40);
        numbers2.insert(60);
        numbers2.insert(80);
        numbers2.insert(100);
        numbers.intersect(numbers2).print();
    }
}