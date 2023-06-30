package collections.Set.TreeSet;

import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<Object> ts = new TreeSet<>();

        ts.add("A");
        ts.add("a");
        ts.add("B");
        ts.add("Z");
        ts.add("L");
        // ts.add(10);  CCE, heterogeneous objects are not allowed
        // ts.add(null); // NPE null insertion is not allowed

        //The natural sorting order is according to ASCII table, small a is 97, it is the biggest decimal
        System.out.println(ts);
    }    
}

