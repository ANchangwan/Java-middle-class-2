package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    private static final int CAPACITY = 10;

    public static void main(String[] args) {
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];

        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        System.out.println("buckets : " + Arrays.toString(buckets));
        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 3);
        add(buckets, 14);
        add(buckets, 15);
        add(buckets, 9);
        add(buckets, 99);
        System.out.println("buckets : " + Arrays.toString(buckets));

    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
       int hashIndex = hashIndex(value);
       LinkedList<Integer> bucket = buckets[hashIndex]; //O(1)
       if (!bucket.contains(value)) { // O(n)
           bucket.add(value);
       }
    }

    private static boolean search(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    public static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
