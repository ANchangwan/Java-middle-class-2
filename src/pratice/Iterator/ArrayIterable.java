package pratice.Iterator;

import java.util.Iterator;

public class ArrayIterable  implements Iterable<Integer> {
    private int[] array;
    public ArrayIterable(int[] array) {
        this.array = array;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ArrayIterator(array);
    }
}
