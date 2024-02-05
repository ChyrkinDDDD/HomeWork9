package myHashMap;

public class DemoMyHashMap {
    public static void main(String[] args) {
        MyHashMap<Integer,String> myHashMap = new MyHashMap<>();
        myHashMap.put(1,"one");
        System.out.println("myHashMap.get(1) = " + myHashMap.get(1));

        myHashMap.put(1,"One");
        myHashMap.put(2,"Two");
        myHashMap.put(3,"Three");
        myHashMap.put(4,"Four");
        System.out.println("myHashMap.get(1) = " + myHashMap.get(1));
        System.out.println("myHashMap.size() = " + myHashMap.size());

        System.out.println("myHashMap.get(5) = " + myHashMap.get(5));
        myHashMap.remove(1);
        System.out.println("myHashMap.get(1) = " + myHashMap.get(1));
        System.out.println("myHashMap.size() = " + myHashMap.size());
    }
}
