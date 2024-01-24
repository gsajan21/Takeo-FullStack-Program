package comparableandcomparator;

import java.util.Comparator;

public class ItemNameComparatorTest implements Comparator<Cart> {
//    @Override
//    public int compare(Item o1, Item o2) {
//        return (o1.getName().compareTo(o2.getName()));
//    }

    @Override
    public int compare(Cart o1, Cart o2) {
        return (o1.getItemName().compareTo(o2.getItemName()));
    }
}
