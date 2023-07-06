package collections.Map.LinkedHashMap;

import java.util.*;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        HashMap<Object, Object> lhm = new LinkedHashMap<>() {
            {
                put(100, "Laura");
                put(200, "Francisco");
                put(300, "Maicon");
            }
        };

        // Insertion order preserved.
        System.out.println(lhm);
    }
}
