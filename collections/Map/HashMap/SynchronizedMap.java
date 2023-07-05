package collections.Map.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMap {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>(); // non synchronized

        Map<String, Integer> m1 = Collections.synchronizedMap(m); // synchronized
        System.out.println(m1);
    }
}
