package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();

        list.add("apple");
        list.add("Sajan");
        list.add("banana");
        list.add("Ram");

        list.forEach(System.out::println);

        list.remove("Ram");
        list.forEach(System.out::println);

        System.out.println(list.indexOf("apple")); // index of apple //0

        Iterator<String> i = list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
