package out.production.StringsInJava;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String input = "helloworldhello";
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char ch : input.toCharArray()) {
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }

        // Print duplicate characters
        System.out.println("Duplicate characters");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
}
