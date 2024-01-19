package org.example;

public class StringClassDemo {
    public static void main(String[] args) {
        String s = "Strings and its predefined methods.";

        // String hashcode() of the String
        int hashCode = s.hashCode();
        System.out.println(hashCode);

        // String chatAt method() -> it helps to find index of the character
        char charAt = s.charAt(0);
        System.out.println(charAt);

        // String compareTo() method -> it helps to compare to Strings
        String newString = "This is new a string to test";
        System.out.println(s.compareTo(newString));

        // String contains() -> check to see if the given set of character is present in a string
        System.out.println(s.contains("anything"));
        System.out.println(s.contains("and"));

        // String endsWith() -> checks if this strings ends with the given suffix
        System.out.println(s.endsWith("methods."));
        System.out.println(s.endsWith("methods")); // I didn't put the . here, so returns false

        // String concat() -> combines specified string at the end of the string
        System.out.println(s.concat(" Lets add something to this string"));

        // String isEmpty -> checks if the input string is empty or not
        System.out.println(s.isEmpty());
        String emptyString = "";
        System.out.println(emptyString.isEmpty());

        // String join() -> this methods return a string joined with the given
        String date = String.join("/", "18", "01", "2024");
        String time = String.join(":", "09", "01", "60");
        System.out.println(date);
        System.out.println(time);

        // String length() -> finds the length of the given string
        System.out.println(s.length());


        // String replace() -> returns a string replacing all the old char or CharSequence to new char or CharSequence.
        System.out.println(s.replace("and", "cat" ));

        // String replaceAll() ->  returns a string replacing all the sequence of characters matching regex and replacement string.
        System.out.println(s.replaceAll("t", "a"));

        // String split() -> splits this string against given regular expression and returns a char array.
        String [] splitArray = s.split("\\s"); // splits the sentence into string array.
        System.out.println(splitArray[0]);
        System.out.println(splitArray[1]);

        // String substring() -> returns a part of the string given beginIndex and endIndex
        System.out.println(s.substring(2, 9));

        // String toCharArrar() -> converts this string into character array.
        // It returns a newly created character array, its length is similar to this string and its contents are initialized with the characters of this string.
        System.out.println(s.toCharArray());

        // String toUpperCase() -> returns the given string to Uppercase format
        System.out.println(s.toUpperCase());

        // String toLowerCase( ) -> returns the given string to lowercase format
        System.out.println(s.toLowerCase());

        // String trim() -> eliminates leading and trailing spaces
        String trimString = "    It has a lot of white spaces front and back    ";
        System.out.println(trimString.trim());
    }
}
