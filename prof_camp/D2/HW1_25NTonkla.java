package prof_camp.D2;

public class HW1_25NTonkla {
    public static String reverseString(String str) {
        if ( str.length() == 1 ) { // คิด Base case ให้พี่ด้
            return str; // ใส่ return เองน้าน้
        } else { // general case
            return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
        }
    }

    public static void main(String[] args) {
        String in = "CS KMITL";
        System.out.println(String.format("Reversed string of %s is : %s" ,  in , reverseString(in)));
    }
}
