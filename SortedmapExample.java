package collection;


import java.util.*;

public class SortedmapExample{
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Insertion
        treeMap.put(3, "C");
        treeMap.put(1, "A");
        treeMap.put(2, "B");

        // Updation
        treeMap.put(2, "Z");

        // Searching
        System.out.println("Value at key 2: " + treeMap.get(2));

        // Deletion
        treeMap.remove(3);

        // Traversal (sorted)
        System.out.println("Sorted Map:");
        for (Map.Entry<Integer, String> e : treeMap.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}


