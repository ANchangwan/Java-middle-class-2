package collection.utils;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortMain {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Collections.sort(list);

        System.out.println("min, max");
        Integer min = Collections.min(list);
        Integer max = Collections.max(list);
        System.out.println("min: " + min + " max: " + max);

        System.out.println("shuffle");
        Collections.shuffle(list);
        System.out.println("shuffle: "+list);



    }
}
