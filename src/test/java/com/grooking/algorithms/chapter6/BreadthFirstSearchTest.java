package com.grooking.algorithms.chapter6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class BreadthFirstSearchTest {

    @Test
    public void shouldFindMangoSeller() {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("you", Arrays.asList("alice", "bob", "claire"));
        graph.put("bob", Arrays.asList("anuj", "peggy"));
        graph.put("alice", Arrays.asList("peggy"));
        graph.put("claire", Arrays.asList("thom", "jonny"));
        graph.put("anuj", Arrays.asList());
        graph.put("peggy", Arrays.asList());
        graph.put("thom", Arrays.asList());
        graph.put("jonny", Arrays.asList());

        assertThat(BreadthFirstSearch.search(graph, "you")).isEqualTo(true);
    }

}
