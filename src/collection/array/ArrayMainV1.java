package collection.array;

import java.util.Arrays;

public class ArrayMainV1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr1 = new int[arr.length+1];
        for(int i =0; i < arr.length; i++){
            arr[i] = i+1;
        }
        arr1[0] = 5;
        for(int i = 0; i < arr.length; i++){
                arr1[i+1] = arr[i];

        }
        System.out.println(Arrays.toString(arr1));
    }
}
