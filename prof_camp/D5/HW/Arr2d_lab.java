package prof_camp.D5.HW;

import java.util.Arrays;

//25 N'Tonkla
public class Arr2d_lab {
    public static void main(String[] args) {


        System.out.println(3 % 3);

        int [][] a = {{2,4,6},{4,6,4},{6,4,2}};
        int [][] b = {{1,3,5},{3,5,3},{5,3,1}};
        int [][] q1 = additionMatrix(a,b);
        int [][] q2 = subtractionMatrix(a,b);
        int [][] q3 = multiplicationMatrix(a,b);
    
        System.out.println("Addition of Matrix :");
        for (int[] is : q1) {
        System.out.println(Arrays.toString(is));
        }
        System.out.println("Subtraction of Matrix :");
        for (int[] is : q2) {
        System.out.println(Arrays.toString(is));
        }
        System.out.println("Multiplication of Matrix :");
        for (int[] is : q3) {
        System.out.println(Arrays.toString(is));
        }
    }

    public static int[][] additionMatrix(int[][] a, int[][] b) {
        int[][] x = new int[3][3];
        
        for (int i = 0 ; i < 3 ; i++)
        {
            for (int j = 0 ; j < 3 ; j++)
            {
                x[i][j] = a[i][j] + b[i][j];
            }
        }
        return x;
    }

    public static int[][] subtractionMatrix(int[][] a, int[][] b) {
        int[][] x = new int[3][3];
        for (int i = 0 ; i < 3 ; i++)
        {
            for (int j = 0 ; j < 3 ; j++)
            {
                x[i][j] = a[i][j] - b[i][j];
            }
        }
        return x;
    }

    public static int[][] multiplicationMatrix(int[][] a, int[][] b) {
        int[][] x = new int[3][3];
        for (int i = 0 ; i < 3 ; i++)
        {
            for (int j = 0 ; j < 3 ; j++)
            {
                
                for (int l = 0 ; l < 3 ; l++)
                {
                    x[i][j] += a[i][l] * b[l][j];
                }
            }
        }
        return x;
    }

    // 00 + 00 01+ 10 02 + 20 | 01 + 00  

}