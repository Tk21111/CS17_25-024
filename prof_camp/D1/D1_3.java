package prof_camp.D1;

public class D1_3 {
    public static void main(String[] args) {
        int hr = 25;
        int amount = 0;

        if ( hr % 24 > 15 )
        {
            hr = hr - (hr % 24) + 24;
        }

        if ( hr % 24 != 0)
        {
            amount += 10;
        }

        amount += Math.round(hr / 24) *100;
        amount += (hr % 24) *10;

        System.out.println(amount);
    }
}
