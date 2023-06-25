package collections.practice;

import java.util.*;

public class SortedSetInterface {
    public static void main(String[] args) {
        SortedSet<String> ts = new TreeSet<>(); 

        ts.add("Helena");
        ts.add("Bruno");
        ts.add("Arthur");
        System.out.println(ts);

        System.out.println("First value: " + ts.first()); 
        System.out.println("Last element: " + ts.last());
    
        Iterator<String> it = ts.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
