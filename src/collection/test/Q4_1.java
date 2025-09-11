package collection.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Q4_1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> result = new ArrayList<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기",1000);
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue().equals(1000)) {
                result.add(entry.getKey());
            }
        }
        System.out.println(result);
    }
}
