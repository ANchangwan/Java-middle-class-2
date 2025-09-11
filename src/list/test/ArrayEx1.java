package list.test;

import java.util.ArrayList;

public class ArrayEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(80);
        list.add(70);
        list.add(60);
        list.add(50);

        int total = 0;
        for(Integer i : list) {
            total += i;
        }
        System.out.println(total);
        System.out.println((double)total / list.size());
    }
}