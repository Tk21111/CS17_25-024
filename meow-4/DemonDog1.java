public class DemonDog1 extends Dog{
    
    public DemonDog1(int age, String name) {
        super(age, name);
    }

    @Override
    public void run(int time){
        for (int i = 0 ; i < time ; i++ )
        {
            System.out.println(String.format("%s is doing %s", name , "Go no kata: Kanten no Jiu"));

        }
    }


    
}
