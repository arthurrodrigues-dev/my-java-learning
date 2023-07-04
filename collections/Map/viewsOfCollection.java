package collections.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class viewsOfCollection {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Arthur");
        map.put(102, "Laura");
        map.put(103, "Thayná");

        Set<Integer> keySet = map.keySet();
        System.out.println(keySet);

        Collection<String> values = map.values();
        System.out.println(values);

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        System.out.println(entrySet);
    }
}

