package exception;

public class MyExceptionDemo {

    static void exceptionMethod(){
        System.out.println("Testing Exception");

        String hello = null;
        try {
            hello.length();
        }catch (Exception e){
            System.out.println("Exception caught." + e.getMessage());
        }
        System.out.println("Exception complete");
    }

    public static void main(String[] args){

        MyExceptionDemo.exceptionMethod();
        System.out.println("End");
    }
}
