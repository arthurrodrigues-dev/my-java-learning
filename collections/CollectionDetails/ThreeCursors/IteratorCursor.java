package collections.CollectionDetails.ThreeCursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCursor {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            l.add(i);
        }

        Iterator<Integer> itr = l.iterator();

        while (itr.hasNext()) {
            Integer i = (Integer) itr.next();
            if (i % 2 != 0) 
                itr.remove();
            else
                System.out.println(i);
        }
    }
}
