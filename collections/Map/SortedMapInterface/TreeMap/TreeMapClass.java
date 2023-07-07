package collections.Map.SortedMapInterface.TreeMap;

import java.util.*;

public class TreeMapClass {
    public static void main(String[] args) {
        TreeMap<Object, Object> tm = new TreeMap<>() {
            {
                put(100, "ZZZ");
                put(103, "YYY");
                put(101, "XXX");
                put(104, 106);
                // put("FFFF", "XXX"); // CCE because depending on D.N.S.O, heterogeneous keys are not allowed. 
                // put(null, "XXX"); // NPE, key null insertion is not allowed
            }
        };

        System.out.println(tm);
     
    }
}
