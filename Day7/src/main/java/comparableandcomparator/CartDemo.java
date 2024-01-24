package comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartDemo {
    public static void main(String[] args) {

        Cart cart1=new Cart(10,"orange");
        Cart cart2=new Cart(25,"apple");
        Cart cart3=new Cart(15,"pineapple");
        Cart cart4=new Cart(5,"banana");
        Cart cart5=new Cart(35,"lemon");


        List<Cart> list=new ArrayList<>();
        list.add(cart1);
        list.add(cart2);
        list.add(cart3);
        list.add(cart4);
        list.add(cart5);

        list.forEach(System.out::println); // original list

        System.out.println("====================");

        list.sort(new ItemQtyComparatorTest()); // sorting using qty

        for(Cart cart:list) {
            System.out.println(cart);
        }
        System.out.println("====================="); // sorting using name
        list.sort(new ItemNameComparatorTest());

        for(Cart cart:list) {
            System.out.println(cart);
        }
    }
}
