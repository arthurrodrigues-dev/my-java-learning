package collections.Vector.practice;

import java.util.*;
public class VectorDetails {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>(10, 5);

        System.out.println(v.capacity());

        for (int i = 1; i <= 10; i++) {
            v.addElement(i);
        }
        System.out.println(v.capacity());
        v.addElement("A");
        System.out.println(v.capacity());
        System.out.println(v);
    }
}
