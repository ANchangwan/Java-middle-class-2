package pratice.Set;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class Set {
    private final int CAPACITY = 10;
    private LinkedList<Integer>[] set  = new LinkedList[CAPACITY];
    private int size = 0;

    public Set(int capacity) {
        set = new LinkedList[capacity];
        extracted();
    }
    public Set() {
        this.set = new LinkedList[CAPACITY];
        extracted();
    }

    private void extracted() {
        for(int i =0; i < CAPACITY; i++){
            set[i] = new LinkedList<>();
        }
    }

    public boolean add(Integer value){
        Integer hashCode = hashCode(value);
        LinkedList<Integer> hash = set[hashCode];
        if(set[hashCode].contains(value)){
            return false;
        }
        hash.add(value);
        size++;
        return true;
    }

    public boolean contains(Integer value){
        Integer hashCode = hashCode(value);
        LinkedList<Integer> hash = set[hashCode];
        return hash.contains(value);
    }

    public boolean remove(Integer value){
        Integer hashCode = hashCode(value);
        LinkedList<Integer> hash = set[hashCode];
        boolean result = hash.remove(value);
        if(result){
            size--;
            return true;
        }else{
            return false;
        }
    }

    public Integer hashCode(Integer value) {
        return Math.abs(value.hashCode()) % CAPACITY;
    }

    @Override
    public String toString() {
        return "Set{" +
                "CAPACITY=" + CAPACITY +
                ", set=" + Arrays.toString(set) +
                '}';
    }
}
