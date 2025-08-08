package com.aryan.OOPs.Vector;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        List<Integer> list2 = new LinkedList<>();
        list2.add(38);
        list2.add(40);
        list2.add(80);
        list2.add(90);

        System.out.println(list2);

        // In ArrayList, multiple thread can access the same object,
        // so ArrayList is not synchronized
        // For the above reason, ArrayList is preferred over Vector;
        // Vector is synchronized, only one thread can access at a time
        //  if the other thread tries to access,
        //  it has to wait until the first one completes it's task.
        Vector<Integer> vector = new Vector<>();
        vector.add(100);
        vector.add(103);
        vector.add(106);
        vector.add(110);

        System.out.println(vector);
    }
}
