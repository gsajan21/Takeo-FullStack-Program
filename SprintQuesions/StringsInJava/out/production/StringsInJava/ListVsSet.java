package out.production.StringsInJava;

import java.util.*;

public class ListVsSet {
    public static void main(String[] args) {


        // List
        // it maintains insertion order
        // it accepts duplicate values
        List<String> stringList = new ArrayList<>(Arrays.asList("apple", "apple", "banana", "banana", "orange"));
        System.out.println(stringList);

        //Set
        // it doesn't maintain insertion order
        // it doesn't accept duplicate values

        Set<String> stringSet = new HashSet<>(Arrays.asList("apple", "apple", "banana", "banana", "orange"));
        System.out.println(stringSet); // doesn't store duplicate value
    }
}
