package org.example;

public class StringPool {
    public static void main(String[] args) {

        String name = "Sajan";

        String s = "Sajan";

        if (name.hashCode() == s.hashCode()){
            System.out.println("String pool helps to reuse the strings");
        } else {
            System.out.println("Something is wrong.");
        }

    }
}
