package collection.set.javaset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        HashSet<Integer> hashSet = new LinkedHashSet<>(List.of(inputArr));


        for(Integer i : hashSet) {
            System.out.println(i);
        }
    }
}
