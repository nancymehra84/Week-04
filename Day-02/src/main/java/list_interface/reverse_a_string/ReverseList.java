package list_interface.reverse_a_string;

import java.util.*;

public class ReverseList {
    //reverse an array list method
    public static <T> void reverseArrayList(List<T> list){
        int left=0,right=list.size()-1;
        while(left<right){
            T temp= list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
    }
    //reverse Linked List method
    public static <T> void reverseLinkedList(List<T> list){
        int left=0,right=list.size()-1;
        while(left<right){
            T temp= list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
    }

    //main method
    public static void main(String[] args){
        //For arrayList
        List<Integer> arrayList=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("Sample Array List: "+arrayList);
        reverseArrayList(arrayList);
        System.out.println("Reversed Array List: "+arrayList);

        //For Linked List
        LinkedList<Integer> linkedList=new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("Sample Linked List: "+linkedList);
        reverseLinkedList(linkedList);
        System.out.println("Reversed Linked List: "+linkedList);
    }
}
