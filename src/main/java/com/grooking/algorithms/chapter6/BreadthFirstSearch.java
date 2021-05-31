package com.grooking.algorithms.chapter6;

import java.util.*;

public class BreadthFirstSearch {

    public static boolean search(Map<String, List<String>> graph, String name) {
        Queue<String> searchQueue = new ArrayDeque();
        searchQueue.addAll(graph.get(name));
        Map<String, Boolean> searched = new HashMap<>();
        while (!searchQueue.isEmpty()) {
            String person = searchQueue.poll();
            if (!searched.containsKey(person)) {
                if (isMangoSeller(person)) {
                    System.out.println(person + " is a mango seller");
                    return true;
                } else {
                    searchQueue.addAll(graph.get(person));
                    searched.put(person, true);
                }
            }
        }
        return false;
    }

    public static boolean isMangoSeller(String name) {
        String substring = name.substring(name.length() - 1);
        return name.substring(name.length() - 1).equals("m");
    }

}
