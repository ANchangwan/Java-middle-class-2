package collection.set;

import java.util.Arrays;

public class HashStart3 {
    public static void main(String[] args) {
        Integer[] array = new Integer[100];
        array[1] = 1;
        array[2] = 2;
        array[5]= 5;
        array[8] = 8;
        array[99]= 99;
        array[88] = 88;



        System.out.println("Array ="+Arrays.toString(Arrays.copyOf(array, array.length)));
    }
    public static boolean contains(Integer[] array, int value) {
        return array[value] != null;
    }

    public static Integer search(Integer[] array, int value) {
        if (contains(array, value)) {
            return array[value];
        }
        return null;
    }
}
