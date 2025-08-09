import java.util.*;
class Both extends Thread
{
    String toPrint;
    int threadId ; 
    volatile Long nloop = 0L;
    Date timeStart = new Date();
    
    public Both(String toPrint , int i)
    {
        this.toPrint = toPrint;
        this.threadId = i;
    }

    @Override
    public void run() {
        for (Long i = 0L; i < 99999999999999L; i++) {
            // System.out.println("Thread : " + threadId + " " + (toPrint != null? toPrint : "mewo") + " : " + i);
            this.nloop = i;
        }

        Date currTime = new Date();
        System.out.println("Thread : " + threadId + " " + (currTime.getTime() - timeStart.getTime()));
    }
    
}

public class A 
{

    public static void main(String[] args) throws InterruptedException {

        Map<String , Both> threds = new HashMap<>();

        for (int i = 0 ; i <50 ; i++)
        {
            Both oo = new Both("kkk" , i);
            oo.start();

            threds.put(Integer.toString(i), oo);
        }

        LoopManager manager = new LoopManager(threds);
        manager.start();

    }
}



class LoopManager extends Thread
{
    Map<String , Both> threds;
    int[] prevRank = new int[50];


    public LoopManager(Map<String , Both> threds) {
        this.threds = threds;
    }

    public void checkRank()
    {
        List<Map.Entry<String, Both>> entries = new ArrayList<>(threds.entrySet());


        entries.sort((a, b) -> Long.compare(b.getValue().nloop, a.getValue().nloop));

        System.out.println("Rank");

        String out = "";
        for (int i = 0 ; i < Math.min(10, entries.size()); i++)
        {
            int rankUp = prevRank[entries.get(i).getValue().threadId] - i;
            prevRank[entries.get(i).getValue().threadId] = i;
            out += (i +1) + " place : " + entries.get(i).getValue().threadId  + " " + rankUp +  " , ";
        }

        System.out.println(out);
       
    }

    @Override
    public void run()  {

        boolean kill = false;
        while (true) { 
            try{
                for (Map.Entry<String, Both> en : threds.entrySet()) {
     
                    Both val = en.getValue();
                    if (!val.isAlive()){
                        kill = true;
                    }
                }

                if (kill)
                {
                    break;
                }
                checkRank();
                Thread.sleep(1000); // Fixed wait
            } catch (Exception err)
            {
                System.err.println("err");
            }
        }

    }

    
   
}