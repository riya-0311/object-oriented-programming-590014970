package collection;

import java.util.*;

public class Sortedset{
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Insertion
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);

        // Searching
        System.out.println("Contains 2? " + treeSet.contains(2));

        // Updation (not direct)
        treeSet.remove(2);
        treeSet.add(10);

        // Deletion
        treeSet.remove(3);

        // Traversal (sorted)
        System.out.println("Sorted Set:");
        for (int x : treeSet) {
            System.out.println(x);
        }
    }
}
