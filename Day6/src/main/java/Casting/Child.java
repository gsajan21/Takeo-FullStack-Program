package Casting;

public class Child extends Parent {
    void method1(){
        System.out.println("This is a Child class.");
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.method1();

        Child c = new Child();
        c.method1();

        Parent castedChild = (Parent) c; // casting parent class to child class
        castedChild.method1();


    }
}
