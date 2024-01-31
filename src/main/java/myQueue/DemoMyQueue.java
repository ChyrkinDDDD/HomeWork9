package myQueue;

public class DemoMyQueue {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);
        myQueue.add(6);

        System.out.println(myQueue.toString());
        System.out.println("myQueue.size() = " + myQueue.size());

    }
}
