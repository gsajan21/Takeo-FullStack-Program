package comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List list = new ArrayList<>();

        list.add(365);
        list.add(548);
        list.add(1);
        list.add(47);
        list.add(58);

        System.out.println(list);
        System.out.println(list.stream().sorted().toList());
        Collections.sort(list);
        System.out.println(list);
    }
}
