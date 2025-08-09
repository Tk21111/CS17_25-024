public class Dog
    {
        public int age;
        protected String name;
        private String specialName;

        public void bark()
        {
            System.out.println("barkๆ");
        }

        Dog(int age , String name)
        {
            this.age = age;
            this.name = name;
        }

        public void changeAge(int age)
        {
            this.age = age;
        }

        public DogStat getStat()
        {
            
            return new DogStat(age, name , specialName);
        }

        public String getName()
        {
            return name;
        }

        public void SetNickName( String nickName)
        {
            this.specialName= nickName;
        }

        public void run(int time)
        {
            System.out.println(String.format(" %s is running", name));
        }
        
    }