package comparableandcomparator;

import java.util.Comparator;

public class ItemQtyComparatorTest implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {


        return o1.getItemQty().compareTo(o2.getItemQty());
    }

}
