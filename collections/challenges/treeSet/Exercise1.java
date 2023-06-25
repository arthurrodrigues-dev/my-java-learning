package collections.challenges.treeSet;

import java.util.TreeSet;

// Write a Java program to create a tree set, add some colors (strings) and print out the tree set.

public class Exercise1 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("White");
        colors.add("Brown");
        colors.add("Black");
        colors.add("Pink");

        System.out.println(colors);

    }
}
