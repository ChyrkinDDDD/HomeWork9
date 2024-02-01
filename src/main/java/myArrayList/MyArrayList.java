package myArrayList;

import java.util.Arrays;

public class MyArrayList<T> {
    private final int DEFAULT_CAPACITY = 10;
    private T[] values;
    private int size = 0;

    public MyArrayList(){
        values = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void add(T value){
        if(size >= values.length)
            values = Arrays.copyOf(values,values.length+DEFAULT_CAPACITY);

        values[size] = value;
        size++;
    }

    public void remove(int index){
//        size--;
//
//        if(indexRemoveElement == 0) {
//            values = Arrays.copyOfRange(values, 1, values.length);
//            return;
//        }
//
//        if(indexRemoveElement == values.length-1){
//            values = Arrays.copyOfRange(values,0,values.length-1);
//            return;
//        }
//
//        T[]tmp1 = Arrays.copyOfRange(values,0,indexRemoveElement);
//        T[]tmp2 = Arrays.copyOfRange(values,indexRemoveElement+1,values.length);
//        values = Arrays.copyOf(tmp1,values.length-1);
//        System.arraycopy(tmp2, 0, values, tmp1.length, tmp2.length);

        System.arraycopy(values,index + 1,values,index,values.length-index-1);
        values[values.length-1] = null;
        size--;

    }

    public T get(int index){
            return values[index];
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
