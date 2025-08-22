package prof_camp.D5.HW;

//25 N'Tonkla
public class MyLinkedList {

    public Node head;
    public int size;

    public MyLinkedList()
    {
        this.head = null;
        this.size = 0;
    }

    public void addFirst(int data)
    {
        if(size == 0)
        {
            head = new Node(data);
            head.next = null;
        } else 
        {
            Node tmp = new Node(data);
            tmp.next = head;

            head = tmp;
        }

        size ++;
    }

    public void addLast(int data)
    {
        if(size == 0)
        {
            head = new Node(data);
            head.next = null;
        } else 
        {
            Node curr = head;
            while (curr.next != null) 
            {
                curr = curr.next;    
            }

            Node toAdd = new Node(data);
            toAdd.next = null;
            curr.next = toAdd;
            
        }

        size++;
    }

    public void insertAt(int pos , int data)
    {
        Node curr = head;
        for (int i = 1 ;  i < pos ; i++)
        {
            curr = curr.next;
        }

        Node toAdd = new Node(data);
        Node tmp = curr.next;

        curr.next = toAdd;
        toAdd.next = tmp;

        size ++;

    }

     public void set(int pos , int data)
    {
        Node curr = head;
        for (int i = 0 ;  i < pos ; i++)
        {
            curr = curr.next;
        }

        curr.data = data;

    }

    public int get(int pos)
    {
        Node curr = head;
        for (int i = 0 ; i < pos ; i++)
        {
            curr = curr.next;
        }

        return curr.data;
    }

    public void removeFirst()
    {
        if(head == null)
        {
            return;
        } else 
        {
            head = head.next;

        }

        size --;
    }

    public void removeLast()
    {
        if(size == 0)
        {
            return;
        } else 
        {
            Node curr = head;
            //remove head and last
            //get prev last
            for (int i = 0 ; i < size -1 -1 ; i++)
            {
                curr = curr.next;
            }

            curr.next = null;
        }
        size --;
    }

    public void removeAt(int pos)
    {
        if(head == null)
        {
            return;
        } else 
        {
            Node curr = head;

            if (size == 1 )
            {
                head = null;

            }

            for (int i = 0 ; i < pos -1 ; i ++)
            {
                curr = curr.next;
            }

            // System.out.println(curr.data);
            if( curr == head)
            {
                head = curr.next;
            } else 
            {
                curr.next = (curr.next != null) ? curr.next.next : null;    

            }
        }

        size --;
    }

    public void printList()
    {
        if(size == 0)
        {
            System.out.println("[[]");
        } else 
        {
            System.out.print("[");
            Node curr = head;
            System.out.print(curr.data);

            while (curr.next != null) {
                curr = curr.next;
                System.out.print(" -> " + curr.data );
            }

            System.out.print("]");
            System.out.println("");
        }
    }

    public int indexOf(int value)
    {
        if (size == 0)
        {
            return -1;
        } 
        
        Node curr = head;
        
        for (int i = 0 ; i < size ; i ++)
        {
            if ( curr.data == value)
            {
                return i;
            }

            curr = curr.next;
        }

        return -1;
        
    }
}

class Node
{
    public int data;
    public Node next;

    public Node(int data)
    {
        this.data = data;
    }
}
