import java.util.Arrays;

public class ArrayDemo {

    // Method 1: Find all pairs whose sum is equal to a given number
    void arrayFunc(int[] arr, int target) {
        System.out.println("Pairs of elements whose sum is " + target + " are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }

    // Method 2: Merge two sorted arrays and redistribute
    void arrayFunc(int[] A, int p, int[] B, int q) {
        int[] merged = new int[p + q];

        // Copy all elements from A and B into merged
        System.arraycopy(A, 0, merged, 0, p);
        System.arraycopy(B, 0, merged, p, q);

        // Sort merged array
        Arrays.sort(merged);

        // Fill A with first p smallest elements
        for (int i = 0; i < p; i++) {
            A[i] = merged[i];
        }

        // Fill B with remaining elements
        for (int i = 0; i < q; i++) {
            B[i] = merged[p + i];
        }

        System.out.println("Merged arrays while maintaining sorted order:");
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        ArrayDemo demo = new ArrayDemo();

        // Test method 1
        int[] numbers = {4, 6, 5, -10, 8, 5, 20};
        int target = 10;
        demo.arrayFunc(numbers, target);

        // Test method 2
        int[] A = {1, 3, 5};
        int[] B = {2, 4, 6, 8};
        demo.arrayFunc(A, A.length, B, B.length);
    }
}
