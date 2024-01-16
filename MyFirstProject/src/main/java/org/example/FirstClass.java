package org.example;

public class FirstClass {
    // variables -- storing some values
    int a = 10;
    int b = 20;

    // functions -- it is used to write logic in the program
    void hi () {
        int a = 30;
        System.out.println(a);
    }
    void hello(){
        System.out.println(a);
    }

    void sample(){
        System.out.println(a);
    }

    void test(){
        System.out.println(a);
    }
    public static void main(String[] args) {

        FirstClass firstClass = new FirstClass();
        firstClass.hi();
        firstClass.hello();
        firstClass.sample();
        firstClass.test();

    }
}
