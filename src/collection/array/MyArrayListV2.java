package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {
    private static final int DEFAULT_CAPACITY = 3;
    private Object[] elementData;
    private int size = 0;

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayListV2(int capacity) {
        elementData = new Object[capacity];
    }

    public int size(){
        return size;
    }

    public void add(Object element) {
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

   private void grow() {
        int newSize = elementData.length * 2;
        elementData  = Arrays.copyOf(elementData, newSize);
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object old = elementData[index];
        elementData[index] = element;
        return old;
    }

    public int indexOf(Object element) {
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
