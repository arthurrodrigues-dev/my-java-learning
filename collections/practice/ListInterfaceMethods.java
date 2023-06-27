package collections.practice;

import java.util.*;


public class ListInterfaceMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));

        list.add(0, 10);
        list.add(2, 20);

        list.addAll(4, new ArrayList<>(Arrays.asList(30, 50, 30)));

        int index = list.get(0);
        System.out.println(list);

        System.out.println("index 0: " + index);

        int removed = list.remove(list.size() - 1);
        System.out.println("Element removed: " + removed);

        int oldValue = list.set(0, 9);
        System.out.println("old value: " + oldValue);
        System.out.println("new value: " + list.get(0));
        System.out.println(list);

        System.out.println("index of value 50: " + list.indexOf(50));
        System.out.println("last index of value 30: " + list.lastIndexOf(30));
        
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
