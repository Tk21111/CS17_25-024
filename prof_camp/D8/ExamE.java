package prof_camp.D8;

import java.util.Scanner;

// 5 5
// 1 2 1 2 3
public class ExamE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int amount = sc.nextInt();

        //testing purpose
        //2 3 3
        
        // int amount = 12;
        // int[] bags = {12 , 0 , 0 , 0 , 0 };
        
        int[] bags = new int[len];
        for (int i = 0; i < bags.length; i++) {
            bags[i] = sc.nextInt();
        }

        sc.close();

        int count = 0;
        int curculatingAmount = amount;
        // ArrayList<Integer> list = new ArrayList<>();

        for (int k = 0; k < bags.length; k++) {
           for (int i = k; i < bags.length; i++) {
                curculatingAmount -= bags[i];
                // list.add(bags[i]);
                if(curculatingAmount == 0)
                {
                    // System.out.println(list);
                    count++; 
                } else if(curculatingAmount < 0) {
                    break;   
                }
            }
            // list.clear();
            //reset
            curculatingAmount = amount;
    
        }
       
        System.out.println(count);
    }
}
