package collections.Set.TreeSet.Practice;

import java.util.TreeSet;

// Write a program to insert String and StringBuffer objects into the TreeSet where sorting order is
// increasing length and if two objects having the same length consider their alphabetical order

public class IncreaseLengthOrder {

    public static void main(String[] args) {
        TreeSet<Object> ts = new TreeSet<>((Object obj1, Object obj2) -> {
        String s1 = obj1.toString();
        String s2 = obj2.toString();

        int l1 = s1.length();
        int l2 = s2.length();

        if (l1 < l2) {
            return -1;
        } else if (l1 > l2) {
            return 1;
        } else {
            return s1.compareTo(s2);
        }
    });   

    ts.add("A");
    ts.add(new StringBuffer("ABC"));
    ts.add(new StringBuffer("AA"));
    ts.add("XX");
    ts.add("ABCD");
    ts.add("A");

    System.out.println(ts);
    }
    
}
