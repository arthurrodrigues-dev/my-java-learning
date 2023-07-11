package collections.ArraysClass;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        System.out.println("Sorting primitive array");
        int[] a = {10, 5, 20, 11, 6};

        System.out.println(Arrays.toString(a));

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println("Sorting object array");
        String[] s = {"A", "Z", "B"};
        System.out.println(Arrays.toString(s));

        Arrays.sort(s);

        System.out.println(Arrays.toString(s));

        System.out.println("Sorting object array with comparator");

        System.out.println(Arrays.toString(s));

        Arrays.sort(s, (String s1, String s2) -> {
            return s2.compareTo(s1);
        });

        System.out.println(Arrays.toString(s));
    }    
}
