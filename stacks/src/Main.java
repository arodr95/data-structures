public class Main {
    public static void main(String[] args) {
        var string = "abcd";

        StringReverser reverser = new StringReverser();
        var result = reverser.reverse(string);
        System.out.println(result);
    }
}
