package collections.Set.TreeSet;

import java.util.TreeSet;

public class SortingStrings {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>((String str1, String str2) -> {
            return str2.compareTo(str1); 
        });

        ts.add("Roja");
        ts.add("ShobhaRani");
        ts.add("RajaKumari");
        ts.add("GangaBhavani");
        ts.add("Ramulamma");

        // TreeSet<StringBuffer> ts = new TreeSet<>((StringBuffer str1, StringBuffer str2) -> {
        //     return str2.compareTo(str1); 
        // });

        // ts.add(new StringBuffer("A"));
        // ts.add(new StringBuffer("Z"));
        // ts.add(new StringBuffer("K"));
        // ts.add(new StringBuffer("L"));

        // System.out.println(ts);
    }
}
