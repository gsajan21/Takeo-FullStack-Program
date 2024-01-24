package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1,  "Apple");
        map.put(2, "Orange");
        map.put(3, "Grapes");
        map.put(4, "Tomato");

        Set<Integer> s = map.keySet();
        System.out.println(s);
        System.out.println(map.values());

    }
}