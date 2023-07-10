package collections.Map.NavigableMapInterface;

import java.util.TreeMap;

public class NavigableMapMethods {
    public static void main(String[] args) {
        TreeMap<String, String> t = new TreeMap<>();
        t.put("b", "banana");
        t.put("c", "cat");
        t.put("a", "apple");
        t.put("d", "dog");
        t.put("g", "gun");

        System.out.println(t);
        System.out.println(t.ceilingKey("c")); // c
        System.out.println(t.higherKey("e")); // g
        System.out.println(t.floorKey("e")); // d
        System.out.println(t.lowerKey("e")); // d
        System.out.println(t.pollFirstEntry()); // a=apple
        System.out.println(t.pollLastEntry()); // g=gun
        System.out.println(t.descendingMap()); // {d, c, b}
        System.out.println(t);

    }
}
