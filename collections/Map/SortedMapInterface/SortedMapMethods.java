package collections.Map.SortedMapInterface;

import java.util.*;

public class SortedMapMethods {
    public static void main(String[] args) {
        SortedMap<Integer, Character> m = new TreeMap<>() {
            {
                put(101, 'A');
                put(103, 'B');
                put(104, 'C');
                put(107, 'D');
                put(125, 'E');
                put(136, 'F'); 
            }
        };

        System.out.println("first key: " + m.firstKey());
        System.out.println("last key: " + m.lastKey());
        System.out.println("head map of 107: " + m.headMap(107));
        System.out.println("tail map of 107: " + m.tailMap(107));
        System.out.println("submap of 103,125: " + m.subMap(103, 125));
        System.out.println("comparator: " + m.comparator());
    }
}
