package out.production.StringsInJava;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        String input = "abc";
        List<String> permutations = generatePermutations(input);
        System.out.println("Permutations of '" + input + "': " + permutations);
    }

    public static List<String> generatePermutations(String input) {
        List<String> result = new ArrayList<>();
        generatePermutationsHelper(input.toCharArray(), 0, result);
        return result;
    }

    // Recursive function
    private static void generatePermutationsHelper(char[] arr, int index, List<String> result) {
        if (index == arr.length - 1) {
            result.add(new String(arr));
            System.out.println(result);
        } else {
            for (int i = index; i < arr.length; i++) {
                swap(arr, index, i);
                generatePermutationsHelper(arr, index + 1, result);
                swap(arr, index, i); // Backtrack -> changing to previous form
            }
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
