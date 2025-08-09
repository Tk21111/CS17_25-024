
import java.util.Arrays;


public class SelectionSort {

    
    public static void main(String[] args)
    {
        int[] arr = new int[] { 5,4,4,4,4,48,};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void SelectionSort(int[] arr)
    {
        for ( int i = 0 ; i < arr.length ; i++)
        {
            for ( int j = 0 ; j < arr.length ; j++)
            {
                if ( arr[i] > arr[j])
                {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
