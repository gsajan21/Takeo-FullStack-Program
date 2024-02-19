package out.production.StringsInJava;

import java.util.*;

public class ListToMap {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("apple", "apple", "banana", "banana", "orange"));
        System.out.println(stringList);



        Map<Integer, String> stringMap = new HashMap<>();
        int i = 1;
        for(String s : stringList){
            stringMap.put(i, s); // putting the values of list mapped with a number starting 1.
            i++;
        }
        System.out.println(stringMap);
    }
}
