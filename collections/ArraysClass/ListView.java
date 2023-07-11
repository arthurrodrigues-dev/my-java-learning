package collections.ArraysClass;

import java.util.*;

public class ListView {
    public static void main(String[] args) {
        String[] s = {"A", "Z", "B"};
        List l = Arrays.asList(s);
        System.out.println(l); // [A, Z, B]

        s[0] = "K";

        System.out.println(l); // [K, Z, B]
        l.set(1, "L");

        System.out.println(Arrays.toString(s));  // [K, L, B]
        // l.add("durga"); // UsOE
        // l.remove(2); // UsOE
        // l.set(1, new Integer(10)); // ASE

        
    }
}
