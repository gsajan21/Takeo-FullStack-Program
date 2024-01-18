package org.oop;


public class MethodOverloadingDemo {

    void sum(int a, int b){
        System.out.println(a + b);
    }
    void sum( int a, int b, int c){
        System.out.println(a+b+c);
    }
    int  sum ( int a){
        return a+a;
    }


    public static void main(String[] args) {

        MethodOverloadingDemo object = new MethodOverloadingDemo();

        object.sum(2,5);
        object.sum(5,6,8);
        System.out.println(object.sum(1));
    }
}
