package myLinkedList;

import java.util.*;

public class DemoMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(6);

        System.out.println("myLinkedList = " + myLinkedList);
        System.out.println("myLinkedList.size() = " + myLinkedList.size());

        System.out.println("myLinkedList.get(1) = " + myLinkedList.get(1));//starts searching from the head
        System.out.println("myLinkedList.get(4) = " + myLinkedList.get(4));//starts searching from the tail

        myLinkedList.remove(1);
        System.out.println("myLinkedList.size() after remove(1) = " + myLinkedList.size());
        myLinkedList.remove(4);
        System.out.println("myLinkedList.size() after remove(4) = " + myLinkedList.size());

        System.out.println("myLinkedList = " + myLinkedList);

        myLinkedList.clear();
        System.out.println("myLinkedList after clear() = " + myLinkedList);

        myLinkedList.add(7);
        myLinkedList.add(8);
        myLinkedList.add(9);
        System.out.println("myLinkedList = " + myLinkedList);
    }
}
