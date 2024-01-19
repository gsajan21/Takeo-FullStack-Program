package org.example;

public class ConstructorClass {
    public ConstructorClass(){
        System.out.println("Object has been created.");
    }
    public ConstructorClass( int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        ConstructorClass constructorClass = new ConstructorClass();
        ConstructorClass constructorClass1 = new ConstructorClass(20, 30);
    }
}
