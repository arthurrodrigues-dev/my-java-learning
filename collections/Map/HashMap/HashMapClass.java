package collections.Map.HashMap;

import java.util.*;

public class HashMapClass {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>(){
            {
                put("Arthur", 700);
                put("Francisco", 800);
                put("Maria", 200);
                put("Laura", 500);
            }
        };

        System.out.println(m);

        System.out.println(m.put("Arthur", 1000));
        Set<String> s = m.keySet();
        System.out.println(s);

        Collection<Integer> c = m.values();
        System.out.println(c);

        Set<Map.Entry<String, Integer>> s1 = m.entrySet();

        Iterator<Map.Entry<String, Integer>> it = s1.iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> m1 = it.next();
            System.out.println(m1.getKey() + "......." + m1.getValue());
            if (m1.getKey().equals("Laura")) {
                m1.setValue(1000);
            }
        }
        System.out.println(m);
    }
}
