package collections.Queue;

import java.util.*;

public class QueueInterfaceMethods {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>() {
            {
                offer(1);
                offer(2);
                offer(3);
                offer(4);
                offer(5);
            }
        };

        System.out.println(q);

        System.out.println("head element removed: " + q.poll());
        System.out.println(q);
        System.out.println("head element without removing: " + q.peek());
        System.out.println(q);

        q.clear();
        System.out.println(q);
        System.out.println("poll empty queue: " + q.poll());
        System.out.println("peek empty queue: " + q.peek());

        try {
            System.out.println("Throws runtime exceptions:");
            System.out.println("remove: " + q.remove());
            System.out.println("element: " + q.element());
        } catch (RuntimeException e) {
            System.out.println("runtime exceptions! queue is empty");
            // e.printStackTrace();
        }
    }
}
