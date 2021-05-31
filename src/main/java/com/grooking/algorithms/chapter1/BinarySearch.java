package com.grooking.algorithms.chapter1;

public class BinarySearch {

    public static int binarySearch(int[] arr, int item) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int middle = Math.round((low + high) / 2);
            int guess = arr[middle];
            if (guess == item) {
                return middle;
            }
            if (guess > item) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{ 2, 5, 7, 11, 13, 15 };
        System.out.println(binarySearch(arr, 5));
    }

}
