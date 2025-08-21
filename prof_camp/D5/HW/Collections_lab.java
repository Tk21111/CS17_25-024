package prof_camp.D5.HW;

import java.util.*;

public class Collections_lab {
    public static void main(String[] args) {
        q1();
        q2();
    }

    // Q1: Practice ArrayList
    // Add, remove, get, and loop through elements
    public static void q1() {
        System.out.println("Q1: ArrayList demo");
        ArrayList<String> list = new ArrayList<>();
        // * YOUR CODE HERE */

        //add to list
        String[] toAdds = { "Apple" , "Banana" , "Orange"};
        for (String toAdd: toAdds) {
            list.add(toAdd);
        }
        System.out.println("List : " + list);

        //remove last
        list.remove(1);
        System.out.println("After remove : " + list);

        //elemnet at 1
        System.out.println("Element at index 1 : " + list.get(1));

        //loop throught arrList
        for (String i : list) {
            System.out.println(" - " + i);
        }

        
    }

    // Q2: Practice LinkedList
    // AddFirst, AddLast, RemoveFirst, RemoveLast
    public static void q2() {
        System.out.println("\nQ2: LinkedList demo");
        LinkedList<Integer> linked = new LinkedList<>();
        
        int[] demo = {10,20,30};
        //Link list
        for (Integer i : demo) {
            linked.add(i);
        }
        System.out.println("LinkList: " + linked);
        //remove first and last
        linked.removeFirst();
        linked.removeLast();

        System.out.println("After removeFirst & removeLast: " + linked);

    }
}