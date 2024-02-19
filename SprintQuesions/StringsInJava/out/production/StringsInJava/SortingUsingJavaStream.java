package out.production.StringsInJava;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortingUsingJavaStream {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(Arrays.asList("Apple", "Orange", "Banana", "Grapefruit", "Grapes", "Pineapple"));

        List<String> sortedList = strings.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);

        List<String> sortedDescending = strings.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedDescending);
    }
}
