package collection.set;

import java.util.Arrays;

public class HashStart4 {
    private static final int CAPACITY = 10;

    public static void main(String[] args) {
        System.out.println("hash(1) = " + hashIndex(1));
        System.out.println("hash(1) = " + hashIndex(1));
        System.out.println("hash(1) = " + hashIndex(1));
        System.out.println("hash(2) = " + hashIndex(3));
        System.out.println("hash(3) = " + hashIndex(5));
        System.out.println("hash(99) = " + hashIndex(99));

        Integer[] arr = new Integer[CAPACITY];
        add(arr, 1);
        add(arr, 2);
        add(arr, 3);
        add(arr, 14);
        System.out.println("Array: "+ Arrays.toString(arr));

        int hashIndex = hashIndex(14);
        System.out.println(arr[hashIndex]);

    }

    private static void add(Integer[] arr, int value) {
        int index = hashIndex(value);
        arr[index] = value;
    }

    public static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
