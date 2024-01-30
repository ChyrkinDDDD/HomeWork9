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

    public void remove(int indexRemoveElement){

        try {
            if (indexRemoveElement >= values.length)
                throw new IndexOutOfBoundsException("out of bounds!");
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            return;
        }

        indexLastElement--;

        if(indexRemoveElement == 0) {
            values = Arrays.copyOfRange(values, 1, values.length);
            return;
        }

        if(indexRemoveElement == values.length-1){
            values = Arrays.copyOfRange(values,0,values.length-1);
            return;
        }

        T[]tmp1 = Arrays.copyOfRange(values,0,indexRemoveElement);
        T[]tmp2 = Arrays.copyOfRange(values,indexRemoveElement+1,values.length);
        values = Arrays.copyOf(tmp1,values.length-1);
        System.arraycopy(tmp2, 0, values, tmp1.length, tmp2.length);

    }

    public T get(int index){
        try{
            return values[index];
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return null;
    }
    public void clear(){
        values = (T[]) Array.newInstance(clazz,1);
        indexLastElement = 0;
    }

    public int size(){
        return values.length;
    }

    @Override
    public String toString(){
        return Arrays.toString(values);
    }
}
