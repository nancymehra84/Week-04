package set_interface.set_to_sorted_list;

import java.util.*;

public class SetToSortedList {
    public static List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set); // Convert Set to List
        Collections.sort(sortedList); // Sort in ascending order
        return sortedList;
    }

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        System.out.println("Sorted List: " + convertToSortedList(numbers)); // Output: [1, 3, 5, 9]
    }
}

