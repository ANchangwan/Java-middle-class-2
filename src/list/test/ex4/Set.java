package list.test.ex4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class Set<T> {
    private final int CAPACITY = 16;
    private LinkedList<T>[] bucket;
    private int size = 0;

    public Set(){
        bucket = new LinkedList[CAPACITY];
        extracted();
    }
    public Set(int capacity){
        bucket = new LinkedList[capacity];
        extracted();
    }

    private void extracted() {
        for(int i = 0; i < CAPACITY; i++){
            bucket[i] = new LinkedList<>();
        }
    }


    public boolean remove(T value){
        int hash = hashIndex(value);
        LinkedList<T> list = bucket[hash];
        if(list.contains(value)){
            list.remove(value);
            size--;
            return true;
        }
        return false;
    }

    public boolean contains(T value){
        int hash = hashIndex(value);
        LinkedList<T> list = bucket[hash];
        return list.contains(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Set<?> set = (Set<?>) o;
        return CAPACITY == set.CAPACITY && size == set.size && Objects.deepEquals(bucket, set.bucket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CAPACITY, Arrays.hashCode(bucket), size);
    }

    public int hashIndex(T index){
        return Math.abs((Integer) index) % CAPACITY;
    }
}
