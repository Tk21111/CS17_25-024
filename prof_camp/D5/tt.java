package prof_camp.D5;

import java.util.Arrays;

public class tt {
    
    public static void main(String[] args) {
        int [][] a = { 
            {2,4,6},
            {4,6,4},
            {6,4,2}    
        };

        int [][] b = { 
            {1,3,5},
            {3,5,3},
            {5,6,1}    
        };

        int [][] result = new int[3][3];
        for (int i = 0 ; i < 3 ; i++)
        {
            for (int j=0 ; j < 3 ; j++)
            {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println(Arrays.deepToString(result));

    }
}
