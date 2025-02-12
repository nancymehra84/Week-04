package list_interface.remove_duplicates_while_preserving_order;

import java.util.*;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicateSet(List<Integer> list){
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> list){
        List<Integer> result=new ArrayList<>();
        Set<Integer> seen=new HashSet<>();

        for(Integer item:list){
            if(!seen.contains(item)){
                result.add(item);
                seen.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args){
        List<Integer> inputList=Arrays.asList(3,1,2,3,4);

        //Using Linked HashSet
        List<Integer> resultSet=removeDuplicateSet(inputList);
        System.out.println("Using LinkedHashSet: " + resultSet);

        //Using HashSet Tracking
        List<Integer> resultManual = removeDuplicatesManual(inputList);
        System.out.println("Using Manual Approach: " + resultManual);
    }
}
