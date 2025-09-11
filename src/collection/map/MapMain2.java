package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2{
    public static void main(String[] args) {
        Map<String, Integer> map  = new HashMap<>();
        map.put("a", 1);
        map.put("a", 2);
        System.out.println(map);
        boolean contains = map.containsKey("a");
        System.out.println("contain key : "+contains);

        map.putIfAbsent("ac", 3);
        System.out.println(map);
    }
}
