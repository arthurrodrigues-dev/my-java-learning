package collections.Queue.PriorityQueue;

import java.util.*;

public class myComparator<E> implements Comparator<E> {
    public int compare(Object obj1, Object obj2) {
        String s1 = (String) obj1;
        String s2 = (String) obj2;

        return s2.compareTo(s1);
    }  

    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<>(15, new myComparator<String>());

        q.offer("A");
        q.offer("Z");
        q.offer("L");
        q.offer("B");
        System.out.println(q);
    }
}
