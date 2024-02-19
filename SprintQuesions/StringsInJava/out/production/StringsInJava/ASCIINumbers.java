package out.production.StringsInJava;

public class ASCIINumbers {

    public static void main(String[] args) {
        String original = "Sajan Gurung";
        String converted = convertedString(original);
        System.out.println("Original: " + original);
        System.out.println("Converted: " + converted);
    }

    private static String convertedString(String original) {
        StringBuilder result = new StringBuilder();
        for(char ch: original.toCharArray()){
            if(ch >= 'a' && ch <= 'z')
                result.append((char) (ch-32));
            else if(ch >= 'A' && ch <= 'Z')
                result.append((char)(ch+32));
            else
                result.append(ch);

        }
        return result.toString();
    }
}
