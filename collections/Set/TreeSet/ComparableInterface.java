package collections.Set.TreeSet;

import java.util.TreeSet;

public class ComparableInterface {
    public static void main(String[] args) {
        Integer obj1 = 10;
        Integer obj2 = 11;

        // obj1 has to come before obj2 so it returns -1
        System.out.println(obj1.compareTo(obj2));

        obj1 = 12;

        // obj1 has to come after obj2 so it returns 1
        System.out.println(obj1.compareTo(obj2));

        obj2 = 12;

        // both are equal so it returns 0
        System.out.println(obj1.compareTo(obj2));

        // note: the value returned is the distance between the strings in the ascii table
        System.out.println("A".compareTo("Z"));
        System.out.println("Z".compareTo("B"));
        System.out.println("A".compareTo("A"));
        // System.out.println("A".compareTo(null)); nullPointerException

        // Internally the compareTo() method will be called while inserting objects
        TreeSet<Object> ts = new TreeSet<>();
        ts.add("B");
        ts.add("Z");
        ts.add("A");

        System.out.println(ts);
    }
}
