public class Shepherd extends Dog {
    
    public Shepherd(int age, String name) {
        super(age, name);
    }

    @Override
    public void bark()
    {
        System.out.println("Meow");
    }
    
}
