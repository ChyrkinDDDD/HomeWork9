package myLinkedList;

public class MyLinkedList<T> {
    private int size;
    public void add(T element){
        size++;
    }

    public void remove(int index){
        size--;
    }

    public void clear(){
        size = 0;
    }

    public int size(){
        return size;
    }

    public T get(int index){
        return null;
    }
}
