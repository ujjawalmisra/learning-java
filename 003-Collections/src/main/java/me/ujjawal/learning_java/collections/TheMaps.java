package me.ujjawal.learning_java.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TheMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Davien", 20);
        map.put("Rajat", 21);
        map.put("Deepika", 21);
        map.put("Pallavi", 20);

        map.putIfAbsent("Davien", 21);

        System.out.println("~~~~ Lookup ~~~~");
        for (String key : Arrays.asList("Davien", "Pallavi", "Deepika", "Alu")) {
            System.out.println(key + " --> " + map.getOrDefault(key, -1));
        }

        System.out.println("~~~~ All elements ~~~~");
        for (String key : map.keySet()) {
            System.out.println(key + " --> " + map.get(key));
        }

        System.out.println("~~~~ EntrySet ~~~~");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }
}
