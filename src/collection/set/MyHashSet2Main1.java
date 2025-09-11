package collection.set;

public class MyHashSet2Main1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        set.add("B");
        set.add("A");
        set.add("C");
        set.add("D");
        set.add("AB");
        set.add("SET");
        System.out.println(set);

        System.out.println("A.hashcode()= "+"A".hashCode());

        String searhValue = "SET";
        boolean result = set.contains(searhValue);
        System.out.println("result contains: "+result);
    }
}
