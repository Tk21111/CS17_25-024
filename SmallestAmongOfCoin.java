
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SmallestAmongOfCoin {

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
        while (change != changeByCoin) {

            for(Integer i : coinHave){
                if(changeByCoin + i <= change){
                    returnCoin.add(i);
                    changeByCoin += i;
                    continue;
                }
            }
        }

        System.out.println(returnCoin);

    }
}