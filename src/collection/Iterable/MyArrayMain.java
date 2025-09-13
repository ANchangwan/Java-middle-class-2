package collection.Iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray array = new MyArray(new int[]{1,2,3,4,5});
        Iterator<Integer> iterator = array.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
