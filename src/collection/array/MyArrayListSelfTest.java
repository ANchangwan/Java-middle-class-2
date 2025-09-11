package collection.array;

import java.util.Arrays;

public class MyArrayListSelfTest<E> {
    private E[] elements;
    private int size;

    public MyArrayListSelfTest(E[] elements) {
        this.elements = elements;
    }
    public MyArrayListSelfTest(int size, E[] elements) {
        this.elements = (E[]) elements[size];
    }

    public E get(int index) {
        return elements[index];
    }
    public void set(int index, E element) {
        elements[index] = element;
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E element) {
        if (size == elements.length) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    public void add(int index, E element) {
        if(size == elements.length) {
            grow();
        }
        shift(index);
        elements[index] = element;
        size++;
    }

    private void shift(int index) {
        for(int i = size; i > index; i--) {
            elements[i] = elements[i + 1];
        }
    }

    private void grow() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }


    public E remove(int index, E element) {
        E oldElement = elements[index];
        unshift(index);
        size--;
        elements[size] = null;
        return oldElement;
    }

    private void unshift(int index) {
        for(int i = index; i < elements.length; i++) {
            elements[i] = elements[i + 1];
        }
    }

}
