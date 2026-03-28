package collection;

import java.util.*;

public class MapExample{
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Insertion
        map.put(1, "A");
        map.put(2, "B");

        // Updation
        map.put(1, "Z");

        // Searching
        System.out.println("Value at key 1: " + map.get(1));
        System.out.println("Contains key 2? " + map.containsKey(2));

        // Deletion
        map.remove(2);

        // Traversal
        System.out.println("Map elements:");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
} 
    

