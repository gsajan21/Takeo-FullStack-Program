package org.example;

public class CommunicatingWithTwoMethods {

    void methodOne(){
        System.out.println(methodTwo());
    }

    int methodTwo(){
        int a = 20;
        int b = 30;
        return a + b;
    }

    public static void main(String[] args) {

        CommunicatingWithTwoMethods object = new CommunicatingWithTwoMethods();

        object.methodOne();
    }
}
