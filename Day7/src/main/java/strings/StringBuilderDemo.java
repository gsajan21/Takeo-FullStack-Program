package strings;

public class StringBuilderDemo {
    public static void main(String[] args) {

        String s = "Hello";
        s = s+" World";
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(", How are you?");

        System.out.println(sb);
    }
}
