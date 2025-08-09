import java.util.Arrays;

public class BubbleSort {
    
    static void bubbleSort(int[] arr)
    {
        boolean isSwaped = false;
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr.length -i -1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                    isSwaped = true;
                }

               
            }

            if(!isSwaped)
            {
                break;
            }
            
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] { 5,4,4,4,4,48,};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
