public class CountingSortFunction {
    
    // Function to perform counting sort
    public static void countingSort(int[] arr) {
        // Step 1: Find maximum value
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 2: Create count array
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Step 3: Rebuild sorted array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Call counting sort function
        countingSort(arr);

        System.out.print("\nSorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
