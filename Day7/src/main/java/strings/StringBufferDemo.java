package strings;

public class StringBufferDemo {
    public static void main(String[] args) {
        String s = "Hello";
        s = s+" World";
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(", How are you?");

        System.out.println(sb);
    }
}
