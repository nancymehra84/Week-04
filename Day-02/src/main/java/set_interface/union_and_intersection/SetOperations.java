package set_interface.union_and_intersection;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static Set<Integer> getUnion(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    public static Set<Integer> getIntersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
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

        System.out.println("Union: " + getUnion(set1, set2));
        System.out.println("Intersection: " + getIntersection(set1, set2));
    }
}

