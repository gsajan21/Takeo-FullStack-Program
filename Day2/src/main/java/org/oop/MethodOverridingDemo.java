package org.oop;

// Method Overriding
public class MethodOverridingDemo {

    static class Animal{

        void type(){

        }
        void name(){

        }

        void speak(){
            System.out.println("Says something..");
        }
    }
    static class Goat extends Animal{

        @Override
        void type(){
            System.out.println("Domestic Animal");
        }
        @Override
        void name(){
            System.out.println("Lucy");
        }
        @Override
        void speak(){
            System.out.println("Maaaaaaa...maaaaa");
        }
    }

}
