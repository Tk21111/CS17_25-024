import java.util.Scanner;

public class RPGSurvivalFix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //---------- health -------
        Float health = 150f;
        while (health < 0f || health > 100f) {
            System.out.println("health In (0-100): ");
            health = sc.nextFloat();
        }

        //--------- mana -----------
        Float mana = 150f;
        while (mana < 0f || mana > 100f) {
            System.out.println("mana In (0-100): ");
            mana = sc.nextFloat();
        }

        // -------------- weapon -------------
        System.out.println("weapon In (1-5) integer only: ");
        int weapon = sc.nextInt();
        
        //----------------- place -------------
        //del leftover
        sc.nextLine();

        System.out.println("place In (A-E) uppercase recommend: ");
        String place = sc.nextLine();

        sc.close();

        //--------------- condition ---------------

        if(health + mana >= 150f){
            System.out.println("Champ will fight!!");

            //default
            String weaponFormatted ="no weapon on hand!" ;
            String placeFormatted = "somewhere i don't know";

            //weapon
            switch (weapon) {
                case 1:
                    weaponFormatted = "Fire Sword";
                    break;
                case 2:
                    weaponFormatted = "Thunder Bow";
                    break;
                case 3:
                    weaponFormatted = "Ice magic";
                    break;
                case 4:
                    weaponFormatted = "Refletive shield";
                    break;
                case 5:
                    weaponFormatted = "Monster Axe";
                    break;
                default:
                    break;
            }

            //place
            switch (place) {
                case "A":
                    placeFormatted = "Magical Forest";
                    break;
                case "B":
                    placeFormatted = "Dragon's Cave";
                    break;
                case "C":
                    placeFormatted = "Haunted castle";
                    break;
                case "D":
                    placeFormatted = "Volcanoes of fire";
                    break;
                case "E":
                    placeFormatted = "Tower of wind";
                    break;
                default:
                    break;
            }

            System.out.println("Champ use " + weaponFormatted + " to fight in " +  placeFormatted);

            if(health < 65f){
                System.out.println("!!! Warning low heath, might die !!!");
            }

        } else if (health + mana < 150f){
            System.out.println("Champ decide to run , escape fast!!");
            System.out.println("Champ go back to restock");
            
            if(mana < 40f){
                System.out.println("!!! Not enough mana to wrap. Champ has to escape by foot , RUN!!!!!! ");
            }
        }

    }
}
