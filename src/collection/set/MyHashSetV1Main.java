package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(16);
        set.add(17);
        System.out.println(set);

        int searchValue =16;
        boolean result = set.remove(searchValue);
        System.out.println("delete searchValue= "+result);
        int searchValue2 = 1;
        boolean resultContains = set.contains(searchValue2);
        System.out.println("contains searchValue= "+ resultContains);



    }
}
