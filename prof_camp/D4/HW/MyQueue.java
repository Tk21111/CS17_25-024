package HW;

//25 
public class MyQueue {

    int[] data;
    int front;
    int rear;
    int MAXSIZE;
    int size;

    MyQueue(int maxSize)
    {
        MAXSIZE = maxSize;
        size = 0;
        data = new int[maxSize];
        front = 0;
        rear = -1;
    }

    void enqueue(int item)
    {
        if ( size  == MAXSIZE)
        {
            return;
        } else if(size == -1)
        {
            rear = -1;
            front = 0;
        }
        size ++;

        rear = (rear + 1) % MAXSIZE;
        data[rear] = item;
    }

    int dequeue()
    {
        size --;
        int value = data[front];
        data[front] = 0;
        front = ( front + 1) % MAXSIZE;

        return size < 0 ? -1 : value;
    }

    int peek()
    {
        return size <= 0 ? -1 : data[front];
    }



    boolean isEmpty()
    {
        return size <= 0;
    }

    int getSize()
    {
        return size;
    }

    @Override
	public String toString() {
		if (isEmpty())
			return "[]]";

		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < MAXSIZE; i++) {
			// int index = (front + i) % MAXSIZE;
			int index =  i;
            // int index = i;
			sb.append(data[index]);
			if (i < MAXSIZE - 1)
				sb.append(", ");
		}
		sb.append("] (front -> ").append(data[front])
				.append(", rear -> ").append(data[rear]).append(")");
		return sb.toString();
	}
}
