package collections.Map.HashMap;

import java.util.*;

public class EntryMethods {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>() {
            {
                put(100, "Arthur");
                put(200, "Maria");
                put(300, "João");
                put(400, "Gui");
            }
        };

        Set<Map.Entry<Integer, String>> e = m.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = e.iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> currentEntry = itr.next();
            if (currentEntry.getKey().equals(400)) {
                currentEntry.setValue("Guilherme");
            }
            System.out.println("key: " + currentEntry.getKey() + " value: " + currentEntry.getValue());
        }

    }
}
