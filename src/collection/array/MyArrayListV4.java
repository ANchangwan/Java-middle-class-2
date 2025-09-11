package collection.array;

import java.util.Arrays;

public class MyArrayListV4 <E> {
    private static final int DEFAULT_CAPACITY = 3;
    private E[] elementData;
    private int size = 0;


    public MyArrayListV4() {
        elementData = (E[]) new Object[DEFAULT_CAPACITY];
    }
    public MyArrayListV4(int capacity) {
        elementData = (E[]) new Object[capacity];
    }

    public int size(){
        return size;
    }

    public void add(E element) {
        try{
            if(elementData.length == size){
                grow();
            }
            elementData[size] = element;
            size++;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void add(int index,E element) {
        try{
            if(elementData.length == size){
                grow();
            }
            shift(index);
            elementData[size] = element;
            size++;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public E remove(int index) {
        E oldData = get(index);
        unshift(index);
        size--;
        elementData[size] = null;
        return oldData;
    }

    private void unshift(int index) {
        for(int i = index; i < size+1; i++){
            elementData[i] = elementData[i+1];
        }
    }


    private void shift(int index) {
        for(int i = size; i > index; i--){
            elementData[i] = elementData[i - 1];
        }
    }

    private void grow() {
        int newSize = elementData.length * 2;
        elementData  = Arrays.copyOf(elementData, newSize);
    }

    public E get(int index) {
        return (E) elementData[index];
    }

    public E set(int index, E element) {
        E old = (E) elementData[index];
        elementData[index] = element;
        return old;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                "size= "+size + "capacity= " +
                elementData.length;
    }

}
