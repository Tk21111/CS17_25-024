package prof_camp.D1;
//25_[N'Tonkla]

public class HW1_25NTonkla {

    public static void main(String[] args) {
        int maxXY = 10;

        for (int i = 0 ; i < maxXY ; i++)
        {
            String lineOut = "";
            //first
            for (int f = 0 ; f < maxXY -i -1 ; f++)
            {
                lineOut += " ";
            }

           
            for (int o = 0 ; o <= i ; o++)
            {
                lineOut += "* ";
            }
           

            System.out.println(lineOut);
        }

        //avoid max
        for (int i = maxXY -2 ; i >= 0  ; i--)
        {
            String lineOut = "";
            //first
            for (int f = 0 ; f < maxXY -i -1 ; f++)
            {
                lineOut += " ";
            }

           
            for (int o = 0 ; o <= i ; o++)
            {
                lineOut += "* ";
            }
           

            System.out.println(lineOut);
        }
    }
}
