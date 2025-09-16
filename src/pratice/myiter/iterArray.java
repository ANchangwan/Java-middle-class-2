package pratice.myiter;

import java.util.Iterator;

public class iterArray implements Iterable<Integer> {
    private int[] array;

    public iterArray(int [] array) {
        this.array = array;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new ArrayIterator(array);
    }
}
