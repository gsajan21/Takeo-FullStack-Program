package out.production.StringsInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseString {

    public static String reverseString(String s){
        int j = 0;
        Character[] reverseString = new Character[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            reverseString[j] = s.charAt(i);
            j++;
        }
        return Arrays.toString(reverseString);
    }
    public static void main(String[] args) {
        System.out.println(reverseString("Hello World"));
    }
}
