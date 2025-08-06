package prof_camp.D1;

public class D1_1 {

    public static void main(String[] args) {
        int maxXY = 5;

        for (int i = 0 ; i < maxXY ; i++)
        {
            String out = "";
           for (int f = 1 ; f < i+2 ;f++)
           {
                out += Integer.toString(f);
           }

           System.out.println(out);
        }
    }
}
