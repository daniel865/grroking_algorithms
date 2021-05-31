package com.grooking.algorithms.chapter7;

import java.util.HashMap;
import java.util.Map;

public class DijkstraAlgorithm {

    public static int findShortestPath(Map<String, Map<String, Integer>> graph, Map<String, Integer> costs, Map<String, String> parents) {
        Map<String, Boolean> processed = new HashMap<>();
        Map.Entry<String, Integer> node = findLowestCostNode(costs, processed);
        while (node != null) {
            Integer cost = costs.get(node.getKey());
            Map<String, Integer> neighbors = graph.get(node.getKey());
            for (Map.Entry<String, Integer> n : neighbors.entrySet()) {
                Integer newCost = cost + neighbors.get(n.getKey());
                if (costs.get(n.getKey()) > newCost) {
                    costs.put(n.getKey(), newCost);
                    parents.put(n.getKey(), node.getKey());
                }
            }
            processed.put(node.getKey(), Boolean.TRUE);
            node = findLowestCostNode(costs, processed);
        }
        return 0;
    }

    public static Map.Entry<String, Integer> findLowestCostNode(Map<String, Integer> costs, Map<String, Boolean> processed) {
        Integer lowestCost = Integer.MAX_VALUE;
        Map.Entry<String, Integer> lowestCostNode = null;
        for (Map.Entry<String, Integer> node : costs.entrySet()){
            Integer cost = costs.get(node.getKey());
            if (cost < lowestCost && !processed.containsKey(node.getKey())) {
                lowestCost = cost;
                lowestCostNode = node;
            }
        }
        return lowestCostNode;
    }

}
