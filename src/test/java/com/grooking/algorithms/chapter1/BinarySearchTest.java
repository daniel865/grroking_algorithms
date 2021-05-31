package com.grooking.algorithms.chapter1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearchTest {

    @Test
    public void shouldFindItem() {
        int[] arr = new int[]{ 1, 3, 6, 7, 8 };
        int itemToFind = 6;
        assertThat(BinarySearch.binarySearch(arr, itemToFind)).isEqualTo(2);
    }

    @Test
    public void shouldNotFindItem() {
        int[] arr = new int[]{ 1, 3, 6, 7, 8 };
        int itemToFind = 5;
        assertThat(BinarySearch.binarySearch(arr, itemToFind)).isEqualTo(-1);
    }

}
