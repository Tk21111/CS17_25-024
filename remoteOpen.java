public class remoteOpen {

    public static void main(String[] args) {
        
        Tv myTv = new Tv();
        myTv.remoteOpenTv();
    }
}

class Tv {

    private String weather = "tommorow days is very nice ";
    public boolean openTv = false;

    public void remoteOpenTv(){
        this.openTv = true;
        if(openTv){
            System.out.println(weather);
        }
    }

    
    
}
