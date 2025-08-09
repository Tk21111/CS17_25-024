public class Mystack 
{
    int[] data;
    int _size;
    int maxSize;

    public Mystack(int maxSize)
    {
        this.maxSize = maxSize;
        data = new int[maxSize];
        _size = 0;
    }

    public void push(int d)
    {
        if (_size >= maxSize)
        {
            return;
        }
        data[_size] = d;
        _size++;
    }

    public void push(int... d)
    {
        for (int i : d)
        {
            push(i);
        }
    }

    public int pop()
    {
        _size --;
        int value = data[_size];
        data[_size] = 0;

        return value;
    }

    public int peak()
    {
        return data[_size -1];
    }

    public boolean isEmtry()
    {
        return _size <= 0;
    }

    public int size()
    {
        return _size;
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
