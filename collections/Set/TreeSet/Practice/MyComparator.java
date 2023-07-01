package collections.Set.TreeSet.Practice;

import java.util.Comparator;

public class MyComparator<T> implements Comparator<T> {
    public int compare(Object obj1, Object obj2) {
        Integer i1 = (Integer) obj1;
        Integer i2 = (Integer) obj2;

        // Descending order
        if (i1 < i2) {
            return 1;
        } else if (i1 > i2) {
            return -1;
        } else {
            return 0;
        } 

        // return i1.compareTo(i2); // Ascending order
        // return -i1.compareTo(i2); // Descending order
        // return i2.compareTo(i1); // Descending order
        // return -i2.compareTo(i1); // Ascending order

        // return 1; // Insertion order allowing duplicates bc there's no condition where it will be 0 so it's never gonna delete the duplicate
        // return -1; // Reversed insertion order allowing duplicates
        // return 0; // Only the first number inserted will stay in the set
        
        // Descending order without duplicates
        // if (i1.equals(i2)) {
        //     return 0;
        // } else {
        //     return 1;
        // }

    }
}
