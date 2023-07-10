package collections.CollectionsClass;

import java.util.*;

public class CollectionsClass2 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>() {
            {
                add("Z");
                add("A");
                add("M");
                add("K");
                add("a");

            }
        };

        Collections.sort(l);
        System.out.println(Collections.binarySearch(l, "A"));
        System.out.println(Collections.binarySearch(l, "J")); //returns -2 because it is where the J would be if inserted in the list considering that the first insertion point element (at index 0) is -1 and the list is sorted;
        System.out.println(l); // [A, K, M, Z, a]
    }
}
