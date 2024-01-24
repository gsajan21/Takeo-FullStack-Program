package practice;

import java.util.Comparator;

public class IntegerComparable implements Comparator <Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
