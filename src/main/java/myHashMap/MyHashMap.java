package myHashMap;

import java.util.LinkedList;
import java.util.Map;

public class MyHashMap<K,V> {
    private static final int DEFAULT_SIZE = 8;
    private Entry<K,V>[] entries = new Entry[DEFAULT_SIZE];
    private int size = 0;
    public void put(K key, V value){
        int index = getBucketIndex(key);
        Entry<K,V> entry = new Entry<>(key, value);
        if(entries[index] == null ) {
            entries[index] = entry;
            size++;
        }
        if( entries[index].key.equals(key))
            entries[index] = entry;
        else{
            Entry<K,V> temp = entries[index];
            while (true){
                if(temp.key.equals(key)){
                    temp.value = value;
                    return;
                }
                else if (temp.next == null) {
                    break;
                } else
                    temp = temp.next;
            }

            temp.next = entry;
            size++;
        }
    }
    public void remove(K key){
        int index = getBucketIndex(key);

        if(entries[index] == null)
            return;

        if(entries[index].key.equals(key)) {
            if(entries[index].next != null) {
                entries[index] = entries[index].next;
            }
            else
                entries[index] = null;
            size--;
        }
        else {
            Entry<K,V> temp1 = entries[index];

            if(temp1.next == null){
                return;
            }
            Entry<K,V> temp2 = entries[index].next;

            while (true){
                if(temp2.key.equals(key)){
                    if(temp2.next == null){
                        temp1.next = null;
                    }
                    else {
                        temp1.next = temp2.next;
                    }
                    size--;
                }
                else if(temp2.next == null)
                    break;
                else
                    temp1 = temp2;
                    temp2 = temp2.next;
            }
        }

    }
    public void clear(){
        entries = new Entry[DEFAULT_SIZE];
        size = 0;
    }
    public int size(){
        return size;
    }
    public V get(K key){
        int index = getBucketIndex(key);
        if(entries[index] == null)
            return null;
        if(entries[index].key.equals(key))
            return entries[index].value;
        else{
            Entry<K,V> temp = entries[index].next;
            while (true){
                if(temp.key.equals(key)){
                    return temp.value;
                }
                else if(temp.next == null)
                    break;
                else
                    temp = temp.next;
            }
        }
        return null;
    }

    private int getBucketIndex(K key){
        return Math.abs(key.hashCode() % entries.length);
    }

    private static class Entry<K,V>{
        K key;
        V value;
        Entry<K,V> next;
        public Entry(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
}
