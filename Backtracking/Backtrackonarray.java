package Backtracking;

public class Backtrackonarray {
    public static void changearray(int arr[], int i , int v) {
        // base case
        if (i == arr.length) {
            printArray(arr);
            return;
        }

        // recursive case
        arr[i] = v;                 // Step 1: change
        changearray(arr, i + 1, v); // Step 2: call
        arr[i] = arr[i] - 2;        // Step 3: backtrack
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // ✅ ADD THIS MAIN METHOD
    public static void main(String[] args) {
        int[] arr = new int[5];
        changearray(arr, 0, 1);
        printArray(arr);
    }
}
