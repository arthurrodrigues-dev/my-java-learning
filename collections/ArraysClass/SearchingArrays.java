package collections.ArraysClass;

// import static java.util.Arrays.*;
import java.util.Arrays;
import collections.CollectionsClass.MyComparator;
import collections.Queue.PriorityQueue.myComparator;

public class SearchingArrays {
    public static void main(String[] args) {
        int[] a = {10, 5, 20, 11, 6};
        Arrays.sort(a);

        System.out.println(Arrays.binarySearch(a, 6)); // 1
        System.out.println(Arrays.binarySearch(a, 14)); // -5

        String[] s = {"A", "Z", "B"};
        Arrays.sort(s);
        System.out.println(Arrays.binarySearch(s, "Z")); // 2
        System.out.println(Arrays.binarySearch(s, "S")); // -3

        Arrays.sort(s, new MyComparator<>());
        System.out.println(Arrays.binarySearch(s, "Z", new myComparator<>())); // 0
        System.out.println(Arrays.binarySearch(s, "S", new myComparator<>())); // -2

        System.out.println(Arrays.binarySearch(s, "N")); // unpredictable result
        
    }
}
