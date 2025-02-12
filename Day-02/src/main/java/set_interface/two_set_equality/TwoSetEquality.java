package set_interface.two_set_equality;

import java.util.HashSet;
import java.util.Set;

public class TwoSetEquality {
    public static boolean AreSetEquals(Set<Integer> set1,Set<Integer> set2){
       return set1.equals(set2);
    }

    public static void main(String[] args){
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(2);
        set2.add(1);

        System.out.print("Are Sets equal?"+AreSetEquals(set1,set2));
    }
}
