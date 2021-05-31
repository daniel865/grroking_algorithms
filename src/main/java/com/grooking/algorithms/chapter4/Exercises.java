package com.grooking.algorithms.chapter4;

import java.util.Arrays;

public class Exercises {

    public static int sum(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        } else {
            return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }

    public static int count(int[] arr) {
        if (arr.length == 1) {
            return 1;
        } else {
            return 1 + count(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }

    public static int maximum(int[] arr) {
        if (arr.length == 2) {
            return arr[0] > arr[1] ? arr[0] : arr[1];
        }
        int subMax = maximum(Arrays.copyOfRange(arr, 1, arr.length));
        return arr[0] > subMax ? arr[0] : subMax;
    }

}
