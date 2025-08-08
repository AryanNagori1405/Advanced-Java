package com.aryan.Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));

        System.out.println(Arrays.toString(arr));

        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arr));
    }

    // Sorting the array by creating Array copy
    // Note that we are not changing the original array
    private static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] firstArray = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] secondArray = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(arr, firstArray, secondArray);
    }

    private static int[] merge(int[] arr, int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }

    // Here we are changing in the Array Object
    // Note that we are changing the original array
    private static void mergeSortInPlace(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }
}