


import java.util.*;

public class MergeSort {

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return; // base case
        }

        int mid = si + (ei - si) / 2;

        // Recursive calls
        mergeSort(arr, si, mid);      // Left part
        mergeSort(arr, mid + 1, ei);  // Right part

        // Merge
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];

        int i = si;      // pointer for left part
        int j = mid + 1; // pointer for right part
        int k = 0;       // pointer for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Left part remaining
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Right part remaining
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp to original array
        for (int l = 0; l < temp.length; l++) {
            arr[si + l] = temp[l];
        }
    }

    public static void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
