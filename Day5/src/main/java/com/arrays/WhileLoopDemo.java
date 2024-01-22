package com.arrays;

public class WhileLoopDemo {

    public static void main(String[] args) {

        int [] a = new int [16];
        int i = 0;

        while(i <= 15){
            a[i] = i;
            ++i;
        }
        int j = 0;
        while(j < 16 ){
            System.out.println(a[j]);
            j ++;
        }
    }
}
