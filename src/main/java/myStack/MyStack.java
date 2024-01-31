package myStack;

import java.util.Arrays;

public class MyStack<T> {
    private  final int DEFAULT_CAPACITY = 10;
    private T[] values;
    private int size = 0;

    public MyStack(){
        values = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void push(T value){
        if(size >= values.length)
            values = Arrays.copyOf(values,values.length+DEFAULT_CAPACITY);

        values[size] = value;
        size++;
    }

    public void remove(int index){
        System.arraycopy(values,index + 1,values,index,values.length-index-1);
        values[values.length-1] = null;
        size--;
    }

    public void clear(){
        values = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size(){
        return size;
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
