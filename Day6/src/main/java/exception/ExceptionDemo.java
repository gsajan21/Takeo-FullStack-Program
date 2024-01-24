package exception;

public class ExceptionDemo {
    void method1(){
        System.out.println("Hello World.");

        int a = 10;
        int b = a + 20;
        try{
            b = b/0;
        }catch(ArithmeticException e){
            System.out.println(e);
        }

        System.out.println("End.");
    }

    public static void main(String[] args) {
        ExceptionDemo ex = new ExceptionDemo();
        ex.method1();

    }
}
