package collection.test.q7;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<Product, Integer> map = new HashMap<>();


    public void add(Product member, int quantity) {
        map.put(member, map.getOrDefault(member, 0) + quantity);
    }

    public void minus(Product member, int quantity) {
        map.put(member, map.getOrDefault(member, 0) - quantity);
        if(map.get(member) <= 0) {
            map.remove(member);
        }
    }

    public void printAll() {


    }
}
