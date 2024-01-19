package org.example;

public class StringDemo {
    public static void main(String[] args) {
        String s = new String("String");
        String s1 = new String ("Some String");

        String s2 = s + s1;

        System.out.println(s2);
        System.out.println(s);
        System.out.println(s1);


        StringTest st = new StringTest();
        System.out.println(st);
    }
}
