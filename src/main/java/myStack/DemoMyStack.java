package myStack;

public class DemoMyStack {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        myStack.push(9);
        myStack.push(10);

        myStack.remove(0);
        myStack.remove(4);

        System.out.println("myStack = " + myStack.toString());

        System.out.println("myStack.peek() = " + myStack.peek());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack = " + myStack.toString());

        myStack.clear();
        System.out.println("myStack after clear: " + myStack.toString());
    }
}
