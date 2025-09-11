package collection.set.javaset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Q3 {
    public static void main(String[] args) {

        TreeSet<Integer> hashSet = new TreeSet<>(List.of(30, 20, 20, 10, 10, 10));


        for(Integer i : hashSet) {
            System.out.println(i);
        }
    }
}
