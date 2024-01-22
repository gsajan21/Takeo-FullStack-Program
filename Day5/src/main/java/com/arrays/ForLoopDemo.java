package com.arrays;

public class ForLoopDemo {
    public static void main(String[] args) {

        int [] forArray  = new int[16];

        for(int i = 0; i <= 15; i++){
            forArray[i] = i;
            System.out.println(forArray[i]);
        }

//       for(int i : forArray){
//           System.out.println(i);
//       }
    }
}
