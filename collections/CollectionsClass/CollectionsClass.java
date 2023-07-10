package collections.CollectionsClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args) {
        List<Integer> emptyList = Collections.emptyList();

        System.out.println(emptyList);
        // empty lists are immutable
        // emptyList.add(0, 1);
        // System.out.println(emptyList);

        List<String> list = Arrays.asList("hello", "how are you", "thank you");
        System.out.println(list);

        Collections.fill(list, "nice!");
        System.out.println(list);

        List<Integer> listInteger = Arrays.asList(1, 2, 3, 1, 1, 2);
        System.out.println(Collections.frequency(listInteger, 1));

        List<Character> reveredCharList = Arrays.asList('o', 'l', 'l', 'e', 'h');

        System.out.println("Before: " + reveredCharList);
        Collections.reverse(reveredCharList);

        System.out.println("After:" + reveredCharList);

        List<Integer> generalList = Arrays.asList(1, 3, 4, 2, 6, 7);

        Collections.shuffle(generalList);
        System.out.println(generalList);

        Collections.sort(generalList);
        System.out.println(generalList);

        int indexOfValue = Collections.binarySearch(generalList, 3);
        System.out.println("Binary search index of value 3: " + indexOfValue);

        Collections.swap(generalList, 0, 2);
        System.out.println(generalList);
    }
}