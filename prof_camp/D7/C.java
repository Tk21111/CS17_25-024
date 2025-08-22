public class C {
    public static void main(String[] args) {
        BlackCat bc = new BlackCat("Meow");
        bc.MeowOut();

        Meow m = (Meow)bc;
        System.out.println(m.name);
    }
}

class Meow {
    protected String name;
    Meow(String name)
    {
        this.name = name;
    }

    void MeowOut()
    {
        System.out.println(String.format("%s : meow~~ ;p", name));
    }
}

class BlackCat extends Meow 
{

    BlackCat(String name) {
        super(name);
        
    }

    @Override
    void MeowOut() {
        super.MeowOut();
        System.out.println(String.format("%s : meow~~ The Black cat ;}", name));
    }

}
