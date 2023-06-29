package collections.LinkedList.challenges;

import java.util.*;


// Write a Java program to iterate a linked list in reverse order.

public class Exercise4 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Blue");
        colors.add("Pink");
        colors.add("White");
        colors.add("Brown");

        // Iterator<String> it = colors.descendingIterator();

        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        ListIterator<String> lit = colors.listIterator(colors.size());

        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

    }
}
