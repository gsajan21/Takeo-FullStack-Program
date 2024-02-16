import java.util.ArrayList;
import java.util.List;

public class ReverseString {

    public static String reverseString(String s){

        List<Character> reverseString = new ArrayList<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            reverseString.add(s.charAt(i));
        }
        List<Character> reversed = reverseString.reversed();
        return reversed.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseString("Hello World"));
    }
}
