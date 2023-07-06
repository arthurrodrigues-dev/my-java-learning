package collections.Map.IdentityHashMap;

import java.util.IdentityHashMap;

public class IHMExample {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> identityHashMap = new IdentityHashMap<>();

        identityHashMap.put("A", 1);
        identityHashMap.put(new String("A"), 2);

        System.out.println(identityHashMap.size()); // 2
        System.out.println(identityHashMap.get("A")); // 1
        System.out.println(identityHashMap);
    }
}
