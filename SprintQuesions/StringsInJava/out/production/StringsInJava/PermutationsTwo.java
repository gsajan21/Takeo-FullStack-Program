package out.production.StringsInJava;

import java.util.Arrays;

public class PermutationsTwo {
    public static void main(String[] args) {
        String input = "ABC";
        permutations(input.toCharArray(), 0);
    }
    static void permutations(char[] arr, int fi){
        if(fi == arr.length - 1){
            System.out.print(Arrays.toString(arr));
            return;
        }
        for(int i = fi; i < arr.length; i++){
            swap(arr, i, fi);
            permutations(arr, fi + 1);
            swap(arr, i , fi);
        }
    }
    static void swap(char[] arr, int i , int fi){
        char temp = arr[i];
        arr[i] = arr[fi];
        arr[fi] = temp;
    }

}
