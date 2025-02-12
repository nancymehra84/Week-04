package list_interface.rotate_element_in_list;

import java.util.*;

import java.util.LinkedList;

public class RotateListElement {
    public static <T> List<T> RotateElement(List<T> list,int k ) {
        int n = list.size();
        //empty list
        if(n==0) return list;

        k=k%n;
        if(k==0) return list;

        List<T> rotatedList= new ArrayList<>();
        rotatedList.addAll(list.subList(k,n));
        rotatedList.addAll(list.subList(0,k));

        return rotatedList;
    }

    public static void main(String[] args){
        List<Integer> inputList=Arrays.asList(10,20,30,40,50);
        int rotate=2;

        List<Integer> rotated=RotateElement(inputList,rotate);
        System.out.print(rotated);
    }
}
