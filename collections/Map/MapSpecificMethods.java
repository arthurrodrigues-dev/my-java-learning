package collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapSpecificMethods {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(101, "Arthur");
        hashMap.put(102, "Laura");
        Object oldValue = hashMap.put(101, "Java");

        System.out.println("old value replaced: " + oldValue);
        System.out.println(hashMap);

        Map<Integer, String> anotherHm = new HashMap<>();
        anotherHm.put(103, "João");
        anotherHm.put(104, "Maria");

        hashMap.putAll(anotherHm);

        System.out.println(hashMap);
        System.out.println("value of key 103: " + hashMap.get(103));

        Object removed = hashMap.remove(101);
        System.out.println("Entry removed: " + removed);

        System.out.println(hashMap);

        System.out.println("contains 101? " + hashMap.containsKey(101));
        System.out.println("contains value Maria? " + hashMap.containsValue("Maria"));
        System.out.println(hashMap);
        System.out.println("Hashmap size: " + hashMap.size());
        
        hashMap.clear();
        System.out.println("is empty? " + hashMap.isEmpty());
    }   
}
