package myArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayList<T> {
    private T[] values;
    private int indexLastElement = 0;
    private Class<T> clazz;
    public MyArrayList(Class<T> clazz){
        this.clazz = clazz;
        values = (T[]) Array.newInstance(clazz,1);
    }

    public void add(T element){
        if(indexLastElement == 0){
            values[indexLastElement] = element;
            indexLastElement++;
            return;
        }

        values = Arrays.copyOf(values, values.length+1);
        values[indexLastElement] = element;
        indexLastElement++;
    }

    public T get(int index){
        return values[index];
    }
    public void clear(){
        values = (T[]) Array.newInstance(clazz,1);
        indexLastElement = 0;
    }

    public int size(){
        return values.length;
    }
}
