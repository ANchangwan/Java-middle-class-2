package collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        array[1] = 1;
        array[2] = 2;
        array[5]= 5;
        array[8] = 8;

        System.out.println("Array ="+Arrays.toString(Arrays.copyOf(array, array.length)));
    }
}
