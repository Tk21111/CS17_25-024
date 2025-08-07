package prof_camp.D2;

public class HW2_25NTonkla {
    public static int gcd(int a, int b) {
        System.out.println(a);
        System.out.println(b);
        

        if ( a == 0) { // คิด Base case
            return b; // ใส่ return
        } else {
            return gcd(b % a, a);
            //technic of get the lower value to divide 
            // 18 % 48 result = 18 , 48
        }
    }
    public static void main(String[] args) {
        System.out.println(gcd(48, 18));
    }
}
