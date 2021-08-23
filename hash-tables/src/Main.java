import java.util.*;

public class Main {
    public static void main(String args[]) {
        CharFinder finder = new CharFinder();

        var str1 = "a green apple";
        var ch1 = finder.findFirstNonRepeatedChar(str1);
        System.out.println("string: " + str1);
        System.out.println("first non-repeated character is '" + ch1 + "'");

        var str2 = "green apple";
        var ch2 = finder.findFirstRepeatedChar(str2);
        System.out.println("string: " + str2);
        System.out.println("first repeated character is '" + ch2 + "'");
    }
}
