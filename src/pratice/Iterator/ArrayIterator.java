package pratice.Iterator;

import java.util.Iterator;

public class ArrayIterator implements Iterator<Integer> {
    private int currentIndex = -1;
    private int[] array;
    private int size;


    public ArrayIterator(int[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length - 1;
    }

    @Override
    public Integer next() {
        return array[++currentIndex];
    }
}
