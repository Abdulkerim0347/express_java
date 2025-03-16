package generics;

import java.util.HashMap;
import java.util.Map;

public class GenericMap {

    public static <K,V> void printMap(Map<K,V> map) {
        for (Map.Entry<K,V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("John",1);
        map1.put("Alice",2);
        map1.put("James",3);
        printMap(map1);
    }
}
