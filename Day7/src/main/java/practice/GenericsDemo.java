package practice;


import java.util.*;
import java.util.stream.Collectors;

public class GenericsDemo {


    static void integerHashSet() {
        Set<Integer> integerSet = new HashSet<>();

        integerSet.add(154);
        integerSet.add(1);
        integerSet.add(23);
        integerSet.add(78);
        integerSet.add(214);
        integerSet.add(3658);

        System.out.println(integerSet);
        System.out.println("=======================");
        // sorted
//        System.out.println(integerSet.stream().sorted().collect(Collectors.toList()));
        List<Integer> sortedList = integerSet.stream().sorted().toList();
        sortedList.forEach(System.out::println);

        System.out.println("======================");
    }

    static void stringHashSet() {
        Set<String> s = new HashSet<>();
        s.add("Dog");
        s.add("Goat");
        s.add("Tiger");
        s.add("Lion");


        s.forEach(System.out::println);
    }

    public static void main(String[] args) {


        GenericsDemo.integerHashSet();
        GenericsDemo.stringHashSet();

    }
}
