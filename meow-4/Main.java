public class Main {
 
    static void Method1()
    {
        System.out.println("hello world");
    }

    static void recursive(int i)
    {
        if(i ==0)
        {
            return;
        }
        System.out.println(i);
        recursive( i -1);

    }

    
    public static void main(String[] args)
    {
        // Method1();

        // int i = 0;

        // do { 
        //     System.out.println(i);
        //     i++;
        // } while (i < 5);

        // recursive(5);

        //normal cause why not
        Dog normal_dog = new Dog(54, "normal dog 1");
        normal_dog.bark();

        //upcast cause im bored
        Shepherd not_normal_dog = new Shepherd(80, "not normal dog 1");
        not_normal_dog.bark();

        //downcast cause why not
        Dog normal_dog1 = (Dog)not_normal_dog;
        normal_dog1.bark();

        //for spicy purpose
        normal_dog.changeAge(745206);

        //with protect
        System.out.println(normal_dog.getName());

        //new class without no protect
        DogStat notSoNormal = normal_dog.getStat();
        System.out.println(notSoNormal.age);
        System.out.println(notSoNormal.name);
        System.out.println(notSoNormal.nickName);

        int m = 5;

        if (m ==0){
            System.out.println("meow");
        } else if (m ==5)
        {
            System.out.println("xcfvbnrm,;jlkigfhvytgipjp[',mp;oi;mluk4jfvjcu']");
        }

        NotSoNormalShepherd veryNormalShepherd = new  NotSoNormalShepherd();
        veryNormalShepherd.specialAction();

        Dog thoisDoggonnaRun = new Dog(52555, "running dog");
        thoisDoggonnaRun.run(5);

        DemonDog1 fifthnFormDog = new DemonDog1(55555, "fifthFormDog");
        fifthnFormDog.run(9);

        DemonDog dogThatCanCalculate = new NotSoNormalShepherd();
        System.out.println(dogThatCanCalculate.sub(4, 5));

    }
}

