package com.grooking.algorithms.chapter4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExercisesTest {

    @Test
    public void shouldSumArray() {
        int[] arr = new int[]{ 2, 5, 1, 3 };

        assertThat(Exercises.sum(arr)).isEqualTo(11);
    }

    @Test
    public void shouldCountArray() {
        int[] arr = new int[]{ 2, 5, 1, 3 };

        assertThat(Exercises.count(arr)).isEqualTo(4);
    }

    @Test
    public void shouldFindMaximum() {
        int[] arr = new int[]{ 2, 5, 1, 3 };

        assertThat(Exercises.maximum(arr)).isEqualTo(5);
    }

}
