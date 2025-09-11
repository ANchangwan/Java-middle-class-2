package collection.set;

import collection.set.member.MyHashSetV3;

public class MyHashSetMain {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>();
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println(set);

        String searchValue = "a";
        boolean result = set.contains(searchValue);
        System.out.println(result);

    }
}
