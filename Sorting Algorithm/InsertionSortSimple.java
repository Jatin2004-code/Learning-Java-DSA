public class InsertionSortSimple {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            // Shift elements of arr[0..i-1] that are greater than current
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place current at its correct position
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 1, 3};  // Static input array

        // Call insertion sort
        insertionSort(arr);

        // Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
