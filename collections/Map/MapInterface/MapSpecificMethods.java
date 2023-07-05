package collections.Map.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapSpecificMethods {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Arthur");
        map.put(102, "Laura");
        Object oldValue = map.put(101, "Java");

        System.out.println("old value replaced: " + oldValue);
        System.out.println(map);

        Map<Integer, String> anotherHm = new HashMap<>();
        anotherHm.put(103, "João");
        anotherHm.put(104, "Maria");

        map.putAll(anotherHm);

        System.out.println(map);
        System.out.println("value of key 103: " + map.get(103));

        Object removed = map.remove(101);
        System.out.println("Entry removed: " + removed);

        System.out.println(map);

        System.out.println("contains 101? " + map.containsKey(101));
        System.out.println("contains value Maria? " + map.containsValue("Maria"));
        System.out.println(map);
        System.out.println("map size: " + map.size());
        
        map.clear();
        System.out.println("is empty? " + map.isEmpty());
    }   
}
