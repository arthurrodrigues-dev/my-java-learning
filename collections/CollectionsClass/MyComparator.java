package collections.CollectionsClass;

import java.util.Comparator;

public class MyComparator<E> implements Comparator<E> {

    public int compare(Object obj1, Object obj2) {
        Integer i1 = (Integer) obj1, i2 = (Integer) obj2;
        return i2.compareTo(i1);
    }
}
