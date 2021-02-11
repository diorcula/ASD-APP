package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] test = {5, 3, 4, 2, 1};

        System.out.println(test.length);
        System.out.println("unsorted: " + Arrays.toString(test));

        // test.length -1, because else the arr is out of bound.
        QuickSort.quickSort(test, 0, test.length - 1);
        System.out.println("sorted: " + Arrays.toString(test));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            // it is sorted then.
            return;
        }

        int pivotIndex = partition(arr, start, end);

        // Recursive Divide & Conquer
        quickSort(arr, start, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, end);
    }

    public static  int partition(int[] arr, int start, int end) {
        int pivotIndex = start;
        int pivotValue = arr[end];
        for (int i = start; i < end; i++) {
            if (arr[i] < pivotValue) {
                swap(arr, i, pivotIndex);
                pivotIndex++;
            }
        }
        swap(arr, pivotIndex, end);
        return pivotIndex;
    }

    public static void swap (int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
