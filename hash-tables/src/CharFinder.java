import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {
    // O(n)
    public char findFirstNonRepeatedChar(String str){
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

    // O(n)
    public char findFirstRepeatedChar(String str) {
        Set<Character> set = new HashSet<>();

        for(char ch : str.toCharArray()) {
            if (set.contains(ch))
                return ch;

            set.add(ch);
        }

        return Character.MIN_VALUE;
    }
}
