
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SmallestAmongOfCoin1{

    public static void main(String[] args) {
        ArrayList<Integer> coinHave = new ArrayList<Integer>(Arrays.asList(20,10,8,5,3,1));
        ArrayList<Integer> returnCoin = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Tree price");
        Integer price = sc.nextInt();
        System.out.println("Costomer pay price");
        Integer coinGet = sc.nextInt();
        sc.close();

        Integer change = coinGet - price;
        System.out.println(change);

        Integer changeByCoin = 0;
  
        for(Integer i : coinHave){
            
            if(change / i == 0){
                continue;
            }
            Integer num = change / i;
            Integer left = change % i;

            changeByCoin += i*num;

            for (Integer f = 0 ; f <= num-1 ; f++){
                returnCoin.add(i);
            }
            change = left;
        }
    

        System.out.println(returnCoin);

    }
}