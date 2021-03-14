package recursion;

public class RecursiveFunctions {

    public static void main(String[] args) {
        int n = 4;
        System.out.println("n = " + n);
        System.out.println("sum of the first n integers: " + SumOfIntegers(n));

        RecursiveFunctions test = new RecursiveFunctions();
        test.printIntegersAscending(n);
    }

    // Sum of integers till x
    public static long SumOfIntegers(int x) {
        if (x == 1) {
            return 1;
        } else {
            return SumOfIntegers(x - 1) + x;
        }
    }

    // Print numbers from 1 to n
    public void printIntegersAscending(int n) {
        if (n > 1) {
            printIntegersAscending(n - 1);
        }
        System.out.println(n);
    }

}
