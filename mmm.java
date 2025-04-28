import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
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
            System.out.println("check");
            this.win = sc.nextLine();
            if(win != null && timeclick == 0 ){
                timeclick = System.currentTimeMillis();
            }
        }
        
        
    }
}

class ThreadExample {

    public static int fullCanvas = 5;
 
    static void generate(int[] pointAt , int[][] check){


        for(int i = 0 ; i < fullCanvas; i++){

            String drawCanvas = "";

            for (int f = 0 ; f < fullCanvas ; f++){
                boolean place = false;
                for (int[] point : check) {
                    if(i == point[0] && f == point[1] && i == pointAt[0] && f == pointAt[1]){
                        drawCanvas += "X";
                        place = true;
                    } else if(i == point[0] && f == point[1]){
                        drawCanvas += "x";
                    } 
                }

                if(i == pointAt[0] && f == pointAt[1] && !place) {
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

  

    private static long[] Game(MyThread Runnable , int[][] check , long mainLoopWait , int ii , int ff ) throws InterruptedException{

        
        long[] timeShow = new long[check.length];
        for (int t = 0 ; t < timeShow.length ; t++) {
            timeShow[t] = -10;
        }
        long timeShowTmp = 0;

        int checked = 0;


        for(int i = ii ; i < fullCanvas; i++){
            for (int f = ff ; f < fullCanvas ; f++){
    
                //generate wna wait
                generate(new int[]{i,f}, check);

                //timeshow
                timeShowTmp = System.currentTimeMillis();

                Thread.sleep(mainLoopWait);
 
                //check
                if(Runnable.getWin() != null ){

                    for(int point = 0 ; point < check.length ; point++){
                        if(check[point][0] == i && check[point][1] == f){
                            checked++;
                            timeShow[point] = Runnable.getTime() - timeShowTmp;
                            
                        }
                    } 


                    Runnable.clearWin();
                    break;
                   
                }

                //reset input loop
                Runnable.clearWin();
            }   

            //stucture prob.
            if(checked == check.length){
                break;
            }
        }

        return timeShow ;
    }

    static void TestRun() throws InterruptedException{
        Thread.sleep(500);
        System.out.println("");
        ShowSentence("It will move like this : ");
        System.out.println("");
        Thread.sleep(500);
        ShowSentence("Try to select  ");
        Thread.sleep(500);

        
        MyThread RunnableEx = new MyThread(); 
        Thread ThreadEx = new Thread(RunnableEx);
        ThreadEx.start();
        long refEx = Game(RunnableEx, new int[][]{{2,3}}, 1000 , 2 , 0)[0];
        System.out.println("Nice....");
        System.out.println(refEx);
    }

    static void Instuction(Scanner sc) throws InterruptedException{
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

        System.out.println("");
        ShowSentence("Good. Now.....................");

        Thread.sleep(200);

        System.out.println("");
        ShowSentence("This an example grid : ");
        
        generate(new int[]{1,0} , new int[][]{{2,3}});

        System.out.println("");
        ShowSentence("0 is pointer ");
        System.out.println("");
        ShowSentence("x is the point to select ");
        System.out.println("");
        ShowSentence("type anything to continous : ");
        sc.next();
    }

    
    public static void main(String[] args) throws InterruptedException {


        ShowSentence("!! Welcome to reflection checker !!");
        

        //init sc & set mainLoopWait
        Scanner sc = new Scanner(System.in);
        ShowSentence("Select your's input range (0-?) (ms) : ");
        long mainLoopWait  = sc.nextLong();

       

        ShowSentence("Set to  ");
        ShowSentence(Integer.toString(fullCanvas) + " x " + Integer.toString(fullCanvas) );
        ShowSentence(" Square");

        System.out.println("");
        ShowSentence(" Skip introduction ? ( Y = yes , N = no):");
        String skip = sc.next().toUpperCase();


        if(skip.equals("N")){
            //Instuction(sc);
            //TestRun();
        }

        System.out.println("");
        ShowSentence("How many time u want to play : ");
        int timeplay = sc.nextInt();


        System.out.println("");
        ShowSentence("point per game : ");
        int pointPerGame = sc.nextInt();
        

//         //sc.close();
//         But your MyThread class has its own Scanner sc = new Scanner(System.in);, and it expects System.in to still be open.
// When you call sc.close() in main, it closes System.in, causing any other Scanner (like in MyThread) to crash with NoSuchElementException when it tries to read.

        //init main loop
        boolean again  = true;
        
        //int[] check = new int[]{ 1,1 };

        //set up in put loop
        MyThread Runnable = new MyThread(); 
        Thread thread1 = new Thread(Runnable);

        while (again) {

            System.out.println("");
            ShowSentence("READY");
            System.out.println("");
            ShowSentence("SET");

            System.out.println("");
            for (int o = 3 ; o >= 0 ; o--){
                System.out.println(o);
                Thread.sleep(70);
            }
            ShowSentence("GO...");

         
            ArrayList<long[]>reflectionArr = new ArrayList<long[]>();


            //start input 
            thread1.start();
            for (int time = timeplay ;  time > 0 ; time--) {

                //generate point
                Random r = new Random();
               
                int[][] check = new int[pointPerGame][2];
                for (int point = 0 ; point < pointPerGame ; point++){
                    boolean dup = false;

                    do{
                        check[point][0] = r.nextInt(fullCanvas);
                        check[point][1] = r.nextInt(fullCanvas);

                        if(check.length > 1){
                            for(int pointCheck = 0 ; pointCheck < check.length -1 ; pointCheck++){
                       
                                if(check[point][0] == check[pointCheck][0] && check[point][1] == check[pointCheck][1] && !dup){
                                    dup = true;
                                } 
                            }
                        }
                        
                    } while(dup);
                    
                    
                    
                }
    
                //swith for smooth trasition //TODO
    
                reflectionArr.add(Game(Runnable, check, mainLoopWait , 0 , 0));
    
                
            }
            thread1.interrupt();
           
            System.out.println("");
            ShowSentence("your's refection is :");
            reflectionArr.forEach(val -> System.out.print(Arrays.toString(val)));
    
            AtomicInteger failAttemp = new AtomicInteger(0);
            AtomicInteger notAttemp = new AtomicInteger(0);
            AtomicLong AvgRes = new AtomicLong(0);
            AtomicLong AvgResCount = new AtomicLong(0);
    
            reflectionArr.forEach((vals)  -> {
                
                for (long val : vals) {
                    
                    if (val == -10){
                        notAttemp.incrementAndGet();
                    } else{
                        AvgRes.set(AvgRes.get() + val);
                        AvgResCount.incrementAndGet();
                    }


                }
                
                
            });
    
            System.out.println("");
            ShowSentence(String.format("your's refection is delays by : %f sec with %d fail attemp and %d  not attemp", (float)(AvgRes.get() / AvgResCount.get() / 1000) , failAttemp.get() , notAttemp.get() ));
            ShowSentence("Play again ? [YC] = yes change setting , [Y] = yes no change  , [N] = no");
            String retry = sc.next().toUpperCase();
            if(retry.equals("N")){
                again = false;
                break;
            } else if(retry.equals("YC")){
                ShowSentence("change speed (ms)");
                mainLoopWait = sc.nextLong();
                ShowSentence("how many time");
                timeplay = sc.nextInt();
            }

            
        }

        
    }
} 
