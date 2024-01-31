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

        System.out.println("myQueue.peek() = " + myQueue.peek());
        System.out.println(myQueue.toString());

        System.out.println("myQueue.poll() = " + myQueue.poll());
        System.out.println(myQueue.toString());

        myQueue.add(7);
        myQueue.add(8);
        myQueue.add(9);
        myQueue.add(10);
        myQueue.add(11);
        myQueue.add(12);
        myQueue.add(13);
        System.out.println(myQueue.toString());

        myQueue.clear();
        System.out.println(myQueue.toString());

        myQueue.add(14);
        myQueue.add(15);
        myQueue.add(16);
        System.out.println(myQueue.toString());
    }
}
