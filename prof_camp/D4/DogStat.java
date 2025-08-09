public class DogStat {
    
    int age = 0;
    String name = "default name";
    String nickName = "I don't have nickname";

    public DogStat(int age, String name , String nickName) {
        this.age = age;
        this.name = name;
        if (nickName != null)
        {
            this.nickName = nickName ;
        }
    }

    
}
