import java.util.Random;
import java.util.Scanner;
import java.lang.Thread;


class MyThread implements Runnable {
    
    public String win = null;
    
    private Scanner sc = new Scanner(System.in);

    public void clearWin(){
        this.win = null;
    }
    
    public String getWin(){
        System.out.println(win);
        return this.win;
    }

    public void run() {
        // Code to be executed in the new thread
        while (true) {
            this.win = sc.nextLine();
        }
        
        
    }
}

class ThreadExample {

    private static int fullCanvas = 5;

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
    public static void main(String[] args) throws InterruptedException {

        boolean win = false;

        MyThread myRunnable1 = new MyThread(); // <-- Create MyThread separately
        Thread thread1 = new Thread(myRunnable1);
        thread1.start();

        Random r = new Random();

        int[] check = new int[]{ r.nextInt(fullCanvas) ,r.nextInt(fullCanvas)  };
        //int[] check = new int[]{ 1,1 };

        while (!win) {

            boolean sw = false;

            for(int i = 0 ; i < fullCanvas; i++){
                for (int f = 0 ; f < fullCanvas ; f++){

                    System.err.print(check[0] + " , " + check[1] + " ||");
                    System.err.print(i + " , " + f + "\n");
                    
                    generate(new int[]{i,f}, check);
                    Thread.sleep(200);
     
                    if(myRunnable1.getWin() != null && check[0] == i && check[1]  ==f ){
                        win = true;
                        break;
                    }
                    myRunnable1.clearWin();
                }   

                if(win){
                    break;
                }
            }
        }
       
        System.out.println("win");
    }
} 
