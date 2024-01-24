package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<Object> s = new HashSet<>();

        s.add("Sajan");
        s.add("Sajan"); // trying to add same String
        s.add(564564);
        s.add("Ram");
        s.add(54.21456);

        s.forEach(System.out::println);

        Set <String> set1 = new LinkedHashSet<>();

        set1.add("Sajan");
        set1.add("Ram");
        set1.add("Java");
        set1.add("Orange");
        set1.add("Apple");

        set1.forEach(System.out::println);


    }
}
