package comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        Item item1 = new Item(10, "Mango");
        Item item2 = new Item(5, "Orange");
        Item item3 = new Item(5452, "Pineapple");
        Item item4 = new Item(65294, "Lemon");
        Item item5 = new Item(2, "Grapes");
        Item item6 = new Item(7, "Pumpkin");
        Item item7 = new Item(2564, "Tomato");

        List <Item>list = new ArrayList<>();
        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);
        list.add(item5);
        list.add(item6);
        list.add(item7);

        list.forEach(System.out::println);

        Collections.sort(list);

        System.out.println("=========================");

        list.forEach(System.out::println);
    }
}
