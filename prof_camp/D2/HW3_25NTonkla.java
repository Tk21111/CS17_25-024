package prof_camp.D2;

public class HW3_25NTonkla {
   public static int gcd(int a, int b) {

        if ( a == 0) { // คิด Base case
            return b; // ใส่ return
        } else {
            return gcd(b % a, a);
        }
    }

    public static int Icm(int a, int b) {

        if ( a == 0 ||  b == 0) { // คิด Base case
            return 0; // ใส่ return
        } else {
            return Math.abs(a*b) /gcd(a, b);
        }
    }
    public static void main(String[] args) {
        int in1 = 12;
        int in2 = 15;
        System.out.println(String.format("ICM of %d and %d is : %d" , in1 , in2, Icm(in1, in2)));
    }
}
