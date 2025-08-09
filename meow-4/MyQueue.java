public class MyQueue {
    int[] data;
    int _size;
    int maxSize;
    int rear;
    int front;

    public MyQueue(int maxSize)
    {
        this.maxSize = maxSize;
        data = new int[maxSize];
        _size = 0;
        rear = -1;
        front = 0;

    }

    public void enqueue(int d)
    {
        if (_size == maxSize)
        {
            return;
        }

        _size++;

        rear = (rear +1) % maxSize;
        data[rear] = d;
    }

    public int dequeue()
    {
        int tmp = data[front];
        front = (front + 1 ) % maxSize;
        _size --;
        return tmp;
    }

    public int peek()
    {
        return data[front];
    }

    @Override
    public String toString()
    {
        String str ="[";
        for ( int i = 0 ; i < _size ; i++)
        {
            str += ( data[i] + " ");
        }

        str += "]";
        return str;
    }
}
