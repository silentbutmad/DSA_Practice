package com.silentbutmad.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = arr[end];
        int left = start;
        int right = end - 1;

        while (left <= right) {

            while (left <= right && arr[left] <= pivot) {
                left++;
            }


            while (left <= right && arr[right] > pivot) {
                right--;
            }

            // Swap if pointers haven't crossed
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        int temp = arr[left];
        arr[left] = arr[end];
        arr[end] = temp;

        sort(arr, start, left-1);
        sort(arr, left+1, end);
    }

    public static void main(String[] args) {
        int[] arr = {1000, 50, 30, 458, 59, 59};
        System.out.println("Before sorting : " + Arrays.toString(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println("After sorting  : " + Arrays.toString(arr));
    }
}
