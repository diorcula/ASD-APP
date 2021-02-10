package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] test = {5, 3, 4, 2, 1};
        System.out.println(test.length);
        System.out.println("unsorted: " + Arrays.toString(test));

        MergeSort.mergeSort(test);
        System.out.println("sorted: " + Arrays.toString(test));
    }

    public static void mergeSort(int[] array) {
        mergeSort(array, new int[array.length], 0, array.length - 1);
    }

    public static void mergeSort(int[] array, int[] temp, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return;
        }
        int center = (leftStart + rightEnd) / 2;
        mergeSort(array, temp, leftStart, center);
        mergeSort(array, temp, center + 1, rightEnd);
        merge(array, temp, leftStart, rightEnd);
    }

    public static void merge(int[] array, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (rightEnd + leftStart) / 2;
        int righStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = righStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {
            if (array[left] <= array[right]) {
                temp[index] = array[left];
                left++;
            } else {
                temp[index] = array[right];
                right++;
            }
            index++;
        }

        // Copies elements of 1 array into the other
        System.arraycopy(array, left, temp, index, leftEnd - left + 1);
        System.arraycopy(array, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, array, leftStart, size);
    }
}