package collections.Set.NavigableSetInterface;

import java.util.*;

public class NavigableSetMethods {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(1000);
        ts.add(2000);
        ts.add(3000);
        ts.add(4000);
        ts.add(5000);

        System.out.println(ts);
        System.out.println(ts.ceiling(2000)); // 2000
        System.out.println(ts.higher(2000)); // 3000
        System.out.println(ts.floor(3000)); // 3000
        System.out.println(ts.lower(3000)); // 2000
        System.out.println(ts.pollFirst()); // 1000
        System.out.println(ts.pollLast()); // 5000
        System.out.println(ts.descendingSet()); // [5000, 4000, 3000, 2000, 1000]
        System.out.println(ts);
    }
}
