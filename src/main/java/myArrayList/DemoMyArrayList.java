package myArrayList;

public class DemoMyArrayList {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>(String.class);
        myArrayList.add("Hello");
        myArrayList.add("Dima!");
        myArrayList.add("How");
        myArrayList.add("are");
        myArrayList.add("you");
        myArrayList.add("?");

        for(int i = 0; i < myArrayList.size(); i++){
            System.out.println("myArrayList.get(" + i + ") = " + myArrayList.get(i));
        }

        myArrayList.clear();

        myArrayList.add("Hello");
        myArrayList.add("Dima!");
        myArrayList.add("How");
        myArrayList.add("are");

        for(int i = 0; i < myArrayList.size(); i++){
            System.out.println("myArrayList.get(" + i + ") = " + myArrayList.get(i));
        }
    }
}
