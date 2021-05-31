package com.grooking.algorithms.chapter2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SelectionSortTest {

    @Test
    public void shouldFindSmallest() {
        int[] arr = new int[]{ 5, 3, 1, 4 };
        assertThat(SelectionSort.findSmallest(arr)).isEqualTo(2);
    }

    @Test
    public void shouldMakeSelectionSort() {
        int[] arr = new int[]{ 5, 3, 1, 4 };
        int[] sortedArr = new int[]{ 1, 3, 4, 5 };

        assertThat(SelectionSort.selectionSort(arr)).isEqualTo(sortedArr);
    }

    @Test
    public void shouldRemoveIndex() {
        int[] arr = new int[]{ 5, 3, 1, 4 };
        int index = 2;

        assertThat(SelectionSort.removeIndex(arr, index)).isEqualTo(new int[]{5, 3, 4});
    }

    @Test
    public void shouldAddElement() {
        int[] arr = new int[]{ 5, 3, 1, 4 };
        int element = 2;

        assertThat(SelectionSort.addElement(arr, element)).isEqualTo(new int[]{5, 3, 1, 4, 2});
    }

}
