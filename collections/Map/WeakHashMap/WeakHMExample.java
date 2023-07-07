package collections.Map.WeakHashMap;

import java.util.*;

public class WeakHMExample {
    public static void main(String[] args) {
        Map<Temp, String> hm = new WeakHashMap<>();
        Temp t = new Temp();

        hm.put(t, "Arthur");

        System.out.println(hm);
        t = null;
        System.gc();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // the WeakHashMap is weaker than garbage collector, so the gc can destroy
        // the object and call finalize() method.
        System.out.println(hm);
    }   
}
