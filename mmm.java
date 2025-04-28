import java.util.Scanner;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Random;

class MyThread implements Runnable {
    
    public boolean win = false;
    public Scanner sc(){
        return new Scanner(System.in);
    }
    
    public boolean getWin(){
        return this.win;
    }

    static void generate(int pointAt){
        int fullCanvas = 9;
        String drawCanvas = "";
        
        for(int i = 0 ; i < fullCanvas; i++){
            if(i == pointAt){
                drawCanvas += "x";
            } else {
                drawCanvas += i;
            }
        }
        System.out.println(Thread.currentThread().threadId());
        System.out.println(drawCanvas);
    }

    public void run() {
        // Code to be executed in the new thread
            Random r = new Random();
            int iRandom = r.nextInt(9);
            
            generate(iRandom);
            
            
            int i = sc().nextInt();
            
            if(iRandom == i){
                System.out.println(Thread.currentThread().threadId());
                System.out.println("win");
                win = true;
               
            } else {
                System.out.println(Thread.currentThread().threadId());
                System.out.println("loss");
            }
        
    }
}

class ThreadExample {
    public static void main(String[] args) throws InterruptedException {

        


        boolean win = false;
        boolean use1 = true;

        while (!win) {

            MyThread myRunnable1 = new MyThread(); // <-- Create MyThread separately
            Thread thread1 = new Thread(myRunnable1);
            MyThread myRunnable2 = new MyThread(); // <-- Create MyThread separately
            Thread thread2 = new Thread(myRunnable2);

            

            if(use1){
                System.out.println("1 : ");
               
                thread1.start();
                thread1.join(5500);
                win = myRunnable2.getWin();
                use1 = false;

            } else {
                System.out.println("2 : ");

         
                thread2.start();
                thread2.join(5500);
                win = myRunnable1.getWin();
        
                use1 = true;

            }

            

            
            
        }
       
        System.out.println("win");
    }
} 
