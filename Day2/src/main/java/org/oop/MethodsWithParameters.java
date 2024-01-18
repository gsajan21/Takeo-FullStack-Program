package org.oop;

// one method calling another method method and executing with object parameters
public class MethodsWithParameters {
    MethodsWithParameters(){
        System.out.println("Object Created.");
    }

    int methodOne(int firstNumber, int secondNumber){
       return firstNumber + secondNumber;
    }

    int methodTwo(){
        int a = 10123;
        int b = 12345123;

        return methodOne(a, b);
    }
    public static void main(String[] args) {

        MethodsWithParameters object = new MethodsWithParameters();

        int defaultSum = object.methodTwo();
        System.out.println(defaultSum);


    }
}
