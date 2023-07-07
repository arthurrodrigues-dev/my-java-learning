package collections.Map.WeakHashMap;

import java.util.*;

public class Temp {
    public static void main(String[] args) {
        HashMap<Temp, String> hm = new HashMap<>();
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
        // the garbage collection can't destroy the object which t was pointing out 
        // bc HashMap is "stronger" than it.
        // finalize() method isn't called.
        System.out.println(hm);
    }

    @Override
    public String toString() {
        return "temp";
    }

    public void finalize() {
        System.out.println("finalized method called");
    }
}
