package collections.CollectionDetails.ThreeCursors;

import java.util.*;

public class ImplementationClasses {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>();

        // The enumeration interface is implemented in the method
        Enumeration<Object> e = v.elements();
        Iterator<Object> itr = v.iterator();
        ListIterator<Object> litr = v.listIterator();
        // Corresponding implemented classes
        System.out.println(e.getClass().getName());
        System.out.println(itr.getClass().getName());
        System.out.println(litr.getClass().getName());
    }
}
