package com.grooking.algorithms.chapter2;

public class SelectionSort {

    public static int findSmallest(int[] arr) {
        int smallest = arr[0];
        int smallestIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int[] selectionSort(int[] arr) {
        int size = arr.length;
        int[] newArr = new int[0];
        for (int i = 0; i < size; i++) {
            int smallest = findSmallest(arr);
            newArr = addElement(newArr, arr[smallest]);
            arr = removeIndex(arr, smallest);
        }
        return newArr;
    }

    public static int[] removeIndex(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    public static int[] addElement(int[] arr, int element) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = element;
        return newArr;
    }

}
