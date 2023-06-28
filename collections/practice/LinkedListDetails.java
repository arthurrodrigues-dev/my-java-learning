package collections.practice;

import java.util.LinkedList;

public class LinkedListDetails {
    public static void main(String[] args) {
        LinkedList<Object> l = new LinkedList<>();
        l.add("Arthur");
        l.add(30);
        l.add(null);
        l.add("Arthur");
        
        l.set(0, "Software");
        l.add(0, "rodrigues");

        Object lastRemoved = l.removeLast();
        Object firstRemoved = l.removeFirst();

        l.addFirst(1);
        l.addLast(99);

        System.out.println(l);
        System.out.println("first element: " + l.getFirst());
        System.out.println("last element: " + l.getLast());
        System.out.println("element index 0 removed: " + firstRemoved);
        System.out.println("element last index removed: " + lastRemoved);
    }
}
