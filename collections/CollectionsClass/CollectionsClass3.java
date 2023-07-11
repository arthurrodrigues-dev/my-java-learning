package collections.CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClass3 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(15);
        l.add(0);
        l.add(20);
        l.add(10);
        l.add(5);

        System.out.println(l);

        // comparator sort the list in descending order
        Collections.sort(l, new MyComparator<>());

        System.out.println(l);

        System.out.println(Collections.binarySearch(l, 10, new MyComparator<>()));
        System.out.println(Collections.binarySearch(l, 13, new MyComparator<>()));
        System.out.println(l);

        System.out.println(Collections.binarySearch(l, 17)); // unpredictable results because the list is not sorted according to DNSO and we don't pass the comparator as parameter.
    }
}
