package collections.Set.TreeSet.Practice;

import java.util.TreeSet;

public class ComparatorInterface {
    public static void main(String[] args) {
        // TreeSet<Integer> ts = new TreeSet<>((Integer i1, Integer i2) -> i2.compareTo(i1));

        // TreeSet<Integer> ts = new TreeSet<>(new MyComparator<>());
        TreeSet<Integer> ts = new TreeSet<>((Integer i1, Integer i2) -> {
            if (i1.equals(i2)) {
                return 0;
            } else {
                return -1;
            }
        });
   
        ts.add(10); 
        ts.add(0); // compare(0, 10)
        ts.add(15); // compare(15, 10)
        ts.add(20); // compare(20, 10); compare(20,15)
        ts.add(20); // compare(20, 10); compare(20, 15); compare(20, 20)
    
        System.out.println(ts);
    }
}

