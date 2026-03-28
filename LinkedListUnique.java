package collection;

import java.util.*;

public class LinkedListUnique {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list.add(x); 
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : list) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        System.out.println("Unique elements:");
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                System.out.println(e.getKey());
            }
        }

        sc.close();
    }
}
