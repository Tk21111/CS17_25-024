package HW;

public class HW2D4_25NTonkla {

}

class MyStack {

    int[] data;
    int MAXSIZE;
    int size;

    MyStack(int maxsize)
    {
        MAXSIZE = maxsize;
        data = new int[maxsize];
        size = 0;
    }

    void push(int item)
    {
        if ( size >= MAXSIZE)
        {
            return;
        }

        data[size] = item;
        size ++;

    }

    int pop()
    {
        size --;
        int value = data[size];
        data[size] = 0;
        return value;
    }

    int peek()
    {
        return data[size];
    }

    boolean isEmtry()
    {
        return size <= 0;
    }

    int getSize()
    {
        return size;
    }
}

class MyQueue 
{
    int[] data;
    int front = 0;
    int rear = -1;
    int MAXSIZE;
    int size;

    MyQueue(int maxSize)
    {
        MAXSIZE = maxSize;
        size = 0;
        data = new int[maxSize];
    }

    void enqueue(int item)
    {
        size ++;

        rear = (rear + 1) % MAXSIZE;
        data[rear] = item;
    }

    int dequeue()
    {
        size --;
        int value = data[front];

        front = ( front + 1) % MAXSIZE;

        return value;
    }

    int peek()
    {
        return data[front];
    }

    boolean isEmtry()
    {
        return size == 0;
    }

    int getSize()
    {
        return size;
    }
}