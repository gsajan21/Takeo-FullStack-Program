package com.arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        int [] intArray = new int [10];
        String [] strArray = {"Ram", "Shyam", "Hari", "John", "Doe"};

        for(int i = 0; i < intArray.length; i++ ){
            intArray[i] = i;
            System.out.println(intArray[i]);
        }

        for(String i : strArray)
            System.out.println(i);


        double [] doubleArray = new double[5];

        doubleArray[0] = 1.25;
        doubleArray[1] = 45.5;
        doubleArray[2] = 243.44;
        doubleArray[3] = 54736.44;
        doubleArray[4] = 4552.585;
        for(double d : doubleArray)
            System.out.println(d);

    }

}
