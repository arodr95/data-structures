import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Main {
    public static void main(String args[]) {
        var string = "a green apple";
        var ch = findFirstNonRepeatedChar(string);
        System.out.println(ch);
    }

    // O(n)
    public static char findFirstNonRepeatedChar(String str){
        Map<Character, Integer> map = new HashMap<>();

        var chars = str.toCharArray();
        for(char ch : chars) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for(var ch : chars)
            if(map.get(ch) == 1)
                return ch;

        return Character.MIN_VALUE;
    }
}
