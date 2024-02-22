package CollectionsExample;

import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("John", 70);
        map.put("Tom", 60);
        map.put("Lee", 99);
        map.put("Brod", 88);

        Set<String> keySet = map.keySet();
        System.out.println("Key:" + keySet);

        Collection<Integer> values = map.values();
        System.out.println("Values:" + values);

        for(String key : keySet) {
            System.out.println("Key:" + key + " And Value:" + map.get(key));
        }
    }
}
