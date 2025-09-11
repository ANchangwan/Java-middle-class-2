package collection.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Q1 {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"},
                {"JPA", "30000"}};

        Map<String, Integer> map = new HashMap<>();
        for(String[] arr : productArr){
            map.put(arr[0], Integer.valueOf(arr[1]));
        }
         Set<String> key = map.keySet();
        for(String product : key){
            Integer value = map.get(product);
            System.out.println("제품 : " + product+ ", 가격 : "  + value);
        }
    }
}
