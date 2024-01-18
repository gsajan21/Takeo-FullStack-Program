package org.oop;

public class ConstructorDemo {

    int a, b;
    String name, address;
    String phoneNumber;
    public ConstructorDemo(){
        System.out.println("Default Constructor.");

    }
    public ConstructorDemo(int a, int b){
        this.a = a;
        this.b = b;
        System.out.printf("The two integer are %d and %d", a, b);

    }
    public ConstructorDemo(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;

        System.out.printf("Name: %s\nAddress: %s\nPhone number: %s\n", name, address, phoneNumber);
    }

    public static void main(String[] args) {
        ConstructorDemo constructorDemo = new ConstructorDemo();
        ConstructorDemo constructorDemo1 = new ConstructorDemo(20, 30);
        ConstructorDemo constructorDemo2 = new ConstructorDemo("Sajan Gurung", "California", "(000)000 0000");
    }
}
