package collections.Set.TreeSet;

import java.util.TreeSet;

public class TreeSetClass2 {
    public static void main(String[] args) {
        TreeSet<StringBuffer> ts = new TreeSet<>();

        // In new versions of java, StringBuffer implements Comparable, so the code is right. But, in java older versions, StringBuffer did not implements the Comparable interface, so the code would throw a ClassCastException
        
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("Z"));
        ts.add(new StringBuffer("L"));
        ts.add(new StringBuffer("B"));
        System.out.println(ts);
    }
}
