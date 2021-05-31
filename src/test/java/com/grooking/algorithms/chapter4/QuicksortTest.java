package com.grooking.algorithms.chapter4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QuicksortTest {

    @Test
    public void shouldMakeQuicksort() {
        int[] arr = new int[]{ 5, 1, 4, 3 };

        assertThat(Quicksort.quicksort(arr)).isEqualTo(new int[]{1, 3, 4, 5});
    }

    @Test
    public void shouldFindElementsInArrayLessThanItem() {
        int[] arr = new int[]{ 5, 1, 4, 3 };
        int item = 2;

        assertThat(Quicksort.lessThanItem(arr, item)).isEqualTo(new int[]{1});
    }

    @Test
    public void shouldFindElementsGreaterThanItem() {
        int[] arr = new int[]{ 5, 1, 4, 3 };
        int item = 2;

        assertThat(Quicksort.greaterThanItem(arr, item)).isEqualTo(new int[]{5, 4, 3});
    }

}
