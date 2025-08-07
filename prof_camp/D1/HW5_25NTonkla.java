package prof_camp.D1;
//25_[N'Tonkla]

public class D1_4 {
    public static void main(String[] args) {
        double numDouble = 44310000000000000000000d;
        String num = Double.toString(numDouble);

        String out = num.substring(0, 1);
        
        out += num.substring(2, num.indexOf("E") );
        out += "0".repeat(Integer.parseInt(num.substring(num.indexOf("E") +1, num.length())) - (num.indexOf("E") - 2));
        System.out.println(out);
    }
}
