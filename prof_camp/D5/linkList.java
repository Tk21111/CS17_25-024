package prof_camp.D5;

public class linkList {
    public int size;
    public ttt head;
    public ttt rear;
    
    public linkList()
    {
        this.size = 0;
        this.head = null;
    }

    public void addLast(int value)
    {
        if (size == 0)
        {
            head = new ttt(value);
            rear = head;
        } else {
            ttt toAdd = new ttt(value);
            rear.next = toAdd;
            rear = toAdd;
        }

        size++;
    }

    public void addFirst(int value)
    {
        if (head == null)
        {
            head = new ttt(value);
            rear = head;
        } else 
        {
            ttt toAdd = new ttt(value);
            toAdd.next = head;
            rear = head;
            head = toAdd;

        }

        size++;
    }

    public int popLast()
    {
        if (size != 0)
        {
            size --;
            
            ttt curr = head;
            for (int i =0 ; i < size -1 ; i++)
            {
                curr = curr.next;
            }

            rear = curr;
            rear.next = null;

            int tmpValue = rear.data;

            if (size == 0)
            {
                head = null;
                rear = null;
            }

            return tmpValue;
        } else {
            return -1;
        }
    }

    public void printOut()
    {

        if (size == 0)
        {
            System.out.println("[[]");
            return;
        }
        ttt curr = head;
        System.out.print("[ "  + curr.data);

        
           
        while (curr.next != null)
        {
            curr = curr.next;
            System.out.print( " , " + curr.data );
        }

        System.out.print("]");
    }
}
