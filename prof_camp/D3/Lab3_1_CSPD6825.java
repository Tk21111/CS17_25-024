package prof_camp.D3;

//25
public class Lab3_1_CSPD6825 {
    public static class StandUser {
        
        private String name;
        private String stand;
        private Boolean isSummon;
        private String specialMove;

        StandUser(String name, String stand , Boolean isSummon , String specialMove){
            this.name = name;
            this.stand = stand;
            this.isSummon = isSummon;
            this.specialMove = specialMove;
        }

        public void summon()
        {
            isSummon = true;
            System.out.println(name + " summon " + stand);
        }

        public void useSpecialMove()
        {
            System.out.println(stand + " " + specialMove);
        }
            
        public String getSpecialMove()
        {
            return specialMove;
        }

        public void setSpecialMove(String specialMove)
        {
            this.specialMove = specialMove;
        }

    }

    public static void main(String[] args) {
        StandUser a = new StandUser("pakapong", "swiming in the air", false, "bigger than");
        StandUser b = new StandUser("pakapong", "swiming in the air", null, null);
        StandUser c = new StandUser(null, null, null, null);
    }
}
