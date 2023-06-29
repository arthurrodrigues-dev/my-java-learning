package collections.CollectionDetails.ThreeCursors;

import java.util.*;


public class ListIteratorCursor {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("it");
        l.add("do");
        l.add("just");
        l.add("nike");

        // Iterate a LinkedList from reverse order
        ListIterator<String> ltr = l.listIterator(l.size());

        while (ltr.hasPrevious()) {
            System.out.println(ltr.previous());
        }
    }
}
