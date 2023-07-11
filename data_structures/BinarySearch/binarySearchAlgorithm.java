package data_structures.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class binarySearchAlgorithm {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 5, 12, 22, 34, 56));

        int target = 5;
        int ans = binarySearch(list, target);

        System.out.println(ans);
    }

    static int binarySearch(List<Integer> list, int target) {
        int start = 0;
        int end = list.size() - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;

            if (list.get(mid) > target) {
                end = mid - 1;
            } else if (list.get(mid) < target) {
                start = mid + 1;
            } else {
                // return the index
                return mid;
            }
        }

        return -1;
    }
}
