package list.test.ex4;

public class hashMain {
    public static void main(String[] args) {
        Set<Object> set1 = new Set<>();
        Set<Object> set2 = new Set<>();

        System.out.println(set1.hashIndex("hello3".hashCode()));
        System.out.println(set1.hashIndex("world".hashCode()));
    }
}
