package org.oop;
public class DataTypes {

    int number = 10;
    boolean bool = false;

    float fNumber= 0.002f;

    char someChar = 'a';

    String someString = "You can write anything here.";

    void printDataTypes(){
        System.out.println("This is a int type: "+number);
        System.out.println("This is a boolean type: "+bool);
        System.out.println("This is a float type: "+fNumber);
        System.out.println("This is a char type: "+someChar);
        System.out.println("This is a String type: "+someString);
    }

    public static void main(String[] args) {
        DataTypes dataTypes = new DataTypes();

        dataTypes.printDataTypes();

    }
}
