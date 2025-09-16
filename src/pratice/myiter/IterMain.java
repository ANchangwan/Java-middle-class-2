package pratice.myiter;

import java.util.Iterator;

public class IterMain {
    public static void main(String[] args) {
        iterArray array = new iterArray(new int[]{1,2,3,4});
        Iterator<Integer> iterator = array.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
