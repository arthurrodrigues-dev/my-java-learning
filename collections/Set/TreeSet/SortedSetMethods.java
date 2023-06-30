package collections.Set.TreeSet;

import java.util.*;

public class SortedSetMethods {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(new ArrayList<>(Arrays.asList(115, 107, 104, 103, 101, 110, 100)));

        System.out.println(ts);
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.headSet(104));
        System.out.println(ts.tailSet(104));
        System.out.println(ts.subSet(103, 110));
        // We get null bc the underlying sorting order is the default
        System.out.println(ts.comparator());
    }
}
