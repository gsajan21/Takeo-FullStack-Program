package out.production.StringsInJava;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        String input = "abc";
        List<String> combinations = generateCombinations(input);
        System.out.println("Combinations of '" + input + "': " + combinations);
    }

    public static List<String> generateCombinations(String input) {
        List<String> result = new ArrayList<>();
        generateCombinationsHelper(input.toCharArray(), 0, new StringBuilder(), result);
        return result;
    }

    private static void generateCombinationsHelper(char[] arr, int index, StringBuilder current, List<String> result) {
        if (index == arr.length) {
            result.add(current.toString());
        } else {
            // Include current character
            generateCombinationsHelper(arr, index + 1, current.append(arr[index]), result);
            current.deleteCharAt(current.length() - 1); // Backtrack

            // Exclude current character
            generateCombinationsHelper(arr, index + 1, current, result);
        }
    }
}
