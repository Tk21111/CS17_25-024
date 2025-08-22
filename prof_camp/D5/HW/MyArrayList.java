package prof_camp.D5.HW;

import java.util.*;

//25 N'Tonkla

public class MyArrayList {

    int[] data;
    int size ;
    int MAX_SIZE = 5;

    public MyArrayList()
    {
        data = new int[MAX_SIZE];
        size = 0;
    }

    public void checkAndAddMoreSpace()
    {
        if (size == MAX_SIZE)
        {
            int[] newData = new int[MAX_SIZE *2];
            for (int i = 0 ; i < size ; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }

    public void add(int value)
    {
        checkAndAddMoreSpace();
        // System.out.println(Arrays.toString(data));
        data[size] = value;
        size++;
    }

    public void insert(int pos , int value)
    {
        //ผมขี้เกียจ ขอบคุนคับ ;)
        int[] newData = new int[size+1];
        MAX_SIZE ++;
        
        for (int i = 0; i < pos ; i ++)
        {
            newData[i] = data[i]; 
        }

        newData[pos] = value;

        for (int i = pos; i < size ; i ++)
        {
            newData[i+1] = data[i]; 
        }

        data = newData;
        size ++;
    }

    public int size()
    {
        return size;
    }

    public void deleteByIndex(int pos)
    {
        for (int i = pos ; i < size -1  ; i++)
        {
            data[i] = data[i+1];
        }

        size--;
    }

    public int get(int pos)
    {
        if ( pos >= size || pos < 0)
        {
            return -1;
        }

        return data[pos];
    }

    public void set(int pos , int value)
    {
        data[pos] = value;
    }

    public int indexOf(int value)
    {
        for (int i = 0 ; i < data.length ; i++)
        {
            int tmp = data[i];
            if(tmp == value)
            {
                return i;
            }
        }

        return -1;
    }

    public void printArray()
    {
        System.out.print(data[0]);
        for (int i = 1 ; i < size ; i++)
        {
            System.out.print(" " + data[i]);
        }
        System.out.println("");
    }
}