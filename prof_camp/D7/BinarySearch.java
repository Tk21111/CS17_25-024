// package prof_camp.D7;

// public class BinarySearch {
//     public static int binarySearch(int[] arr , int target)
//     {
//         int left = 0;
//         int right = arr.length - 1;

//         while (left <= right) {
//             int mid = left + ( right - left);
//         }
//     }

//     public static void main(String[] args) {
        
//     }
// }
import java.util.*;
import java.util.stream.Gatherer.Integrator;;

public class BinarySearch {

    public static void main(String[] args) {
        
        int[] a = new int[]{5,8,7,7,6,7,7,9};

        ArrayList<Integer> c = new ArrayList<>();

        for (Integer i : a) {
            c.add(i);
        }
   
        System.out.println(Collections.max(c));

        List<Integer> empty = Collections.emptyList();
        
        LinkedList<Integer> ab = new LinkedList<>(Arrays.asList(5,7,9,5,4,2,4));

        ab.add(5);
        ab.pollLast();
        System.out.println(ab);
        System.out.println("ab".repeat(8) + Arrays.toString("aghnjmk,".split("g")));
        System.out.println("aaaaaaaaaa".hashCode());
        
        Stack<Integer> uu = new Stack<>();

        uu.push(8);
        uu.push(4);
        uu.push(5);
        uu.push(69);

        System.out.println(uu.removeLast());

        //FIFO
        Queue<Integer> uuu = new LinkedList<Integer>();

        uuu.add(10);
        uuu.add(8);

        // System.out.println(uuu.remove(8));
        System.out.println(uuu);

        Collections.sort((LinkedList<Integer>)uuu);
        System.out.println(uuu);

        //FILO
        Stack<Integer> ssss = new Stack<>();
        Queue<Integer> sssssss = new LinkedList<>();

        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());




        

    }
}
