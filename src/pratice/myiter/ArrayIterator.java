package pratice.myiter;

import java.util.Iterator;

public class ArrayIterator implements Iterator<Integer> {
    private int[] array;
    private int currentIndex = -1;

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
