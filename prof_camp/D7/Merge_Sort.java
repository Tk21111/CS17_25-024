

import java.util.*;

public class Merge_Sort {
 
    
    public static void main(String[] args) {
       int[] s = new int[]{5,4,8,4,3,4,7,1,5,7,1,4,77,};

       System.out.println(Arrays.toString(Merge_Sort(s)));
    }

    public static int[] Merge_Sort(int[] a)
    {

        if(a.length <= 1)
        {
            return a;
        }

        int mid = a.length / 2;
        int[] l = Merge_Sort(Arrays.copyOfRange(a, 0, mid));
        int[] r = Merge_Sort(Arrays.copyOfRange(a, mid, a.length));

        System.out.println(Arrays.toString(Merge(l, r)));
        return Merge(l,r);
    }

    public static int[] Merge(int[] a, int[] b) {
        int[] newA = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        // Merge while both arrays have elements
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                newA[k++] = a[i++];
            } else {
                newA[k++] = b[j++];
            }
        }

        // Copy leftovers from a
        while (i < a.length) {
            newA[k++] = a[i++];
        }

        // Copy leftovers from b
        while (j < b.length) {
            newA[k++] = b[j++];
        }

        return newA;
    }

}
