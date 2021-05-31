package com.grooking.algorithms.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quicksort {

    public static int[] quicksort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        } else {
            int pivot = arr[0];
            int[] less = lessThanItem(arr, pivot);
            int[] greater = greaterThanItem(arr, pivot);

            return merge(quicksort(less), new int[]{pivot}, quicksort(greater));
        }
    }

    public static int[] lessThanItem(int[] arr, int item) {
        List<Integer> newArr = new ArrayList<Integer>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= item) {
                newArr.add(arr[i]);
            }
        }
        Integer[] array = newArr.toArray(new Integer[0]);
        return Arrays.stream(array).mapToInt(i -> i).toArray();
    }

    public static int[] greaterThanItem(int[] arr, int item) {
        List<Integer> newArr = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > item) {
                newArr.add(arr[i]);
            }
        }
        Integer[] array = newArr.toArray(new Integer[0]);
        return Arrays.stream(array).mapToInt(i -> i).toArray();
    }

    public static int[] merge(int[]... ints) {
        return Arrays.stream(ints).flatMapToInt(i -> Arrays.stream(i)).toArray();
    }

}
