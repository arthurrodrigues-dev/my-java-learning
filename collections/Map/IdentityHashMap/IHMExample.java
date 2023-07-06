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

        String s1 = "durga";
        String s2 = new String("durga");

        identityHashMap.put(s1, 100);
        identityHashMap.put(s2, 200);

        System.out.println(s1 == s2);
        System.out.println(identityHashMap);
    }
}
