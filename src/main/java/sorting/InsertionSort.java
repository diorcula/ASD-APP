package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {7,2,4,3,5,1,6};
        InsertionSort sorter = new InsertionSort();
        sorter.sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    public void sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int toBeInserted = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > toBeInserted) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = toBeInserted;
        }
    }
}
