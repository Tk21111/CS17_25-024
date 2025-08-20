import java.util.Arrays;

public class maaa {

    public static void main(String[] args) {
        int[] disnut = new int[]{ 1,2,9,7,4,5};

        // boolean swap = false;
        // for (int i = 0 ; i < disnut.length ; i++)
        // {
        //     for (int j = 0 ; j < disnut.length - 1; j++ )
        //     {
        //         if(disnut[j] > disnut[j+1])
        //         {
        //             int tmp = disnut[j];
        //             disnut[j] = disnut[j+1];
        //             disnut[j+1] = tmp;
        //             swap = true;
        //         }
        //     }

        //     if(!swap)
        //     {
        //         break;
        //     }
        // }

        for (int i = disnut.length - 1; i> 0 ; i--)
        {
            int f = 1;
            while (f - 1  < i) {
                if( disnut[i] < disnut[i-f])
                {
                    int tmp = disnut[i];
                    disnut[i] = disnut[i-f];
                    disnut[i-f] = tmp;
                }
                f++;
            }
            System.out.println(Arrays.toString(disnut));
        }

        System.out.println(Arrays.toString(disnut));
    }
   
}
