package org.oop;

// Write a program to describe a House

public class House {
    House(){
        System.out.println("This is a House.");
    }

    String address = "Kathmandu, Nepal";
    int numberOfRooms = 10;


    void kitchen() {
        System.out.println("Mom is cooking in the Kitchen.");
    }

    void childrenRoom(){
        System.out.println("Children are playing in their room. ");
    }
    void livingRoom(){
        System.out.println("Father is chilling in the living room.");
    }

    public static void main(String[] args) {
        House house = new House();

        System.out.println("The address of the House is: " + house.address);
        System.out.println("The House has "+ house.numberOfRooms+" rooms");

        house.kitchen();
        house.livingRoom();
        house.childrenRoom();

    }
}
