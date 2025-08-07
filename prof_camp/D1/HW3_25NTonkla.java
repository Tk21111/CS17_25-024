package prof_camp.D1;

//25_[N'Tonkla]

public class HW3_25NTonkla {
    public static void main(String[] args) {
        String strIn = "CS is the best";

        
        int indexOfC = -1;
        indexOfC = strIn.indexOf("c");
        
        if (indexOfC == -1){
             indexOfC = strIn.indexOf("C");
        }

         if (indexOfC == -1){
            System.out.println(-1);
         } else {
            //char is ' '
            if ( strIn.charAt(indexOfC +1) == 'S' || strIn.charAt(indexOfC +1) == 's')
            {
                System.out.println(indexOfC);
            } else {
                System.out.println(-1);
            }
         }
    }
}
