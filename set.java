package collection;

import java.util.*;

public class set{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Insertion
        set.add("A");
        set.add("B");

        // Searching
        System.out.println("Contains A? " + set.contains("A"));

        // Updation (not direct)
        set.remove("A");
        set.add("Z");

        // Deletion
        set.remove("B");

        // Traversal
        System.out.println("Set elements:");
        for (String s : set) {
            System.out.println(s);
        }
    }
}

