package collections.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
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


    }   
}
