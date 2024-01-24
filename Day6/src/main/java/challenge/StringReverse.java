package challenge;

public class StringReverse {

    static void reverseString(String s){

    }
    public static void main(String[] args) {
        String str = "hello123";

        char[] revString = new char[str.length()];

        int j = 0;
        for(int i = str.length() -1 ; i >= 0; i --){
            revString[j] = str.toCharArray()[i];

            j++;
        }

        System.out.println(revString);
    }
}
