import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.lang.Thread;


class MyThread implements Runnable {
    
    public String win = null;
    public Boolean checked = false;

    public long timeclick  = 0;
    
    private Scanner sc = new Scanner(System.in);


    //reset every main loop
    public void clearWin(){
        this.win = null;
        this.timeclick = 0;
    }
    
    public String getWin(){

        return this.win;

    }

    public long getTime(){
        return this.timeclick;
    }

    public void run() {
        // Code to be executed in the new thread
        while (true) {
            this.win = sc.nextLine();
            if(win != null && timeclick == 0 ){
                timeclick = System.currentTimeMillis();
            }
        }
        
        
    }
}

class ThreadExample {

    public static int fullCanvas = 5;
 
    static void generate(int[] pointAt , int[] check){


        for(int i = 0 ; i < fullCanvas; i++){

            String drawCanvas = "";

            for (int f = 0 ; f < fullCanvas ; f++){
                if(i == check[0] && f == check[1] && i == pointAt[0] && f == pointAt[1]){
                    drawCanvas += "X";
                } else if(i == check[0] && f == check[1] ){
               
                    drawCanvas += "x";
                } else if(i == pointAt[0] && f == pointAt[1]) {
                    drawCanvas += "0";
                } else {
                    drawCanvas += "-";
                }
            }

            System.out.println(drawCanvas);
            
        }

        System.out.println("=======================================");

        
        
    }

    private static void ShowSentence(String se) throws InterruptedException{
        for (int i = 0 ; i < se.length() ; i++ ) {
            
            Thread.sleep(20);
            System.out.print(se.charAt(i));
        }
        Thread.sleep(100);
    }

    private static long Game(MyThread Runnable , int[] check , long mainLoopWait) throws InterruptedException{
        long timeShow = 0;
        Boolean win = false;

        for(int i = 0 ; i < fullCanvas; i++){
            for (int f = 0 ; f < fullCanvas ; f++){

                //debug pls del
                System.err.print(check[0] + " , " + check[1] + " ||");
                System.err.print(i + " , " + f + "\n");
                
                //generate wna wait
                generate(new int[]{i,f}, check);

                //timeshow
                timeShow = System.currentTimeMillis();

                Thread.sleep(mainLoopWait);
 
                //check
                if(Runnable.getWin() != null && check[0] == i && check[1]  ==f ){
                    win = true;

                    //mod
                    timeShow = Runnable.getTime() - timeShow;
                    break;

                }

                //reset input loop
                Runnable.clearWin();
            }   

            //stucture prob.
            if(win){
                break;
            }
        }

        return timeShow;
    }
    public static void main(String[] args) throws InterruptedException {


        ShowSentence("!! Welcome to reflection checker !!");
        

        //init sc & set mainLoopWait
        Scanner sc = new Scanner(System.in);
        ShowSentence("Select your's input range (0-?) (ms) : ");
        long mainLoopWait  = sc.nextLong();

        //set prepare time
        ShowSentence(String.format("Obviously u want time to breath like... .How much (20 - %d percent) :" , mainLoopWait));
        int place = Math.round((int)sc.nextLong() / mainLoopWait) + 1;
        if(place >= fullCanvas){
            place = Math.round(place / fullCanvas) ;
        }

        ShowSentence("Set to  ");
        ShowSentence(Integer.toString(fullCanvas) + " x " + Integer.toString(fullCanvas) );
        ShowSentence(" Square");


        //-----------------------------------------------------------------------------

        System.out.println("");
        ShowSentence("To select type something ex.");
        ShowSentence(" y ");
        ShowSentence(" -> ");
        ShowSentence(" [enter]");
        System.out.println("");
        ShowSentence("Your's hand should be at both key at all time");
        System.out.println("");
        ShowSentence("Try now :");

        String userExPress = sc.next();

        if(userExPress.length() > 1){
            ShowSentence("U can press only 1 key if u want but what ever");
        }
        ShowSentence("Good. Now.....................");

        Thread.sleep(200);

        System.out.println("");
        ShowSentence("This an example grid : ");
        int[] examplePoint = new int[]{1,0}; 
        generate(examplePoint, new int[]{2,3});

        System.out.println("");
        ShowSentence("It will move like this : ");
        

        System.out.println("");
        ShowSentence("READY");
        ShowSentence("SET");

        for (int o = 3 ; o >= 0 ; o--){
            System.out.println(o);
            Thread.sleep(70);
        }
        ShowSentence("GO...");

        
        

        //init main loop
        boolean win = false;
        ArrayList<Long> reflectionArr = new ArrayList<Long>();

        //generate point
        Random r = new Random();

        int checkX = r.nextInt(fullCanvas) + place;
        if(checkX / fullCanvas > 1){
            checkX = checkX % fullCanvas;
        }

        int[] check = new int[]{ checkX ,r.nextInt(fullCanvas)  };
        
        //int[] check = new int[]{ 1,1 };

        //set up in put loop
        MyThread Runnable = new MyThread(); 
        Thread thread1 = new Thread(Runnable);

        //start input 
        thread1.start();

        while (!win) {

            //swith for smooth trasition //TODO
            boolean sw = false;
            reflectionArr.add(Game(Runnable, check, mainLoopWait));

            
        }
       
        System.out.println("");
        System.out.print("your's refection is :");


    }
} 
