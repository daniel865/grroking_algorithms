package com.grooking.algorithms.chapter7;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class DijkstraAlgorithmTest {

    @Test
    public void shouldFindShortestPath() {
        Map<String, Map<String, Integer>> graph = new HashMap<>();
        Map<String, Integer> costs = new HashMap<>();
        Map<String, String> parents =  new HashMap<>();

        // Graph
        graph.put("start", Stream.of(new Object[][]{
                {"a", 6},
                {"b", 2}
        }).collect(Collectors.toMap(p -> (String) p[0], p -> (Integer) p[1])));

        graph.put("a", Stream.of(new Object[][]{
                {"fin", 1}
        }).collect(Collectors.toMap(p -> (String) p[0], p -> (Integer) p[1])));

        graph.put("b", Stream.of(new Object[][]{
                {"a", 3 },
                {"fin", 5}
        }).collect(Collectors.toMap(p -> (String) p[0], p -> (Integer) p[1])));

        graph.put("fin", null);

        // Costs
        costs.put("a", 6);
        costs.put("b", 2);
        costs.put("fin", Integer.MAX_VALUE);

        // Parents
        parents.put("a", "start");
        parents.put("b", "start");
        parents.put("fin", null);
    }

    @Test
    public void shouldFindLowestCostNode() {
        Map<String, Boolean> processed = new HashMap<>();
        Map<String, Integer> costs = new HashMap<>();

        // Costs
        costs.put("a", 6);
        costs.put("b", 2);
        costs.put("fin", Integer.MAX_VALUE);

        assertThat(DijkstraAlgorithm.findLowestCostNode(costs, processed)).isNotNull();
    }


}
