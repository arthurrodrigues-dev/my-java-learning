package collections.LinkedList.challenges;

import java.util.Iterator;
import java.util.LinkedList;

//  Write a Java program to iterate through all elements in a linked list starting at the specified position

public class Exercise3 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Blue");
        colors.add("Pink");
        colors.add("White");
        colors.add("Brown");

        int position = 2;

        Iterator<String> it = colors.listIterator(position);

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
