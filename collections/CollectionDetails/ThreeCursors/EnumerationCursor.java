package collections.CollectionDetails.ThreeCursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        for (int i = 0; i <= 10; i++) {
            v.addElement(i);
        }

        Enumeration<Integer> e = v.elements();

        while (e.hasMoreElements()) {
            Integer i = e.nextElement();
            if (i % 2 == 0) System.out.println(i);
        }
    }
}
