package pratice.Iterator;

import java.util.Iterator;

public class ArrayMain {
    public static void main(String[] args) {
        int[] arrs = new int[]{1, 2, 3, 4, 5};
        ArrayIterable arrayIterable = new ArrayIterable(arrs);
         Iterator<Integer> arr = arrayIterable.iterator();

        for (Integer s : arrs) {
            System.out.println(s);
        }


    }
}
