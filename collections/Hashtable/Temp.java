package collections.Hashtable;

import java.util.Hashtable;

public class Temp {
    int i;
    Temp(int i) {
        this.i = i;
    }

    @Override
    public int hashCode() {
        return i;
    }

    @Override
    public String toString() {
        return i + "";
    }

    public static void main(String[] args) {
        Hashtable<Temp, String> h = new Hashtable<>();

        // entries are inserted according to hashcode, and displayed from top to
        // bottom (according to hashcode insertion) and right to left (where are multiple entries);
        h.put(new Temp(5), "A");
        h.put(new Temp(2), "B");
        h.put(new Temp(6), "C");
        h.put(new Temp(15), "D");
        h.put(new Temp(23), "E");
        h.put(new Temp(16), "F");

        System.out.println(h);

    }
}
