package sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {7,2,4,3,5,1,6};
        InsertionSort sorter = new InsertionSort();
        sorter.sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
