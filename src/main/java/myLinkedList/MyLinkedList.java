package myLinkedList;

import java.util.Objects;

public class MyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;
    public void add(T element){
        Node<T> node = new Node<>(element);

        if(head == null){
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        size++;
    }

    public void remove(int index){
        Objects.checkIndex(index,size);

        Node<T> nodeByIndex = null;
        Node<T> nextNode = null;
        Node<T> previousNode = null;

        if(index < size / 2) {
            nodeByIndex = head;
            for (int i = 0; i < index; i++) {
                nodeByIndex = nodeByIndex.next;
            }
        }
        else{
            nodeByIndex = tail;
            for (int i = 0; i < size - index - 1; i++) {
                nodeByIndex = nodeByIndex.previous;
            }
        }

        if(nodeByIndex.next == null) {
            previousNode = nodeByIndex.previous;
            previousNode.next = null;
            tail = previousNode;
        }
        else if(nodeByIndex.previous == null){
            nextNode = nodeByIndex.next;
            nextNode.previous = null;
            head = nextNode;
        }
        else {
            nextNode = nodeByIndex.next;
            previousNode = nodeByIndex.previous;
            previousNode.next = nextNode;
            nextNode.previous = previousNode;
        }

        size--;
    }

    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public T get(int index){
        Objects.checkIndex(index, size);
        Node<T> current = null;
        if(index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        }
        else{
            current = tail;
            for (int i = 0; i < size - index - 1; i++) {
                current = current.previous;
            }
        }

        return current.value;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<T> current = head;
        for (int i = 0; i < size; i++) {
            if(i < size-1) {
                result.append(current.value).append(", ");
                current = current.next;
            }
            else
                result.append(current.value);
        }
        result.append("]");
        return result.toString();
    }

    public static class Node<T>{
        private T value;
        private Node<T> next;
        private Node<T> previous;

        public Node(T value){
            this.value = value;
        }
    }
}
