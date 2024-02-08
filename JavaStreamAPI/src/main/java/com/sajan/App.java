package com.sajan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class App
{
    public static void main( String[] args )
    {
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Orange");
        list.add("Pineapple");
        list.add("Tangerine");
        list.add("Apple");

        list.forEach(System.out::println);
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        list.stream().filter(l -> l.contains("pp")).forEach(System.out::println);

        HashSet<String> strings = new HashSet<>(list);

        for (String string : strings) {
            System.out.println(string);

        }

    }

}
