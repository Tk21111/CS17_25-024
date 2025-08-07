package prof_camp.D2;

public class HW4_25NTonkla {
   private static int findMaxHelper(int[] arr, int index) {
    if ( arr.length -1  == index  ) { // คิด Base case
        return arr[index]  ; // ใส่ return เองน้าน้
    }
    int maxOfRest = findMaxHelper(arr, index + 1);
    return Math.max(arr[index], maxOfRest) ;
    }
    public static void main(String[] args) {
        int[] arrIn =new int[]{ 34 , 2 ,5 ,36 , 24 ,8};
        System.out.println(String.format("The maximum value is : %d" , findMaxHelper(arrIn, 0)));
    }

    //for this it will get all value first then calculate from back -> front
    //index + 1 = 34 -> 2 -> 5 to 8 
    //then get the last and compare to the prev last
    //why???????
}
