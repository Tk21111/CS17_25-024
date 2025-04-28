import java.util.Scanner;

public class LetsGo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Float sleepyness = 150f;
        while (sleepyness < 0f || sleepyness > 100f) {
            System.out.println("Sleepyness In (0-100): ");
            sleepyness = sc.nextFloat();
        }
        
        Float boredom = 150f;
        while (boredom < 0f || boredom > 100f) {
            System.out.println("boredom In (0-100): ");
            boredom = sc.nextFloat();
        }


        sc.close();

        if(sleepyness + boredom >= 150f){
            System.out.println("Wake up , Let's get out ...");
        } else if (sleepyness + boredom >=100f){
            System.out.println("Not now maybe later , Study first");
        } else {
            System.out.println("Not delicate enough , Don't go");
        }

    }
}
