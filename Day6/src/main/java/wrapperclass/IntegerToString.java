package wrapperclass;

public class IntegerToString {
    public static void main(String[] args) {

        Integer num = 2584;

        String numStr = num.toString(); // Integer to String
        System.out.println(numStr);

        String str ="5445522";
        Integer strInt = Integer.valueOf(str); // String to Integer
        System.out.println(strInt);

        Double doubleNum = 10.267;
        Float floatNum = doubleNum.floatValue(); //Double to Float, but unnecessary unboxing

        System.out.println(floatNum);

    }
}
