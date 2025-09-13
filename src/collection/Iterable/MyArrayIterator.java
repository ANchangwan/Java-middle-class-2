package collection.Iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {
    private int[] array;
    private int currentIndex = -1;

    public MyArrayIterator(int[] array) {
        this.array = array;
        //내가 순회하고 싶은 배열
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
