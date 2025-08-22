package prof_camp.D7;

import java.util.*;

public class Merge_Sort {
 
    
    public static void main(String[] args) {
       
    }

    public int[] Merge_Sort(int[] a)
    {

        if(a.length <= 1)
        {
            return a;
        }
        int mid = a.length / 2;
        int[] l = Arrays.copyOfRange(a, 0, mid);
        int[] r = Arrays.copyOfRange(a, mid, a.length);
        return Merge(l,r);
    }

    public int[] Merge(int[] a , int[] b)
    {
        int min_len = 0;
        int toAddLater = -1;
        if (a.length == b.length)
        {
            min_len = -1;
        }
        if(a.length > b.length)
        {
            min_len = b.length;
            toAddLater = a[a.length];
        } else
        {
            min_len = a.length;
            toAddLater = b[b.length];
        }

        int[] newA = new int[a.length + b.length];

        int newAi = 0;
        for(int i = 0 ; i < min_len ; i++)
        {
    
            if(a[i] > b[i])
            {
                newA[newAi] = b[i];
                newA[newAi + 1] = a[i];
                newAi +=2;
            } else {
                newA[newAi + 1] = b[i];
                newA[newAi] = a[i];
                newAi +=2;
            }
        }

        return newA;
    }
}
