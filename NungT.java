import java.util.Scanner;

public class NungT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name Dud");
        //String name = sc.nextLine();
        String name = "Tonklaaa";

        
        if(!name.isEmpty()){

            Integer extra = name.length() % 2;
            String nameFormat = "|" + " ".repeat((12 - name.length())/2) + name + " ".repeat((12 - (name.length())/2 + extra)) + "|";

            System.out.println(" ____________");
            System.out.println("|            |");
            System.out.println(nameFormat);
            System.out.println("|____________|");
            System.out.println("(\\__/)  || ");
            System.out.println("(O Y O) ||");
            System.out.println("/ 　   P");
        }

        sc.close();
    }
}
