package collection.array;

import java.util.Arrays;

public class MyArrayListV3 {
    private static final int DEFAULT_CAPACITY = 3;
    private Object[] elementData;
    private int size = 0;

    public MyArrayListV3() {
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayListV3(int capacity) {
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
    public void add(int index,Object element) {
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
    public Object remove(int index) {
        Object oldData = get(index);
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
