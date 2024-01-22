package com.arrays;

public class StringArrayDemo {
    public static void main(String[] args) {

        String [] strArray = new String[5];

        strArray[0] = "Apple";
        strArray[1] = "Banana";
        strArray[2] = "Mango";
        strArray[3] = "Pineapple";
        strArray[4] = "Grapes";

        for(String s : strArray){
            System.out.println(s);
        }
    }
}
