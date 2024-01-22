package com.package1;

import com.package2.ClassX;
import com.package2.ClassY;

public class ClassA {

    void print(){
        System.out.println("This is class A.");
    }

    public static void main(String[] args) {
        ClassB b = new ClassB();
        b.print();
        b.doSomething();

        ClassX x  = new ClassX();
        x.print();
//        x.eat(); //can't access default method
        ClassY y = new ClassY();
        y.print();
    }
}
