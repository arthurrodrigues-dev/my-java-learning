package collections.Set.HashSet;

import java.util.*;

public class HashSetClass {
    public static void main(String[] args) {
        // ArrayList<Integer> AL = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 4, 2, 2, 2, 5));

        // HashSet<Integer> h = new HashSet<>(AL);

        // System.out.println(h);

        HashSet<Object> h = new HashSet<>();

        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(10);

        //output is false because Z is already in the hashset and duplicates are not allowed.
        System.out.println(h.add("Z"));
        System.out.println(h); 
        

    }
}
