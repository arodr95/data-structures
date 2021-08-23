import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Main {
    public static void main(String args[]) {
        // a green apple

        var string = "a green apple";

        System.out.println(findFirstNonRepeatedCharacter(string));
    }

    public static char findFirstNonRepeatedCharacter(String string){
        var array = string.toLowerCase().toCharArray();
        Map<Character, Boolean> map = new HashMap<>();


        for(char character : array) {
            if (map.containsKey(character)){
                map.put(character,true);
                return character;
            } else {
                map.put(character, false);
            }
        }

        return '0';
    }
}
