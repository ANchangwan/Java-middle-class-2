package collection.set.javaset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q4 {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {3, 4, 5, 6, 7};

        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));
        set1.addAll(set2);

        Set<Integer> intersection = new HashSet<>(Arrays.asList(arr1));
        intersection.retainAll(set2);

        Set<Integer> difference = new HashSet<>(List.of(arr1));
        difference.removeAll(List.of(arr2));



        System.out.println(set1);
        System.out.println(intersection);
        System.out.println(difference);
    }
}
