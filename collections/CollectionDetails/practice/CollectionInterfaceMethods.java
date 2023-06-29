package collections.CollectionDetails.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionInterfaceMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(8);

        System.out.println(list);

        list.addAll(new ArrayList<>(Arrays.asList(4, 23, 19, 0)));
        System.out.println(list);

        // .remove() method remove the value from an index
        list.remove(3);
        System.out.println(list);

        List<Integer> odds = Arrays.asList(1, 5, 23, 19);
        list.removeAll(odds);

        System.out.println(list);

        // remove all the objects from the list
        list.clear();
        System.out.println("Empty list: " + list);
        System.out.println("Is empty? " + list.isEmpty());

        list.addAll(new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)));

        List<Integer> evens = Arrays.asList(0, 2, 4, 6, 8);

        // retain all the evens list and remove the rest.       
        list.retainAll(evens);
        System.out.println("List of evens: " + list);
        System.out.println("Current list size: " + list.size());
        System.out.println("The list contain the number 10? " + list.contains(10));
        System.out.println("The list contains 0, 2, 4, 6 and 8? " + list.containsAll(evens));

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
