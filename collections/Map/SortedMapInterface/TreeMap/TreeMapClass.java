package collections.Map.SortedMapInterface.TreeMap;

import java.util.*;

public class TreeMapClass {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>((Integer i1, Integer i2) -> {
            return i2.compareTo(i1);
        }
        ) ;
        tm.put(1, "A");
        tm.put(2, "B");
        tm.put(450, "C");
        System.out.println(tm);
    }
}
