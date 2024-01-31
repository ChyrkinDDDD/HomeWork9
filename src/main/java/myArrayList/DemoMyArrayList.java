package myArrayList;
public class DemoMyArrayList {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        
        myArrayList.add("Hello");
        myArrayList.add("world");
        myArrayList.add("!");
        System.out.println("myArrayList.size() = " + myArrayList.size());
        System.out.println("myArrayList = " + myArrayList.toString());

        myArrayList.remove(3);//Error
        System.out.println("myArrayList after remove() = " + myArrayList.toString());

        myArrayList.remove(1);
        System.out.println("myArrayList after remove() = " + myArrayList.toString());

        myArrayList.add("some text");
        System.out.println("myArrayList add() after remove() = " + myArrayList.toString());

        System.out.println("myArrayList.get(0) = " + myArrayList.get(0));
        myArrayList.clear();
        System.out.println("myArrayList after clear() = " + myArrayList.toString());
    }
}
