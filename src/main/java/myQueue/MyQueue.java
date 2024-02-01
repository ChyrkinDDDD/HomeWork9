package myQueue;

import java.util.Arrays;

public class MyQueue<T>{
    private final int DEFAULT_CAPACITY = 10;
    private T[] values;
    private int size;

    public MyQueue(){
        values = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(T value){
        if(size >= values.length)
            values = Arrays.copyOf(values,values.length+DEFAULT_CAPACITY);

        values[size] = value;
        size++;
    }

    public void clear(){
        values = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size(){
        return size;
    }

    public T peek(){
        return values[0];
    }

    public T poll(){
        T returnValue = values[0];
        //values = Arrays.copyOfRange(values,1, values.length);
        System.arraycopy(values,1,values,0, size);
        size--;
        return returnValue;
    }

    @Override
    public String toString() {
        StringBuilder returnValue = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            if(i == size - 1){
                returnValue.append(values[i].toString());
            }
            else {
                returnValue.append(values[i].toString()).append(", ");
            }
        }
        returnValue.append("]");

        return returnValue.toString();
    }
}
