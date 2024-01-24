package practice;

import comparableandcomparator.ItemNameComparatorTest;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class GenericsDemo{
    static void integerHashSet(){
        Set<Integer> s = new HashSet<>();

        s.add(154);
        s.add(1);
        s.add(23);
        s.add(78);
        s.add(214);
        s.add(3658);
        System.out.println(s);
        System.out.println(s.stream().sorted().collect(Collectors.toSet()));

        s.stream().forEach(System.out::println);
    }
    static void stringHashSet(){
        Set<String> s = new HashSet<>();
        s.add("Dog");
        s.add("Goat");
        s.add("Tiger");
        s.add("Lion");

//        Collections.sort(s);

        s.stream().forEach(System.out::println);
    }
    public static void main(String[] args) {


    GenericsDemo.integerHashSet();
    GenericsDemo.stringHashSet();

    }

//    @Override
//    public int compareTo(Object o) {
//        GenericsDemo gd = (GenericsDemo) o;
//        return gd.compareTo(o);
//    }
}
