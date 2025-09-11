package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);

        Integer a = map.get("a");
        System.out.println("a = " + a);
        Set<String> strings = map.keySet();
        for(Object key : strings) {
            Integer value = map.get(key);
            System.out.println("key = " + key + " value = " + value);
        }
        Collection<Integer> values = map.values();
        for(Integer value : values) {
            System.out.println("value = " + value);
        }
    }
}
