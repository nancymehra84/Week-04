package set_interface.symmetric_difference;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static Set<Integer> getSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> symmetricDiff = new HashSet<>(set1);
        Set<Integer> intersection = new HashSet<>(set1);

        symmetricDiff.addAll(set2);
        intersection.retainAll(set2);
        symmetricDiff.removeAll(intersection);

        return symmetricDiff;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Symmetric Difference: " + getSymmetricDifference(set1, set2)); // Output: {1, 2, 4, 5}
    }
}

