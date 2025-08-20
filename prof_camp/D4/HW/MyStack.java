package HW;

//25
public class MyStack {
   

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

		if (size < 0 )
		{
			size = 0;
			return -1;
		}

        int value = data[size];
        data[size] = 0;
        return value;
    }

    int peek()
    {
        return size <= 0 ? -1 : data[size -1];
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
			return "[]";
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size; i++) {
			sb.append(data[i]);
			if (i < size - 1)
				sb.append(", ");
		}
		sb.append("] (top -> ").append(data[size - 1]).append(")");
		return sb.toString();
	}

}
