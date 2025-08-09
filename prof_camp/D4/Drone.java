public class Drone implements RecordAble , FlyAble
{
    // @Override
    // public void fly()
    // {
    //     System.out.println("Im flying");
    // }

    @Override
    public void record()
    {
        System.out.println("recording");
    }

    @Override
    public void fly() 
    {
        System.out.println("flying");
    }

    
}
