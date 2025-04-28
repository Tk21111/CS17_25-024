import java.util.ArrayList;
import java.util.Arrays;

public class largestNumber {
    public static ArrayList<Integer> value = new ArrayList<Integer>(Arrays.asList(3,1,5,10,9,2,5)); 

    public static void main(String[] args) {
        Integer max = value.get(0);
        for (Integer i =0 ; i < value.size()-2 ; i++){
            
            if(value.get(i) < value.get(i+1)){
                max = value.get(i+1);
            } 
        }

        System.out.println(max);
    }
    
}
